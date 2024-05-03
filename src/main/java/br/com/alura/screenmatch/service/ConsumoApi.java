package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public String obterDados(String endereco) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco)) //a URI diz para
                // qual endereço irá ser feita uma requisição
                .build();
        HttpResponse<String> response = null;
        try { //Tenta receber resposta da URI
            response = client //O client manda a requisição e
                    // eu recebo a resposta(response)
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Essa string json recebe o corpo da resposta
        String json = response.body();
        return json;
    }
}
