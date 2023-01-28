package exceptionsClass;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.github.dockerjava.api.model.Driver;

import findElemen.BrokenLinks;

public class ExceptError extends RuntimeException {
	
	public static String message;
	
	public  ExceptError() {
		message="this a custome exception";
	}
	public  ExceptError(String message) {
		this.message = message;
	}
	public String getMessage() {

		return message;
	}

}
