package AssignmentOOPArray;

public class PassArrayToMethod {
	
	public static void findMin(int a[]) {
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Minmum value in array is: "+min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,35,21,3,45,22,9};
		
		PassArrayToMethod.findMin(arr);
		
	}

}
