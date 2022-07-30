package calm.js;

public class AsteriskLogger implements Logger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String Log) {
		// TODO Auto-generated method stub
		System.out.println("***" + Log + "***");
	}

	@Override
	public void error(String Error) {
		// TODO Auto-generated method stub
	System.out.println("**************************");
	System.out.println("    ***Error: " + Error + "***");
	System.out.println("**************************");
	}

}
