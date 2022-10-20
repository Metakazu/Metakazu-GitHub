SELECT * FROM datebase.家計簿アーカイブ;
-- 分组
-- 如果要查询一个列，和这个列的组函数，且在一起的视图，必须要对这个列进行分组。
select 費目, sum(出金額) from 家計簿アーカイブ group by 費目;
-- 组函数的条件判断式 having
select 費目, sum(出金額) from 家計簿アーカイブ group by 費目 having sum(出金額)>0;

-- 顺序
-- select 选择列LIST from 表table where 条件式 group by 分组名 having 组函数结果的条件式 order by 排序方式； 