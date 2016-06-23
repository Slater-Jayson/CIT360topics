package httpcommunication;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

public class TestGet {

	public static void methodGet() throws MalformedURLException, IOException{
	
		String url = "https://api.nytimes.com/svc/books/v3/lists/best-sellers/history.json";
		String charset = java.nio.charset.StandardCharsets.UTF_8.name(); //"UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
		String param1 = "?author=xyz";
		String param2 = "?title=xyz";
		// ...

		String query = String.format("param1=%s&param2=%s", 
		     URLEncoder.encode(param1, charset), 
		     URLEncoder.encode(param2, charset));
		
		URLConnection connection = new URL(url + "?" + query).openConnection();
	connection.setRequestProperty("Accept-Charset", charset);
	InputStream response = connection.getInputStream();
	// ...
	
	// InputStream response = new URL(url).openStream();
	// ...
	
	try (Scanner scanner = new Scanner(response)) {
	    String responseBody = scanner.useDelimiter("\\A").next();
	    System.out.println(responseBody);
	}
	}
}
