
package gr.codehub.io2407;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {
        System.out.println("Copying file...");
        CharIO.copyFile("C:\\programs\\databases\\a.txt", 
                "C:/programs/databases/b.txt");
        System.out.println("Copying done!");
    }
}
