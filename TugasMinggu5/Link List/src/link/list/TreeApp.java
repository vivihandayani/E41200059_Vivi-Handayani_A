package link.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {

    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Vivi");
        theTree.insert(25, "Alvioni");
        theTree.insert(75, "Fiqri");
        theTree.insert(12, "Ila");
        theTree.insert(37, "Rafli");
        theTree.insert(43, "Hyuan");
        theTree.insert(30, "Winda");
        theTree.insert(33, "Sifka");
        theTree.insert(87, "Fahmi");
        theTree.insert(93, "Torik");
        theTree.insert(97, "Izul");
        
        while (true) {
            System.out.print("Enter first letter of show, " +
                    "insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                    
                case 'i':
                    System.out.print("Enter value and data to" + " insert: ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                    
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.println("could not find " + value);
                    }
                    break; 
                    
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted " + value);  
                    } else {
                        System.out.println("Could not delete " + value);
                    }
                    break;
                    
                case 't':
                    System.out.print("Enter type 1, 2 or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                    
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
          
public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
}

public static char getChar() throws IOException {
    String s = getString();
    return s.charAt(0);
}

public static int getInt() throws IOException {
    String s = getString();
    return Integer.parseInt(s);
}

   }
