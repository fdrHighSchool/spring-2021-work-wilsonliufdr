/* Notes: A subclass inherits all public methods from its superclass, you can modify the existing methods this is called overriding methods.
To overwrite an inherited method, the method of the child class must have the same name, parameter list and return type.
Overloading a method is when several methods have the same name but the parameter types, order, or number are different.
 */

public class Pet
{
    private String name;
    private String type;

    public Pet(String n, String t)
    {
        name = n;
        type = t;
    }
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }

    public void speak()
    {
        System.out.println("grr!");
    }
    public static void main(String[] args)
    {
        Pet p = new Pet("Sammy","hamster");
        System.out.println(p.getType());
        p.speak();

        Dog d = new Dog("Fido");
        System.out.println(d.getType());
        d.speak();
        Cat c = new Cat("Fluffy");
        System.out.println(c.getType());
        c.speak();

    }
}

// Complete the Dog class
class Dog extends Pet{

    public Dog(String name) {
        super(name, "dog");
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

// Add a Cat class
class Cat extends Pet{
    public Cat(String name) {
        super(name, "cat");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

