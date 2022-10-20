-- このテーブルについて、次のデータを取得するSQL文を作成してください。
-- ①6月のデータ
SELECT * FROM datebase.気象観測 where 月 = 6;
-- ②6月以外のデータ
SELECT * FROM datebase.気象観測 where 月 != 6;
-- ③降水量が100未満のデータ
SELECT * FROM datebase.気象観測 where  降水量<100;
-- ④降水量が200より多いデータ
SELECT * FROM datebase.気象観測 where  降水量>200;
-- ⑤最高気温が30以上のデータ
SELECT * FROM datebase.気象観測 where 最高気温>30;
-- ⑥最低気温が0以下のデータ
SELECT * FROM datebase.気象観測 where 最低気温<30;
-- ⑦3月、5月、7月のデータ
SELECT * FROM datebase.気象観測 where 月 in(3,5,7);
-- ⑧3月、5月、7月以外のデータ
SELECT * FROM datebase.気象観測 where 月 not in(3,5,7);
-- ⑨降水量が100以下で、湿度が50より低いデータ
SELECT * FROM datebase.気象観測 where (降水量<100 and 湿度<50);
-- ⑩最低気温が5未満か、最高気温が35より高いデータ
SELECT * FROM datebase.気象観測 where (最高気温>35 or 最低気温<5);
-- ⑪湿度が60～79の範囲にあるデータ
SELECT * FROM datebase.気象観測 where 湿度 between 60 and 79;
-- ⑫観測データがない列のある月のデータ
SELECT * FROM datebase.気象観測 where 降水量 is null or 最低気温 is null or 最高気温 is null or 湿度 is null;
