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
        public ListElement prev;
	//private ListEl
	private int data;
	
	
	public ListElement()
	{
		this.next = null;
                this.prev = null;
		this.data = 0;
		
	}
        
         public ListElement(ListElement x, ListElement y, int z)
        {
            this.next = x;
            this.prev = y;
            this.data = z;
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
       