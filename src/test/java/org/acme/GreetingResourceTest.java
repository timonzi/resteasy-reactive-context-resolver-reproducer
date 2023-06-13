package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when()
                .body("\"dummy value\"")
                .header("Content-Type", "application/json")
                .get("/hello")
                .then()
                .statusCode(200)
                .body(is("Got value: SampleClass{myString='new class created by the deserializer', myIntValue=123}"));
    }

}