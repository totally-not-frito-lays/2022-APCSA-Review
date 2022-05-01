public class Phone {
   Phone() {
      System.out.println("Constructor of phone class.");
   }
   void phone_method() {
      System.out.println("Phone battery is low");
   }
   public static void main(String[] args) {
      Phone p = new Phone();
      Laptop l = new Laptop();
      p.phone_method();
      l.laptop_method();
   }
}
class Laptop {
   Laptop() {
      System.out.println("Constructor of Laptop class.");
   }
   void laptop_method() {
      System.out.println("Laptop battery is low");
   }
}