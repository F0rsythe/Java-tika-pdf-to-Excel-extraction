/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class karclass04 {
    public static void main(String args[]) throws IOException {
            try
        {
            //FileInputStream fin = new FileInputStream("C:\\Users\\23490\\OneDrive\\Documents\\Book01.xlsx");
            Workbook wk = new XSSFWorkbook();
            /*Sheet sh = wk.createSheet("EmployeeData");
            String[] columns = {"Employee Name", "Employee Number","Ministry/Agency","Department","Location","Grade","Step","Date of birth","Date of appointment","Period","Total Earnings","Total Deductions","Netpay","Branch Name","Account Number","Basic Salary","Transport Allowance","Pension","Tax","Union Dues"};
            Font hdfont = wk.createFont();
            hdfont.setBold(true);
            CellStyle cs = wk.createCellStyle();
            cs.setFont(hdfont);
            
            Row hdrow = sh.createRow(0);
            for (int i = 0; i < columns.length;i++)
            {
                Cell cl = hdrow.createCell(i);
                cl.setCellValue(columns[i]);
                cl.setCellStyle(cs);
            }
            for (int i = 0; i < columns.length;i++)
            {
                sh.autoSizeColumn(i);
            }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the directory of the PDF File : ");
        String PDFdir = scan.nextLine();
        System.out.println("Input the phrase to find");
        String phrase = scan.nextLine(); 
        File file = new File(PDFdir);
        PDDocument doc = PDDocument.load(file);
        PDFTextStripper findPhrase = new PDFTextStripper();
        String text = findPhrase.getText(doc);
        String PDF_content = text;
        int c = 0;
        String tr = "";
        Sheet sh1 = wk.getSheetAt(0);
        //Row r1 = sh1.setRow(1);
        Cell c1 ;
        
        int startindex;
        int indexrange;
        int endindex;
        String words[] = PDF_content.split("\\s");
        File [] files = new File("C:\\Users\\23490\\Downloads\\Splitted\\Splitted1\\Splitted1_1").listFiles();
        for (int i = 0; i < doc.getNumberOfPages();i++)
        {
              // if (PDF_content.contains(phrase))
            //{
            
                String t = w.toString();
                if (t.contains(phrase))
                {
                    c = i + 1;
                    c1 = sh1.createRow(c).createCell(0);
                    startindex = PDF_content.indexOf(phrase);
                    indexrange = startindex + 15;
                    endindex = indexrange + 29;
                    tr = PDF_content.substring(indexrange,endindex);
                    c1.setCellValue(tr);
                } else {
                }
            }

             
        }
            FileOutputStream fs = new FileOutputStream("C:\\Users\\23490\\OneDrive\\Documents\\Book01.xlsx");
            wk.write(fs);  
            fs.close();
        }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        //C:\Users\23490\Downloads\Splitted\AGBADO-OKE ODO.pdf
        
    }
}