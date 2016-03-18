package _6_oop_principles;

public class OOPprinciplesTesting extends AbstactClass implements Swiming {

	
	//V javata moje da nasledish samo i edinstveno 1 klas
	//V Javata moje da implementirash mnogo interfeisi
	public static void main(String[] args) {
		
		
		OOPPrinciples oop = new OOPPrinciples();
		
		GSM nokia = new GSM();
		nokia.getCall();
		nokia.getWriteSms();
		
		SMartPhones sony = new SMartPhones();
		
		sony.getCall();
		sony.getWriteSms();
		sony.getDisplaySize();
		
		OOPprinciplesTesting oopInterface = new OOPprinciplesTesting();
		oopInterface.canHeroSwim();
		
		Swiming.flyHero();
		
		System.out.println();
		
		
	}

	@Override
	public void pushTheButton() {
		System.out.println("Children push the button and watch TV");
		
	}
	
	
	//you can override default method in Class which implements interface (mojesh da prenapishesh metoda kato tozi na abstrakniq metod)
	@Override
	public  String  canHeroSwim(){
		System.out.println("asdfahsdfl'l';");
		return "asdaskdjfkalsdjfklasdf";
		
	}

	
	@Override // tova e virtualen metod
	public String dieHero() {
		// TODO Auto-generated method stub
		return null;
	};
	
	
	
	

}
