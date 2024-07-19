
package gr.codehub.io2407;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataIO {
    
    public static void saveData(String outFilename) throws IOException {
        
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFilename)));  
        double y = 3.14;
        out.writeDouble(y);
        out.writeInt(9999);
        out.writeUTF("πολύ ωραία!");
        out.close();
        
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(outFilename)));  
        double pi = in.readDouble();
        int almost100 = in.readInt();
        String greeting = in.readUTF();
        
        
        System.out.println("pi=" + pi);
        System.out.println("almost100=" + almost100);
        System.out.println("greeting=" + greeting);
    }
}
