
package gr.codehub.io2407;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception  {
//        System.out.println("Copying file...");
//        DataIO.saveData("C:\\programs\\databases\\c.txt");
//        System.out.println("Copying done!");
//        
        List<String> lines = LineIO.readFile("C:\\programs\\databases\\a.txt");
        for(String line: lines) {
            System.out.println(line);
        }
        
    }
}
