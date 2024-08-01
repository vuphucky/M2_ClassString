// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static ClassNameExample classNameExample;
    public static void main(String[] args) {
     String [] validClassName = {"C0223G", "A0323K"};
     String[] invalidClassName = {"M0318G","P0323A"};

     classNameExample = new ClassNameExample();
     for (String className: validClassName){
         boolean isValid = classNameExample.validate(className);
         System.out.println("Class name is: " + className + " is valid: " + isValid);
     }

     for (String className: invalidClassName){
         boolean isValid = classNameExample.validate(className);
         System.out.println("Class name is: " + className + " is valid: " + isValid);
     }
    }
}