package hello;

public class ArrayUtil {
	/**
	 * Don't let anyone instantiate this class.
	 */
	private ArrayUtil() {
		super();
	}

	/**
	 * 求int数组的最大值
	 * 
	 * @param array
	 * @return max
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	/**
	 * 求double数数组的最大值（重载）
	 * 
	 * @param array
	 * @return max
	 */
	public static double max(double[] array) {
		double max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * 求int数组的最小值
	 * 
	 * @param array
	 * @return min
	 */
	public static int min(int[] array) {
		int min = array[0];
		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
	
	/**
	 * 求double数组的最小值(重载)
	 * 
	 * @param array
	 * @return min
	 */
	public static double min(double[] array) {
		double min = array[0];
		for (double f : array) {
			if (f < min) {
				min = f;
			}
		}
		return min;
	}

	/**
	 * 冒泡排序
	 * 
	 * @param array
	 */
	public static void bubbleSort(int[] array) {
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	/**
	 * 选择排序
	 * 
	 * @param array
	 */
	public static void selectSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}

	/**
	 * 交换数组中两个数的位置
	 * 
	 * @param array
	 * @param x
	 * @param y
	 */
	private static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
