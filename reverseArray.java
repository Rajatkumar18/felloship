//Java Program to reverse an array:

package DAY6;

public class reverseArray {
	public static void main(String[] args) {
		int arr[]=new int[] {2,3,4,5,6};
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
