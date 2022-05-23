
import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */
public class kartclass01
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\23490\\OneDrive\\Documents\\NetBeansProjects\\tutorialkart01\\kartpdf02.pdf");
        PDDocument doc = null;
        try
        {
            doc = PDDocument.load(file);
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(doc);
            System.out.println(text);
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
