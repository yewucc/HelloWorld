package hello;

public class BinarySearchDemo {
	public static void main(String[] args) {
		int[] array = { 8, 17, 19, 37, 40, 73, 79, 82, 87, 95, 97, 98 };
		int key = 40;
		int index = binarySearch(array, key);
		System.out.println(index);
	}

	private static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < key) {
				low = mid + 1;
			} else if (array[mid] > key) {
				high = mid - 1;
			} else if (array[mid] == key) {
				return mid;
			}
		}
		return -1;

	}
}
