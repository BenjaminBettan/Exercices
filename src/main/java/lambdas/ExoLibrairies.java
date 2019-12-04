package lambdas;

import java.util.*;

public class ExoLibrairies {

	public static int solve(int solde, List<Integer> cost, List<Integer> quantity) {
		List<Librairie> librairies = genereListeDeLibrairiesEtTrieLesParPrix(cost, quantity);
		return calcul(solde, librairies);
	}

	private static int calcul(int solde, List<Librairie> librairies) {
		int nbLivreQueJePeuxAcheter = 0;
		
		for (Librairie librairie : librairies) {
			for (int i = 0; i < librairie.getNbLivres(); i++) {
				if (solde - librairie.getPrice()<0) {//je n ai plus d argent
					return nbLivreQueJePeuxAcheter;
				}
				else {
					solde = solde - librairie.getPrice();
					nbLivreQueJePeuxAcheter++;
				}
			}
		}
		return nbLivreQueJePeuxAcheter;
	}

	private static List<Librairie> genereListeDeLibrairiesEtTrieLesParPrix(List<Integer> cost, List<Integer> quantity) {
		List<Librairie> librairies = new ArrayList<>();
		
		for (int i = 0; i < quantity.size(); i++) {
			librairies.add(new Librairie(quantity.get(i), cost.get(i)));
		}
		
		librairies.sort(Comparator.comparing(Librairie::getPrice));
		
		return librairies;
	}
}
