package ThinkingInJava4th源码code.TIJ4code.typeinfo;//: typeinfo/Person.java
// A class with a Null Object.

import ThinkingInJava4th源码code.TIJ4code.net.mindview.util.Null;

import java.io.File;

class Person {
    public final String first;
    public final String last;
    public final String address;

    // etc.
    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() { super("None", "None", "None"); }

        public String toString() { return "NullPerson"; }
    }

    public static final Person NULL = new NullPerson();
} ///:~
