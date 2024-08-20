package com.apirestfull.consultaCNPJ.controller;

import com.apirestfull.consultaCNPJ.dto.CnpjDTO;
import com.apirestfull.consultaCNPJ.service.CnpjServiceImpl;
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
    private CnpjServiceImpl cnpjServiceImpl;

    @GetMapping("/{cnpj}")
    public ResponseEntity<CnpjDTO> getCnpj(@PathVariable String cnpj) throws Exception {
    	
    	CnpjDTO cnpjDTO = cnpjServiceImpl.fetchCnpj(cnpj);
    	
        if (cnpjDTO != null) {
        	
            return ResponseEntity.ok(cnpjDTO);
            
        } else {
        	
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
