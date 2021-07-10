package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClientHttp {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest request =
          HttpRequest.newBuilder()
            .uri(URI.create("https://www.google.com.br/"))
            .GET()
            .build();

        HttpResponse<String> response =
          httpClient.send(request, BodyHandlers.ofString());
        
        System.out.println(response.body());
        
    }
    
}
