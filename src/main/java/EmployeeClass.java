



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */
public class EmployeeClass 
{
    public static void main(String[] args){
        try
        {
            File fi = new File("C:\\Users\\23490\\OneDrive\\Documents\\Book01.xlsx");
            FileInputStream fin = new FileInputStream(fi);
            Workbook wk = new XSSFWorkbook("C:\\Users\\23490\\Downloads\\Splitted\\AGBADO-OKE ODO.pdf");
            Sheet sh = wk.createSheet();
            Sheet sh1;
            String[] columns = {"Employee Name", "Employee Number","Ministry/Agency","Department","Location","Grade","Step","Date of birth","Date of appointment","Period","Total Earnings","Total Deductions","Netpay","Branch Name","Account Number","Basic Salary","Transport Allowance","Pension","Tax","Union Dues"};
            Font hdfont = wk.createFont();
            hdfont.setBold(true);
            CellStyle cs = wk.createCellStyle();
            cs.setFont(hdfont);
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
            String empName = "";
            int c = 0;
            Row hdrow = sh.createRow(1);
            for (int i = 0; i < columns.length;i++)
            {
                Cell cl = hdrow.createCell(i);
                cl.setCellValue(columns[i]);
                cl.setCellStyle(cs);
            }
            
            
            int rownum = 1;
            for (int i = 0; i < doc.getNumberOfPages();i++)
        {
               if (PDF_content.contains(phrase))
            {
                sh1 = wk.getSheet("EmployeeData");
                Row rw = sh1.getRow(1);
                Cell c1 = rw.createCell(0);
                empName = PDF_content.substring(109,135);
                c1.setCellValue(empName);
            } 
        }
           /* for (Employee em: emp)
            {
                empName = 
            }*/
            
            for (int i = 0; i < columns.length;i++)
            {
                sh.autoSizeColumn(i);
            }
            FileOutputStream fs = new FileOutputStream("C:\\Users\\23490\\OneDrive\\Documents\\Book01.xlsx");
            wk.write(fs);  
            fs.close();
            wk.close();
        }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }

    }
}
        /*Workbook wk = new XSSFWorkbook();
        Sheet sh = wk.getSheet("EmployeeData");
        
        Row r1 = sh.getRow(1);
        Cell c1 = null;*/