import java.util.*;
import java.util.regex.*;


public class FieldExtractor {


    public static Map<String, String> extract(String text) {
        Map<String, String> map = new HashMap<>();


        map.put("policyNumber", find(text, "Policy Number[: ]+(\\w+)"));
        map.put("claimant", find(text, "NAME OF INSURED.*?\\n(.*)"));
        map.put("date", find(text, "DATE OF LOSS.*?(\\d{2}/\\d{2}/\\d{4})"));
        map.put("damage", find(text, "ESTIMATE AMOUNT[: ]+(\\d+)") );
        map.put("description", find(text, "DESCRIPTION OF ACCIDENT(.*?)LOSS"));


        return map;
    }


    private static String find(String text, String pattern) {
        Pattern p = Pattern.compile(pattern, Pattern.DOTALL);
        Matcher m = p.matcher(text);
        return m.find() ? m.group(1).trim() : null;
    }
}
