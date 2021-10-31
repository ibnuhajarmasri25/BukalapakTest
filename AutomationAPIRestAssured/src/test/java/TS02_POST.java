import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TS02_POST {

    @Test
    public void Test1_Post() {

        JSONObject Req = new JSONObject();
//        Put json
        Req.put("title","recommendation");
        Req.put("body","motorcycle");
        Req.put("userId",12);

        System.out.println(Req);
//        Req env
        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(Req.toJSONString()).
                when().
                post("https://jsonplaceholder.typicode.com/posts").
                then()
                .statusCode(201)
                .log().all();
        System.out.println("Success!!!");
    }
}
