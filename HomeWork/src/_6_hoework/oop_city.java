package _6_hoework;

public class oop_city extends oop_vilage2{

	
	public static void main(String[] args) {
		
		kyshta kyshta1 = new kyshta("dyrvena");
		kyshta kyshta2 = new kyshta("dyrvena");
		kyshta kyshta3 = new kyshta("dyrvena");
		kyshta kyshta4 = new kyshta("dyrvena");
		kyshta kyshta5 = new kyshta("dyrvena");
		kolperaciq kolperaciq1 = new kolperaciq("dyrvena");
		kolperaciq kolperaciq2 = new kolperaciq("dyrvena");
		cyrkva cyrkva1 = new cyrkva("metalna");
		magazin magazin1 = new magazin("dyrvena");
		kolperaciq kmetstwo = new kolperaciq("dyrvena");
		ychilishte ychilishte1 = new ychilishte("metalna");
		chitalishte chitalishte1 = new chitalishte("dyrvena");
		
		kyshta1.setOsnova("kamyk");
		kyshta1.setStena("kerpich");
		kyshta1.setPokriv("keremida");
		//kyshta1.setVrata("dyrwena");
		kyshta1.setProzorec(4);
		kyshta1.setStaq(3);
		
		kyshta2.setOsnova("kamyk");
		kyshta2.setStena("tuhla");
		kyshta2.setPokriv("keremida");
		//kyshta2.setVrata("dyrwena");
		kyshta2.setProzorec(8);
		kyshta2.setStaq(3);

		kyshta3.setOsnova("kamyk");
		kyshta3.setStena("tuhla");
		kyshta3.setPokriv("keremida");
		//kyshta3.setVrata("dyrwena");
		kyshta3.setProzorec(8);
		kyshta3.setStaq(4);
		
		kyshta4.setOsnova("kamyk");
		kyshta4.setStena("tuhla");
		kyshta4.setPokriv("keremida");
		//kyshta4.setVrata("dyrwena");
		kyshta4.setProzorec(12);
		kyshta4.setStaq(5);
		
		kyshta5.setOsnova("kamyk");
		kyshta5.setStena("tuhla");
		kyshta5.setPokriv("keremida");
		//kyshta5.setVrata("dyrwena");
		kyshta5.setProzorec(20);
		kyshta5.setStaq(7);
		
		kolperaciq1.setOsnova("kamyk");
		kolperaciq1.setStena("tuhla");
		kolperaciq1.setPokriv("keremida");
		//kolperaciq1.setVrata("dyrwena");
		kolperaciq1.setProzorec(24);
		kolperaciq1.setStaq(10);
		kolperaciq1.setStylbishte("beton");
		kolperaciq1.setEtaj(2);
		kolperaciq1.setBalkon(2);
		
		kolperaciq2.setOsnova("kamyk");
		kolperaciq2.setStena("tuhla");
		kolperaciq2.setPokriv("keremida");
		//kolperaciq2.setVrata("dyrwena");
		kolperaciq2.setProzorec(30);
		kolperaciq2.setStaq(18);
		kolperaciq2.setStylbishte("beton");
		kolperaciq2.setEtaj(3);
		kolperaciq2.setBalkon(4);
		
		cyrkva1.setOsnova("kamyk");
		cyrkva1.setStena("kamyk");
		cyrkva1.setPokriv("keremida");
		cyrkva1.setKube("metal");
		//cyrkva1.setVrata("metal");
		cyrkva1.setProzorec(50);
		
		magazin1.setOsnova("kamyk");
		magazin1.setStena("tuhla");
		magazin1.setPokriv("keremida");
		//magazin1.setVrata("dyrvo");
		magazin1.setProzorec(6);
		magazin1.setShtand(5);
		
		magazin1.rabotii();
		
		kmetstwo.setOsnova("kamyk");
		kmetstwo.setStena("tuhla");
		kmetstwo.setPokriv("keremida");
		//kmetstwo.setVrata("dyrwena");
		kmetstwo.setProzorec(30);
		kmetstwo.setStaq(18);
		kmetstwo.setStylbishte("beton");
		kmetstwo.setEtaj(3);
		kmetstwo.setBalkon(4);
		
		ychilishte1.setOsnova("kamyk");
		ychilishte1.setStena("tuhla");
		ychilishte1.setPokriv("keremida");
		//ychilishte1.setVrata("metal");
		ychilishte1.setProzorec(160);
		ychilishte1.setStaq(36);
		ychilishte1.setStylbishte("beton");
		ychilishte1.setEtaji(3);
		
		chitalishte1.setOsnova("kamyk");
		chitalishte1.setStena("tuhla");
		chitalishte1.setPokriv("keremida");
		//chitalishte1.setVrata("dyrwena");
		chitalishte1.setProzorec(20);
		chitalishte1.setStaq(7);
		chitalishte1.setSalon("amfiteatralen");
		chitalishte1.setScena("dyrvo");
		chitalishte1.setRedove(20);
		
	}
}
