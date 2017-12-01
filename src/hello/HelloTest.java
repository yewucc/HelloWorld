package hello;

import org.junit.Test;

public class HelloTest {
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	@Test
	public void testsum() {
		int[] array = { 1, 5, 3, 6 };
		int sum = sum(array);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}

	// @Test
	// public void test1() {
	// int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0,
	// 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
	// int[] num = new int[10];
	// for (int i = 0; i < score.length; i++) {
	// if (score[i] == 0) {
	// num[0]++;
	// } else if (score[i] == 1) {
	// num[1]++;
	// } else if (score[i] == 2) {
	// num[2]++;
	// } else if (score[i] == 3) {
	// num[3]++;
	// } else if (score[i] == 4) {
	// num[4]++;
	// } else if (score[i] == 5) {
	// num[5]++;
	// } else if (score[i] == 6) {
	// num[6]++;
	// } else if (score[i] == 7) {
	// num[7]++;
	// } else if (score[i] == 8) {
	// num[8]++;
	// } else if (score[i] == 9) {
	// num[9]++;
	// }
	// }
	// for (int i : num) {
	// System.out.println(i);
	// }
	// }
	//
	// @Test
	// public void buttonSort(){
	// int[] num={15,21,7,48,34};
	// for (int i = 1; i < num.length; i++) {
	// for (int j = 0; j < num.length-i; j++) {
	// if(num[j]>num[j+1]){
	// int temp=num[j];
	// num[j]=num[j+1];
	// num[j+1]=temp;
	// }
	// }
	// }
	// for (int i : num) {
	// System.out.println(i);
	// }
	// }

	// @Test
	// public void selectSort(){
	// int[] num={15,21,7,48,34};
	// for (int i = 0; i < num.length-1; i++) {
	// for (int j = i+1; j < num.length; j++) {
	// if(num[i]>num[j]){
	// int temp=num[i];
	// num[i]=num[j];
	// num[j]=temp;
	// }
	// }
	// }
	// for (int i : num) {
	// System.out.println(i);
	// }
	// }

	@Test
	public void testAdd() {
		Cal cal = new Add(3, 5);
		int result = cal.getResult();
		System.out.println(result);
	}

	@Test
	public void testArrayUtil() {
		int[] array = { 1, 5, 27, 33, 9, 21, 18 };
		System.out.println(ArrayUtil.max(array));
		System.out.println(ArrayUtil.min(array));
		ArrayUtil.selectSort(array);
		for (int i : array) {
			System.out.print(i + "  ");
		}
	}

}
