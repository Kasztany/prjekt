package pl.edu.pk.projekt.przyrodnicze;



public class BieszczadzkiParkNarodowy implements ParkNarodowyInterface {
	
		private ParkNarodowy park;
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

		public void setOpis() {

			park.setOpis("Park narodowy utworzony w 1973 roku położony w Bieszczadach Zachodnich o łącznej powierzchni 292,02 km2."
					+ "W parku wyróżniono dwa piętra roślinno-klimatyczne: regiel dolny i połoniny."
					+ "Blisko 80% obszaru BPN zajmują naturalne lasy liściaste. Park posiada największy wskaźnik obszarów objętych ochroną spośród wszystkich parków narodowych w Polsce."
					+ "Na terenie BPN istnieje kilkanaście ścieżek przyrodniczo-historycznych, które w większości prowadzą wzdłuż istniejących szlaków pieszych.");
		}
		
		public void setMiejsce(){
			park.setMiejsce("Muzeum Przyrodnicze w Ustrzykach Dolnych");
		}
		
		public ParkNarodowy getParkNarodowy() {
			return park;
		}
}
