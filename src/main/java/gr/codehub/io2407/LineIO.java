
package gr.codehub.io2407;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class LineIO {
    
    public static List<String> readFile(String inFilename) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(inFilename));
        List<String> lines = new ArrayList<>();
        boolean finished = false;
        while(!finished) {
            String line = in.readLine();
            if (line == null) {
                finished = true;
            } else {
                lines.add(line);
            }
        }
        in.close();
        return lines;
    }
    
    
    public static void writeFile(String outFilename, List<String> lines) throws Exception {
        PrintWriter pw = new PrintWriter(outFilename); 
        for (String line: lines) {
            pw.write(line + "\n");
        }
        //        lines.forEach(pw::write);
        // lines.forEach(s -> pw.write(s + "\n"));
        // lines.stream().forEach(s -> pw.write(s + "\n"));
        pw.close();
    }
}
