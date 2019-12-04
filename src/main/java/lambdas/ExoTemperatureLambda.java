package lambdas;

import java.util.*;
import java.util.stream.*;

public class ExoTemperatureLambda {

	public static double closestToZero(double[] temperatureArray) throws Exception {
		if (temperatureArray==null) {
			throw new Exception("Temperature Array is mandatory");
		}
		List<Double> temperatureList = ChangetoList(temperatureArray);

		Optional<Double> minAbsList = temperatureList.stream()
				.map(Double::doubleValue)
				.reduce((a, b) -> (Math.abs(a) < Math.abs(b)) ? Math.abs(a) : Math.abs(b));

		if (minAbsList.isPresent()) {
			return temperatureList.contains(minAbsList.get()) ? minAbsList.get() : - minAbsList.get();
		}
		return 0;
	}

	private static List<Double> ChangetoList(double[] temperatureArray) {
		List<Double> temperatureList = Arrays.stream(temperatureArray).boxed().collect(Collectors.toList());
		return temperatureList;
	}

}
