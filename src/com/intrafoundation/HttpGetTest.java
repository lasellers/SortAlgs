package com.intrafoundation;

//import static org.hamcrest.Matchers.*;

public class HttpGetTest {

/*    @Test
    void isExampleUp() {
        given().
                when().
                get("http://example.com").
                then().
                assertThat().
                statusCode(200).
                and().
                contentType(ContentType.JSON);
    }*/

   /* @Test
    void isGoogleUp2() {
        given().when().get("http://www.google.com").then().statusCode(HttpURLConnection.HTTP_OK);
    }*/

    /**
     * OkHttpClient client = new OkHttpClient();
     *
     * Request request = new Request.Builder()
     *   .url("https://freegeoip.app/json/")
     *   .get()
     *   .addHeader("accept", "application/json")
     *   .addHeader("content-type", "application/json")
     *   .build();
     *
     * Response response = client.newCall(request).execute();
     */
    /**
     * {"ip":"47.40.244.146","country_code":"US","country_name":"United States","region_code":"TN","region_name":"Tennessee","city":"Jefferson City","zip_code":"37760","time_zone":"America/New_York","latitude":36.1163,"longitude":-83.481,"metro_code":557}
     */

  /*  @Test
    void isGeoIpUS() {
        given().
                when().
                get("https://freegeoip.app/json/").
                then().
                statusCode(HttpURLConnection.HTTP_OK); //.
               // body("country_code", equals("US")).
                //body("country_name", equals("United States"));
    } */

}