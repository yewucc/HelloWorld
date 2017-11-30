package hello;

import java.util.regex.Pattern;

import org.junit.Test;

public class RegexTest {
	@Test
	public void testMatch(){
		String regex1 = "(\\+86|0086)?\\s?\\d{11}";
		String tel = "008615650163873";
		System.out.println(tel.matches(regex1));
		System.out.println(Pattern.matches(regex1, tel));
		
		String regex2 = "[0-9a-zA-Z-_]+@\\w+(\\.[a-z]+)+";
		String mail1 = "frgg_fb-h12AD@cde_AS121.com";
		String mail2 = "frgg_fb-h12AD@cde_AS121.com.cn.gov";
		System.out.println(mail1.matches(regex2));
		System.out.println(Pattern.matches(regex2, mail2));
	}
	
	@Test
	public void testSplit(){
		String regex1 = "\\d*4\\d*";
		String regex2 = "\\d*48";
		String str = "affefSAC148vsfdsvXCds144cdsc48vssc-NK_cns248A";
		String[] splitArray1 = str.split(regex1);
		for (String s : splitArray1) {
			System.out.println(s);
		}
		System.out.println("----------");
		String[] splitArray2 = str.split(regex2);
		for (String s : splitArray2) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testReplace(){
		String regex1 = "\\d*48";
		String regex2 = "\\d*4\\d*";
		String str = "affefSAC148vsfdsvXCds144cdsc48vssc-NK_cns248A";
		System.out.println(str.replaceAll(regex1, "##"));
		System.out.println(str.replaceAll(regex2, "##"));
	}
}
