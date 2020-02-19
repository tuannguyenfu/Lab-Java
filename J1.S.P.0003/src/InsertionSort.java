
public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {5,4,7,-10,2};
		insertionSort(a);
		display(a);
	}

	public static void insertionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (a[j-1] > a[j]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				} else
					break;
			}
		}
	}
	
	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
