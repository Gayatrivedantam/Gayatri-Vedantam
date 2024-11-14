package Basics;

public class DatatypeDemo {

	public static void main(String[] args) {
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("min range of byte is"+byteMin+"max range of byte"+byteMax);
		Short shortMax=32767;
		Short shortMin=-32768;
		System.out.println("min range of short is"+shortMin+"max range of Short"+shortMax);
		int maxInt=2147483647;
		int minInt=-2147483648;
		System.out.println("min range of int is"+minInt+"max range of int"+maxInt);
		long maxlong=9223372036854775807L;
		long minlong=-9223372036854775808L;
		System.out.println("min range of long is"+minlong+"max range of long"+maxlong);
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914d;
		System.out.println("float value"+f+"double"+d);
		boolean status=false;
		System.out.println("boolean value is"+status);
		char c='m';
		System.out.println("char value "+ c);
	}

}
