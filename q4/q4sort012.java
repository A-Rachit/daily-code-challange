public class q4sort012 {

	static int[] sort012(int arr[]) {
		int[] arr0 = new int[arr.length];
		int[] arr1 = new int[arr.length];
		int[] arr2 = new int[arr.length];
		int i0 = 0, i1 = 0, i2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr0[i0] = arr[i];
				i0 += 1;
			}
			if (arr[i] == 1) {
				arr1[i1] = arr[i];
				i1 += 1;
			}
			if (arr[i] == 2) {
				arr2[i2] = arr[i];
				i2 += 1;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr1[i] != 0) {
				arr0[i0 + i] = arr1[i];
			}
		}
		i0=i0+i1;
		for (int i = 0; i < arr.length; i++) {
			if (arr2[i] != 0) {
				arr0[i0 + i] = arr2[i];
			}
		}
		
		return arr0;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,0,1,0,2,0,2,1,2,1,0,2,1,0,2,0,1,2};
		int[] sarr=sort012(arr);
		System.out.println("sorted array");
		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
	}
}
