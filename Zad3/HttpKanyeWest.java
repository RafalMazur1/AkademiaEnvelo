package Zad3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedList;
import java.util.List;

public abstract class HttpKanyeWest {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .build();
    private static final List<String> kanyeWestQuotes = new LinkedList<>();

    private static final HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.kanye.rest/text"))
            .build();

    public static void getQuoteFromKanyeWest() throws IOException, InterruptedException {

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        while (isThereSuchQuote(response.body())) {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        }
        kanyeWestQuotes.add(response.body());
        System.out.println(response.body());
    }

    private static boolean isThereSuchQuote(String quote) {
        for (String o : HttpKanyeWest.kanyeWestQuotes) {
            if (o.equals(quote)) {
                return true;
            }
        }
        return false;
    }
}
