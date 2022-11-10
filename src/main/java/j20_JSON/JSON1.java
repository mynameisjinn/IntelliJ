package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "HyeJin");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "hyejin@abc.com");
        jsonObject.addProperty("username", "김혜진");
        jsonObject.addProperty("birth", 1997);

        System.out.println(jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);


    }
}
