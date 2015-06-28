package pl.edu.pk.projekt.przyrodnicze;

public class ParkNarodowy {
	private String nazwa;
	private String flora;
	private String fauna;
	private Boolean slonceDeszcz;
	private String opis;
	private String miejsce;
	
	public ParkNarodowy(){
		super();
	}
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getFlora() {
		return flora;
	}
	public void setFlora(String flora) {
		this.flora = flora;
	}
	public String getFauna() {
		return fauna;
	}
	public void setFauna(String fauna) {
		this.fauna = fauna;
	}
	public Boolean getSlonceDeszcz() {
		return slonceDeszcz;
	}
	public void setSlonceDeszcz(Boolean slonceDeszcz) {
		this.slonceDeszcz = slonceDeszcz;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String text) {
		this.opis = text;
	}

	public String getMiejsce() {
		return miejsce;
	}

	public void setMiejsce(String miejsce) {
		this.miejsce = miejsce;
	}
	
	
}