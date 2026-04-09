
import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class PdfReader {


    public static String readPdf(String path) throws Exception {
        PDDocument doc = PDDocument.load(new File(path));
        PDFTextStripper stripper = new PDFTextStripper();
        String text = stripper.getText(doc);
        doc.close();
        return text;
    }
}

