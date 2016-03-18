package data_structures;

public class Lists {

	// Lists(Static Dynamic), Queue, Stack, Dictionaries( Hash tables), Linked List, Generics
	
	//Lists(Static Lists)
	//All abstract data structures have looklike properties:
	/**
	 * 1. Add element
	 * 2. If some elements is in Object of list
	 * 3. Check does list are empty or not
	 * 4. Remove element from list
	 * 5. Give some element position in lists
	 */
	
	
	
	//Object is java key word (Object gets arraylist without any primitive type )
	private Object [] list;
	
	//list_counts - how many lists you will have 
	private int list_counts;
	
	//list_capacity - capacity of list (how many words you can write on list paper)
	private int list_capacity = 10;
	
	
	public int getLength(){
		return list_counts;
	}
	
	public Lists(){
		 list = new Object[list_capacity];
		 list_counts = 0;
	}
	
	//we need to double array size because, there is memory for old and for new array size
	public void add(int index, Object list_to_add){
		if(index <= list_capacity || index > 0){
			Object [] add_list = list;
			if (list_counts + 1 == list.length) {
				add_list = new Object[list.length *2];
			}
			System.arraycopy(list, 0, add_list, 0, index);
			list_counts++;
			System.arraycopy(list, index, add_list, index +1, list_counts - index -1);
			add_list[index] = list_to_add;
		}
	}
	
	public void add(Object add_list){
		add(list_counts, add_list);
	}
	
	
	
	//To see IndexOF (position of Object in array)
	// When if statement is true then program give us return and exit
	public int indexOf(Object position_of_Object){
		if(position_of_Object == null){
			for (int i = 0; i < list.length; i++) {
				if (list[i] == null) {
					return i;
				}
			}
		}
		else {
			for (int i = 0; i < list.length; i++) {
				if(position_of_Object.equals(list[i])){
					return i;
				}
			}
		}
		return 0;
	}
	
	//If some object is in List
	//Contains
	
	public boolean contains(Object contain_object){
		
		int index = indexOf(contain_object);
		boolean isTrue = (index != 0);
		return isTrue;
	}
	
	
	//What Object contains at some position of array
	public Object indexContain(int index){
		if(index >= list_capacity || index < 0){
			throw new IndexOutOfBoundsException(
				"You have Entered invalid index :" + index);
		}
		else{
			return list[index];
		}
		
	}
	
	
	public Object removeObj(int index){
		if(index >= list_counts || index < 0){
			throw new IndexOutOfBoundsException(
					"You have Entered invalid index :" + index);
		}
		Object removeFromArray = list[index];
		System.arraycopy(list, index + 1, list, index, list_counts-index+1);
		list[list_counts - 1] = null;
		list_counts --;
		return removeFromArray;
	}
	
	//Remove the Object from array
	public int removeObj(Object remove_object){
		int index = indexOf(remove_object);
		
		if (index == 0) {
			return index - 1;
		}
		
		else {
			System.arraycopy(list, index + 1, list, index, list_counts-index+1);
			list_counts--;
			return index;
		}
	}
	
	public static void main(String [] args){
		Lists l = new Lists();
		
		l.add("String");
		l.add(1515);
		l.removeObj(0);
		
		for (int i = 0; i <l.getLength(); i++) {
			System.out.println(l.indexContain(i));
		}
		
	}
}
