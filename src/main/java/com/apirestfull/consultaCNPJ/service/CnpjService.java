package com.apirestfull.consultaCNPJ.service;

import com.apirestfull.consultaCNPJ.dto.CnpjDTO;

public interface CnpjService {

	CnpjDTO fetchCnpj(String CNPJ) throws Exception;

}
