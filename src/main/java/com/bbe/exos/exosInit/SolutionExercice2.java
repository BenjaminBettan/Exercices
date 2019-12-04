package com.bbe.exos.exosInit;
import java.util.*;
import java.util.stream.Collectors;

public class SolutionExercice2 {
	
	private static int highScore = 0;

	public static int solve(int solde, List<Integer> cost_, List<Integer> quantity_) throws Exception {
		
		highScore=0;
		List<Integer> indexTropCher = new ArrayList<>();
		List<Integer> cost = new ArrayList<>(cost_);
		List<Integer> quantity = new ArrayList<>(quantity_);

		//gestion des cas tordus...
		
		
		for (int i = 0; i < cost.size(); i++) {
			//on cherche les vendeurs qui sont trop cher et qui ne permettent pas le moindre achat
			if (cost.get(i)>solde) {
				indexTropCher.add(i);
			}
		}
		
		for (int i = indexTropCher.size() - 1; i >= 0 ; i--) {//on supprime ces vendeurs
			cost.remove(indexTropCher.get(i));
			quantity.remove(indexTropCher.get(i));
		}
		
		if (cost.size()!=quantity.size()) {
			throw new Exception("taille quantite/cout differentes...");
		}
		if (cost.size()==0) {
			throw new Exception("taille nulle...");
		}
		else if (cost.size()==1) {
			return calculMaxQuantite(0,quantity,cost,solde);
		}
		
		//fin des cas tordus !
		
		else {
			
			List<List<String>> listePerm = new ArrayList<>();
			
			for (int i = 0; i < cost.size(); i++) {
				List<String> permutation = new ArrayList<>();
				int maxQuantite = calculMaxQuantite(i,quantity,cost,solde);
				
				for (int quantite = 0; quantite <= maxQuantite; quantite++) {
					permutation.add(new StringBuilder().append(quantite).append(",").append(quantite*cost.get(i)).append("|").toString());
				}
				
				listePerm.add(permutation);
			}
			
			List<String> listeTotal=getPermutation(listePerm.get(0), listePerm.get(1));
			
			for (int i = 2; i < cost.size(); i++) {
				listeTotal=getPermutation(listeTotal, listePerm.get(i));
			}
			
			for (String string : listeTotal) {
				
				int solde2 = solde;
				String[] s2 = string.split("\\|");
				int q =0;
				
				for (int i = 0; i < s2.length; i++) {
					q = q + Integer.parseInt(s2[i].split(",")[0]);
					solde2 = solde2 - Integer.parseInt(s2[i].split(",")[1]);
				}
				
				highScore = (q>highScore && solde2>=0) ? q : highScore;
				
			}
			
			return highScore;
		}
	}

	private static int calculMaxQuantite(int i, List<Integer> quantity, List<Integer> cost, int solde) {
		int q = quantity.get(i);
		int c = cost.get(i);
		int maxQuantite=0;
		
		if (c==0) {//si c est gratuit
			maxQuantite=q;
		}else {
			maxQuantite = solde / c;
		}
		
		if (maxQuantite>q) {//si les stocks sont insuffisants
			maxQuantite = q;
		}
		return maxQuantite;
	}
	
	/**genere toutes les permutations de 2 listes*/
	public static List<String> getPermutation(List<String> a, List<String> b){
		return a.stream()
				.flatMap(x -> b.stream()
						.map(y -> new String(x+y))
						)
				.collect(Collectors.toList());
	}
}
