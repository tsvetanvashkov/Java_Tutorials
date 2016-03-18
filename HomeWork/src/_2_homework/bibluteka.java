package _2_homework;

import java.util.Scanner;

public class bibluteka {
	
	static Scanner input = new Scanner (System.in);
	
	public static void biblioteka(){
		
		while (true){
			System.out.println("Izberi biblioteka za knigi: ");
			System.out.println("1. Sv. Kliment Ohridski");
			System.out.println("2. Sv. Ivan Rilski");
			System.out.println("3. Paisi Hilqndarski");
			System.out.println("4. Sv. Ivan Rilski");
			System.out.println("5. Ivan Vazow");
			System.out.println("Vuvedi: ");
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					Kliment_Ohridski();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void Kliment_Ohridski(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("Knigi: ");
			System.out.println("1. Hudojestwena literatura");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("5. ");
			
			byte choice = input.nextByte();
			
			switch (choice) {
				case 1:
					Hudojestwena_Literatura();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void Hudojestwena_Literatura(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("1. Chujdoezikova");
			System.out.println("2. Bylgarska");
			
			byte choice = input.nextByte();
			
			switch (choice) {
				case 1:
					Chujdoezikova();
					break;
				case 2:
					Bylgarska();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public  static void Bylgarska(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Bylgarska>>>");
			System.out.println("1. Istinata Boli");
			System.out.println("2. Nie sme KY-KY");
			System.out.println("3. Pazachyt na wremeto");
			System.out.println("4. Sytworenieto");
			System.out.println("5. Karadjata");
			System.out.println("6. Nazad kym HudojestwenaLiteratura");
			
			byte choice = input.nextByte();
			
			switch (choice) {
				case 1:
					IstinataBoli();
					break;
				case 2:
					NieSmeKYKY();
					break;
				case 3:
					PazachytNawremeto();
					break;
				case 4:
					Sytworenieto();
					break;
				case 5:
					Karadjata();
					break;
				case 6:
					Hudojestwena_Literatura();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void Karadjata(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Bylgarska>>>");
			System.out.println("Karadjata");
			System.out.println("Georgi bojinow");
			System.out.println("Cena: 13lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Bylgarska();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void Sytworenieto(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Bylgarska>>>");
			System.out.println("Sytworenieto");
			System.out.println("Stoqn Vladow");
			System.out.println("Cena: 5lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Bylgarska();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void PazachytNawremeto(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Bylgarska>>>");
			System.out.println("Pazachyt na Vremeto");
			System.out.println("Georgi Chernqkow");
			System.out.println("Cena: 10lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Bylgarska();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void NieSmeKYKY(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Bylgarska>>>");
			System.out.println("Nie Sme KY-KY");
			System.out.println("Sasho Dilkov");
			System.out.println("Cena: 15lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Bylgarska();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void IstinataBoli(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Bylgarska>>>");
			System.out.println("Istinata Boli");
			System.out.println("Sasho Dilkov");
			System.out.println("Cena: 15lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Bylgarska();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void Chujdoezikova(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Chujdoezikova>>>");
			System.out.println("1. The song of Achilles");
			System.out.println("2. Blue Gold");
			System.out.println("3. Das Parfum");
			System.out.println("4. The Firm");
			System.out.println("5. The Templar Throne");
			System.out.println("6. Nazad kym HudojestwenaLiteratura");
			
			byte choice = input.nextByte();
			
			switch (choice) {
				case 1:
					TheSongOfAchilles();
					break;
				case 2:
					BlueGold();
					break;
				case 3:
					DasParfum();
					break;
				case 4:
					TheFirm();
					break;
				case 5:
					TheTemplarThrone();
					break;
				case 6:
					Hudojestwena_Literatura();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void TheTemplarThrone(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Chujdoezikova>>>");
			System.out.println("The Templar Throne");
			System.out.println("Paul Christopher");
			System.out.println("Cena: 17lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Chujdoezikova();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void TheFirm(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Chujdoezikova>>>");
			System.out.println("The Firm");
			System.out.println("John Grisham");
			System.out.println("Cena: 16lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Chujdoezikova();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void DasParfum(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Chujdoezikova>>>");
			System.out.println("Das Parfum");
			System.out.println("Patrick Suskid");
			System.out.println("Cena: 32lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Chujdoezikova();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void BlueGold(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Chujdoezikova>>>");
			System.out.println("Blue Gold");
			System.out.println("Clive Cussler");
			System.out.println("Cena: 10lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Chujdoezikova();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void TheSongOfAchilles(){
		
		while (true){
			System.out.println("<<<Sv. Kliment Ohridski>>>");
			System.out.println("<<<Hudojestwena_Literatura>>>");
			System.out.println("<<<Chujdoezikova>>>");
			System.out.println("The song of Achilles");
			System.out.println("Madeline Miller");
			System.out.println("Cena: 20lv.");
			System.out.println("1. Kupi");
			System.out.println("2. Nazad kym chujdoezikova literatura");
		
			byte choice = input.nextByte();
		
			switch (choice) {
				case 1:
					kupi();
					break;
				case 2:
					Chujdoezikova();
					break;
				default: 
					System.out.println("Error!!!");
					break;
			}
		}
	}
	
	public static void kupi(){
		System.out.println("Vie zakupihte jelanata kniga");
	}
	
	
	public static void main(String [] args) {
		
		//TODO da se syzdadyt metodi za biblioteka kartoteka, bibliotekar ime nomer, knigi, nomer, zaqvki za knigi...
		
	biblioteka();
		
	}
}
