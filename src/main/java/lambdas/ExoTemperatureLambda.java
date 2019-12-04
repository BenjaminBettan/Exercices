package lambdas;

import java.util.*;
import java.util.stream.*;

public class ExoTemperatureLambda {
	
	public static double closestToZero(double[] temperatureArray) {
		return testTableauVide(temperatureArray) ? 0 : getClosestToZero(temperatureArray);
	}

	private static List<Double> ChangetoList(double[] temperatureArray) {
		List<Double> temperatureList = Arrays.stream(temperatureArray).boxed().collect(Collectors.toList());
		return temperatureList;
	}
	
	private static boolean testTableauVide(double[] temperatureArray) {
		return temperatureArray.length==0;
	}

	private static double getClosestToZero(double[] temperatureArray) {
		List<Double> temperatureList = ChangetoList(temperatureArray);
		
		Optional<Double> minAbsList = temperatureList.stream()
				.map(Double::doubleValue)
				.reduce((a, b) -> (Math.abs(a) < Math.abs(b)) ? Math.abs(a) : Math.abs(b));
		
		if (minAbsList.isPresent()) {
			return temperatureList.contains(minAbsList.get()) ? minAbsList.get() : - minAbsList.get();
		}
		else {
			return 0;
		}
		 
	}
}
