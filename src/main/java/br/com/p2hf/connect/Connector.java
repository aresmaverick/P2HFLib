package br.com.p2hf.connect;

import br.com.p2hf.web.connect.model.WebResponse;

public interface Connector {

	public static String POST = "POST";
	public static String GET = "GET";
	
	public static String USER_AGENT = "Mozilla/5.0";
	
	public WebResponse send();
}
