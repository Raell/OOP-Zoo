package Zoo;

public class Zoo {

  public static void main(String[] args) {
    System.out.println("Whoop! You have opened the zoo for business.");
  }

  public String feed(Animal animal, Food food) {
    //TODO: Insert code here!
    return animal.eat(food);
    
  }
  public String feed(Dog dog, Food food) {
    //TODO: Insert code here!
    return dog.eat(food);
    
  }
}
