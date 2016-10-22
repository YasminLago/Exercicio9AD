package copycaracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Yasmin
 */
public class CopyCaracteres {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        FileReader read = new FileReader("texto10.txt");
        FileWriter write = new FileWriter("texto11.txt");

        int c;
        while((c = read.read()) != -1){
            write.write(c);
        }        
        read.close();
        write.flush();
        write.close();
    }
    
}
