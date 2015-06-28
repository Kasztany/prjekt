package pl.edu.pk.projekt.przyrodnicze;

import junit.framework.TestCase;

public class TestParkNarodowy extends TestCase {
	public TestParkNarodowy(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetNazwa() {
		ParkNarodowy park = new ParkNarodowy();
		String s;
		park.setNazwa("test");
		s = park.getNazwa();
		assertEquals("Blad", s , "test" );
	}

	public void testGetSlonceDeszcz(){
		ParkNarodowy park = new ParkNarodowy();
		Boolean b;
		park.setSlonceDeszcz(false);
		b = park.getSlonceDeszcz();
		assertFalse(b);
	}
	
	public void testGetOpis(){
		ParkNarodowy park = new ParkNarodowy();
		String s;
		park.setOpis("test raz dwa trzy");
		s = park.getOpis();
		assertEquals("Blad", s , "test raz dwa trzy");
	}
	
	public void testGetMiejsce(){
		ParkNarodowy park = new ParkNarodowy();
		String s;
		park.setMiejsce("Szkola");
		s = park.getMiejsce();
		assertEquals("Blad", s, "Szkola");
	}
	public void testGetFauna(){
		ParkNarodowy park = new ParkNarodowy();
		String s;
		park.setFauna("Kot");
		s = park.getFauna();
		assertEquals("Blad",s,"Kot");
	}
}
