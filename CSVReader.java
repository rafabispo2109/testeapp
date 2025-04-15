import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	  	public CSVReader(FileReader fileReader) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
        String csvFile = "C:\\Rafael\\Westcliff\\JAVA\\Eclipse\\Week3.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] data = line.split(csvSplitBy);
                
                // Print data or process it as needed
                for (String item : data) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
            
     }
	  	}
}
