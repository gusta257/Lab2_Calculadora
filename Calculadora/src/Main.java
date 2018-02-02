/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Gustavo De Leon 17085
 * @author Luis Esturban 17256
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");
        Calculadora calc = new Calculadora();
        
        try {
            String sCadena;
            FileReader fr = new FileReader("datos.txt");
            BufferedReader bf = new BufferedReader(fr);
            while ((sCadena = bf.readLine())!=null) {       
                System.out.println(calc.calcular(sCadena));
            } 

        }catch(Exception e){
            System.out.println("Documento no encontrado o dañado :( por favor verificar");
            }
        System.out.println("Gracias por esperar");
    }
}

