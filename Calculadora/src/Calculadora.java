import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Calculadora implements CalculadoraI{
    Stack<Integer> pila = new StackVector<Integer>();
   
       @Override
    public String calcular(String exp) {
        int n1;
        int n2; 
        int num; 
        int resp;
        String fin;
        char letra;
        for (int i = 0; i < exp.length(); i++) {
            letra = exp.charAt(i);
            if (letra != ' '){ 
                if(letra >= '0' && letra <= '9'){ 
                    num = Integer.parseInt("" + exp.charAt(i));
                    pila.push(num);
                }
                else if ((letra == '+')){
                    n1 = pila.pop();
                    n2 = pila.pop();
                    resp = n1+n2;
                    pila.push(resp);
                }
                else if ((letra == '-')){ 
                    n2 = pila.pop();
                    n1 = pila.pop();
                    resp = n1-n2;
                    pila.push(resp);
                }
                else if ((letra == '*')){ 
                    n1 = pila.pop();
                    n2 = pila.pop();
                    resp = n1*n2;
                    pila.push(resp);
                }
                else if ((letra == '/')){ 
                    n2 = pila.pop();
                    n1 = pila.pop();
                    resp = n1/n2;
                    pila.push(resp);
                }
            }
        }
        fin = pila.pop()+"";
        return fin;
    }
}