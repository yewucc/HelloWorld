package hello;

import org.junit.Test;

public class Trim {
	@Test
	public void testTrim() {
		String str = "---java android--";
		String str1 = "-----";
		String str2 = "-";
		String str3 = null;
		System.out.println(trim(str));
		System.out.println(trim(str1));
		System.out.println(trim(str2));
		System.out.println(trim(str3));
	}
	
	public  String trim(String str){
		if(str == null){
			return null;
		}
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		while((beginIndex <= endIndex) && (str.charAt(beginIndex)) == '-'){
			beginIndex ++;
		}
		while((beginIndex <= endIndex) && (str.charAt(endIndex)) == '-'){
			endIndex --;
		}
		return str.substring(beginIndex, endIndex + 1);
	}
	
	@Test
	public void testBu(){
		String str1 = "java";
		String str2 = "android";
		String str3 = "ios";
		StringBuffer buffer1 = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer();
		buffer1.append(str1);
		buffer1.append(str2);
		buffer1.append(str3);
		System.out.println(buffer1);
		buffer2.append(str1).append(str2).append(str3);
		System.out.println(buffer2);
		
		StringBuilder bulider1 = new StringBuilder();
		StringBuilder bulider2 = new StringBuilder();
		bulider1.append(str1).append(str2).append(str1);
		System.out.println(bulider1);
		bulider2.append(str1);
		bulider2.append(str2);
		bulider2.append(str1);
		System.out.println(bulider2);
		
		String str = "java" + "android" + "ios";
		System.out.println(str);
	}
}
