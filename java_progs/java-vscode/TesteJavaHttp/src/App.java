import java.util.Scanner;
import java.net.URI;
import java.net.http.*;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.lang.Object;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String id = "c5451c17c17cd1d107abd2920782a680";
        String urlBase = "https://api.openweathermap.org/data/2.5/weather?" + "appid=" + id;
        String url = addCity(urlBase ,"London");
        System.out.println(url);

        // getJsonFromApi(url);

        String jsonBody = "{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":291.49,\"feels_like\":291.65,\"temp_min\":290.4,\"temp_max\":293.25,\"pressure\":1015,\"humidity\":87},\"visibility\":10000,\"wind\":{\"speed\":2.06,\"deg\":260},\"clouds\":{\"all\":90},\"dt\":1632574615,\"sys\":{\"type\":2,\"id\":2019646,\"country\":\"GB\",\"sunrise\":1632549089,\"sunset\":1632592368},\"timezone\":3600,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
        postJsonToApi(jsonBody, url);
    }

    public static void postJsonToApi(String jsonBody, String url) {
        HttpRequest request = HttpRequest.newBuilder(URI.create(url))
                                .POST(BodyPublishers.ofString(jsonBody))
                                .header("accept", "application/json")
                                .build();
        HttpClient client = HttpClient.newHttpClient();
        
        try {
            var response = client.send(request, BodyHandlers.ofString());
            System.out.println(response);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void getJsonFromApi(String url) {
        //create a client
        var client = HttpClient.newHttpClient();

        // create a request
        var request = HttpRequest.newBuilder(URI.create(url))
            .GET()
            .header("accept", "application/json")
            .build();

        // use the client to send the request
        try { 
            //the response
            var response = client.send(request, BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String addCity(String urlBase ,String city) {
        String urlWithCity = urlBase + "&q=" + city;
        return urlWithCity;
    }
}