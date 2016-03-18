package _2_homework;

public class castvane {

	public static void main(String [] args) {

		//TODO da se razgledat implicitno i explicitno kastvane
		//TODO da se izvedat vsichi ostanali parseri float, double , short, byte ot String kym tqh i obratnoto
		
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 55.55f;
		double d = 66.6666666;
		
		String test = "34";
		
		byte i_to_b = (byte) i; 
		System.out.println(i_to_b);
		
		long s_to_l = (long) s;
		System.out.println(s_to_l);
		
		float b_to_f = (float) b;
		System.out.println(b_to_f);
		
		double l_to_d = (double) l;
		System.out.println(l_to_d);
		
		int d_to_i = (int) d;
		System.out.println(d_to_i);
		
		double f_to_d = (double) f;
		System.out.println(f_to_d);
		
		String strB = String.valueOf(b);
		System.out.println(strB);
		
		byte bStr = Byte.parseByte(test);
		System.out.println(bStr);
		
		String strS = String.valueOf(s);
		System.out.println(strS);
		
		short sStr = Short.parseShort(test);
		System.out.println(sStr);
		
		String strI = String.valueOf(i);
		System.out.println(strI);
		
		int iStr = Integer.parseInt(test);
		System.out.println(iStr);
		
		String strL = String.valueOf(l);
		System.out.println(strL);
		
		long lStr = Long.parseLong(test);
		System.out.println(lStr);
		
		String strF = String.valueOf(f);
		System.out.println(strF);
		
		float fStr = Float.parseFloat(test);
		System.out.println(fStr);
		
		String strD = String.valueOf(d);
		System.out.println(strD);
		
		double dStr = Double.parseDouble(test);
		System.out.println(dStr);
		
	}
	
}
