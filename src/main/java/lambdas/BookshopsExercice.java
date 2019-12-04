package lambdas;

import java.util.*;
import com.google.common.collect.Collections2;

public class BookshopsExercice {

	public static int solve(int balance, List<Integer> cost, List<Integer> quantity) {
		List<Bookshop> bookshopList = generateListOfBookshop(cost, quantity);
		return solve(balance, bookshopList);
	}

	private static int solve(int balance, List<Bookshop> bookshops) {
		int currentHighScore = 0;
		Collection<List<Bookshop>> bookshopPermutations = Collections2.permutations(bookshops);// get every permutations of a given list

		for (List<Bookshop> bookshopPermutation : bookshopPermutations) {
			int currentBalance = balance;
			int newPotentialHighScore = 0;
			
			for (Bookshop bookshop : bookshopPermutation) {
				int price = bookshop.getPrice();
				
				if ( enoughMoney(currentBalance, price) ) {
					newPotentialHighScore += bookshop.getQuantity();
		 			currentBalance -= price;
				}
				else {
					break;
				}
				currentHighScore = updateIfNecessary(currentHighScore, newPotentialHighScore);
			}
		}

		return currentHighScore;
	}

	private static boolean enoughMoney(int currentBalance, int price) {
		return currentBalance>=price;
	}

	private static int updateIfNecessary(int currentHighScore, int newPotentialHighScore) {
		return newPotentialHighScore > currentHighScore ? newPotentialHighScore : currentHighScore;
	}

	private static List<Bookshop> generateListOfBookshop(List<Integer> cost, List<Integer> quantity) {
		List<Bookshop> bookshopList = new ArrayList<>();

		for (int iterateOnSizeOfBookshop = 0; iterateOnSizeOfBookshop < quantity.size(); iterateOnSizeOfBookshop++) {
			bookshopList.add(new Bookshop(quantity.get(iterateOnSizeOfBookshop), cost.get(iterateOnSizeOfBookshop)));
		}

		return bookshopList;
	}
}
