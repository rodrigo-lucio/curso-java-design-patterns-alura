package br.com.lucio.loja.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpClientViaCep implements HttpAdapterConsultaCep {

    private static final String URL_API = "https://viacep.com.br/ws/%s/json/";
    
    @Override
    public String get(String cep) {
        try {
            System.out.println("Consultando cep para " + URL_API + " utilizando URLConnection");
            URL url = new URL(String.format(URL_API, cep));
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));

            return jsonSb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisição HTTP para " + URL_API, e);
        }
        
    }

}
