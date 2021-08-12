package java11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ClientHttp_2 {

    private static final int TIMEOUT = 30;

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException, TimeoutException {
        var path = Path.of("body.txt");
        byte[] readAllBytes = Files.readAllBytes(path);
        var fileInputStream = new FileInputStream(path.toFile());

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
//                .POST(BodyPublishers.ofString("{\"canal\": \"RinaldoDev\"}"))
//                .POST(BodyPublishers.ofFile(path))
//                .POST(BodyPublishers.ofByteArray(readAllBytes))
//                .POST(BodyPublishers.ofInputStream(() -> fileInputStream))
//                .PUT()
//                .uri(URI.create("https://postman-echo.com/post"))
                .uri(URI.create("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.12%2B7/OpenJDK11U-jdk_x64_windows_hotspot_11.0.12_7.msi"))
                .headers("Accept", "application/xml")
                .timeout(Duration.ofSeconds(TIMEOUT))
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(TIMEOUT))
                .followRedirects(Redirect.NORMAL)
//                .executor(Executors.newFixedThreadPool(2))
//                .proxy(ProxySelector.of(new InetSocketAddress("186.148.172.110", 8181)))
                .build();

        httpClient.sendAsync(request, 
//                BodyHandlers.ofString()
//                BodyHandlers.ofByteArray()
//                BodyHandlers.ofInputStream()
//                BodyHandlers.ofFile(Path.of("bodyResponse.txt"))
                BodyHandlers.ofFileDownload(Path.of("download"), StandardOpenOption.CREATE, StandardOpenOption.WRITE)
                )
//                .thenApply(HttpResponse::body)
//                .thenApply(String::toUpperCase)
//                .thenApply(t -> {
//                    try {
//                        return t.readAllBytes();
//                    } catch (IOException e) {
//                        return null;
//                    }
//                })
//                .thenApply(String::new)
//                .thenAccept(System.out::println)
                .get(TIMEOUT, TimeUnit.SECONDS);
    }

}
