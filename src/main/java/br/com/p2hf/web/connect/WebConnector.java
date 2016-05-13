package br.com.p2hf.web.connect;

import br.com.p2hf.connect.Connector;
import br.com.p2hf.web.connect.model.WebRequest;
import br.com.p2hf.web.connect.model.WebResponse;

public class WebConnector implements Connector {

	public WebResponse send(WebRequest request) {
		return new WebResponse();
	}
}
