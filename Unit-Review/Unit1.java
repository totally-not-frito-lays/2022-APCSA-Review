public class Unit1 { 
  public static void main(String[] args) { 
  	// Integers
    int primitiveInt = 5;
    Integer wrapperInt = 5;
    System.out.println(primitiveInt);
    System.out.println(wrapperInt);
    
    // Doubles
    double primitiveDouble = 5.99;
    Double wrapperDouble = 5.99; 
    System.out.println(primitiveDouble);
    System.out.println(wrapperDouble);
    
    // Boolean
    boolean primitiveBoolean = true;
    Boolean wrapperBoolean = true;
    System.out.println(primitiveBoolean);
    System.out.println(wrapperBoolean);
    
    // Equality check
    System.out.println("Equality Check");
    System.out.println(primitiveInt == wrapperInt);
    System.out.println(primitiveDouble == wrapperDouble);
    System.out.println(primitiveBoolean == wrapperBoolean);

    // Inter-type Operations
    System.out.println("hello there " + 3);
    System.out.println("hello there " * 3);
    System.out.println(3 * 3.0);
  }
}
