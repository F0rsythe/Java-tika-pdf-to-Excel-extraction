
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */
public class kartclass02 extends PDFTextStripper
{
    static List<String> words = new ArrayList<String>();

    public static void main(String [] args)
    {
        File file = new File("C:\\Users\\23490\\OneDrive\\Documents\\NetBeansProjects\\tutorialkart01\\kartpdf02.pdf");
        PDDocument doc = new PDDocument();
        try 
        {
            doc = PDDocument.load(file);
            PDFTextStripper strip = new kartclass02();
            strip.setSortByPosition(true);
            strip.setStartPage(0);
            strip.setEndPage(doc.getNumberOfPages());
            
            Writer wr = new OutputStreamWriter(new ByteArrayOutputStream());
            strip.writeText(doc, wr);
            for(String word:words){
                System.out.println(word); 
            }
            doc.close();
        
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    protected void writeString(String str, List<TextPosition> textPositions) throws IOException {
        String[] wordsInStream = str.split(getWordSeparator());
        if(wordsInStream!=null){
            for(String word :wordsInStream){
                words.add(word);    
}
            
        }
    }
}