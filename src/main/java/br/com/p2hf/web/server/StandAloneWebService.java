package br.com.p2hf.web.server;

import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class StandAloneWebService {

	String[] packageName;
	URI url;
	
	ResourceConfig rc;
	
	HttpServer server;

	public StandAloneWebService(String packageName, URI url) {
		this(new String[] {packageName}, url);
	}
	
	public StandAloneWebService(String[] packageName, URI url) {
		this.packageName = packageName;
		this.url = url;
		
		rc = new ResourceConfig().packages(this.packageName);
		
		server = GrizzlyHttpServerFactory.createHttpServer(url, rc);
	}
}
