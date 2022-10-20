package com.brightstar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseBean {
	private int mid;//専攻ID
	private int cid;//科目ID
	private String cname;//科目名称
	private int ctype;//区分
	private int state;//選択状態（未使用新品）
	private Major major;//専攻
	private int credit;//単位数
	private int std_max;//上限人数-
	private int std;//選択人数-
	private int cpreid;//先修ID
	private int cmode;//授業形態-
	private int weekday;//曜日-
	private int ctime;//時限-
	private String teacher;//先生
	private String dpname;
	private String mname;
}
