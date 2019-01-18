//: typeinfo/pets/ForNameCreator.java
package ThinkingInJava4th源码code.TIJ4code.typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {
  
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Mutt",
    "ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Pug",
    "ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.EgyptianMau",
    "ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Manx",
    "ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Cymric",
    "ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Rat",
    "ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Mouse",
    "ThinkingInJava4th源码code.TIJ4code.typeinfo.pets.Hamster"
  };	
  
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  
  static { loader(); }
  
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
