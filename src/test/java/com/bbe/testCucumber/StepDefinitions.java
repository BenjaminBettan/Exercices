package com.bbe.testCucumber;

import org.junit.Assert;

import com.bbe.exos.*;

import java.util.*;
import cucumber.api.java.en.*;

public class StepDefinitions {
	
	private List<Integer> array;//exo1
	
	//exo2
	private List<Integer> cost;
	private List<Integer> quantity;
	private int solde = 0;
	
	private List<String> dict;//exo3
	
	/**convertir une chaine en List d'integer. la chaîne est séparée de ","
	 * @param str
	 * @return
	 */
	private List<Integer> parseString(String str){
		List<Integer> array2 = new ArrayList<Integer>();
		String[] strArray = str.split(",");
		for (String string : strArray) {
			array2.add(Integer.parseInt(string));
		}
		
		return array2;
	}
	
	//exo1

	@Given("^je cherche \"(.*?)\"$")
	public void je_cherche(String str) throws Throwable {
		array = parseString(str);
	}

	@Then("^apres elimination des doublons en incrementant de un je trouve : (\\d+)$")
	public void apres_elimination_des_doublons_en_incrementant_de_un_je_trouve(int arg1) throws Throwable {
		Assert.assertTrue("Erreur dans la méthode SolutionExercice1.getMinimumUniqueSum",SolutionExercice1.solve(array) == arg1);
	}
	
	//exo2

	@Given("^j ai des inputs \"(.*?)\" \"(.*?)\" (\\d+)$")
	public void j_ai_des_inputs(String cost_, String quantity_, int solde_) throws Throwable {
		cost = parseString(cost_);
		quantity = parseString(quantity_);
		solde = solde_;
	}

	@Then("^si je dois maximiser les achats je dois obtenir : (\\d+) produits$")
	public void si_je_dois_maximiser_les_achats_je_dois_obtenir_produits(int arg1) throws Throwable {
		int r = SolutionExercice2.solve(solde,cost,quantity);
		Assert.assertTrue("Erreur dans la méthode SolutionExercice2.solve (valeur "+r+" trouvee)", r == arg1);
	}
	
	//exo3
	
	@Given("^j ai les inputs \"(.*?)\"$")
	public void j_ai_les_inputs(String arg1) throws Throwable {
		dict = Arrays.asList(arg1.split(","));
	}

	@Then("^Resolution : (\\d+)$")
	public void resolution(int arg1) throws Throwable {
		int r = SolutionExercice3.solve(dict);
		Assert.assertTrue("Erreur dans la méthode SolutionExercice3.solve (valeur "+r+" trouvee)", r == arg1);
	}
}
