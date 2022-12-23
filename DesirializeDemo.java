import java.io.*;
public class DesirializeDemo {
    public static void main(String [] args){
        employe d=null;
        try {
            FileInputStream fileIn = new FileInputStream("employe.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            d=(employe) in.readObject();
            fileIn.close();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            return;
        }
        System.out.println("Deserialized Employee..");
        System.out.println("Name: " + d.name);
        System.out.println("Address: " + d.address);
        System.out.println("SSN: " + d.SSN);
        System.out.println("Number: " + d.number);
    }
}

