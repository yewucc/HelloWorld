package db;

public class Oracle extends AbstractDB {

	@Override
	public void getConnection() {
		System.out.println("Oracle.getConnection()");
	}

}
