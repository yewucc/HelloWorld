package hello;

public class ArrayUtil {
	/**
	 * Don't let anyone instantiate this class.
	 */
	private ArrayUtil() {
		super();
	}

	/**
	 * ��int��������ֵ
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
	 * ��double����������ֵ�����أ�
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
	 * ��int�������Сֵ
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
	 * ��double�������Сֵ(����)
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
	 * ð������
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
	 * ѡ������
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
	 * ������������������λ��
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
