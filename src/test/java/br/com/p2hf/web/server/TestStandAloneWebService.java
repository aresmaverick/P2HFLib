package br.com.p2hf.web.server;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestStandAloneWebService {

	private static final String LOCALHOST = "http://localhost:9090";

	StandAloneWebService saws;
	
	URI url;
	
	@Before
	public void init() {
		try {
			url = new URI(LOCALHOST);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		saws = new StandAloneWebService("br.com.p2hf.web", url);
		saws.start();
	}
	
	@After
	public void destroy() {
		saws.shutdown();
	}
	
	@Test
	public void test() {
		URL url;
		try {
			url = new URL(LOCALHOST + "/myresource");
			URLConnection urlConn = url.openConnection();

			BufferedReader br = new BufferedReader( new InputStreamReader(urlConn.getInputStream()));
			String line = br.readLine();
			
			assertEquals("Got it!", line);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
