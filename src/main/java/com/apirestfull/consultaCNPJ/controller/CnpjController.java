package com.apirestfull.consultaCNPJ.controller;

import com.apirestfull.consultaCNPJ.dto.CnpjDTO;
//import com.apirestfull.consultaCNPJ.response.CnpjResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/cnpj")
public class CnpjController {

    @Value("${api.cnpj.url}")
    private String apiCnpjUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{cnpj}")
    public ResponseEntity<CnpjDTO> getCnpj(@PathVariable String cnpj) {
        final String URLAPI = apiCnpjUrl + cnpj;

        //final CnpjDTO cnpjResponse = restTemplate.getForObject(URLAPI, CnpjDTO.class);
        //return ResponseEntity.ok(cnpjResponse);

        return Optional.ofNullable(restTemplate.getForObject(URLAPI, CnpjDTO.class))
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
