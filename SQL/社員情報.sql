-- １．部署名が入った全社員の一覧表
select 社員番号, 社員.名前, 部署.名前 as 部署名 
from 社員
left join 部署
on 社員.部署ID = 部署.部署ID;
																													 
-- ２．上司の名前が入った全社員の一覧表
-- 方法1 
select A.社員番号,A.名前,B.名前 as 上司名
from 社員 as A
inner join 社員 as B
on A.社員番号 = B.上司ID;
-- 方法2 用left join来显示左表全部
select A.社員番号,A.名前,B.名前 as 上司名
from 社員 as A
left join 社員 as B
on A.社員番号 = B.上司ID;

-- ３．部署名と勤務地が入った社員一覧表
-- 方法1 
select 社員番号, 社員.名前, 部署.名前 as 部署名,支店.名前 as 勤務地
from 社員
inner join 部署
on 社員.部署ID = 部署.部署ID
inner join 支店
on 支店.支店ID=部署.本部拠点ID;

--  方法2 用left join来显示左表全部 此处结果与上表一致
select 社員番号, 社員.名前, 部署.名前 as 部署名,支店.名前 as 勤務地
from 社員
left join 部署
on 社員.部署ID = 部署.部署ID
left join 支店
on 支店.支店ID=部署.本部拠点ID;



-- ４．支店ごとの支店長と社員数の一覧表
select 支店.支店ID as 支店コード,支店.名前 as 支店名,社員.名前 as 支店長名,c.人数 as 社員数
from 社員
inner join 支店
on 社員.勤務地ID = 支店.支店ID
inner join 社員 as b
on b.上司ID=社員.社員番号
join (select 勤務地ID, count(名前) as 人数 from 社員 group by 勤務地ID)as c
on c.勤務地ID= 支店.支店ID;

-- ５．上司と違う勤務地社員の一覧表
-- 步骤1 取表A 普通社员 的两个属性 
-- 步骤2 将A普通社员 和B上司的表连接起来 
-- 步骤3 取表判断 本人工作地
-- 步骤4 取表判断 上司工作地
-- 步骤5 寫一個會顯示全表的select,然後寫一個where來判斷上司跟普通社員是不是在同一個地區
-- select * from(XXX)as 改名where 本人勤務地!=上司勤務地

-- 不可以读表 
select * from (
select A.社員番号,A.名前,
case 
when A.勤務地ID=12 then '東京'
else '京都'
end as 本人勤務地,
case 
when B.勤務地ID=12 then '東京'
else '京都'
end as 上司勤務地
from 社員 as A
join 社員 as B
on B.社員番号=A.上司ID)as M
where 本人勤務地!=上司勤務地;

-- 方法一
select
	s.社員番号,
    s.名前,
    st.名前 as 本人勤務地,
    jt.名前 as上司勤務地
from 社員 s
	join 支店 st
		on s.勤務地ID=st.支店ID
	join 社員 j
		on j.社員番号=s.上司ID
	join 支店 jt
		on jt.支店ID=j.勤務地ID
where s.勤務地ID != j.勤務地ID;
-- 方法二
SELECT
    sy.社員番号
    , sy.名前
    , zd.名前 本人勤務地
    , ss.名前 上司勤務地 
FROM
    社員 AS sy
    JOIN 支店 AS zd 
        ON sy.勤務地ID = zd.支店ID 
    JOIN 支店 AS ss 
        ON sy.上司ID = ss.支店長ID 
WHERE
    zd.名前 != ss.名前;