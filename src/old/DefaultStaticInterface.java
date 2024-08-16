public class DefaultStaticInterface {

    public interface Interface1 {

        // regular abstract method
        void method1(String str);

        // default method
        default void log(String str) {
            System.out.println("I1 logging::" + str);
        }

        // static method
        public static boolean isNull(String str) {
            System.out.println("Interface Null Check");

            return str == null || "".equals(str);
        }
    }

    // A class implementing Interface1
    public static class MyClass implements Interface1 {

        @Override
        public void method1(String str) {
            System.out.println("MyClass method1::" + str);
        }

        // Optional: Override the default method
        @Override
        public void log(String str) {
            System.out.println("MyClass logging::" + str);
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Calling the implemented method
        obj.method1("Hello");

        // Calling the overridden default method
        obj.log("Hello");

        // Calling the static method from the interface
        boolean result = Interface1.isNull("");
        System.out.println("Is Null or Empty: " + result);

        result = Interface1.isNull("Test");
        System.out.println("Is Null or Empty: " + result);
    }
}
