
package motorcycle;


public class Motorcycle {

    String znacka;
    String barva;
    boolean stavMotoru;
    
     void startujMotor(){
         if (stavMotoru == true){
             System.out.println("Motor už běží.");
             }
         else {
             stavMotoru = true;
             System.out.println("Motor se nastartoval.");
         }
     }
     void ukazAtrib(){
         System.out.println("Tento motocykl je " + barva + " " + znacka);
         if (stavMotoru == true){
             System.out.println("Motor je zapnutý.");
              }
         else {
             System.out.println("Motor je vypnutý.");
         }
     }
   
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.znacka = "Yamaha RZ350";
        m.barva  = "žlutá";
        System.out.println("Volám ukazAtrib.");
        m.ukazAtrib();
        System.out.println("--------");
        System.out.println("Startuji motor...");
        m.startujMotor();
        System.out.println("--------");
        System.out.println("Volám ukazAtrib.");
        m.ukazAtrib();
        System.out.println("--------");
        System.out.println("Startuji motor...");
        m.startujMotor();
        
        
    }
    
}
