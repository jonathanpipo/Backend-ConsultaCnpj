package com.apirestfull.consultaCNPJ.service;

import com.apirestfull.consultaCNPJ.dto.CnpjDTO;
//import com.apirestfull.consultaCNPJ.response.CnpjResponse;

public interface CnpjService {

	CnpjDTO fetchCnpj(String CNPJ) throws Exception;

}
