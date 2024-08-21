package com.apirestfull.consultaCNPJ.controller;

import com.apirestfull.consultaCNPJ.dto.CnpjDTO;
import com.apirestfull.consultaCNPJ.service.CnpjService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cnpj")
public class CnpjController {

    @Value("${api.cnpj.url}")
    private String apiCnpjUrl;

    @Autowired
    private CnpjService cnpjService;

    @GetMapping("/{cnpj}")
    public ResponseEntity<CnpjDTO> getCnpj(@PathVariable String cnpj) throws Exception {
    	
    	Optional<CnpjDTO> cnpjDTO = cnpjService.fetchCnpj(cnpj);
    	
        return cnpjDTO.map(ResponseEntity::ok)
        		.orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
