package _7_oop_constuktor;

public class House extends Koliba{

	//syzdava se konstruktor na nasledeniq klas NO konstruktora e za House
	//konstruktor na House
	public House(String golqma_stena, String ogneoporni_tuhli) {
		super(golqma_stena, ogneoporni_tuhli);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args){
		// konstruktor na roditelq(na nasledenq klas)
		House h = new House("bug wall", "hylti");
		
		
		
		System.out.println(h.getStena());
	}
	
	
	// TODO da se priloji v OOP sys konstruktori 
	// Da se se zapoznaesh s prazni konstruktori 
	// kakvo shte stane ako se nasledi s prazen konstruktor shte se promeni li neshto
	public void  sameConstructor(){
		System.out.println("Diferrent method in the same constructor");
	}

}
