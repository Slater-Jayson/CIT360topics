
package httpcommunication;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GetGson {
	
	public void getGson() throws IOException {
	String ip;
	String sURL = "http://jsonip.com"; //a string that has the url with the free API

    // connect to URL using java
    URL url = new URL(sURL);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
    request.connect();

    // converting to json object
    JsonParser jp = new JsonParser(); //gson
    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert input to json
    JsonObject rootobj = root.getAsJsonObject(); //root or object. 
    ip = rootobj.get("ip").getAsString(); //grab ip
	System.out.println(ip);
}
}
