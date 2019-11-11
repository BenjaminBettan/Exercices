package com.bbe.exos;
import java.util.*;

public class SolutionExercice1 {

	public static int solve(List<Integer> arr_) {
		
		if (arr_==null || arr_.isEmpty()) {
			System.err.println("La liste est vide ou nulle");
			return 0;
		}
		
		List<Integer> arr = new ArrayList<>(arr_);
		Collections.sort(arr);//tri par ordre croissant
		
		if( new HashSet<>(arr).size() == arr.size() ){//pas de doublon
			return calculFinal(arr);
		}
		else{
			
			for(int i=0; i< arr.size(); i++){
				
				int currentValue = arr.get(i);
				
				List<Integer> subList = new ArrayList<>();
				
				for(int j = i+1; j < arr.size(); j++){//creation d'une sous liste a partir de la valeur i (non inclus)
					subList.add(arr.get(j));
				}
				
				if(subList.contains(currentValue)){//un doublon a ete detecte dans la sous liste
					arr.remove(i);//on supprime cette valeur
					arr.add(currentValue +1);//on insere cette valeur incrementee de 1
					i=0;//On parcours a nouveau toute la liste
					Collections.sort(arr);//tri par ordre croissant
				}
			}

			return calculFinal(arr);
		}
	}

	private static int calculFinal(List<Integer> arrCopy) {
		int r = 0;
		for (int val : arrCopy) {
			r+= val;
		}
		return r;
	}
}
