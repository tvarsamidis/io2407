
package gr.codehub.io2407;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {
        System.out.println("Copying file...");
        ByteIO.copyFile("C:\\programs\\DBeaver\\DBeaver.exe", 
                "C:/programs/DBeaver/MyDBeaver.exe");
        System.out.println("Copying done!");
    }
}
