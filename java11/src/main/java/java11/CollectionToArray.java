package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

public class CollectionToArray {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        List<Integer> lista = List.of(1,2,3,4);
        
        Integer[] array = lista.toArray(Integer[]::new);
        
        System.out.println(array);
    }
    
}
