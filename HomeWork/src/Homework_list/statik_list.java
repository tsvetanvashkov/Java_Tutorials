package Homework_list;

public class statik_list {

	private Object [] list1;
	private int list1_count;
	private int list1_capacity = 10;
	
	public int getLeght(){
		return list1_count;
	}
	
	public statik_list(){
		
		list1 = new Object[list1_capacity];
		list1_count = 0;
	}
	/////////////////////////////////////////////////////////////////////////////
	public void add(int index, Object list1_to_add){
		if(index <= list1_capacity || index > 0){
			Object [] add_list1 = list1;
			if(list1_count + 1 == list1.length){
				add_list1 = new Object[list1.length * 2];
			}
			System.arraycopy(list1, 0, add_list1, 0, index);
			list1_count++;
			System.arraycopy(list1, index, add_list1, index + 1, list1_count  - index- 1);
			add_list1[index] = list1_to_add;
		}
	}
	
	public void add(Object add_list1){
		add(list1_count, add_list1);
	}
	/////////////////////////////////////////////////////////////////////////
	public int indexOf(Object position_of_object){
		if(position_of_object == null){
			for(int i = 0; i < list1.length; i++){
				if(list1[i] == null){
					return i;
				}
			}
		}
		else{
			for(int i = 0; i < list1.length; i++){
				if(position_of_object.equals(list1[i])){
					return i;
				}
			}
		}
		return 0;
	}
	///////////////////////////////////////////////////////////////////////////
	public boolean contains(Object contain_object){
		int index = indexOf(contain_object);
		boolean isTrye = (index != 0);
		return isTrye;
	}
	
	public Object indexContain(int index){
		if(index >= list1_capacity || index < 0){
			throw new IndexOutOfBoundsException("You have Entered invalid index :" + index);
		}
		else{
			return list1[index];
		}
	}
	///////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		

	}

}
