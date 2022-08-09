package questions;

public class q1revarray {
	static void reverse(int arr[], int l) {
		int[] rarr = new int[l];
		int j = l;
		for (int i = 0; i < l; i++) {
			rarr[j - 1] = arr[i];
			j = j - 1;
		}
		for (int k = 0; k < l; k++) {
			System.out.println(rarr[k]);
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		reverse(a, a.length);
	}
}
