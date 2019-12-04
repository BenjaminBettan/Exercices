package lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.Collections2;

public class ExoLibrairies {

	public static int solve(int solde, List<Integer> cost, List<Integer> quantity) {
		List<Librairie> librairies = genereListeDeLibrairies(cost, quantity);
		return solve(solde, librairies);
	}

	private static int solve(int solde, List<Librairie> librairies) {
		int nbLivreQueJePeuxAcheter = 0;
		int soldeCopy = solde;
        Collection<List<Librairie>> permutations = Collections2.permutations(librairies);
        
        for (List<Librairie> list : permutations) {
			
		}
		
        return nbLivreQueJePeuxAcheter;
	}

	private static List<Librairie> genereListeDeLibrairies(List<Integer> cost, List<Integer> quantity) {
		List<Librairie> librairies = new ArrayList<>();
		
		for (int i = 0; i < quantity.size(); i++) {
			librairies.add(new Librairie(quantity.get(i), cost.get(i)));
		}
		
		return librairies;
	}
	
	
}
