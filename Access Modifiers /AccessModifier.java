package myPackage;

// Example class with different access modifiers
public class AccessModifiersExample {

    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;
    int defaultVariable = 40;

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Protected method accessible within this package and by subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Default method accessible within this package (default access)
    void defaultMethod() {
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        // Creating an object of AccessModifiersExample class
        AccessModifiersExample obj = new AccessModifiersExample();

        // Accessing variables with different access modifiers
        System.out.println("Public Variable: " + obj.publicVariable);
        System.out.println("Private Variable: " + obj.privateVariable); // Error: Cannot access private variable directly
        System.out.println("Protected Variable: " + obj.protectedVariable);
        System.out.println("Default Variable: " + obj.defaultVariable);

        // Accessing methods with different access modifiers
        obj.publicMethod();
        // obj.privateMethod(); // Error: Cannot access private method directly
        obj.protectedMethod();
        obj.defaultMethod();
    }
}
