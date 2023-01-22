//Java Program to sort an array in ascending order:

package DAY6;

public class accendingOrder {
	public static void main(String[] args) {
		int arr[]=new int[] {21,12,31,13,42,24};
		System.out.println("original array");
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
	}
	

}
