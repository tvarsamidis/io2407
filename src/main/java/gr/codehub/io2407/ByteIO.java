package gr.codehub.io2407;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIO {

    public static void copyFile(String inFilename, String outFilename) throws IOException {

        FileInputStream in = new FileInputStream(inFilename);
        FileOutputStream out = new FileOutputStream(outFilename);

        boolean finished = false;
        while (!finished) {
            int b = in.read();
            byte c[] = in.readNBytes(100);
            
//            in.skip(10_000_000_000L);
//            in.reset();
//            in.skipNBytes(10_000_000_000L);
            
            if (b == -1) {
                finished = true;
            } else {
                out.write(b);
            }
        }
        in.close();
        out.close();
    }
}
