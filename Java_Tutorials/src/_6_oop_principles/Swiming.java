/**
 * 
 */
package _6_oop_principles;

/**
 * @author Tsvetan
 *
 */
public interface Swiming {
	
	//Interfeisa e nqkakvo deistvie, koeto moje da se implementira (dade kato harakter na klasa)
	
	//interfeisa moje samo i EDINSTVENO da sydyrja abstraktni metodi (nezavyrsheni); Ima izkliucheniq
	// te trqbva da sa public zadyljitelno
	
	//v Javata moje da se slagat poleta v interfeisite  (promenlivi) no tova ne e pravilno za OOP
	//public String gosho = "asd";
	
	
	//default method in Interface you can implement it 
	//Defalten metod v interfeisa moje da mu zadesh body 
	
	//
	  default String  canHeroSwim(){
		System.out.println("asdfasdf");
		return "asdaskdjfkalsdjfklasdf";
		
	};
	//v interfeisa ima i static metod kydeto otnovo moje da ima body samiq metod
	//statichnite metodi sa za samiq interfeis v momenta na syzdavane na interfeisa 
	//(implementirane za nqkoi klas te se syzdavat i rabotqt za samiq interfeis)
	//static metoda ne moje da se izpolzva nikyde izvyn iterfeisa
	public static String flyHero(){
		System.out.println("It works from interface");
		return "asdasd";
		
	}
	
	public String dieHero(); // standarten abstrakten metod
	
	

}
