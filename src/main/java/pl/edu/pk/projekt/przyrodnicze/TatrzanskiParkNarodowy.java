package pl.edu.pk.projekt.przyrodnicze;


public class TatrzanskiParkNarodowy implements ParkNarodowyInterface{
	private ParkNarodowy park;

	public TatrzanskiParkNarodowy(){
		park = new ParkNarodowy();
	}
	
	public void setNazwa(){
		park.setNazwa("Tatrzanski Park Narodowy");
	}
	
	public void setFlora(){ 
		park.setFlora("bory świerkowe, jodła, buk, jawor, kosodrzewina, goździk lodowcowy, sasanka alpejska, goryczka przezroczysta, jaskier lodnikowy");
	}
	
	public void setFauna(){
		park.setFauna("kozica, świstak, jeleń, sarna, ryś, łasica, niedźwiedź brunatny, orzeł przedni pomurnik");
	}

	public void setSlonceDeszcz() {
		park.setSlonceDeszcz(true);
	}

	public void setOpis() {
		park.setOpis("Jeden z 23 parków narodowych na terenie Polski. Utworzony z dniem 1 stycznia 1955 roku o łącznej powierzchni 211,64 km2. "
				+ "TPN obejmuje całe polskie Tatry oraz niewielkie części Pogórza Bukowińskiego i Rowu Podtatrzańskiego. "
				+ "Najwyższym punktem jest szczyt Rysów (2499 m), najniższym dolina Porońca (ok. 773 m). Tatry dzielą się na Tatry Wysokie, Tatry Zachodnie i Tatry Bielskie (te ostatnie tylko na Słowacji). "
				+ "U podnóża Tatr Polskich rozłożone jest Zakopane, natomiast u podnóża Tatr Słowackich istnieje kilka miejscowości z zapleczem turystycznym jak np. Tatrzańska Łomnica i Poprad.");
	}
	
	public void setMiejsce(){
		park.setMiejsce("Morskie Oko, Dolina Pięciu Stawów");
	}
	
	public ParkNarodowy getParkNarodowy() {
		return park;
	}

}
