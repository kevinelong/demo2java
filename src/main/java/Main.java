public class Main {
  public static void main(String[] args) {
    //CREATE INSTANCE OF CLASS DEFINED ELSEWHERE
    InventoryItem item = new InventoryItem("pencil", 12);
    item.inc();    
    item.inc();
    item.display();

    for (int i = 1; i <= 5; i++) {
        System.out.println("i = " + i);
    }
    
    //SIMPLE DATA TYPES for individual variables
    int a = 6; //integer - whole numbers
    int b = 7;
    int x = a * b;
    System.out.println(x);

    double cost = 9.99; //doubly precise float. 
    //floating point decimal for fractions
    System.out.println(cost);

    char z = 'Z'; //single character
    System.out.println(z);

    //COMPLEX DATA TYPES for Objects and other collections like Array or String
    String name = "Java Folks"; // "array" of characters
    System.out.println("Hello " + name + "!!!");

    //ALSO COMPLEX DATA TYPE BOTH ARRAY AND STRING
    String[] fruit = {"Apple", "Banana", "Cherry"};
    System.out.println(String.join("\t", fruit));

  }
}
