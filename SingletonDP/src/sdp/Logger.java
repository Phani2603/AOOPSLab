package sdp;

public class Logger {
	private static Logger s_instance = null;
	 private Logger() {}
		 public static Logger getInstance() {
			 if(s_instance==null) {
				 s_instance = new Logger();
			 }return s_instance;
		 }
	 public void log(String message) {
		 System.out.println("log message:"+message);
		 }
	
}
