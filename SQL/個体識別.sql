-- 雌雄コード
-- ・１．雄
-- ・２：雌
-- 品種コード
-- ・01：乳用種
-- ・02：肉用種
-- ・03：交雑種
-- １．飼育県別に飼育頭数をカウントし、その結果を次の頭数集計テーブルに登録する。
-- 頭数集計テーブル -- 飼育県

create table 頭数集計(
育県 VARCHAR(10),
頭数 integer
);
INSERT INTO 頭数集計(select 飼育県,count(個体識別番号)from 個体識別 group by 飼育県);

-- ２．１で作成した頭数集計テーブルで、飼育頭数の多いほうから３つの都道府県で飼育されている牛のデータを、個体識別テーブルにより抽出する。
-- 　　　抽出する項目は、都道府県名、個体識別番号、雌雄とする。
-- 　　　ただし、雌雄はコードではなく「雌」、「雄」の日本語表記とする。
-- 方法一 
select 飼育県 as 都道府県名,個体識別番号,
case
when 1 then '雄'
when 2 then '雌'
end as 雌雄
from 個体識別
where 飼育県 in (select * from(
select 飼育県 from 頭数集計 order by 頭数 desc limit 3)as t);

-- 方法二
select 個体.飼育県 as 都道府県名,個体識別番号,
case
when 1 then '雄'
when 2 then '雌'
end as 雌雄
from 個体識別 as 個体
join (
select 飼育県 from 頭数集計 order by 頭数 desc limit 3)as 頭数
on 頭数.飼育県=個体.飼育県;

-- 方法三
select 飼育県,個体識別番号,
case 雌雄コード
when 1 then  '雄'
else '雌'end as 雌雄
from 個体識別 
where 飼育県 
in(select 飼育県 from 頭数集計
where 頭数 
in((select max(頭数) from 頭数集計),
(select max(頭数)-1 from 頭数集計),
(select max(頭数)-2 from 頭数集計))
);

-- ３．個体識別テーブルに母牛についてもデータ登録されており、母牛が乳用種である牛の一覧を個体識別テーブルにより抽出したい。
-- 　　　抽出する項目は、個体識別番号、品種、出生日、母牛番号とする。
-- 　　　なお、品種は、コードではなく「乳用種」、「肉用種」、「交雑種」の日本語表記とする。
-- 方法一 
select 個体識別番号,
case
when 01 then '乳用種'
when 02 then '肉用種'
when 03 then '交雑種'
end as 品種
,出生日,母牛番号
from 個体識別
where 母牛番号 in(
select 個体識別番号 from 個体識別 where 品種コード = '01');
-- 方法二 
select k1.個体識別番号,
case
when 01 then '乳用種'
when 02 then '肉用種'
when 03 then '交雑種'
end as 品種
,k1.出生日,k1.母牛番号
from 個体識別 k1
inner join 個体識別 k2
on k1.母牛番号=k2.個体識別番号
where k2.品種コード='01';