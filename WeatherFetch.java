import java.io.*;
import java.net.*;
import java.util.Scanner;
import org.json.*;

public class WeatherFetch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter city name to get weather details: ");
            String city = scanner.nextLine().trim().replaceAll(" ", "%20");
            scanner.close();

            String urlString = "https://wttr.in/" + city + "?format=j1";
            URL url = new URL(urlString);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject json = new JSONObject(response.toString());

            // 🌍 Location (City + Country)
            JSONArray areaArray = json.getJSONArray("nearest_area");
            String cityName = areaArray.getJSONObject(0).getJSONArray("areaName").getJSONObject(0).getString("value");
            String country = areaArray.getJSONObject(0).getJSONArray("country").getJSONObject(0).getString("value");

            // 🌡 Current Weather
            JSONObject current = json.getJSONArray("current_condition").getJSONObject(0);
            String tempC = current.getString("temp_C");
            String humidity = current.getString("humidity");
            String condition = current.getJSONArray("weatherDesc").getJSONObject(0).getString("value");

            // 💨 Wind
            String windSpeed = current.getString("windspeedKmph");
            String windDir = current.getString("winddir16Point");

            //  Display Output
            System.out.println("\n Location: " + cityName + ", " + country);
            System.out.println(" Temperature: " + tempC + "°C");
            System.out.println(" Humidity: " + humidity + "%");
            System.out.println(" Condition: " + condition);
            System.out.println(" Wind: " + windSpeed + " km/h " + windDir);

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}