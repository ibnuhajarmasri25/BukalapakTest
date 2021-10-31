import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class TS01_GET {
    @Test
    void test_01() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
        int statuscode = response.getStatusCode();
        Assert.assertEquals(statuscode, 200);
        System.out.println("Succes Get URL and Status Code & Get Body: "+ statuscode + " " + response.getBody().asString());
        System.out.println(response.getTime());

    }
    @Test
    public void JSONSchemaValidation() {
        File schema = new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"Json"+File.separator+"schema.json");
        given()
                .get("https://jsonplaceholder.typicode.com/posts")
//       Validation with JsonSchemaValidator
                .then()
                .body(matchesJsonSchema(schema));

        System.out.println("Succes Running Test!!!");

    }
}
