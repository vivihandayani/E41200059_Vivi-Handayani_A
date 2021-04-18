/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphdfs;

/**
 *
 * @author LENOVO
 */
public class Stackdfs {
    
   private final int SIZE = 20;
   private int[] st;
   private int top;
   
      public Stackdfs() {
      st = new int[SIZE];
      top = -1;
      }
   public void push(int j)
      { st[++top] = j; }
   
   public int pop()
      { return st[top--]; }
   
   public int peek()
      { return st[top]; }
   
   public boolean isEmpty()
      { return (top == -1); }
   
   }  