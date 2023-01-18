import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostTest {


    @Test
    public void PostUsers() {

        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "Ana");
        requestParams.put("job", "QA");

        request.body(requestParams.toJSONString());

        Response response = request.post("/https://reqres.in/api/users");
        System.out.println("Status recebido: " + response.statusLine());
        System.out.println(response.asString());

    }
}

