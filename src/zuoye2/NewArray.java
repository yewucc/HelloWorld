package zuoye2;

public class NewArray {
	// ���������µ�һ�����飺
	// int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
	// Ҫ������������ֵΪ0����ȥ��������Ϊ0��ֵ����һ���µ����飬���ɵ�������Ϊ��
	// int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
	public static void main(String[] args) {
		int[] oldArr = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int[] newArr = nozero(oldArr);
		for (int i : newArr) {
			System.out.print(i + "  ");
		}
	}

	private static int[] nozero(int[] oldArr) {
		int count = 0;
		for (int a : oldArr) {
			if (a != 0) {
				count++;
			}
		}
		int[] newArr = new int[count];
		int i = 0;
		for (int a : oldArr) {
			if (a != 0) {
				newArr[i] = a;
				i++;
			}
		}
		return newArr;
	}
}
