
public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {1,-10,5,8,8,5,-2,-7};
		selectionSort(a);
		display(a);
	}
	
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
