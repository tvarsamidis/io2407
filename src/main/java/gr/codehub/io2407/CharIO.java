package gr.codehub.io2407;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIO {

    public static void copyFile(String inFilename, String outFilename) throws IOException {
        FileReader in = new FileReader(inFilename);
        FileWriter out = new FileWriter(outFilename);

        boolean finished = false;
        while (!finished) {
           int c = in.read();
           if (c == -1) {
               finished = true;
           } else {
               if (c == 'e') {
                   c = 'u';
               }
               out.write(c);
           }
        }
        in.close();
        out.close();
    }

}
