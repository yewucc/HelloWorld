package zuoye;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(50.0, "xiao");
		System.out.println("�ٶ�Ϊ��" + v.getSpeed());
		System.out.println("���Ϊ��" + v.getSize() );
		System.out.println("���ٺ��ٶ�" + v.speedUp(10.0));
		System.out.println("���ٺ��ٶ�" + v.speedDown(15.0));
		
	}
}
