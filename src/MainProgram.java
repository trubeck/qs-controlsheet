import java.io.File;
import java.io.IOException;


public class MainProgram {

	public static void main(String[] args) {
		
		CSVParser parser = new CSVParser();
		String [] vollprothetik;
		
		try {
			vollprothetik = parser.read("data/test.qs");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			vollprothetik = null;
		}
		
		for(int i = 0; i < vollprothetik.length;i++){
			System.out.println(vollprothetik[i]);
		}

	}

}
