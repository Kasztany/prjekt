package pl.edu.pk.projekt.przyrodnicze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	private String ts;

	public String readFile(String filePath) throws IOException {
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			String line = bufferedReader.readLine();
			ts=line + "\n";
			while (line != null) {
				line = bufferedReader.readLine();
				if (line!=null)
					ts += ("\n" + line);
			}
		} 
		finally {
			if(bufferedReader != null)
				bufferedReader.close();
		}
		return ts;
	}
}
