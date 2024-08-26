package com.apirestful.consultacnpj.service;

import java.util.Optional;

import com.apirestful.consultacnpj.dto.CnpjDTO;

public interface CnpjService {

	Optional<CnpjDTO> fetchCnpj(String cnpj) throws Exception;

}
