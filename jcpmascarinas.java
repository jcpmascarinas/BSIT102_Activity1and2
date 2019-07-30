import java.io.*;
 
public class jcpmascarinas {
    
    public static void main(String[] args)throws IOException {
    	
    	String name, course, section, address, contact;
    	
    	
    	
    	DataInputStream a = new DataInputStream(System.in);
    	DataInputStream b = new DataInputStream(System.in);
    	DataInputStream c = new DataInputStream(System.in);
    	DataInputStream d = new DataInputStream(System.in);
    	DataInputStream e = new DataInputStream(System.in);
    	
    	System.out.println("What is your name?: ");
    	name = a.readLine();
    	System.out.println("What is your course?: ");
    	course = b.readLine();
    	System.out.println("What is your section?: ");
    	section = c.readLine();
    	System.out.println("What is your address?: ");
    	address = d.readLine();
    	System.out.println("What is your contact number?: ");
    	contact = e.readLine();
    	System.out.println("--------------------------------------------------------------------");
    	System.out.println("My name is: " +name);
    	System.out.println("My course is: " +course);
    	System.out.println("My section is: " +section);
    	System.out.println("My address is: " +address);
    	System.out.println("My contact number is: " +contact);
    	
    }
}
# Activity 1 and 2
# Activity 1 and 2
