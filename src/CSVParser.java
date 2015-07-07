import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSVParser {
	
	public String[] read(String path) throws IOException{
		String full="";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!=null){
			full += line;
			line = br.readLine();
		}
		
		String[] dataSets = full.split(",");

		return dataSets;
	}

}
