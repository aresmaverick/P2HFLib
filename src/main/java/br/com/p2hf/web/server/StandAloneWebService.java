package br.com.p2hf.web.server;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class StandAloneWebService {

	private ResourceConfig rc;
	
	private HttpServer server;

	public StandAloneWebService(String packageName, URI url) {
		this(new String[] {packageName}, url);
	}
	
	public StandAloneWebService(String[] packageName, URI url) {
		rc = new ResourceConfig().packages(packageName);
		
		server = GrizzlyHttpServerFactory.createHttpServer(url, rc);
	}
	
	public void start() {
		try {
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void shutdown() {
		server.shutdown();
	}
}
