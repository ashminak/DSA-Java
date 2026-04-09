import java.util.*;


public class Validator {


    public static List<String> findMissing(Map<String, String> fields) {
        List<String> missing = new ArrayList<>();


        for (String key : fields.keySet()) {
            if (fields.get(key) == null || fields.get(key).isEmpty()) {
                missing.add(key);
            }
        }


        return missing;
    }
}
