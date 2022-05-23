
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */
public class kartclass06 
{
    public static Workbook wk;
    public static Sheet sh;
    public static Sheet sh1;
    public static Cell c1;
    public static void main(String []args) throws FileNotFoundException, IOException
    {
       
        try 
        {
           
            wk = new XSSFWorkbook();
            sh = wk.createSheet("Details");
            String[] columns = {"Employee Name", "Employee Number","Ministry/Agency","Department","Location","Grade","Step","Date of birth","Date of appointment","Period","Total Earnings","Total Deductions","Netpay","Branch Name","Account Number","Basic Salary","Transport Allowance","Pension","Tax","Union Dues"};
            Font hdfont = wk.createFont();
            hdfont.setBold(true);
            CellStyle cs = wk.createCellStyle();
            cs.setFont(hdfont);
            Row hdrow = sh.createRow(0);
            for (int i = 0; i < columns.length;i++)
            {
                Cell cell = hdrow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(cs);
            }
            for (int i = 0; i < columns.length;i++)
            {
                sh.autoSizeColumn(i);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        int cnt = 0;
        File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split2");
        File[] files = folder.listFiles();
        for(int i = 0; i < files.length;i++)
        {
            empName(files[i], cnt);
            //empNo(files[i], cnt);
            //minAgency(files[i], cnt);
            //dep(files[i], cnt);
            //loc(files[i], cnt);
            //grade(files[i], cnt);
            //step(files[i], cnt);
            //dob(files[i], cnt);
            //doa(files[i], cnt);
            //period(files[i], cnt);
            //totEarnings(files[i], cnt);
            //totDeductions(files[i], cnt);
            //netpay(files[i],cnt);
            //branchName(files[i], cnt);
            //accountNo(files[i],cnt);
            //basicSalary(files[i],cnt);
            //transportAllowance(files[i],cnt);
            //pension(files[i],cnt);
            //tax(files[i], cnt);
            //unionDues(files[i],cnt);
            cnt++;
        FileOutputStream fs = new FileOutputStream("C:\\Users\\23490\\Downloads\\Splitted\\Split2\\Employee.xlsx");
        wk.write(fs);
        fs.close();
        

        }
        wk.close();

        
    }
    public static void empName(File f ,int i)
    {
        try 
        {
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Employee Name";
            String empName = "";
            String strtorem = "Number";
            int strtoremindex;
                if (f.isFile())
                {
                    
                    //System.out.println(files[i]);
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 14;
                        endindex = empNameindex + 43;
                        empName = text.substring(empNameindex +1, endindex);
                        //System.out.println(empName);
                        
                        if (empName.contains(strtorem))
                        {
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(0);
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex -1, empName.length());
                            System.out.println("'Employee Name' => string '"+rem.toString()+"'");
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(0);
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }
                    }
                    doc.close();
                }
                else
                {
                    System.out.println("This is not a file");
                }
        }
        catch(Exception ez)
            {
                ez.printStackTrace();
            }
    }
    public static void empNo(File f, int i)
    {
        try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Employee No";
            String empName = "";
            String strtorem = "M";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper strip = new PDFTextStripper();
                    String text = strip.getText(doc);
                    if(text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 13;
                        endindex = empNameindex + 10;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println("'Employee number' => string '"+empName+"'");
                        if (empName.contains(strtorem))
                        {
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(1);
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println("'Employee number' => string '"+rem.toString()+"'");
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(1);
                            
                        }
                        else 
                        {
                            System.out.println("'Employee number' => string '"+empName+"'");
                        }
                    }
                    doc.close();
                }
                else
                {
                    System.out.println("Not a file");
                }
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void minAgency(File f, int i)
    {
        try 
        {
            int count = 0;
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Min";
            String empName = "";
            String strtorem = "Em";
            int strtoremindex;
                if (f.isFile())
                {
                    
                    //System.out.println(files[i]);
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 17;
                        endindex = empNameindex + 27;
                        empName = text.substring(empNameindex, endindex - 4);
                        System.out.println("'Ministry\\Agency' => string '"+empName+"'");
                        int c = 1 + i;
                        sh1 = wk.getSheetAt(0);
                        c1 = sh1.createRow(c).createCell(2);
                        c1.setCellValue(empName);
                        sh1.autoSizeColumn(2);
                    }
                    doc.close();
                }
        }
     catch(Exception ex)
     {
         ex.printStackTrace();
     
    }
    }
    public static void dep(File f, int i)
    {
        try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Depa";
            String empName;
            String strtorem = "St";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 12;
                        endindex = empNameindex + 44;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex -1, empName.length() );
                            System.out.println("'Department' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(3);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(3);
                            
                        }
                        else 
                        {
                            System.out.println("'Department' => string '"+empName+"'");
                        }
                        doc.close();
                    }   
                }

            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void loc(File f, int i)
    {
        try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Location:";
            String empName;
            String strtorem = "Date";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 10;
                        endindex = empNameindex + 31;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex - 1, empName.length());
                            System.out.println("'Location' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(4);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(4);
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void grade(File f, int i)
    {
        try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Grade:";
            String empName = "";
            String strtorem = "Dep";
            int strtoremindex;
                if (f.isFile())
                {
                    System.out.println(f);
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 7;
                        endindex = empNameindex + 20;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex -1, empName.length());
                            System.out.println("'Grade' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(5);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(5);
                        }
                        else 
                        {
                            System.out.println("PROBLEMMMMM");
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void step(File f , int i)
    {
        try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Step:";
            String empName;
            String strtorem = "Loc";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 6;
                        endindex = empNameindex + 15;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex - 2, empName.length());
                            System.out.println("'Step' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(6);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(6);
                            
                        }
                        else 
                        {
                            System.out.println("'Step' => string '"+empName+"'");
                        }

                    }
                    doc.close();
                }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void dob(File f, int i)
    {
        try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Date of Birth:";
            String empName = "";
            String strtorem = "Section:";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 15;
                        endindex = empNameindex + 30;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println("'Date of Birth' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(7);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(7);
                        }
                        else 
                        {
                            System.out.println("PROBLEMMM");
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void doa(File f, int i)
    {
                try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Appointment Date:";
            String empName = "";
            String strtorem = "Job";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 18;
                        endindex = empNameindex + 22;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex, empName.length());
                            System.out.println("'Date of Appointment' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(8);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(8);
                            
                        }
                        else 
                        {
                            System.out.println(empName);
                        }

                    }
                    doc.close();
                }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void period(File f, int i)
    {
                try {

            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Period End";
            String empName = "";
            String strtorem = " to";
            int strtoremindex;
                if (f.isFile()) {
                    doc = PDDocument.load(f);
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
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(9);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(9);
                            
                            
                        }
                        else 
                        {
                            System.out.println("'Period' => string '"+empName+"'");
                        }
                        doc.close();
                    }
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void totEarnings(File f, int i)
    {
                try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Total ₦";
            String empName = "";
            String strtorem = "Rep";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 6;
                        endindex = empNameindex + 22;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex -2, empName.length());
                            System.out.println("'Total Earnings' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(10);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(10);
                        }
                        else 
                        {
                            System.out.println("'Total Earnings' => string '"+empName+"'");
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void totDeductions(File f, int i)
    {
                 try 
        {

            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Total ₦";
            String empName = "";
            String strtorem = "Addit";
            int strtoremindex;
           
            
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.lastIndexOf(phrase);
                        empNameindex = stindex + 6;
                        endindex = empNameindex + 22;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex - 2, empName.length());
                            System.out.println("'Total Deductions' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(11);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(11);
                            
                        }
                        else 
                        {
                            System.out.println("'Total Deductions' => string '"+empName+"'");
                        }

                    }
                    doc.close();
                }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
        public static void netpay(File f, int i)
    {
                    try
            {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "₦";
            String empName = "";
            String strtorem = "Other";
            int strtoremindex;
                if (f.isFile()) {

                    doc = PDDocument.load(f);
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
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(12);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(12);
                            
                            
                        }
                        else
                        {
                            System.out.println("PROBLEMMMMM");
                        }
                        
                    }
                    doc.close();
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void branchName(File f, int i)
    {
            try {
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
                if (f.isFile()) {
                    doc = PDDocument.load(f);
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
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(13);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(13);
                            
                            
                        }
                        else if(empName.contains(strtorem01))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem01);
                            StringBuilder rem = str.delete(strtoremindex + 4, empName.length());
                            System.out.println("'Branch Name' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(13);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(13);
                        }
                        else if(empName.contains(strtorem02))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem02);
                            StringBuilder rem = str.delete(strtoremindex + 2, empName.length());
                            System.out.println("'Branch Name' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(14);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(13);
                        }
                        else
                        {
                            System.out.println("PROBLEMMMMM");
                        }
                        
                    }
                    doc.close();
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void accountNo(File f, int i)
    {
        try {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Plc";
            String empName = "";
            String strtorem = " ₦";
            int strtoremindex;
                if (f.isFile()) {
                    doc = PDDocument.load(f);
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
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(14);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(14);
                        }
                        else 
                        {
                            System.out.println("PROBLEMMM");
                        }
                        doc.close();
                    }
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void basicSalary(File f, int i)
    {
                try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Monthly Basic";
            String empName = "";
            String strtorem = "Rent";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 21;
                        endindex = empNameindex + 25;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                       if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex - 2, empName.length());
                            System.out.println("'Basic Salary' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(15);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(15);
                            
                        }
                        else 
                        {
                            System.out.println("PROBLEMMMMMM");
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void transportAllowance(File f,  int i)
    {
                try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Transport";
            String empName = "";
            String strtorem = "Mea";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 20;
                        endindex = empNameindex + 22;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                       if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex - 1, empName.length());
                            System.out.println("'Transport Allowance' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(16);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(16);
                            
                        }
                        else 
                        {
                            System.out.println("PROBLEMMMMMM");
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
        public static void pension(File f, int i)
    {
                try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Pension";
            String empName = "";
            String strtorem = "Tax";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 8;
                        endindex = empNameindex + 22;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                       if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex -1, empName.length());
                            System.out.println("'Pension' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(17);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(17);
                        }
                        else 
                        {
                            System.out.println("PROBLEMMMMMM");
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void tax(File f, int i)
    {
                try 
        {
            PDDocument doc;
            int stindex;
            int empNameindex;
            int endindex;
            String phrase = "Tax";
            String empName = "";
            String strtorem = "NHF";
            int strtoremindex;
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.indexOf(phrase);
                        empNameindex = stindex + 4;
                        endindex = empNameindex + 22;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                       if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex - 1, empName.length());
                            System.out.println("'Tax' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(18);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(18);
                        }
                        else 
                        {
                            System.out.println("PROBLEMMMMM");
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void unionDues(File f,int i)
    {
                try 
        {
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
                if (f.isFile())
                {
                    doc = PDDocument.load(f);
                    PDFTextStripper findPhrase = new PDFTextStripper();
                    String text = findPhrase.getText(doc);
                    if (text.contains(phrase))
                    {
                        stindex = text.lastIndexOf(phrase);
                        empNameindex = stindex + 11;
                        endindex = empNameindex + 26;
                        empName = text.substring(empNameindex, endindex);
                        //System.out.println(empName);
                        if (empName.contains(strtorem))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem);
                            StringBuilder rem = str.delete(strtoremindex -1, empName.length());
                            System.out.println("'Union Dues' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            sh1 = wk.getSheetAt(0);
                            c1 = sh1.createRow(c).createCell(19);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(19);
                            
                        }
                        else if(empName.contains(strtorem01))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem01);
                            StringBuilder rem = str.delete(strtoremindex -1, empName.length());
                            System.out.println("'Union Dues' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            c1 = sh1.createRow(c).createCell(19);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(19);
                        }
                        else if(empName.contains(strtorem02))
                        {
                            StringBuilder str = new StringBuilder(empName);
                            strtoremindex = empName.indexOf(strtorem02);
                            StringBuilder rem = str.delete(strtoremindex -1, empName.length());
                            System.out.println("'Union Dues' => string '"+rem.toString()+"'");
                            int c = 1 + i;
                            c1 = sh1.createRow(c).createCell(19);
                            c1.setCellValue(rem.toString());
                            sh1.autoSizeColumn(19);
                        }
                        else
                        {
                            System.out.println("Problem");
                        }

                    }
                    doc.close();
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

