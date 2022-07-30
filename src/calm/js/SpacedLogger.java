package calm.js;

public class SpacedLogger implements Logger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String Log) {
		// TODO Auto-generated method stub
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < Log.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(Log.charAt(i));
		}

		System.out.println(result.toString());
		//System.out.println(Log);
	}

	@Override
	public void error(String Error) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < Error.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(Error.charAt(i));
		}

		System.out.println("Error: " + result.toString());
	}
		

}

