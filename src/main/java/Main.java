import dao.DbAdapter;

public class Main {

	public static void main(String[] args) {
		// Connect
		DbAdapter dbAdapter = new DbAdapter();
		dbAdapter.connect();
		dbAdapter.disconnect();
	}

}
