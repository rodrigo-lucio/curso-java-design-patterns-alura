package br.com.lucio.loja.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpURLConnectionApiCep implements HttpAdapterConsultaCep {

    private static final String URL_API = "https://viacep.com.br/ws/%s/json/";
    
    @Override
    public String get(String cep) {
        String url = String.format(URL_API, cep);
        try {
            System.out.println("Consultando cep para " + URL_API + " utilizando HttpClient");
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body().toString();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisição HTTP para " + URL_API, e);
        }
        
    }

}
