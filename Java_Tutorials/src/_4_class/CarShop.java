package _4_class;

public class CarShop {

	public static void main(String [] args){
		
		
		//Klasa Car e shablon
		//audi e obekt ot tip Car - toi ima vsichki poleta i svoistva na Car kalsa (shablona)
		Car audi = new Car();
		
		String carName = audi.getMyCarName();
		System.out.println(carName);
		
		audi.setCar_colour("Silver");
		String colour = audi.getCar_colour();
		audi.setGlass("test");
		System.out.println(audi.getGlass("test"));
		
		String test = audi.car_colour;
		
		//TODO da se napravqt klas za mesindjyr, da se napravqt obekti ot kalsa Messanger - facebook, skype, viber
		
		//Da se napravi klas monitor - da se napravqt obekti ot klasa Monitor - HP, DELL, Lenovo...
		
		Monitor hp = new Monitor();
		Monitor dell = new Monitor();
		
		
		hp.setGoleminaNaEkrana(20);
		int goleminaHp = hp.getGoleminaNaEkrana();
		System.out.println(goleminaHp);
		
		hp.setKontrast(8000);
		int kontrast = hp.getKontrast();
		System.out.println(kontrast);
		
		
		dell.setGoleminaNaEkrana(23);
		int goleminaDell = dell.getGoleminaNaEkrana();
		System.out.println(goleminaDell);
		
		
		
	}
}
