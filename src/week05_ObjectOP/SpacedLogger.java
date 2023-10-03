package week05_ObjectOP;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println(log);
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("Error: " + error);
		
	}

}
