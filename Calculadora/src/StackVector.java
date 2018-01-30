/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class StackVector implements Stack {
    private Stack<String> E = new E<String>();
    public void push(E item){
        return ;
    }
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
  
   
   public E pop(){
       return;
   }
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
    
}
