package AssignmentOOPArray;

public class PresentInArray {
//Find if value present in array or not	

	public static double FindaNum(double[] num,double value) {
		
		for (double d : num) {
			if(d == value) {
				return value;
			}
		}
		
		return -1;//indicate value not found in array
	}

//calculate average marks
	
	public static double avgMarks(double[] num) {
		double avg = 0;
		for (double d : num) {
			avg+=d;
		}
		return avg/num.length;
	}
	
	public static void main(String[] args) {
		double[] data = {12.34,56.87,12,44,72};
		double val = 72;
		double result =  FindaNum(data, val);
		if(result == -1) {
			System.out.println("Value not present in array "+val);
		}else {
			System.out.println("Value present in array "+val);
		}
		
		double avgMark = avgMarks(data);
		
		System.out.printf("Average marks = %.2f",avgMark);
		
	}
}
