package zuoye2;

import java.util.Scanner;

public class Bonus {
	// 利润低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，
	// 可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万
	// 之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入当月利润：");
		double profit = scanner.nextDouble();
		double bonus = bonus(profit);
		System.out.println("奖金数为：" + bonus + "万元");
	}

	private static double bonus(double profit) {
		double donus = 0;
		if (profit > 0 && profit <= 10) {
			donus = profit * 0.1;
		} else if (profit > 10 && profit <= 20) {
			donus = 1 + (profit - 10) * 0.075;
		} else if (profit > 20 && profit <= 40) {
			donus = 1.75 + (profit - 20) * 0.05;
		} else if (profit > 40 && profit <= 60) {
			donus = 2.75 + (profit - 40) * 0.03;
		} else if (profit > 60 && profit <= 100) {
			donus = 3.35 + (profit - 60) * 0.015;
		} else {
			donus = 3.95 + (profit - 100) * 0.01;
		}
		return donus;
	}

}
