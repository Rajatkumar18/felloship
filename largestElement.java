package DAY6;

public class largestElement {
	public static void main(String[] args) {
		int arr[]=new int[] {12,73,31,86,4};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.println("Largest element in array:"+ max);
			}
		}
	}
	
	
}
	


