import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) throws ParseException {
		
		String date1 = "20371010000010";
		LOGGER.info("This is first message for test");
		
		String str = "8800773917,DL,RJ,KUCHBHU,";
		str = str.substring(0,str.lastIndexOf(","));
		LOGGER.info("Formated"+str);
		
		try {
			LOGGER.info("Formated Date [" + getISODate2(date1) + "]");
			LOGGER.info("Check what happening here");
		} catch (IOException e) {
			LOGGER.trace("An exception here",e);
		}		

	}

	public static String getISODate2(String date1) throws IOException, ParseException {
		// DateFormat df = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ssZ");
		DateFormat dft = new SimpleDateFormat("YYYYMMddHHmmss");
		DateFormat df = new SimpleDateFormat("YYYYMMdd'T'HH:mm:ssZ");
		Date formatedDate = null;
		try {
			formatedDate = dft.parse(date1);
			//int x = 1/0;
			throw new Exception();
		} 
		catch (Exception ex) {
			LOGGER.trace("An exception occcured", ex);
			//throw ex;
		}
		
		String nowAsString = df.format(formatedDate);
		return nowAsString;

	}

}
