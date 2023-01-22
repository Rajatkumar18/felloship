package DAY6;
import java.util.Arrays;

public class addElementToArray {
	public static void main(String[] args) {
		int arr[] = {12,32,54,63};  
		int n = arr.length;  
		int newArr[] = new int[n+1];  
		int value = 67;  
		System.out.println(Arrays.toString(arr));  
		for(int i = 0; i<n; i++) {  
		newArr[i] = arr[i];  
		}  
		newArr[n] = value;  
		System.out.println(Arrays.toString(newArr));  
	}

}
