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
