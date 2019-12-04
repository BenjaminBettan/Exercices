package com.bbe.exos;

import java.util.*;
import java.util.stream.*;

public class ExoTemperature2 {
	
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
		double minimumAbsoluteValue = Collections.max( temperatureList, new Comparator<Double>() {
	        @Override
	        public int compare(Double x, Double y) {
	            return Math.abs(x) > Math.abs(y) ? -1 : 1;
	        }
	    });
		
		return temperatureList.contains(minimumAbsoluteValue) ? minimumAbsoluteValue : - minimumAbsoluteValue;
	}



}

//private static double getClosestToZero(double[] temperatureArray) {
//
//List<Double> absTemperatures = getAbsoluteValues(temperatureList);
//
//Collections.sort(absTemperatures);
//Double t = absTemperatures.get(0);
//return temperatureList.contains(t) ? t : - t;
//}

//private static List<Double> getAbsoluteValues(List<Double> temperatureList) {
//List<Double> temperatureAbs = new ArrayList<>();
//
//for (Double temperatures : temperatureList) {
//	temperatureAbs.add(Math.abs(temperatures));
//}
//return temperatureAbs;
//}

//private static final double TEMPERATURE_MIN = -273.15;
//private static final double TEMPERATURE_MAX = 15_000_000;

/*
private static Predicate<Double> temperaturePredicate(double temperatureToReturn) {
    return p -> p > TEMPERATURE_MIN && p < TEMPERATURE_MAX;
//    return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
}
private static <T> ArrayList<T> getArrayListFromStream(Stream<T> stream){ 
	List<T> list = stream.collect(Collectors.toList()); 
	ArrayList<T> arrayList = new ArrayList<T>(list); 
	return arrayList; 
} 
*/

/*
Stream<Double> temperatureStream = temperatureList.stream().skip(1).filter(temperaturePredicate(temperatureToReturn));

// Convert Stream to ArrayList
ArrayList<Double> arrayList = getArrayListFromStream(temperatureStream); 
System.out.println(arrayList);
*/
