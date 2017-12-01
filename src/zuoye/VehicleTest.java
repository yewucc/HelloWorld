package zuoye;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(50.0, "xiao");
		System.out.println("速度为：" + v.getSpeed());
		System.out.println("体积为：" + v.getSize() );
		System.out.println("加速后速度" + v.speedUp(10.0));
		System.out.println("减速后速度" + v.speedDown(15.0));
		
	}
}
