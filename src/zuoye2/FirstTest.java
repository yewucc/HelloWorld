package zuoye2;

import org.junit.Test;

public class FirstTest {
	/** 第一题：打印图形 */
	@Test
	public void test1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/** 第二题：编写方法求s=a+aa+aaa+a...a */
	public static int test2(int a, int num) {
		int s = 0;
		int b = 1;
		int c = 0;
		int d = 0;
		for (int i = 0; i < num; i++) {
			b *= 10;
			c = a * b / 10;
			d += c;
			s += d;
		}
		return s;
	}

	/** 第三题：给出一组学生的成绩int[] scores求出这组成绩中100分，90-99，80-89的学生人数 */
	public static void test3(int[] scores) {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int sco : scores) {
			if (sco == 100) {
				count1++;
			} else if (sco >= 90 && sco <= 99) {
				count2++;
			} else if (sco >= 80 && sco <= 89) {
				count3++;
			}
		}
		System.out.println("100的学生人数为：" + count1);
		System.out.println("90-99的学生人数为：" + count2);
		System.out.println("80-89的学生人数为：" + count3);
	}

	/**
	 * 第四题：编写一个方法int lastIndexOf(String s,char c)，
	 * 计算出一个字符在string中第一次出现的位置（倒着数），如果在string中没有这个字符，则返回-1
	 */
	public static int lastIndexOf(String s, char c) {
		char[] charArr = s.toCharArray();
		int index = 0;
		for (int i = charArr.length - 1; i >= 0; i--) {
			if (charArr[i] == c) {
				index = i;
				break;
			} else {
				index = -1;
			}
		}
		return index;
	}

	/** 第五题：数组src从第srcPos项元素开始的length个元素拷贝到目标数组dest从destPos开始的length个元素 */
	public static void arraycopy(Object[] src, int srcPos, Object[] dest, int destPos, int length) {
		Object[] copy = new Object[length];
		for (int i = srcPos; i < srcPos + length; i++) {
			copy[i - srcPos] = src[i];
		}
		for (int i = 0; i < copy.length; i++) {
			dest[i + destPos] = copy[i];
		}
	}

	/**
	 * 第六题：先写一个图形的抽象类，在里面定义一个求面积的抽象方法，
	 * 然后分别为每种图形设计一个计算面积的子类，每个类中有所需要的属性及一个求面积的方法即可
	 */

	public static void main(String[] args) {
		// Object[] a = { 1, 2, 3, 4, 5, 6 };
		// Object[] b = { 'a', 'b', 'c', 'd', 'e', 'f' };
		// arraycopy(b, 2, a, 2, 5);
		// for (Object o : a) {
		// System.out.println(o);
		// }
		int i = 0;
		i++;
		while (i++ < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println(++i);
	}

}
