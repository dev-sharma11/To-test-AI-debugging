package com.fixbot;
import java.net.http.*;
import java.net.URI;

public class ShippingClient {
    public void calculateRates() throws Exception {
        // BUG: No timeout set, will hang if API is slow
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.shipping.com/v1/rates"))
                .build();
        client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
