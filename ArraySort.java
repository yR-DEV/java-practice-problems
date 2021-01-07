import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] numberArray = { 4, 2, 5, 1, 3 };
		sortArray(numberArray);
		System.out.println(Arrays.toString(numberArray));
	}
	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					// swapping array[i] and array[j]
					int tempInt = arr[i];
					arr[i] = arr[j];
					arr[j] = tempInt;
				}
			}
		}
	}
}