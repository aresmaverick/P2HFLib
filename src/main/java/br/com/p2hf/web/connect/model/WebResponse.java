package br.com.p2hf.web.connect.model;

import br.com.p2hf.connect.Response;

public class WebResponse implements Response {

	@Override
	public boolean isValid() {
		return false;
	}

	@Override
	public int getStatusCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}
