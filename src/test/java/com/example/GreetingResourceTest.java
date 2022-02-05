package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class GreetingResourceTest {

  @Test
  void testHelloEndpoint() {
    given().when().get("/hello").then().statusCode(200);
  }
}
