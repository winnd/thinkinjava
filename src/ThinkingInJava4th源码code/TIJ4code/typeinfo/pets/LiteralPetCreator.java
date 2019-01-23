//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package ThinkingInJava4th源码code.TIJ4code.typeinfo.pets;

import java.util.*;

public class LiteralPetCreator extends PetCreator {
    // No try block needed.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class));
    
    // Types for random creation:
    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());        // r:切割list

    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
} /* Output:
[class Mutt, class Pug, class EgyptianMau, class Manx, class Cymric, class Rat, class Mouse, class Hamster]
*///:~
