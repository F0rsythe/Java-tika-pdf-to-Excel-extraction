

import org.apache.pdfbox.multipdf.Splitter;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */
public class NewClass
{
    public static void main (String[] args)
    {
        try
        {
        File file = new File("C:\\Users\\23490\\Downloads\\AGBOWA GENERAL HOSPITAL.pdf");
        
        PDDocument doc = PDDocument.load(file);
        
        Splitter split = new Splitter();
        split.setSplitAtPage(1);
        List<PDDocument> Pages = split.split(doc);
        Iterator<PDDocument> iterator = Pages.listIterator();
                  int i = 0;
          while(iterator.hasNext()) {
             PDDocument pd = iterator.next();
             pd.save("C:\\Users\\23490\\Downloads\\Splitted\\Split2\\f"+ ++i +".pdf");
             System.out.println("Saved C:\\Users\\23490\\Downloads\\Splitted\\Split2\\f"+ i +".pdf");
          }
           
          // close the document
          doc.close();
    }
    catch (Exception ex)
    {
        ex.printStackTrace();
    }
}
}

