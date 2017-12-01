package zuoye2;

public class NewArray {
	// 现在有如下的一个数组：
	// int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
	// 要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
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
