
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
public class funCreator {

    public static void main(String[] args) 
    {
            try
            {
                File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "₦";
            String empName = "";
            String strtorem = "Other";
            int strtoremindex;
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {

                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase)) {
                        stindex = text.lastIndexOf(phrase);
                        empNameindex = stindex + 9;
                        endindex = empNameindex + 20;
                        empName = text.substring(stindex +1, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex -2 , empName.length());
                            System.out.println("'Net Pay' => string '"+rem.toString()+"'");
                            
                            
                        }
                        else
                        {
                            System.out.println("PROBLEMMMMM");
                        }
                        
                    }
                    doc.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
//Employee Number
/*public static void EmpNo(File[] f)
    {
        try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Employee No";
            String empName = "";
            
            for (int i = 0; i < 464; i++)
            {
                if (f[i].isFile())
                {
                    doc = PDDocument.load(f[i]);
                    PDFTextStripper strip = new PDFTextStripper();
                    String text = strip.getText(doc);
                    if(text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 13;
                        endindex = empNameindex + 7;
                        empName = text.substring(empNameindex, endindex);
                        System.out.println(empName);
                        
                    }
                    doc.close();
                }
                else
                {
                    System.out.println("Not a file");
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }*/

//Ministry/Agency
/*
     try 
        {
            File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Min";
            String empName = "";
            String strtorem = "Em";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    //System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 14;
                        endindex = empNameindex + 27;
                        empName = text.substring(stindex, endindex);
                        System.out.println(empName);
                    }
                    doc.close();
                }
            }
        }
     catch(Exception ex)
     {
         ex.printStackTrace();
     
    }
 */
//Department
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Depa";
            String empName = "";
            String strtorem = "St";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 14;
                        endindex = empNameindex + 44;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }
                        doc.close();
                }   
}

            }
        }
        catch(Exception

                    }
                    doc.c ex)
        {
            ex.printStackTrace();
        }
 */
//Location
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Location:";
            String empName = "";
            String strtorem = "Date";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 14;
                        endindex = empNameindex + 31;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
//Grade
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Grade:";
            String empName = "";
            String strtorem = "Dep";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 14;
                        endindex = empNameindex + 20;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
//Step
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Step:";
            String empName = "";
            String strtorem = "Loc";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 0;
                        endindex = empNameindex + 15;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
//Date of Birth

/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Date of Birth:";
            String empName = "";
            String strtorem = "Sec";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 20;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
// Appointment Date
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Appointment Date:";
            String empName = "";
            String strtorem = "Job";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 22;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
//Total Earnings
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Total ₦";
            String empName = "";
            String strtorem = "Rep";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 22;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
//Total Deductions
/*
         try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Total ₦";
            String empName = "";
            String strtorem = "Addit";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.lastIndexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 22;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
//Union Dues
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Union Dues";
            String empName = "";
            String strtorem = "Hea";
            String strtorem01 = "L";
            String strtorem02 = "Tot";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.lastIndexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 22;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else if(empName.contains(strtorem01))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem01);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                        }
                        else if(empName.contains(strtorem02))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem02);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                        }
                        else
                        {
                            System.out.println("None of the above");
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
// Tax
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Tax";
            String empName = "";
            String strtorem = "NHF";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 22;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                       if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
//Pension
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Pension";
            String empName = "";
            String strtorem = "Tax";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 22;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                       if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                            System.out.println("PROBLEMMMMMM");
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
// Transport Allowance
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Transport";
            String empName = "";
            String strtorem = "Mea";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 22;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                       if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                            System.out.println("PROBLEMMMMMM");
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 */
//Monthly Salary
/*
        try 
        {
           File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Monthly Basic";
            String empName = "";
            String strtorem = "Rent";
            int strtoremindex;
            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    
                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 25;
                        empName = text.substring(stindex, endindex);
                        //System.out.println(empName);
                       if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println(rem.toString());
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                            System.out.println("PROBLEMMMMMM");
                        }

                    }
                    doc.close();
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
*/

//Account Number 
/*
try {
            File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Plc";
            String empName = "";
            String strtorem = " ₦";
            int strtoremindex;
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {

                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase)) {
                        stindex = text.lastIndexOf(phrase);
                        empNameindex = stindex + 4;
                        endindex = empNameindex + 14;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println("'Account Number' => string '"+rem.toString()+"'");
                            
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }
                        doc.close();
                    }
                }
            }
            System.out.println(count);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

*/

// PERIOD
/*
        try {
            File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Period End";
            String empName = "";
            String strtorem = " to";
            int strtoremindex;
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {

                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase)) {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 12;
                        endindex = empNameindex + 50;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println("'Period' => string '"+rem.toString()+"'");
                            
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }
                        doc.close();
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
*/

//Branch Name
/*
            try {
            File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split\\");
            File[] files = folder.listFiles();
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Net Pay";
            String empName = "";
            String strtorem = "Plc";
            String strtorem01 = "Ltd.";
            String strtorem02 = "nk 6";
            int strtoremindex;
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {

                    System.out.println(files[i]);
                    doc = PDDocument.load(files[i]);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase)) {
                        stindex = text.lastIndexOf(phrase);
                        empNameindex = stindex + 9;
                        endindex = empNameindex + 50;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex + 3, empName.length());
                            System.out.println("'Branch Name' => string '"+rem.toString()+"'");
                            
                            
                        }
                        else if(empName.contains(strtorem01))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem01);
                            StringBuilder rem = str.delete(strtoremindex + 4, empName.length());
                            System.out.println("'Branch Name' => string '"+rem.toString()+"'");
                        }
                        else if(empName.contains(strtorem02))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem02);
                            StringBuilder rem = str.delete(strtoremindex + 2, empName.length());
                            System.out.println("'Branch Name' => string '"+rem.toString()+"'");
                        }
                        else
                        {
                            System.out.println("PROBLEMMMMM");
                        }
                        
                    }
                    doc.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
*/