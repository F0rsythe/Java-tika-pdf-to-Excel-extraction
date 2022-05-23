
import java.io.File;
import org.apache.tika.Tika;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Demilade
 */
public class kartclass3 
{
    public static void main (String[] args)
    {
        try
        {
        File file = new File("C:\\Users\\23490\\Downloads\\Splitted\\Splitted1\\Splitted1_1\\part1_1_1_1.pdf");
        Tika tik = new Tika();
        String text = tik.parseToString(file);
        int count = 0;
        while(text.contains("Employee Name"))
        {
            count = count + 1;
        }
        System.out.println(count);
        
    }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
}
}