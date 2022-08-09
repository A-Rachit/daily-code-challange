package questions;
import java.util.*;
public class q3kthsmall {

	static void kthsmall(int arr[], int k) {
		Arrays.sort(arr);
		int s=arr[k-1];
		System.out.println(k + "th Smallest value in the array is " + s);
	}

	public static void main(String[] args) {
		int arr[] = {1,3,45,6,-4,7,8,89,-3};
		kthsmall(arr, 3);
	}
}
