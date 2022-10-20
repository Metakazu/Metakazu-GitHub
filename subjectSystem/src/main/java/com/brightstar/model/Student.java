package com.brightstar.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private int sid;
	private String sname;
	private String password;
	private List<Score> scores;
	private Major major;
	
	private int[] cids;
}
