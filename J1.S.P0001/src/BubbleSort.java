import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = array(5);
		bubbleSort(a);
		display(a);
	}
	
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} 
			}
		}
	}
	
	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int[] array(int n) {
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = enterValue();
		}
		return a;
	}
	
	public static int enterValue() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				return result;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
