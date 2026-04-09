import java.util.*;

public class Result {

    Map<String, String> extractedFields;
    List<String> missingFields;
    String recommendedRoute;
    String reasoning;

    public Result(Map<String, String> f, List<String> m, String r) {
        this.extractedFields = f;
        this.missingFields = m;
        this.recommendedRoute = r;
        this.reasoning = "Auto decision based on rules";
    }
}

