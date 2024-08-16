public class ClassInheritance{
    class Animal{
        String color;

        void speak(){
            System.out.println("Animal sounds.");
        }
    }

    class Cat extends Animal{
        void speak(){
            System.out.println("Meow");
        }
    }

    public static void main(String[] args){
        ClassInheritance example = new ClassInheritance();
        Cat myCat = example.new Cat();

        myCat.color = "orange";

        System.out.println(myCat.color);
        myCat.speak();
    }
}

/*
public class ClassInheritance {
    class Animal {
        String color;

        void eat() {
            System.out.println("This animal is eating.");
        }
    }

    class Cat extends Animal {
        void meow() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        ClassInheritance example = new ClassInheritance();
        Cat myCat = example.new Cat();

        myCat.color = "White";

        myCat.eat();
        myCat.meow();

        System.out.println("My cat's color is " + myCat.color);
    }
}
*/