package zuoye2;

public class MergeSort {
	// 现在给出两个数组：
	// · 数组a：“1，7，9，11，13，15，17，19”；
	// · 数组b：“2，4，6，8，10”
	// 两个数组合并为数组c，按升序排列
	public static void main(String[] args) {
		int[] a = { 1, 7, 9, 11, 13, 15, 17, 19 };
		int[] b = { 2, 4, 6, 8, 10 };
		int[] c = mergeSort(a, b);
		for (int i : c) {
			System.out.print(i + "  ");
		}
	}

	private static int[] mergeSort(int[] a, int[] b) {
		int[] c = merge(a, b);
		bubbleSort(c);
		return c;
	}

	private static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int m = 0;
		for (int i : a) {
			c[m] = i;
			m++;
		}
		int n = a.length;
		for (int i : b) {
			c[n] = i;
			n++;
		}
		return c;
	}

	private static void bubbleSort(int[] c) {
		for (int i = 1; i < c.length; i++) {
			for (int j = 0; j < c.length - i; j++) {
				if (c[j] > c[j + 1]) {
					swap(c, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] c, int m, int n) {
		int temp = c[m];
		c[m] = c[n];
		c[n] = temp;
	}

}
