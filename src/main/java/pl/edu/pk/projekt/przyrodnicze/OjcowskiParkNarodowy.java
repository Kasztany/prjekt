package pl.edu.pk.projekt.przyrodnicze;

import java.io.IOException;

public class OjcowskiParkNarodowy implements ParkNarodowyInterface {
	private ParkNarodowy park;
	private ReadFile file;
	private String text;
	public OjcowskiParkNarodowy(){
		park = new ParkNarodowy();
	}
	
	public void setNazwa(){
		park.setNazwa("Ojcowski Park Narodowy");
	}
	
	public void setFlora(){ 
		park.setFlora("róża alpejska, brzoza ojcowska, kruszczyk błotny, gnidosz rozesłany, goryczuszka orzęsiona");
	}
	
	public void setFauna(){
		park.setFauna("nietoperz, sarna, zając, dzik europejski, lis rudy, kuna leśna");
	}
	public void setSlonceDeszcz() {
		park.setSlonceDeszcz(true);
	}

	public void setOpis() throws IOException {
		file = new ReadFile();
		text = file.readFile("src/main/resources/ojcowski.txt");
		park.setOpis(text);
	}
	
	public void setMiejsce(){
		park.setMiejsce("Ruiny średniowiecznego Zamku w Ojcowie, późnorenesansowy Zamek w Pieskowej Skale, Kaplica \"Na Wodzie\", Maczuga Herkulesa, Jaskinia Łokietka");
	}
	
	public ParkNarodowy getParkNarodowy() {
		return park;
	}
}
