// How do you show a diamond problem with multiple inheritance in Java?
//
// The diamond problem occurs when a class inherits from multiple classes and ambiguity occurs \
// when it’s unclear which method to execute from which class.
// Java doesn’t allow extending multiple classes to avoid the diamond problem

/*
public class DiamondProblem {

    interface I {
        void foo();
    }

    class A implements I {
        public void foo() {
            System.out.println("Foo from A");
        }
    }

    class B implements I {
        public void fool() {
            System.out.println("Foo from B");
        }
    }

    class C implements A, B {
        public void bar() {
            foo();
        }
    }
}
*/


