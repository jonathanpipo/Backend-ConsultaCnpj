package com.apirestful.consultaCNPJ.service;

import java.util.Optional;

import com.apirestful.consultaCNPJ.dto.CnpjDTO;

public interface CnpjService {

	Optional<CnpjDTO> fetchCnpj(String CNPJ) throws Exception;

}
