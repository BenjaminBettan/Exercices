
package com.bbe.exos;

import java.util.*;
import java.util.stream.Collectors;

public class ExoTemperature {
	private static List<Double> temperatureList;

	public static double closestToZero(double[] temperatureArray) {
		temperatureList = toList(temperatureArray);
		return tableauVide(temperatureArray) ? 0 : getAbsoluteOfClosestToZero();
	}

	private static boolean tableauVide(double[] temperatureArray) {
		return temperatureArray.length==0;
	}

	private static double getAbsoluteOfClosestToZero() {
		Collections.sort(temperatureList);
		return temperatureList.get(0);
	}

	private static List<Double> toList(double[] temperatureArray) {
		return Arrays.stream(temperatureArray).boxed().collect(Collectors.toList());
	}
}
