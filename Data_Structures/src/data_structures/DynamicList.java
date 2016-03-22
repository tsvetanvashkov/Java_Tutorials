package data_structures;

import javax.swing.text.StyledEditorKit.BoldAction;

public class DynamicList {

	private class Pointer{
		//element is the element of dynamic array
		//pointer is the next element of dynamic array
		Object element;
		Pointer next_element;
		
		Pointer(Object element, Pointer prev_element){
			this.element = element;
			prev_element = this;
			
		}
		
		//add new element in Pointer Class
		Pointer(Object element){
			this.element = element;
			next_element = null;
		}
		
	}
	
	
	private Pointer head;
	private Pointer tail;
	private int count;
	
	public DynamicList() {
		this.head = null;
		this.tail = null;
		this.count = 0;
		
	}
	
	
	
	public void add(Object add_object){
		if(head == null){
			head = new Pointer(add_object);
			tail = head;
		}
		else{
			Pointer newDynamicList = new Pointer(add_object, tail);
			tail = newDynamicList;
		}
		count++;
	}
	
	public Object remove(int index){
		
		if(index >= count || index < 0){
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		
		int curIndex = 0;
		Pointer curPointer = tail;
		Pointer prevPointer = null;
		//http://www.programcreek.com/2014/05/leetcode-remove-nth-node-from-end-of-list-java/
		while(curIndex < index){
			prevPointer = curPointer;
			curPointer = curPointer.next_element;
			curIndex++;
		}
		
		count--;
		if(count == 0){
			head = null;
			tail = null;
			
		}
		else if(prevPointer == null){
			head = curPointer.next_element;
		}
		else{
			prevPointer.next_element = curPointer.next_element;
		}
		
		return curPointer.element;
	}
	
	public int remove(Object remove_object){
		int curIndex = 0;
		Pointer curPointer = head;
		Pointer prevPointer = null;
		
		while(curPointer != null){
			if(curPointer != null && curPointer.element.equals(remove_object) ||
			((curPointer.element==null) && (remove_object == null)))
			break;
		}
		
		if(curPointer != null){
			count--;
		
		
			if(count == 0){
				head = null;
				tail = null;
				
			}else if (prevPointer == null){
				head = curPointer.next_element;
			}else {
				prevPointer.next_element = curPointer.next_element;
			}
			return curIndex;
			
		}
		
		else{
			return 0;
		}
	}
	
	public int IndexOf(Object index_object){
		int index = 0;
		Pointer curPointer = head;
		if(curPointer != null && curPointer.element.equals(index_object) ||
				((curPointer.element==null) && (index_object == null))){
			return index;
		}
		
		else {
			curPointer = curPointer.next_element;
			index++;
			return 0;
		}
		
	}
	
	public boolean contains(Object contains_obj){
		
		int index = IndexOf(contains_obj);
		boolean isContainInObject = (index != 0);
		return isContainInObject;
		
	}
	
	public int getLength(){
		return count;
	}
	
	
	public Object elementAt(int index){
		if(index >= count || index < 0){
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		Pointer curPointer = head;
		for (int i = 0; i < index; i++) {
			curPointer = curPointer.next_element;
		}
		
		 return curPointer;
	}
	
	
}
