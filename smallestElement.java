package DAY6;

public class smallestElement {
	public static void main(String[] args) {
		int arr[]=new int[] {12,6,32,9,21};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				System.out.println("Smallest number in array:"+min);
			}
		}
	}

}
