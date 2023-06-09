package examples;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Chapter1Test {

    @Test
    public void requestUSZipCode90210_CheckPlaceNameInResponseBody_ShouldEqualBeverlyHills() {

        given().when().get("http://zippopotam.us/us/90210").then().assertThat().body("places[0].'place name'",
                equalTo("Beverly Hills"));
    }
}
