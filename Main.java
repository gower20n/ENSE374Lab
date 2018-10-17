/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
import java.util.Scanner;

/**
 *
 * @author nicho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListElement head = new ListElement(null, null, 0);
        ListElement tail = head;
                
       
        
        int input, index, result;        
        char choice = 'z';//initialize the choice so it can be used with out while loop 
        
        while(choice != 'q'){
        System.out.println("Please enter a choice: ");
        System.out.println("a: Add a node");
        System.out.println("r: Retrieve a node");
        System.out.println("d: Delete a node");
        System.out.println("h: Print the list (head->tail)");
        System.out.println("t: Print the list (tail->head)");
        System.out.println("q: Exit the program");
        
        Scanner reader = new Scanner(System.in);
        choice = reader.next().charAt(0); 
        
        switch(choice){
            case 'a':    
            System.out.println("Please enter a number to add to the list");
            Scanner varInput = new Scanner(System.in);
            input = varInput.nextInt(); 
            addNode(head, input);
            tail = endOfList(head);
            break;
            
            case 'r': 
            System.out.println("Enter the index as a number to be retrieved");
            Scanner varIndex = new Scanner(System.in);
            index = varIndex.nextInt();
            result = retrieveNode(head, index); 
            System.out.println("The data is " + result);
            break;
            
            case 'd':
            System.out.println("Enter the index of a number to be deleted");
            Scanner toBeDel = new Scanner(System.in);
            index = toBeDel.nextInt();
            delete(head, index); 
            break;
            
            case 'h': 
            printListHead(head); 
            break;
            
            case 't':
            printListTail(tail);
            break;
            
            case 'q': 
            System.exit(0);
            
            
            default: System.out.println("Invalid input, enter a new choice"); break;
            
        }
        }
    }
    
    
      public static void addNode(ListElement h, int toAdd){
          if(h.next == null)
          {
          h.next = new ListElement(null, h, toAdd);
          }
          else 
          addNode(h.next, toAdd);

        }
      public static int retrieveNode(ListElement curr, int index){
          for(int i = 0; i < index; i++)
          {
              if(curr.next == null)
                  System.out.println("Index out side of range of list");
              curr = curr.next;
              
          }
          
          return curr.getData();
      }
      public static void delete(ListElement h, int index)
      {
          for(int i = 0; i < index-1; i++)
          {
              if(h.next == null)
                  System.out.println("Index out side of range of list");
              h = h.next;
          }
          if(h.next.next != null)
          {
              h.next = h.next.next;
              h.next.next.prev = h;
          }
          else h.next = null;
      }
      
      public static void printListHead(ListElement h)
      {
          while(h.next != null)
          {
              System.out.print(h.next.getData() + " ");
              h = h.next;
          }
          System.out.println();
      }
      
      public static void printListTail(ListElement t)
      {
          while(t.prev != null)
          {
              System.out.print(t.getData() + " ");
              t = t.prev;
          }
          System.out.println();
      }
      
      public static ListElement endOfList(ListElement h)
      {
          while(h.next != null)
              h = h.next;
          
          return h;
      }
}




  
