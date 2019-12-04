package com.bbe.exos;

import java.util.*;

public class SuiteConway {

	public static String solve(String s, int profondeur) {
		
		StringBuilder sb = new StringBuilder();
		
		List<Integer> li = init(s);
		
		for (Iterator<Integer> iterator = li.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (iterator.hasNext()) {
				sb.append(integer + " ");
			}
			else {
				sb.append(integer +" " +integer);
			}
		}
		
		
		return sb.toString();
	}

	private static List<Integer> init(String s) {
		List<String> l = Arrays.asList(s.split(" "));
		List<Integer> li = new ArrayList<>();
		for (String val : l) {
			li.add(Integer.parseInt(val));
		}
		return li;
	}

}
