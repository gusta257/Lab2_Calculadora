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
            sCadena = bf.readLine();
        //Prueba para ver como lee las lineas
            System.out.println("hola");
        //Finaliza prueba        
            System.out.println(sCadena);
        //Otra forma para leer lineas
            //sCadena = bf.readLine();
            //System.out.println(sCadena);
        //Finaliza forma
 } 

} catch(Exception e)
        {
            System.out.println("Documento no encontrado o dañado :( por favor verificar");
}
     System.out.println("Gracias por esperar");
}
    }

