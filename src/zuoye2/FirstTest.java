package zuoye2;

import org.junit.Test;

public class FirstTest {
	/** ��һ�⣺��ӡͼ�� */
	@Test
	public void test1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/** �ڶ��⣺��д������s=a+aa+aaa+a...a */
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

	/** �����⣺����һ��ѧ���ĳɼ�int[] scores�������ɼ���100�֣�90-99��80-89��ѧ������ */
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
		System.out.println("100��ѧ������Ϊ��" + count1);
		System.out.println("90-99��ѧ������Ϊ��" + count2);
		System.out.println("80-89��ѧ������Ϊ��" + count3);
	}

	/**
	 * �����⣺��дһ������int lastIndexOf(String s,char c)��
	 * �����һ���ַ���string�е�һ�γ��ֵ�λ�ã����������������string��û������ַ����򷵻�-1
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

	/** �����⣺����src�ӵ�srcPos��Ԫ�ؿ�ʼ��length��Ԫ�ؿ�����Ŀ������dest��destPos��ʼ��length��Ԫ�� */
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
	 * �����⣺��дһ��ͼ�εĳ����࣬�����涨��һ��������ĳ��󷽷���
	 * Ȼ��ֱ�Ϊÿ��ͼ�����һ��������������࣬ÿ������������Ҫ�����Լ�һ��������ķ�������
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
