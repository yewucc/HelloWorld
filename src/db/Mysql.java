package db;

public class Mysql extends AbstractDB {

	@Override
	public void getConnection() {
		System.out.println("Mysql.getConnection()");
	}

}
