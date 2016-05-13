package br.com.p2hf.web.connect.model;

import java.net.URI;

import br.com.p2hf.connect.Request;

public class WebRequest implements Request {

	URI uriDestino;
	String submitMethod;
	Content content;
	
	public WebRequest (URI uriDestino) {
		this.uriDestino = uriDestino;
	}
	
	
}
