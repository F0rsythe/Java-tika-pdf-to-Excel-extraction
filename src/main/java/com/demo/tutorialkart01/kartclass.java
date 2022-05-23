/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.tutorialkart01;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author Demilade
 */
public class kartclass 
{
    public static void main(String[] args)
    {
        String fileName = "C:\\Users\\23490\\Downloads\\AGBADO-OKE ODO.pdf";
        PDDocument doc;
        File fName = new File(fileName);
        
        try 
        {
            doc = PDDocument.load(fName);
            PDFTextStripper txtstrip = new PDFTextStripper();
            String pdfText = txtstrip.getText(doc);
            System.out.println(pdfText);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
