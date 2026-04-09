import java.util.*;


public class Router {


    public static String route(Map<String, String> fields, List<String> missing) {


        if (!missing.isEmpty())
            return "Manual Review";


        String description = fields.get("description").toLowerCase();


        if (description.contains("fraud") || description.contains("staged"))
            return "Investigation";


        try {
            double damage = Double.parseDouble(fields.get("damage"));
            if (damage < 25000)
                return "Fast Track";
        } catch (Exception ignored) {}


        if (description.contains("injury"))
            return "Specialist Queue";


        return "Normal Processing";
    }
}
