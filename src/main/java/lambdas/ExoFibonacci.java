package lambdas;

import java.util.stream.Stream;

public class ExoFibonacci {
	public static int getFibonacciValue(int depth) {
		return depth==0 ? 1 : Stream.iterate(1, i->i+1).limit(depth).reduce(0, (a,b) -> a+b);
	}
	
	public static int getFibonacciSuite(int depth) {
		return depth==0 ? 1 : Stream.iterate(1, i->i+1).limit(depth).reduce(0, (a,b) -> a+b);
	}
	
	
}
