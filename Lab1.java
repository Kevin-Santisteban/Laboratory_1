public class Lab1 {

	//Initializing constants
	final static long[] d = {4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
	final static double randomNumberMinRange = -4.0;
	final static double randomNumberMaxRange = 12.0;
	final static int width = 15;
	final static int height = 17;
	final static int[] tempArray = {5,7,11,12,13,15,16};

	//Non-constant
	static double[] x = new double[height];

	public static void main(String[] args) {

		//Filling array x with Random Numbers    
		for (int k = 0; k < height; k++) {
			x[k] = getRandomNumber(randomNumberMinRange, randomNumberMaxRange);
		}

		//Initializing 2D array.
		double[][] multidimensionalArray = new double[width][height];

		for (int i = 0; i < width; i++) {
			int tempValue = (int) d[i];
			for (int j = 0; j < height; j++) {
				if (d[i] == 14) {
					multidimensionalArray[i][j] = firstMathFunction(x, j);
					printFixedPointResult(multidimensionalArray[i][j]);

				} else if (tempValue == 5 || tempValue == 7 || (tempValue >= 11 && tempValue < 14) || (tempValue > 14 && tempValue <= 16)) {
					//}else if (isInArray((int) d[i], tempArray)) {
					multidimensionalArray[i][j] = secondMathFunction(x, j);
					printFixedPointResult(multidimensionalArray[i][j]);

				} else {

					multidimensionalArray[i][j] = thirdMathFunction(x, j);
					printFixedPointResult(multidimensionalArray[i][j]);
				}
			}

			System.out.println("");
		}

	} //Closing Main

	public static double firstMathFunction(double[] functionArray, int arrayIndex) {
		return Math.atan(0.25 * (1 / (Math.pow(Math.E, Math.abs(functionArray[arrayIndex])))));

	}

	public static double secondMathFunction(double[] functionArray, int arrayIndex) {
		return Math.asin(Math.sin(Math.asin(Math.pow(Math.E, ( - 1) * Math.abs(functionArray[arrayIndex])))));

	}

	public static double thirdMathFunction(double[] functionArray, int arrayIndex) {
		return Math.pow(Math.pow(Math.E, (Math.cbrt(Math.tan(functionArray[arrayIndex])) / 2)), 2);

	}

	public static void printFixedPointResult(double value) {
		System.out.printf("%.5f ", (float) value);
	}

	public static double getRandomNumber(double minRange, double maxRange) {
		return ((double) Math.random() * (minRange - maxRange)) + minRange;
	}

	/*    public static boolean isInArray(int value, int[] Array) {
              boolean result = false;
              for (int i: Array) {
                  if (i == value) {
                      result = true;
                  }
              }
              return result;
          }
      */

}