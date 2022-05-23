
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */
public class kartclass05 
{
    public static void main (String[] args)
    {
        try
        {
            
                    File folder = new File("C:\\Users\\23490\\Downloads\\Splitted\\Split");
        File [] files = folder.listFiles();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string you want to search for: ");
        String str;
        str = sc.nextLine();
        String str1;
        int stindex;
        int endindex;
        String empName ="";
        BufferedReader br = new BufferedReader(new FileReader(""));  
String line = null;  
while ((line = br.readLine()) != null)  
{  
     
}
        }

        
        for (int i = 0; i<files.length; i++)
        {
            if(files[i].toString().contains(str))
            {
                System.out.println("Present");
            }
        }
       /* for (File dir: files)
        {
            str1 = dir.toString();
            if (str1.contains(str))
            {
                stindex = str1.indexOf(str);
                endindex = stindex + 40;
                empName = str1.substring(stindex, endindex);
                System.out.println(empName);
            }
            else
            {
                System.out.println("Not there");
            }
                  
        }*/
        //System.out.println(dir.getName());
    }
}
