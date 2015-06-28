package pl.edu.pk.projekt.przyrodnicze;

import java.io.IOException;

public class BieszczadzkiParkNarodowy implements ParkNarodowyInterface {
	
		private ParkNarodowy park;
		private ReadFile file;
		private String text;
		public BieszczadzkiParkNarodowy(){
			park = new ParkNarodowy();
		}
		
		public void setNazwa(){
			park.setNazwa("Bieszczadzki Park Narodowy");
		}
		
		public void setFlora(){ 
			park.setFlora("tojad wschodniokarpacki, goździk kartuzek, goździk skalny, lepnica karpacka, pszeniec biały");
		}
		
		public void setFauna(){
			park.setFauna("jeleń, ryś, żmija, żbik, sarna, dzik, niedźwiedź brunatny, wilk, orzeł przedni, orlik krzykliwy, puchacz, puszczyk uralski, sóweczka, wąż Eskulapa, żubr");
		}

		public void setSlonceDeszcz() {
			park.setSlonceDeszcz(true);
		}

		public void setOpis() throws IOException {
			file = new ReadFile();
			text = file.readFile("src/main/resources/bieszczadzki.txt");
			park.setOpis(text);
		}
		
		public void setMiejsce(){
			park.setMiejsce("Muzeum Przyrodnicze w Ustrzykach Dolnych");
		}
		
		public ParkNarodowy getParkNarodowy() {
			return park;
		}
}
