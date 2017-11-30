package hello;

public class Demo3 {
	public static void main(String[] args) {
		Integer integer1 = 5;
		int i = integer1;
		int j = 3;
		Integer integer2 = j + 3;
		Double pi = 3.14;
		integer1 += 3;
		System.out.println(i);
		System.out.println(integer1);
		//基本数据类型转字符串
		String str1 = integer1 + "";
		System.out.println(str1);
		String str2 = i + "";
		System.out.println(str2);
		String str3 = Integer.toString(j);
		System.out.println(str3);
		String str4 = Integer.toString(integer2);
		System.out.println(str4);
		String str5 = Double.toString(pi);
		System.out.println(str5);
		System.out.println("------------");
		//字符串转基本数据类型
		int value1 = Integer.parseInt(str1);
		Integer value2 = Integer.parseInt(str2);
		int value3 = Integer.parseInt(str3);
		Integer value4 = Integer.parseInt(str4);
		double value5 = Double.parseDouble(str5);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		Double d = value5;
		String s = str5;
		System.out.println(d);
		System.out.println(s);

	}
}
