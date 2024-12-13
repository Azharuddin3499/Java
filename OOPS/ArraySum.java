package AssignmentOOPArray;
//Q1: Add elements in an array
public class ArraySum {
	public static double sum(double[] values) {
		double value = 0;
		for (double d : values) {
			value+=d;
		}
		return value;
	}
	
	public static void main(String[] args) {
		double[] data = {12.34,56.87,12,44,72};
		System.out.printf("Sum is: %.2f%n",sum(data)); //%n for new line
		System.out.printf("Sum is: %.2f",sum(data)); 
	}
}
