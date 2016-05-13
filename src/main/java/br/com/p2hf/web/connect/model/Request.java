package br.com.p2hf.web.connect.model;

import java.net.URI;

public class Request {

	URI uriDestino;
	String submitMethod;
	Content content;
	
	public Request (URI uriDestino, String submitMethod, Content content) {
		this.uriDestino = uriDestino;
		this.submitMethod = submitMethod;
		this.content = content;
	}
	
	
}
