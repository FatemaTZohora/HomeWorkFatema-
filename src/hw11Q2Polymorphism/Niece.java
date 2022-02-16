package hw11Q2Polymorphism;

public class Niece extends Sister {
	@Override
	public void sister() {
		System.out.println("This is from the void type method from Sister.");
	}

	@Override
	public void sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3 * 2;
		System.out.println("Total age of sister from void type parameterized method: " + total1);
	}

	@Override
	public int sister(String age4, int age5, int age6) {
		int total2 = Integer.parseInt(age4) + age5 + age6 - 9;
		System.out.println("Total age of sister from return type parameterized method: " + total2);
		return total2;
	}
	/*
	 * Static method cannot be Overriden.
	 * 
	 * @Override public static int sister(int age7, int age8, String age9) { int
	 * total3 = age7 + age8 + Integer.parseInt(age9);
	 * System.out.println("Total age of Sister from static method: " + total3);
	 * return total3; }
	 * 
	 * Final method cannot be Overriden.
	 * @Override public final int sister(int age10, int age11) { int total4 = age10
	 * + age11; System.out.println("Total age of Sister from final method: " +
	 * total4); return total4;
	 */
	/*
	 * Method Override: When different methods exist with the same method name with
	 * same parameters or signature but with different syntax or logic, it is called
	 * method overriding.
	 */
}
