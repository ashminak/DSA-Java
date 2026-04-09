import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class JsonWriter {


    public static void printJson(Result result) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(result);
        System.out.println(json);
    }
}

