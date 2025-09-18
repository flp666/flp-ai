package plus.gaga.middleware.sdk.test;

import plus.gaga.middleware.sdk.types.utils.BearerTokenUtils;

public class ApiTest {

    public static void main(String[] args) {

        String apiKeySecret = "0595979e819045c1a526004617b3b86c.CK5c7lf2pR4nxcJX";
        String token = BearerTokenUtils.getToken(apiKeySecret);
        System.out.println(token);
    }




}
