package com.brightstar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {

	private int mid;//専攻ID
	private int cid;//科目ID
	private String cname;//科目名称
	private String ctype;//区分
	private int state;//選択状態（未使用新品）
	private Major major;//専攻
	private int credit;//単位数
	private String std_max;//上限人数-
	private String std;//選択人数-
	private int cpreid;//先修ID
	private String cmode;//授業形態-
	private String weekday;//曜日-
	private String ctime;//時限-
	private String teacher;//先生
	private String dpname;
	private String mname;

	public void setStd_max(int std_max) {
		String temp = std_max + "人";
		this.std_max = temp;
	}

	public void setStd(int std) {
		String temp = std + "人";
		this.std = temp;
	}

	public void setCmode(int cmode) {
		String temp = null;
		switch (cmode) {
		case 1:
			temp = "対面形式";
			break;
		case 2:
			temp = "テレワーク形式";
			break;
		}
		this.cmode = temp;
	}

	public void setCtype(int ctype) {
		String temp = null;
		switch (ctype) {
		case 1:
			temp = "必修";
			break;
		case 2:
			temp = "選択必修";
			break;
		case 3:
			temp = "任意科目";
			break;
		}
		this.ctype = temp;
	}

	public void setWeekday(int weekday) {
		String temp = null;
		switch (weekday) {
		case 1:
			temp = "月曜日";
			break;
		case 2:
			temp = "火曜日";
			break;
		case 3:
			temp = "水曜日";
			break;
		case 4:
			temp = "木曜日";
			break;
		case 5:
			temp = "金曜日";
			break;
		}
		this.weekday = temp;
	}

	public void setCtime(int ctime) {
		String temp = null;
		switch (ctime) {
		case 1:
			temp = "一時限目";
			break;
		case 2:
			temp = "二時限目";
			break;
		case 3:
			temp = "三時限目";
			break;
		case 4:
			temp = "四時限目";
			break;
		case 5:
			temp = "五時限目";
			break;
		case 6:
			temp = "六時限目";
			break;
		}
		this.ctime = temp;
	}

}
