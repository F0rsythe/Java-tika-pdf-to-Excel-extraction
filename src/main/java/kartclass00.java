
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */
public class kartclass00 
{
    public static void main (String [] args)
    {
        try
        {
            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();
            doc.addPage(page);
            
            PDFont font = PDType1Font.TIMES_ROMAN;
            PDPageContentStream stream = new PDPageContentStream(doc,page);
            stream.beginText();
            stream.setFont(font, 30);
            stream.newLineAtOffset(45,750);
            stream.showText("My name is Demilade.");
            
            stream.showText("This is text in a pdf file");
            stream.endText();
            stream.close();
            doc.save("kartpdf02.pdf");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
