
package DAY6;

//import java.lang.reflect.Array;

public class duplicateArray {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,2,4,5,4};
		System.out.println("Element of duplicate array");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+" ");
				}
			}
		}
	}

}
