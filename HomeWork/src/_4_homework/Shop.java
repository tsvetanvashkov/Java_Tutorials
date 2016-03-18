package _4_homework;

import java.util.Scanner;

public class Shop {
	
	static Scanner input = new Scanner (System.in);
	
	public static void magazin(){
		
		System.out.println("Izberi Produkt: ");
		System.out.println("1. GSM");
		System.out.println("2. Laptop");
		
		byte choice = input.nextByte();
		
		switch (choice){
			case 1:
				gsm();
				break;
			case 2:
				laptop();
				break;
			default:
				System.out.println("ERORR!!!");
				break;
		}
	}
	
	////////////////////////////////////////////////////////////////shop
	
	public static void gsm(){
		
		System.out.println("<<<GSM>>>");
		System.out.println("1. SONY");
		System.out.println("2. SAMSUNG");
		
		byte choice = input.nextByte();
		
		switch (choice){
			case 1:
				sony();
				break;
			case 2:
				samsung();
				break;
			default:
				System.out.println("ERORR!!!");
				break;
		}
	}
	
	public static void laptop(){
		
		System.out.println("<<<LAPTOPI>>>");
		System.out.println("1. Lenovo");
		System.out.println("2. Dell");
		
		byte choice = input.nextByte();
		
		switch (choice){
		case 1:
			lenovo();
			break;
		case 2:
			dell();
			break;
		default:
			System.out.println("ERORR!!!");
			break;
		}
	}
	
	/////////////////////////////////////////////////////////////////////////gsm
	
	public static void sony(){
		
		System.out.println("<<<GSM>>>");
		System.out.println("<<<SONY>>>");
		
		GSM sony = new GSM();
		
		sony.setDisplay(5);
		sony.setButton("NO");
		sony.setVisochina(15);
		sony.setShirina(7);
		sony.setDebelina(1);
		sony.setProcesor("Chetriqdren");
		sony.setRam(3);
		sony.setKamera("YES");
		sony.setFenerche("YES");
		
		int display = sony.getDisplay();
		System.out.println(display);
		String button = sony.getButton();
		System.out.println(button);
		int visochina = sony.getVisochina();
		System.out.println(visochina);
		int shirina = sony.getShirina();
		System.out.println(shirina);
		int debelina = sony.getDebelina();
		System.out.println(debelina);
		String procesor = sony.getProcesor();
		System.out.println(procesor);
		int ram = sony.getRam();
		System.out.println(ram);
		String kamera = sony.getKamera();
		System.out.println(kamera);
		String fenerche = sony.getFenerche();
		System.out.println(fenerche);
		
	}
	
	public static void samsung(){
		
		System.out.println("<<<GSM>>>");
		System.out.println("<<<SAMSUNG>>>");
		
		GSM samsung = new GSM();
		
		samsung.setDisplay(6);
		samsung.setButton("Menu");
		samsung.setVisochina(17);
		samsung.setShirina(8);
		samsung.setDebelina(1);
		samsung.setProcesor("Chetriqdren");
		samsung.setRam(2);
		samsung.setKamera("YES");
		samsung.setFenerche("YES");
		
		int display = samsung.getDisplay();
		System.out.println(display);
		String button = samsung.getButton();
		System.out.println(button);
		int visochina = samsung.getVisochina();
		System.out.println(visochina);
		int shirina = samsung.getShirina();
		System.out.println(shirina);
		int debelina = samsung.getDebelina();
		System.out.println(debelina);
		String procesor = samsung.getProcesor();
		System.out.println(procesor);
		int ram = samsung.getRam();
		System.out.println(ram);
		String kamera = samsung.getKamera();
		System.out.println(kamera);
		String fenerche = samsung.getFenerche();
		System.out.println(fenerche);
		
	}
	
	///////////////////////////////////////////////////////////////////////laptop
	
	public static void lenovo(){
		
		System.out.println("<<<LAPTOPI>>>");
		System.out.println("<<<LENOVO>>>");
		
		Laptop lenovo = new Laptop();
		
		lenovo.setProcesor(3);
		lenovo.setRam(16);
		lenovo.setVideo(4);
		lenovo.setHdd(500);
		lenovo.setDisplay(14);
		lenovo.setColor("Black");
		lenovo.setBattery(4500);
		lenovo.setCamera("No");
		lenovo.setMicrofon("NO");
		lenovo.setUsb(6);
		lenovo.setHdma("YES");
		lenovo.setVga("YES");
		lenovo.setSdCard("YES");
		
		int procesor = lenovo.getProcesor();
		System.out.println(procesor);
		int ram = lenovo.getRam();
		System.out.println(ram);
		int video = lenovo.getVideo();
		System.out.println(video);
		int hdd = lenovo.getHdd();
		System.out.println(hdd);
		int display = lenovo.getDisplay();
		System.out.println(display);
		String color = lenovo.getColor();
		System.out.println(color);
		int battery = lenovo.getBattery();
		System.out.println(battery);
		String camera = lenovo.getCamera();
		System.out.println(camera);
		String microfon = lenovo.getMicrofon();
		System.out.println(microfon);
		int usb = lenovo.getUsb();
		System.out.println(usb);
		String hdma = lenovo.getHdma();
		System.out.println(hdma);
		String vga = lenovo.getVga();
		System.out.println(vga);
		String sdCard = lenovo.getSdCard();
		System.out.println(sdCard);
		
	}
	
	public static void dell(){
		
		Laptop dell = new Laptop();
		
		dell.setProcesor(2);
		dell.setRam(12);
		dell.setVideo(4);
		dell.setHdd(500);
		dell.setDisplay(15);
		dell.setColor("Silver");
		dell.setBattery(4000);
		dell.setCamera("YES");
		dell.setMicrofon("YES");
		dell.setUsb(6);
		dell.setHdma("YES");
		dell.setVga("NO");
		dell.setSdCard("YES");
		
		int procesor = dell.getProcesor();
		System.out.println(procesor);
		int ram = dell.getRam();
		System.out.println(ram);
		int video = dell.getVideo();
		System.out.println(video);
		int hdd = dell.getHdd();
		System.out.println(hdd);
		int display = dell.getDisplay();
		System.out.println(display);
		String color = dell.getColor();
		System.out.println(color);
		int battery = dell.getBattery();
		System.out.println(battery);
		String camera = dell.getCamera();
		System.out.println(camera);
		String microfon = dell.getMicrofon();
		System.out.println(microfon);
		int usb = dell.getUsb();
		System.out.println(usb);
		String hdma = dell.getHdma();
		System.out.println(hdma);
		String vga = dell.getVga();
		System.out.println(vga);
		String sdCard = dell.getSdCard();
		System.out.println(sdCard);
	}
	
	////////////////////////////////////////////////////////main

	public static void main(String[] args) {
		
		
		magazin();
		

	}

}
