package com.ibm;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HealthResourceTest {
    
    @Test
    public void testHealthEndpoint() {
        given()
          .when().get("/health")
          .then()
             .statusCode(200)
             .contentType(ContentType.JSON)
             .body("status", is("UP"));
    }

}
