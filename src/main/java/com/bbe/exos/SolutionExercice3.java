package com.bbe.exos;
import java.util.*;

public class SolutionExercice3 {
	
	private static int highScore = 1;
	private static Map<Integer, List<String>> m;

	public static int solve(List<String> dict) throws Exception {
		
		highScore = 1;
		int max = getMax(dict);
		
		for (int i = 2; i <= max; i++) {
			
			List<String> ls = m.get(i);
			
			if (ls==null) {
				break;
			}
			
			for (String string : ls) {
				for (int j = 0; j < string.length(); j++) {
					if (dict.contains(new StringBuilder(string).deleteCharAt(j).toString())) {
						highScore = (string.length()>highScore) ? string.length() : highScore;
					}
				}
			}
			
		}
		return highScore;
	}
	
	/**retourne le max en terme de length du dictionnaire et remplit une map contenant en clef la taille */
	private static int getMax(List<String> dict) {
		
		m = new HashMap<>();
		int i=0;
		List<String> ls;
		
		for (String string : dict) {
			
			int length = string.length();
			ls=m.get(length);
			
			if (ls==null) {
				ls = new ArrayList<>();
				ls.add(string);
			}
			else {
				ls.add(string);
			}
			
			i=(length>i) ? string.length() : i;
			m.put(length, ls);
		}
		return i;
	}
}
