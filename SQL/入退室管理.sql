-- サーバールームへの入退室を記録した、次ページのような入退室管理テーブルがあります。
-- このテーブルについて、以下の設問で求められているデータを取得するSQL文を作成してください。
-- なお、同姓同名の社員はいないものとします。

-- 退室
-- ・NULL：入室中
-- ・1：退室済み

-- 事由区分
-- ・１：メンテナンス
-- ・２：リリース作業
-- ・３：障害対応
-- ・９：その他

-- １．現在入室中の社員数を取得する。
select max(日付),count(*)-count(退室) as 入室人数 from 入退室管理;
select count(*) from 入退室管理 where 退室 is null;
-- ２．社員ごとの入室回数を、回数の多い順に取得する。
select 社員名,count(*) as 入室回数 from 入退室管理 group by 社員名 order by 入室回数 desc;
-- ３．事由区分ごとの入室回数を取得する。
select 事由区分,count(*) as 入室回数 from 入退室管理 group by 事由区分;
-- 进化code⬇️ 
select
case 事由区分
when 1 then 'メンテナンス'
when 2 then 'リリース作業'
when 3 then '障害対応'
when 9 then 'その他'
end as 事由区分,
count(事由区分) as 事由回数 from 入退室管理 group by 事由区分;

-- ４．入室回数が10回を超過する社員について、社員名と入室回数を取得する。
select 社員名,count(*) as 入室回数 from 入退室管理 group by 社員名 having count(*)>10;
-- ５．これまでに障害対応が発生した日付と、それに対応した社員数を取得する。
select 日付, count(社員名) as 社員数 from 入退室管理 where 事由区分 = 3 group by 日付;