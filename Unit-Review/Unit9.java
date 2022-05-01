public class Unit9 {
  public static void main(String[] args) { 
  	System.out.println("Benders");
    // What do we need to change to make Toph able to Bend?
    // Person Toph = new Bender("Ba Sing Se", "Earth");
    // Does Toph have access to bending if she's just a person?
    // Toph.bendElement();
    // Can Toph still find her city?
    // Toph.getCity();
    // Can Toph count the number of people that have been made?
    // Toph.getCount();
    return;
    }
}

class Person {
    static int count;
    String city;
    String name;
    public Person(String city) {
        count = 0;
        this.city = city;
    }
    public String getCity() {
      return this.city;
    }
    public static int getCount() {
      return count;
    }
}

class Bender extends Person {
    String element;
    public Bender(String city, String element) {
        super(city); 
        this.element = element;
    }

    public void bendElement() {
        System.out.println("Oh yeah I'm bending " + this.element);
    }

    public String getCity() {
      return "The city this person is from is: " + this.city;
    }

    public String getName() {
      return this.name;
    }
}