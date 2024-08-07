package random;

public class wrapperExample {

	public static void main(String[] args) {

		// boxing
		// Primitive to Non Primitive

		Byte b = Byte.valueOf((byte) 10);
		System.out.println("Primitive to Non Primitive of Byte = " + b);

		Short s = Short.valueOf((short) 25);
		System.out.println("Primitive to Non Primitive of Short = " + s);

		Integer i = Integer.valueOf(20);
		System.out.println("Primitive to Non Primitive of Interger = " + i);

		Long l = Long.valueOf(26L);
		System.out.println("Primitive to Non Primitive of Long = " + l);

		Float f = Float.valueOf(27);
		System.out.println("Primitive to Non Primitive of Float = " + f);

		Double d = Double.valueOf(28);
		System.out.println("Primitive to Non Primitive of Double = " + d);

		
		// unboxing
		// Non Primitive to Primitive

		byte b1 = b.byteValue(); 
		System.out.println("Non Primitive to Primitive of byte = " + b1);

		short s1 = s.shortValue();
		System.out.println("Non Primitive to Primitive of short = " + s1);

		int i1 = i.intValue(); 
		System.out.println("Non Primitive to Primitive of int = " + i1);

		long l1 = l.longValue();
		System.out.println("Non Primitive to Primitive of long = " + l1);

		float f1 = f.floatValue();
		System.out.println("Non Primitive to Primitive of float = " + f1);

		double d1 = d.doubleValue();
		System.out.println("Non Primitive to Primitive of double = " + d1);

	}

}
