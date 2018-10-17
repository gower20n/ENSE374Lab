/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author nicho
 */

public class ListElement {
	
	
	public ListElement next;
	//private ListEl
	private int data;
	
	
	public ListElement()
	{
		this.next = null;
		this.data = 0;
		
	}
        
         public ListElement(ListElement x, int y)
        {
            this.next = x;
            this.data = y;
        }
	
        public ListElement getNext()
        {
            return next; 
        }
	
	public void setData(int data)
	{
		this.data = data;
	}

	
	public int getData()
	{
		return this.data;
	}
        
}
       