package java11;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class ClientHttp {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
//                .DELETE()
//                .uri(URI.create("https://cat-fact.herokuapp.com/facts/"))
//                .uri(URI.create("https://www.getpostman.com"))
//                .uri(URI.create("https://postman-echo.com/delete"))
//                .uri(URI.create("https://apichallenges.herokuapp.com/todos"))
                .uri(URI.create("https://xkcd.com/info.0.json"))
                .headers("Accept", "application/json")
//                .headers("Accept", "application/xml", "chave", "valor", "chave", "valor")
//                .header(null, null)
                .timeout(Duration.ofSeconds(3))
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(3))
                .followRedirects(Redirect.NORMAL)
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(response.statusCode());
        System.out.println(response.headers());
        System.out.println(response.version());

//        httpClient.sendAsync(request, BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenApply(String::toUpperCase)
//                .thenAccept(System.out::println);
    }

}
