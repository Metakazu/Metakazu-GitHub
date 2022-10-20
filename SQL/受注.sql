SELECT * FROM datebase.受注;
-- ある会社では、依頼された品物に刺繍で文字を入れるサービスを行っています。
-- 加工にかかる金額は、1文字ごとに設定された金額を文字数で乗算したもので、1文字の金額は刺繡する書体の種類ごとに決まっています。
-- また、10文字を超える場合は、一律500円の特別加工料が加算されます。

-- 次に、受注内容を登録した受注テーブルと、書体ごとの単価を示します。
-- 書体と単価
-- ・書体コード１：ブロック体　単価100円
-- ・書体コード２：筆記体　単価150円
-- ・書体コード３：草書体　単価200円
-- ※受注時に書体が指定されなかった場合は、書体コードにNULLが設定され、ブロック体の単価100円が適用される。

-- これらをもとに、以下の設問で指示されたSQL文を作成してください。
-- なお、受注日列はDATE型、受注ID、文字、書体コード列はVARCHAR型、文字数列はINTEGER型で定義されています。

-- １．依頼された文字は、何文字を刺繡が必要かを求める。「文字」列のデータをもとに、1つのSQL文で「文字数」列の全行を更新する。
-- 　　　ただし、「文字」列には半角の空白が入る可能性があるが、空白は文字数に含めない。
-- 　　　なお、ここで使用しているDBMSでは、文字列長を得る関数はバイト数ではなく文字数を返すものとする。
update 受注 set 文字数 = character_length(replace(文字,' ',''));

-- ２．受注内容を一覧表示する。一覧には、受注日、受注ID、文字数、書体名、単価、特別加工料を受注日および受注ID順に表示したい。
-- 　　　ただし、特別加工料がかからないものについては、特別加工料をゼロとする。
select *,
case
when 書体コード = 1 then 'ブロック体'
when 書体コード = 2 then '筆記体'
when 書体コード = 3 then '草書体'

else 'ブロック体'

end as 書体名,
case
when 書体コード = 1 then '100円'
when 書体コード = 2 then '150円'
when 書体コード = 3 then '200円'
else '単価100円'
end as 単価,
case 
when 文字数 > 10 then '500円'
end as 特別加工料
from 受注 order by 受注ID;

-- ３．受注IDが113の注文に対して、文字の一部を変更したいという依頼があった。
-- 　　　登録されている文字を次の依頼内容に合わせて更新する。
-- 　　　依頼内容：半角スペースを「★」に変更
update 受注 set 文字 = replace(文字,' ','★') where 受注ID=113;




