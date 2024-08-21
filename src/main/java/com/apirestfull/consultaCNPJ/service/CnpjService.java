package com.apirestfull.consultaCNPJ.service;

import java.util.Optional;

import com.apirestfull.consultaCNPJ.dto.CnpjDTO;

public interface CnpjService {

	Optional<CnpjDTO> fetchCnpj(String CNPJ) throws Exception;

}
