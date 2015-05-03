/**
 * 
 */
package prak_2;

/**
 * @author Fajri
 *
 */
public class prak_3 {
	static boolean bool;
	static byte by;
	static char ch;
	static double d;
	static float f;
	static int i;
	static long l;
	static short sh;
	static String str;


	/**
	 * @param args
	 */
	
	static int b;
	public static void main(String[] args) {
		
		int il = 0x2f;
		int i2 = 0X2F;
		int i3 = 0177;
		long n1 = 200L;
		long n2 = 200l;
		long n3 = 200;
		float f1 = 1;
		float f2 = 1F;
		float f3 = 1f;
		float f4 = 1e-45f;
		float f5 = 1e+9f;
		double d1 = 1d;
		double d2 = 1D;
		double d3 = 47e47d;
		// TODO Auto-generated method stub
		b+=5;
		
		if (b==4)
			 System.out.println("bool = " + f);
		 else
			 System.out.println("bool = " + d);
			 
		System.out.println("bool = " + bool);
		System.out.println("by = " + by);
		System.out.println("ch = " + ch);
		System.out.println("d = " + d);
		System.out.println("f = " + f);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("sh = " + sh);
		System.out.println("str = " + str);

		Boolean refBoolean = new Boolean (true);
		boolean bool = refBoolean.booleanValue();
		
		Byte refByte = new Byte ( (byte) 123);
		byte b = refByte.byteValue();
		
		Character refChar = new Character ('x');
		char c = refChar.charValue();
		
		Short refShort = new Short ((short) 123);
		short s = refShort.shortValue();
		
		Integer reflnt = new Integer (123);
		int i = reflnt.intValue();
		
		Long refLong = new Long (123L);
		long l = refLong.longValue();
		
		Float refFloat = new Float (12.3F);
		float f = refFloat.floatValue();
		
		Double refDouble = new Double (12.3D);
		double d =  refDouble.doubleValue();
		
		System.out.println("bool = " + bool);
		
		
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("il = " + il);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		System.out.println("f3 = " + f3);
		System.out.println("f4 = " + f4);
		System.out.println("f5 = " + f5);
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		

	}

}
