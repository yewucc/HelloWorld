package zuoye2;

import java.util.Scanner;

public class Bonus {
	// ������ڻ����10��Ԫʱ���������10%���������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣�
	// �����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��60��100��
	// ֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱��������Ӧ���Ž�������
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뵱������");
		double profit = scanner.nextDouble();
		double bonus = bonus(profit);
		System.out.println("������Ϊ��" + bonus + "��Ԫ");
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
