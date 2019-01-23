package ThinkingInJava4th源码code.TIJ4code.holding;//: holding/PetMap.java

import ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Cat;
import ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Dog;
import ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Hamster;
import ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

import static ThinkingInJava4th源码code.TIJ4code.net.mindview.util.Print.print;

public class PetMap {
  public static void main(String[] args) {
    Map<String, Pet> petMap = new HashMap<String,Pet>();
    petMap.put("My Cat", new Cat("Molly"));
    petMap.put("My Dog", new Dog("Ginger"));
    petMap.put("My Hamster", new Hamster("Bosco"));
    print(petMap);
    Pet dog = petMap.get("My Dog");
    print(dog);
    print(petMap.containsKey("My Dog"));
    print(petMap.containsValue(dog));
  }
} /* Output:
{My Cat=Cat Molly, My Hamster=Hamster Bosco, My Dog=Dog Ginger}
Dog Ginger
true
true
*///:~
