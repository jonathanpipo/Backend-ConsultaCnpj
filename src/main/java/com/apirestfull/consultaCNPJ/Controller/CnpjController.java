package com.apirestfull.consultaCNPJ.Controller;

import com.apirestfull.consultaCNPJ.Response.CnpjResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/cnpj")
public class CnpjController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{cnpj}")
    public ResponseEntity<CnpjResponseDTO> getCnpj(@PathVariable String cnpj) {
        String URLAPI = "https://publica.cnpj.ws/cnpj/" + cnpj;
        CnpjResponseDTO cnpjResponse = restTemplate.getForObject(URLAPI, CnpjResponseDTO.class);
        return ResponseEntity.ok(cnpjResponse);
    }
}
