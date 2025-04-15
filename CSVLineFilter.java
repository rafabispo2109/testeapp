import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVLineFilter {

    public static void main(String[] args) {
        String csvFile = "C:\\Rafael\\Westcliff\\JAVA\\Eclipse\\Week3.csv";
        String line;
        String delimiter = ","; // Adjust if your CSV uses a different delimiter
        Object people;
        String filterValue = "M"; // Value to filter by

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(delimiter);
                
                // Check if any field matches the filter value
                for (String city : fields) {
                    if (city.startsWith(filterValue)) {
                        System.out.println(line);
                        break; // Avoid printing the line multiple times if multiple fields match
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




