public class q2minmax {
	static void min(int arr[]) {
		int s = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (s>arr[i]) {
				s=arr[i];
			}
		}
		System.out.println("Smallest value in the array is " + s);
	}
	static void max(int arr[]) {
		int s = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (s<arr[i]) {
				s=arr[i];
			}
		}
		System.out.println("Largest value in the array is " + s);
	}
	public static void main(String[]args) {
		int arr[]= {1,2,4,5,67,8,9,-3};
		 min(arr);
		 max(arr);
	}
}
