package com.apirestfull.consultaCNPJ.Service;

import com.apirestfull.consultaCNPJ.Model.CnpjResponse;

public interface CnpjService {

	public CnpjResponse getCnpj (String CNPJ) throws Exception;

}
