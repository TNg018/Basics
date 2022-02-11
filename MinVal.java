//chloe nguyen
//Data Structures Spring 2022
//0.1b #6 Accept three integer values as parameters and return the smallest one

public class MinVal {
  public static void main(String[] args) {
        display_MinVal(10,12,7);
  }
  private static void display_MinVal(int a, int b, int c) {
   int[] intArray = new int[]{a,b,c};
   int minValue = intArray[0];
		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] < minValue)
			{
				minValue = intArray[i];
			}
		}
		//return minValue;
		System.out.println("Minimum value of integers " + a + ", " + b + ", and " + c + " is " + minValue);
	}
}