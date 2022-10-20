package com.brighttar.p0826;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashkkkap {
	public static void main(String[] args) {

		//鍵値対<String, Integer> 
		//key value
		Map<String, Integer> prefs = new HashMap();

		prefs.put("京都", 255);
		prefs.put("東京", 1261);
		prefs.put("熊本", 181);

		System.out.println(prefs.get("東京"));
		Set<String> keySet = prefs.keySet();

		for (String key : prefs.keySet()) {
			System.out.println(key + prefs.get(key));
		}

	}

}
