package pl.edu.pk.projekt.przyrodnicze;

import java.io.IOException;

public class TatrzanskiParkNarodowy implements ParkNarodowyInterface{
	private ParkNarodowy park;
	private ReadFile file;
	private String text;
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

	public void setOpis() throws IOException {
		file = new ReadFile();
		text = file.readFile("src/main/resources/tatrzanski.txt");
		park.setOpis(text);
	}
	
	public void setMiejsce(){
		park.setMiejsce("Morskie Oko, Dolina Pięciu Stawów");
	}
	
	public ParkNarodowy getParkNarodowy() {
		return park;
	}

}
