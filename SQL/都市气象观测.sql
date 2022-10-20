-- １．日本全体としての年降水量の合計と、年間の最高気温、最低気温の平均
select sum(降水量) ,avg(最高気温),avg(最低気温) from 都市別気象観測;
-- ２．都市名「東京」の年間降水量と、各月の最高気温、最低気温の平均
select sum(降水量) ,avg(最高気温),avg(最低気温) from 都市別気象観測 where 都市名 = '東京';
-- ３．各都市の降水量の平均と、最も低かった最高気温、最も高かった最低気温
select 都市名, avg(降水量),min(最高気温),max(最低気温)from 都市別気象観測 group by 都市名;
-- ４．月別の降水量、最高気温、最低気温の平均
select 月, sum(降水量),avg(最高気温),avg(最低気温) from 都市別気象観測 group by 月;
-- ５．1年間で最も高い最高気温が38度以上を記録した月のある都市名とその気温
select 都市名,max(最高気温)from 都市別気象観測 group by 都市名 having max(最高気温)>= 38;
-- ６．1年間で最も低い最低気温が-10度以上を記録した月のある都市名とその気温
select 都市名,min(最低気温)from 都市別気象観測 group by 都市名 having min(最低気温)<= -10;
