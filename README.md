# REST-API-CLIENT

COMPANY : CODTECH IT SOLUTIONS

NAME : MULA SAMEERA

INTERNID : CT04DN836

DOMAIN : JAVA PROGRAMMING

DURATION : 4 WEEKS

MENTOR : NEELA SANTOSH

##DESCRIPTION

### Description of the WeatherFetch Java Program:

The WeatherFetch Java program is a simple, effective, and interactive console-based application designed to fetch and display real-time weather data for any city in the world. It utilizes Java’s core networking and I/O libraries to make HTTP requests and process the response data in JSON format. The primary goal of the application is to demonstrate how to consume a web-based API using Java, making it a useful educational tool for beginners and intermediate developers who want to explore HTTP communication, API integration, and JSON parsing.

This program connects to the public weather API provided by wttr.in, which delivers weather details in JSON format for a given location. The user simply enters a city name, and the program sends a request to the API, retrieves the data, processes it, and then displays the weather details including temperature, humidity, weather condition, and wind speed/direction.

 ### Program Structure and Core Features:
 
The entire program is written in one class named WeatherFetch. It performs several distinct operations in sequence:

1.User Input: The program uses Scanner to capture user input for the city name. It also formats the city name to replace spaces with %20 for compatibility in URL encoding.

2.API Request: A URL is constructed using the input city name and formatted to request data in JSON using the ?format=j1 query parameter from the wttr.in API. The program then establishes an HTTP GET connection using HttpURLConnection.

3.Data Reading: The response from the API is read using a BufferedReader, and all lines are appended to a StringBuilder. This forms the raw JSON response string which contains the weather information.

4.JSON Parsing: The raw JSON is parsed using the org.json library (e.g., JSONObject, JSONArray) to extract useful weather data. This includes:

City name and country (from the "nearest_area" object).

Temperature in Celsius, humidity percentage, and weather condition (from the "current_condition" object).

Wind speed and wind direction.

5.Display Results: The extracted information is neatly formatted and printed to the console, offering a quick overview of current weather conditions.

6.Error Handling: A try-catch block surrounds the entire logic to handle any exceptions related to network errors, malformed JSON, or invalid input. This ensures that the program doesn’t crash and gives meaningful feedback if something goes wrong.

### Use Cases:

This program is more than just an educational tool — it has practical applications in many real-life scenarios:

1.Weather Monitoring: Users can check the weather of any city directly from the terminal without opening a browser or weather app.

2.API Integration Demo: It provides a live example of how third-party REST APIs can be integrated into Java applications.

3.Data Dashboard: It can be extended into a full desktop or web app that displays weather for multiple locations or stores historical data.

4.Learning Tool: For Java learners, this project illustrates how to:

     .Work with URLs and HTTP connections

     .Read and parse JSON in Java

     .Handle user input and exceptions gracefully

  ###  Required Libraries:
Java Standard Library: java.io, java.net, and java.util

External Library: org.json (you must include the json-<version>.jar in your classpath)

 ### How to Run:
 

1.Compile the program:

          javac -cp .;json-20210307.jar WeatherFetch.java

2. Run the program:

           java -cp .;json-20210307.jar WeatherFetch

### OUTPUT:

![Image](https://github.com/user-attachments/assets/1c978316-9839-40b5-9824-38b54cb0c2ce)




