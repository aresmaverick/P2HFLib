package br.com.p2hf.web.connect;

import static org.junit.Assert.fail;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.p2hf.connect.Connector;
import br.com.p2hf.web.connect.model.Request;
import br.com.p2hf.web.server.StandAloneWebService;

public class TestWebConnector {

	private static final String BASE_URL = "http://localhost:9090";
	private static final String PACAKGE = "br.com.p2hf.web";
	StandAloneWebService saws;
	
	URI uriChamada;
	
	@Before
	public void init() {
		URI uri;
		try {
			uri = new URI(BASE_URL);

			saws = new StandAloneWebService(PACAKGE, uri);
			saws.start();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
	
	@After
	public void destroy() {
		saws.shutdown();
	}
	
	@Test
	public void test() {
		try {
			uriChamada = new URI(BASE_URL + "/myresource");
			
			Connector webConnector = new WebConnector();
			Request request = new Request(uriChamada);

			webConnector.send
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
