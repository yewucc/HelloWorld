package hello;

public class ExceptionDemo {
	public static void main(String[] args)  {
		int num1 = 3;
		int num2 = 0;
		System.out.println(div1(num1, num2));
		try {
			System.out.println(div2(num1, num2));
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Ҳ������~");
		}
	}

	public static int div1(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
			System.out.println("û�г���Ŷ��");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("������~");
		} finally {
			System.out.println("~~~~~~~~");
		}
		return result;
	}
	
	public static int div2(int num1, int num2) throws Exception {
		return num1 / num2;
	}
}
