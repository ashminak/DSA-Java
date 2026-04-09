import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "claim.pdf";

            // Step 1: Read PDF
            String text = PdfReader.readPdf(filePath);

            // Step 2: Extract fields
            Map<String, String> fields = FieldExtractor.extract(text);

            // Step 3: Validate missing fields
            List<String> missing = Validator.findMissing(fields);

            // Step 4: Route decision
            String route = Router.route(fields, missing);

            // Step 5: Prepare result
            Result result = new Result(fields, missing, route);

            // Step 6: Print JSON
            JsonWriter.printJson(result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
