package com.apirestfull.consultaCNPJ.Service;

import com.apirestfull.consultaCNPJ.Response.CnpjResponseDTO;

public interface CnpjService {

	public CnpjResponseDTO getCnpj (String CNPJ) throws Exception;

}
