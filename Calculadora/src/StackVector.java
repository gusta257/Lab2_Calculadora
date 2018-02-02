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
public class StackVector<E> implements Stack<E> {
     protected Vector<E> lista;
     
     public StackVector(){
         lista= new Vector<E>();
     }
      public StackVector(int n){
         lista= new Vector<E>(n);
     }
     public void push(E item){
          lista.add(item);
     }

   public E pop(){
        return lista.remove(size()-1);
   }

   public E peek(){
       return lista.get(size()-1);
   }

   public boolean empty(){
       boolean vacio;
       if(lista.isEmpty()==true){
           vacio = true;
       }
       else{
           vacio = false;
       }
       return vacio;
   }

   public int size(){
       return lista.size();
   }
    
}
