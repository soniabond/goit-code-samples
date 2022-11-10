package module13;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HomeTask13 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://jsonplaceholder.typicode.com/users/9";
//        Element body = Jsoup.connect(url)
//                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36")
//                .header()
//                .requestBody(" {\n" +
//                        "    \"name\": \"Kurtis1 Weissnat1\",\n" +
//                        "    \"username\": \"Elwyn.Skiles\",\n" +
//                        "    \"email\": \"Telly.Hoeger@billy.biz\",\n" +
//                        "    \"address\": {\n" +
//                        "      \"street\": \"Rex Trail\",\n" +
//                        "      \"suite\": \"Suite 280\",\n" +
//                        "      \"city\": \"Howemouth\",\n" +
//                        "      \"zipcode\": \"58804-1099\",\n" +
//                        "      \"geo\": {\n" +
//                        "        \"lat\": \"24.8918\",\n" +
//                        "        \"lng\": \"21.8984\"\n" +
//                        "      }\n" +
//                        "    },\n" +
//                        "    \"phone\": \"210.067.6132\",\n" +
//                        "    \"website\": \"elvis.io\",\n" +
//                        "    \"company\": {\n" +
//                        "      \"name\": \"Johns Group\",\n" +
//                        "      \"catchPhrase\": \"Configurable multimedia task-force\",\n" +
//                        "      \"bs\": \"generate enterprise e-tailers\"\n" +
//                        "    }\n" +
//                        "  }")
//                .post()
//                .body();
//        System.out.println("body = " + body);

//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .header("Content-Type","application/json")
//                .POST(HttpRequest.BodyPublishers.ofString("  {\n" +
//                        "    \"name\": \"Kurtis1 Weissnat111\",\n" +
//                        "    \"username\": \"Elwyn.Skiles1\",\n" +
//                        "    \"email\": \"Telly1.Hoeger@billy.biz\",\n" +
//                        "    \"address\": {\n" +
//                        "      \"street\": \"Rex Trail\",\n" +
//                        "      \"suite\": \"Suite 280\",\n" +
//                        "      \"city\": \"Howemouth\",\n" +
//                        "      \"zipcode\": \"58804-1099\",\n" +
//                        "      \"geo\": {\n" +
//                        "        \"lat\": \"24.8918\",\n" +
//                        "        \"lng\": \"21.8984\"\n" +
//                        "      }\n" +
//                        "    },\n" +
//                        "    \"phone\": \"210.067.6132\",\n" +
//                        "    \"website\": \"elvis.io\",\n" +
//                        "    \"company\": {\n" +
//                        "      \"name\": \"Johns Group\",\n" +
//                        "      \"catchPhrase\": \"Configurable multimedia task-force\",\n" +
//                        "      \"bs\": \"generate enterprise e-tailers\"\n" +
//                        "    }\n" +
//                        "  }"))
//                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .method("PATCH", HttpRequest.BodyPublishers.ofString("  {\n" +
                        "    \"name\": \"Kurtis1 Weissnat111\",\n" +
                        "    \"username\": \"Elwyn.Skiles1\",\n" +
                        "    \"email\": \"Telly1.Hoeger@billy.biz\",\n" +
                        "    \"address\": {\n" +
                        "      \"street\": \"Rex Trail\",\n" +
                        "      \"suite\": \"Suite 280\",\n" +
                        "      \"city\": \"Howemouth\",\n" +
                        "      \"zipcode\": \"58804-1099\",\n" +
                        "      \"geo\": {\n" +
                        "        \"lat\": \"24.8918\",\n" +
                        "        \"lng\": \"21.8984\"\n" +
                        "      }\n" +
                        "    },\n" +
                        "    \"phone\": \"210.067.6132\",\n" +
                        "    \"website\": \"elvis.io\",\n" +
                        "    \"company\": {\n" +
                        "      \"name\": \"Johns Group\",\n" +
                        "      \"catchPhrase\": \"Configurable multimedia task-force\",\n" +
                        "      \"bs\": \"generate enterprise e-tailers\"\n" +
                        "    }\n" +
                        "  }"))
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());

        System.out.println("response.body() = " + response.body());
    }
}
