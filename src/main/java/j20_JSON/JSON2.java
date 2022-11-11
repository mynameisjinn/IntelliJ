package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data

class User {
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {
    public static void main(String[] args) {
        // Gson 으로 변환 할 수 있는 객체의 종류
        // JsonObject, Object, Map

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // Object(객체) -> JSON
        User user = new User("hyejin","1111","hyejin@abc.com","김혜진");

//        System.out.println(user);
//        System.out.println(gson.toJson(user));
//        System.out.println(gsonBuilder.toJson(user));
        userJson = gsonBuilder.toJson(user);

        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentname", "혜진");
        jsonObject.addProperty("studentYear", "2");
//        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);

        // Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성 노트북");
//        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);

        System.out.println(" Map 으로 변환");
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        System.out.println();
        System.out.println(" JSONObject 로 변환");
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);

        System.out.println();
        System.out.println("User객체로 변환");
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);


    }
    public static Map convertJsonToMap(String json) {
        Gson gson = new Gson();
        // fromJson(json,변환하고자하는 객체)
        return gson.fromJson(json, Map.class);
    }

    public static JsonObject convertJsonToJsonObject(String json) {
        Gson gson2 = new Gson();
        return gson2.fromJson(json, JsonObject.class);
    }

    public static User convertJsonToUser(String json) {
        Gson gson3 = new Gson();
        return gson3.fromJson(json, User.class);
    }

}
