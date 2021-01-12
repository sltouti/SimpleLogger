import org.apache.log4j.Logger;  
  
import java.io.*;  
import java.sql.SQLException;
  
public class MyLogger{  
  
   /* Get the class name to be printed on */  
   static Logger log = Logger.getLogger(MyLogger.class.getName());
   
   public static void main(String[] args)throws IOException,SQLException{  
      log.trace("Logging trace message");
	  log.debug("Logging debug message");  
      log.info("Logging info message");
      log.warn("Logging warn message");
      log.error("Logging error message");
      log.fatal("Logging fatal message");
   }  
}  