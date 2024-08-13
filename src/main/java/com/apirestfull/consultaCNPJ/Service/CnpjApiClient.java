package com.apirestfull.consultaCNPJ.Service;

import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class CnpjApiClient implements CnpjService {

    @Override
    public void getCnpj(String CNPJ) throws Exception {
        String URLAPI = "https://publica.cnpj.ws/cnpj/" + CNPJ ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URLAPI))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(json);
    }
}
