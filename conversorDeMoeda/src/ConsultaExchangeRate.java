import com.google.gson.Gson;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class ConsultaExchangeRate {
    public RespostaExchangeRate buscaMoeda(String moedaInicial, String moedaFinal, Double valorMoeda){

        URI urlConversor = URI.create("https://v6.exchangerate-api.com/v6/640c58f5d8f11ad790a7d4f9/pair/" +
                moedaInicial + "/" + moedaFinal + "/" + valorMoeda);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(urlConversor)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), RespostaExchangeRate.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}