package com.fixbot;
import java.net.http.*;
import java.net.URI;
import java.time.Duration;

public class ShippingClient {
    public void calculateRates() throws Exception {
        // FIX: Added connect and request timeouts to prevent GatewayTimeout
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.shipping.com/v1/rates"))
                .timeout(Duration.ofSeconds(5))
                .build();
        client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
