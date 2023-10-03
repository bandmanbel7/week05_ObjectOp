package week05_ObjectOP;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger();
		
		logger.log("Basketball"); 
	
		logger.error("Football");
		
		Logger loggers = new SpacedLogger();
		
		loggers.log("Soccer".replace("", " ").trim());
		
		loggers.error("Baseball".replace("", " ").trim());
		
	}
	
	

}
