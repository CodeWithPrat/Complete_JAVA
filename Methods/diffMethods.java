class Methods {
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // Void method (does not return a value)
    void voidMethod() {
        System.out.println("This is a void method.");
    }

    // Non-void method (returns an integer)
    int nonVoidMethod() {
        System.out.println("This is a non-void method returning an integer.");
        return 10;
    }

    // Parameterized method
    void parameterizedMethod(int num) {
        System.out.println("This is a parameterized method with value: " + num);
    }
}

public class DifferentMethodTypes {
    public static void main(String[] args) {
        // Creating an object to access instance methods
        Methods obj = new Methods();

        // Calling static method using class name
        Methods.staticMethod();

        // Calling instance method using object
        obj.instanceMethod();

        // Calling void method
        obj.voidMethod();

        // Calling non-void method and storing the returned value
        int result = obj.nonVoidMethod();
        System.out.println("Returned value from non-void method: " + result);

        // Calling parameterized method with an argument
        obj.parameterizedMethod(5);
    }
}
