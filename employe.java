import java.io.*;
public class employe implements Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
    
}
class SerializeDemo {
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "Manish";
        e.address = "Patna,Bihar";
        e.SSN = 123;
        e.number = 101;
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            fileOut.close();
        }
        catch(IOException i) {
            System.out.println(i);
        }
        e.mailCheck();
    }
}
