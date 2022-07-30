package calm.js;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		logger.error("Hello");
		
		
		Logger logger1 = new SpacedLogger();
		logger1.log("Hi");
		logger1.error("Hello");
		//System.out.println("***" + logger(log) + "***");
	}

}
