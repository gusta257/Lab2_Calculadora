/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Gustavo
 * @author Luis Esturban
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");
        
    try {
        FileReader fr = new FileReader("C:\\Users\\Luis\\Desktop\\Prueba\\datos.txt");
        BufferedReader bf = new BufferedReader(fr);
        String sCadena;
  
        while ((sCadena = bf.readLine())!=null) {
        System.out.println(sCadena);
        //sCadena = bf.readLine();
        //System.out.println(sCadena);
 } 

} catch(Exception e)
        {
            System.out.println("valio");
}
     System.out.println("Gracias por esperar");
}
    }

