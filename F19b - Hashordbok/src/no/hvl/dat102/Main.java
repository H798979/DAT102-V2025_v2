package no.hvl.dat102;

public class Main {

	public static void main(String[] args) {
	
		HashOrdbok<Integer, String> hm = new HashOrdbok<>(100);
		Integer tall = 15;
		String s = new String("Ein");
		hm.leggTil(tall, s);
		
		String gmlVerdi = hm.leggTil(15, "to");
		System.out.println(gmlVerdi);
	}

}
