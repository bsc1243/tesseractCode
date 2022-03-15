import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class textReader {
    public static void main(String[] args) {
        File image = new File("/Users/benjaminszovaticoulter/Desktop/testFile1.jpeg");
        Tesseract tessInst = new Tesseract();
        //tessInst.setLanguage("por");
        tessInst.setDatapath("/Users/benjaminszovaticoulter/Desktop/Tess4J 2/tessdata");
        try {
            String result= tessInst.doOCR(image);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }

    }
}

