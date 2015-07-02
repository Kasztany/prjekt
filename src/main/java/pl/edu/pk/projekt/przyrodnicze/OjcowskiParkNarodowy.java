package pl.edu.pk.projekt.przyrodnicze;



public class OjcowskiParkNarodowy implements ParkNarodowyInterface {
	private ParkNarodowy park;
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

	public void setOpis(){
		park.setOpis("Park utworzony w 1956 roku. Leży w południowej części Wyżyny Krakowsko Częstochowskiej. "
				+ "Jest najmniejszym z polskich  parków narodowych. Jego łączna powierzchnia wynosi 21, 46 km2. "
				+ "Położony jest na obszarze 4 gmin: Skała, Jerzmanowice, Wielka Wieś, Sułoszowa."
				+ " Największe doliny to Dolina Prądnika i Dolina Sąspowska. "
				+ "Wynikiem rozwoju dolin są występujące na zboczach niektórych dolin terasy, pozostałe po nich fragmenty często tworzą ciekawe formy skalne, jak np. Igła Deomyty czy Brama Krakowska."
				+ " Wapienne podłoże sprzyja powstawaniu jaskiń, na terenie parku jest ich ok. 700. Liczne jaskinie umożliwiają występowanie na terenie parku bogatej fauny nietoperzy.");
	}
	
	public void setMiejsce(){
		park.setMiejsce("Ruiny średniowiecznego Zamku w Ojcowie, późnorenesansowy Zamek w Pieskowej Skale, Kaplica \"Na Wodzie\", Maczuga Herkulesa, Jaskinia Łokietka");
	}
	
	public ParkNarodowy getParkNarodowy() {
		return park;
	}
}
