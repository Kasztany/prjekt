package pl.edu.pk.projekt.przyrodnicze;

import java.io.IOException;

public interface ParkNarodowyInterface {
		
		public void setNazwa();
		public void setFlora();
		public void setFauna();
		public void setSlonceDeszcz();
		public void setOpis() throws IOException;
		public void setMiejsce();
		public ParkNarodowy getParkNarodowy();
}
