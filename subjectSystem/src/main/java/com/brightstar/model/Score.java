package com.brightstar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
	private int sid;
	private int cid;
	private int master;
	private Course course;
	private int newcid;
	private int weekday;
	private int ctime;
	private String name;
}
