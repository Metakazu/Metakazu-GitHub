--INSERT MAJOR
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10001', '融合領域', '1601', '教育工学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10001', '融合領域', '1602', '教育愛学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10001', '融合領域', '1701', '科学社会学·科学技術史');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10001', '融合領域', '1801', '文化財科学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10001', '融合領域', '1901', '地理学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10001', '融合領域', '2601', '地域研究');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10001', '融合領域', '2701', 'ジェンダー');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2801', '哲学・倫理学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2802', '中国哲学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2803', '印度哲学・仏教学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2804', '宗教学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2805', '思想史');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2806', '美学・美術史');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2851', '芸術学・芸術史・芸 術一般');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2901', '日本文学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2902', '英米・英語圏文学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2903', 'ヨーロッハ·文学(英文学を除く)');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '2904', '各国文学・文学論');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '3001', '言語学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '3002', '日本語学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '3003', '英語学');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '3004', '日本語教育');
INSERT INTO MAJOR (`DPID`, `DPNAME`, `MID`, `MNAME`) VALUES ('10002', '人文学', '3005', '外国語教育');


--INSERT STUDENT
INSERT INTO STUDENT VALUES(2101160194,'小肠','1214',0,1601,1,0);
INSERT INTO STUDENT VALUES(2001180178,'直肠','0708',0,1801,1,0);
INSERT INTO STUDENT VALUES(2001180192,'盲肠','0904',0,1801,1,0);
INSERT INTO STUDENT VALUES(2002280292,'十二指肠','0219',1,2802,2,0);

--INSERT COURSE
INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '工学教育', '2', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '自然認識', '2', '2', '30', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '科学的社会認識', '1', '2', '40', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '科学リテラシー', '1', '2', '30', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '実験・観察', '1', '2', '20', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '科学教育カリキュラム', '3', '2', '30', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '環境教育', '3', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '産業・技術教育', '3', '2', '10', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '科学高等教育', '1', '2', '10', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '科学技術教育史', '3', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '科学と社会・ 文化', '1', '2', '20', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '科学技術政策', '2', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1601', '科学コミュニケータ養成', '1', '2', '30', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', 'カリキュラム・教授法開発', '3', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', '教授学習支援システム', '2', '2', '5', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', '分散協調教育システム', '3', '2', '30', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', 'ヒューマン・インターフェイス', '1', '2', '12', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', '教材情報システム', '2', '2', '8', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', 'メディアの活用', '2', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', '遠隔教育', '3', '2', '10', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', 'e-ラーニングI', '3', '2', '15', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', 'コンピューターリテラシー', '1', '2', '32', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', 'メディア教育', '2', '2', '30', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', '学習環境', '1', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', '教師教育', '1', '2', '10', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', '授業', '1', '2', '20', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1701', '科学社会学', '1', '2', '10', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1701', '生命倫理', '1', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1701', '科学史', '3', '2', '5', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1701', '技術史', '1', '2', '10', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1701', '医学史', '3', '2', '2', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1701', '産業考古学', '2', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1701', '科学 哲学・科学基礎論', '2', '2', '2', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1701', '科学技術社会論(STS)', '3', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '年代測定', '1', '2', '1', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '材質分析', '2', '2', '100', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '製作技法', '2', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '保存科学', '2', '2', '40', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '遺跡探査', '1', '2', '33', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '動植物遺体・人 骨', '3', '2', '1', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '文化財・文化遺産', '2', '2', '20', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '文化資源', '1', '2', '30', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1801', '文化財政策', '2', '2', '20', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '地理学一般', '1', '2', '23', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '土地利用・景観', '3', '2', '34', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '環境システム', '2', '2', '11', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '地域計画', '2', '2', '23', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '地理教育', '1', '2', '12', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '地誌', '2', '2', '2', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '地形', '3', '2', '22', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '気候', '1', '2', '30', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '水文', '3', '2', '13', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '地図', '2', '2', '13', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', '地理情報システム', '1', '2', '13', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1901', 'リモートセンシング', '2', '2', '13', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('2802', '中国哲学・思想', '3', '2', '2', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('2802', '中国仏教', '1', '2', '32', '0', '2');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('2802', '道教', '2', '2', '44', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('2802', '儒教', '2', '2', '100', '0', '1');

INSERT INTO COURSE(`MID`, `CNAME`, `CTYPE`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`) VALUES ('1602', 'e-ラーニングII', '3', '2', '15', '21', '1');

INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2601', 'ヨーロッパ', '2', '1', '2', '13', '0', '1', '1');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2601', 'ロシア・スラブ地域', '1', '2', '2', '23', '0', '1', '2');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2701', '性差・性別役割', '2', '3', '3', '11', '0', '2', '3');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2701', 'セクシュアリティ', '3', '4', '3', '22', '0', '2', '4');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2801', '哲学原論・各論', '2', '5', '3', '33', '0', '1', '5');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2801', '倫理学原論・各論', '1', '4', '3', '44', '0', '2', '6');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2801', '西洋哲学', '2', '3', '1', '1', '0', '1', '1');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2801', '西洋倫理学', '3', '2', '1', '2', '0', '1', '2');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2803', '印度哲学・思想', '2', '1', '2', '2', '0', '1', '3');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2803', '仏教学・仏教史全般', '1', '2', '1', '1', '0', '2', '4');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2804', '宗教学全般', '2', '3', '2', '2', '0', '2', '5');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2805', '芸術思想史', '3', '4', '3', '1', '0', '2', '6');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2805', '比較思想史', '1', '5', '1', '23', '0', '1', '1');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2805', '社会思想史', '2', '4', '1', '22', '0', '2', '2');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2806', '美学', '3', '3', '2', '10', '0', '1', '3');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2806', '美術史', '1', '2', '3', '12', '0', '2', '4');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2851', '芸術・文化政策', '2', '1', '1', '23', '0', '1', '5');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2851', '表象文化論', '3', '2', '2', '33', '0', '2', '6');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2901', '日本文学一般', '1', '3', '3', '33', '0', '1', '1');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2901', '文学批評・文学理論', '2', '4', '1', '44', '0', '2', '2');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2902', '比較文学', '3', '5', '2', '11', '0', '1', '3');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2903', '書誌学・文献学', '1', '4', '1', '22', '0', '1', '4');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2903', '西洋古典 学', '2', '3', '2', '33', '0', '2', '5');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2904', 'その他の各国文学', '3', '2', '3', '44', '0', '1', '6');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('2904', '東南アジア文学', '2', '1', '1', '12', '0', '2', '1');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3001', '音声学', '1', '2', '2', '10', '0', '1', '2');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3001', '火星文', '3', '3', '10', '1', '0', '2', '3');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3001', '郭老师语言课程', '1', '4', '10', '1', '0', '1', '4');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3001', '危機・少数言語', '2', '5', '3', '12', '0', '1', '5');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3002', '語彙・意味', '3', '4', '2', '12', '0', '1', '6');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3002', '方言', '1', '3', '3', '12', '0', '2', '1');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3003', '英語の多様性', '2', '2', '1', '12', '0', '2', '2');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3004', '日本事情', '3', '1', '2', '12', '0', '2', '3');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3004', '教育評価・測定', '2', '2', '3', '12', '0', '2', '4');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3005', '異文化コミュニケーション', '1', '3', '2', '12', '0', '2', '5');
INSERT INTO `COURSE` (`MID`, `CNAME`, `CTYPE`, `WEEKDAY`, `CREDIT`, `STD_MAX`, `CPREID`, `CMODE`, `CTIME`) VALUES ('3005', '早期英語教育', '3', '4', '1', '12', '0', '2', '6');

UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '1');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '2');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '3');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '4');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '5');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '6');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '7');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '8');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '9');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '10');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '11');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '12');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '13');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '14');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '15');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '16');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '17');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '18');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '19');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '20');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '21');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '22');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '23');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '24');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '25');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '26');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '27');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '28');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '29');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '30');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '31');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '32');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '33');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '34');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '35');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '36');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '37');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '38');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '39');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '40');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '41');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '42');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '43');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '44');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '45');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '46');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '47');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '48');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '49');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '50');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '51');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '52');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '53');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '54');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '55');
UPDATE `COURSE` SET `WEEKDAY` = '1' WHERE (`CID` = '56');
UPDATE `COURSE` SET `WEEKDAY` = '2' WHERE (`CID` = '57');
UPDATE `COURSE` SET `WEEKDAY` = '3' WHERE (`CID` = '58');
UPDATE `COURSE` SET `WEEKDAY` = '4' WHERE (`CID` = '59');
UPDATE `COURSE` SET `WEEKDAY` = '5' WHERE (`CID` = '60');

UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '1');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '2');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '3');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '4');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '5');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '6');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '7');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '8');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '9');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '10');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '11');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '12');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '13');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '14');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '15');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '16');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '17');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '18');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '19');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '20');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '21');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '22');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '23');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '24');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '25');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '26');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '27');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '28');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '29');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '30');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '31');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '32');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '33');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '34');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '35');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '36');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '37');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '38');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '39');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '40');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '41');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '42');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '43');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '44');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '45');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '46');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '47');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '48');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '49');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '50');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '51');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '52');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '53');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '54');
UPDATE `COURSE` SET `CTIME` = '1' WHERE (`CID` = '55');
UPDATE `COURSE` SET `CTIME` = '2' WHERE (`CID` = '56');
UPDATE `COURSE` SET `CTIME` = '3' WHERE (`CID` = '57');
UPDATE `COURSE` SET `CTIME` = '4' WHERE (`CID` = '58');
UPDATE `COURSE` SET `CTIME` = '5' WHERE (`CID` = '59');
UPDATE `COURSE` SET `CTIME` = '6' WHERE (`CID` = '60');

UPDATE `COURSE` SET `CPREID` = '86', `Teacher` = '郭蓓蓓' WHERE (`CID` = '87');
UPDATE `COURSE` SET `CPREID` = '87', `Teacher` = '郭蓓蓓' WHERE (`CID` = '88');
UPDATE `COURSE` SET `CPREID` = '88', `Teacher` = '郭蓓蓓' WHERE (`CID` = '89');
UPDATE `COURSE` SET `Teacher` = '郭蓓蓓' WHERE (`CID` = '86');
UPDATE `COURSE` SET `Teacher` = '郭蓓蓓' WHERE (`CID` = '96');
UPDATE `COURSE` SET `Teacher` = '郭蓓蓓' WHERE (`CID` = '70');
UPDATE `COURSE` SET `Teacher` = '肋骨' WHERE (`CID` = '1');
UPDATE `COURSE` SET `Teacher` = '眼睛' WHERE (`CID` = '2');
UPDATE `COURSE` SET `Teacher` = '鼻子' WHERE (`CID` = '3');
UPDATE `COURSE` SET `Teacher` = '撒哈拉' WHERE (`CID` = '4');
UPDATE `COURSE` SET `Teacher` = '撒哈拉' WHERE (`CID` = '5');
UPDATE `COURSE` SET `Teacher` = '撒哈拉' WHERE (`CID` = '6');
UPDATE `COURSE` SET `Teacher` = '撒哈拉' WHERE (`CID` = '7');
UPDATE `COURSE` SET `Teacher` = '撒哈拉' WHERE (`CID` = '8');
UPDATE `COURSE` SET `Teacher` = '撒哈拉' WHERE (`CID` = '9');
UPDATE `COURSE` SET `Teacher` = '你猜' WHERE (`CID` = '10');
UPDATE `COURSE` SET `Teacher` = '德雷克' WHERE (`CID` = '39');
UPDATE `COURSE` SET `CNAME` = '動植物遺体・人骨', `Teacher` = '华生' WHERE (`CID` = '40');
UPDATE `COURSE` SET `Teacher` = '自己选' WHERE (`CID` = '11');
UPDATE `COURSE` SET `Teacher` = '不告诉你' WHERE (`CID` = '12');
UPDATE `COURSE` SET `Teacher` = '哈哈' WHERE (`CID` = '13');
UPDATE `COURSE` SET `Teacher` = '福尔摩斯' WHERE (`CID` = '14');
UPDATE `COURSE` SET `Teacher` = '大蛇丸' WHERE (`CID` = '15');
UPDATE `COURSE` SET `Teacher` = '漩涡鸣人' WHERE (`CID` = '16');
UPDATE `COURSE` SET `Teacher` = '春野樱' WHERE (`CID` = '17');
UPDATE `COURSE` SET `Teacher` = '暗影' WHERE (`CID` = '18');
UPDATE `COURSE` SET `Teacher` = 'CCTV' WHERE (`CID` = '19');
UPDATE `COURSE` SET `Teacher` = 'CCTV' WHERE (`CID` = '20');
UPDATE `COURSE` SET `Teacher` = '推特' WHERE (`CID` = '21');
UPDATE `COURSE` SET `Teacher` = '推特' WHERE (`CID` = '22');
UPDATE `COURSE` SET `Teacher` = '推特' WHERE (`CID` = '23');
UPDATE `COURSE` SET `Teacher` = '推特' WHERE (`CID` = '24');
UPDATE `COURSE` SET `Teacher` = '推特' WHERE (`CID` = '25');
UPDATE `COURSE` SET `Teacher` = '推特' WHERE (`CID` = '26');
UPDATE `COURSE` SET `Teacher` = '云天明' WHERE (`CID` = '27');
UPDATE `COURSE` SET `Teacher` = '亚当' WHERE (`CID` = '28');
UPDATE `COURSE` SET `Teacher` = '爱因斯坦' WHERE (`CID` = '29');
UPDATE `COURSE` SET `Teacher` = '爱迪生' WHERE (`CID` = '30');
UPDATE `COURSE` SET `Teacher` = '扁鹊' WHERE (`CID` = '31');
UPDATE `COURSE` SET `Teacher` = '妮可罗宾' WHERE (`CID` = '32');
UPDATE `COURSE` SET `Teacher` = '特斯拉' WHERE (`CID` = '33');
UPDATE `COURSE` SET `Teacher` = '特斯拉' WHERE (`CID` = '34');
UPDATE `COURSE` SET `Teacher` = '水晶球' WHERE (`CID` = '35');
UPDATE `COURSE` SET `Teacher` = '显微镜' WHERE (`CID` = '36');
UPDATE `COURSE` SET `Teacher` = '匠人' WHERE (`CID` = '37');
UPDATE `COURSE` SET `Teacher` = '冰箱' WHERE (`CID` = '38');
UPDATE `COURSE` SET `Teacher` = '我不知道' WHERE (`CID` = '41');
UPDATE `COURSE` SET `Teacher` = '赵忠祥' WHERE (`CID` = '42');
UPDATE `COURSE` SET `Teacher` = '赵忠祥' WHERE (`CID` = '43');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '44');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '45');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '46');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '47');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '48');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '49');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '50');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '51');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '52');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '53');
UPDATE `COURSE` SET `Teacher` = '娜美' WHERE (`CID` = '54');
UPDATE `COURSE` SET `Teacher` = '弗兰奇' WHERE (`CID` = '55');
UPDATE `COURSE` SET `Teacher` = '老子' WHERE (`CID` = '56');
UPDATE `COURSE` SET `Teacher` = '观世音' WHERE (`CID` = '57');
UPDATE `COURSE` SET `Teacher` = '太上老君' WHERE (`CID` = '58');
UPDATE `COURSE` SET `Teacher` = '孔子' WHERE (`CID` = '59');
UPDATE `COURSE` SET `Teacher` = '推特' WHERE (`CID` = '60');
UPDATE `COURSE` SET `Teacher` = '伊丽莎白' WHERE (`CID` = '61');
UPDATE `COURSE` SET `Teacher` = '普京' WHERE (`CID` = '62');
UPDATE `COURSE` SET `Teacher` = '艾斯奈美惠' WHERE (`CID` = '63');
UPDATE `COURSE` SET `Teacher` = '保安' WHERE (`CID` = '64');
UPDATE `COURSE` SET `Teacher` = '夏洛克' WHERE (`CID` = '65');
UPDATE `COURSE` SET `Teacher` = '夏洛克' WHERE (`CID` = '66');
UPDATE `COURSE` SET `Teacher` = '夏洛克' WHERE (`CID` = '67');
UPDATE `COURSE` SET `Teacher` = '夏洛克' WHERE (`CID` = '68');
UPDATE `COURSE` SET `Teacher` = '甘地' WHERE (`CID` = '69');
UPDATE `COURSE` SET `Teacher` = '阿拉丁' WHERE (`CID` = '71');
UPDATE `COURSE` SET `Teacher` = '思想者' WHERE (`CID` = '72');
UPDATE `COURSE` SET `Teacher` = '罗辑' WHERE (`CID` = '74');
UPDATE `COURSE` SET `Teacher` = '你猜' WHERE (`CID` = '73');
UPDATE `COURSE` SET `Teacher` = '维纳斯' WHERE (`CID` = '75');
UPDATE `COURSE` SET `Teacher` = '毕加索' WHERE (`CID` = '76');
UPDATE `COURSE` SET `Teacher` = '毕加索' WHERE (`CID` = '77');
UPDATE `COURSE` SET `Teacher` = '毕加索' WHERE (`CID` = '78');
UPDATE `COURSE` SET `Teacher` = '桃太郎' WHERE (`CID` = '79');
UPDATE `COURSE` SET `Teacher` = '郭德纲' WHERE (`CID` = '80');
UPDATE `COURSE` SET `Teacher` = '郭德纲' WHERE (`CID` = '81');
UPDATE `COURSE` SET `Teacher` = '白宫' WHERE (`CID` = '82');
UPDATE `COURSE` SET `CNAME` = '西洋古典学' WHERE (`CID` = '83');
UPDATE `COURSE` SET `Teacher` = 'Jacky' WHERE (`CID` = '85');

--管理者
INSERT INTO STUDENT VALUES(9001,'JACKY','1234',0,1601,1,1);


--学生成绩登录（test）
INSERT INTO SCORE (`SID`, `CID`, `MASTER`) VALUES ('2001180178','60','1');
INSERT INTO SCORE (`SID`, `CID`, `MASTER`) VALUES ('2001180192','61','0');
INSERT INTO SCORE (`SID`, `CID`, `MASTER`) VALUES ('2001180192','62','1');
INSERT INTO SCORE (`SID`, `CID`, `MASTER`) VALUES ('2002280292','60','0');
INSERT INTO SCORE (`SID`, `CID`, `MASTER`) VALUES ('2002280292','61','1');
INSERT INTO SCORE (`SID`, `CID`, `MASTER`) VALUES ('2002280292','62','0');
INSERT INTO SCORE (`SID`, `CID`, `MASTER`) VALUES ('2002280292','63','0');
;




--加课存储
CREATE PROCEDURE INSERT_COURSE (IN C_CID INT, S_SID INT )
BEGIN
    INSERT INTO SCORE VALUES(S_SID,C_CID,0);
    UPDATE COURSE SET STD=STD+1 WHERE CID =  C_CID;
END;

CALL INSERT_COURSE(3,2001180178) ;
CALL INSERT_COURSE(#{cid},#{sid}) ;
drop PROCEDURE INSERT_COURSE ;



