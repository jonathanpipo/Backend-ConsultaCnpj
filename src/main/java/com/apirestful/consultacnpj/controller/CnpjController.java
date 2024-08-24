package com.apirestful.consultacnpj.controller;

import com.apirestful.consultacnpj.dto.CnpjDTO;
import com.apirestful.consultacnpj.service.CnpjService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cnpj")
public class CnpjController {

    @Autowired
    private CnpjService cnpjService;

    @GetMapping("/{cnpj}")
    public ResponseEntity<CnpjDTO> getCnpj(@PathVariable String cnpj) throws Exception {
    	
    	Optional<CnpjDTO> cnpjDTO = cnpjService.fetchCnpj(cnpj);
    	
        return cnpjDTO.map(ResponseEntity::ok)
        		.orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
