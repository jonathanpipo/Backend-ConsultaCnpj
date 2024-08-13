package com.apirestfull.consultaCNPJ.Service;

import com.apirestfull.consultaCNPJ.Response.CnpjResponse;

public interface CnpjService {

	public CnpjResponse getCnpj (String CNPJ) throws Exception;

}
