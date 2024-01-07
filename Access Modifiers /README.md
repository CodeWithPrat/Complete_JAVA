# Access Modifiers and Method Visibility in Java

Access modifiers in Java are keywords that regulate the visibility or accessibility of classes, methods, variables, and constructors within Java programs. They control the level of access that other classes or packages have to these elements.

### Types of Access Modifiers:

1. **Public:**
   - The most permissive access level.
   - Classes, methods, and fields marked as `public` can be accessed by any other class or package.
   - Example: `public class MyClass {}`

2. **Private:**
   - The most restrictive access level.
   - Methods and fields marked as `private` can only be accessed within the same class.
   - They are not accessible from outside the class, even from subclasses in different packages.
   - Example: `private int myField;`

3. **Protected:**
   - Accessible within the same package or by subclasses in different packages.
   - Methods and fields marked as `protected` can be accessed by the classes within the same package and by subclasses, regardless of the package.
   - Example: `protected void myMethod() {}`

4. **Default (Package-Private):**
   - No explicit modifier is used.
   - Classes, methods, and fields without an access modifier (default access) are accessible only within the same package.
   - They are not accessible from outside the package.
   - Example: `void myMethod() {}` (without any access modifier)

### Method Visibility:

Access modifiers applied to methods specify their visibility and control their accessibility from other classes or subclasses. They define which other classes or packages can invoke or access those methods.

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/02/accessibility-of-access-modifiers-in-java.jpg" alt="Access Modifier Visibility" title="AccessModifierVisibility">

### Example Demonstrating Method Visibility:

Consider a class `ExampleClass` with different methods using various access modifiers:

```java
public class ExampleClass {

    public void publicMethod() {
        // Accessible from any class or package.
    }

    private void privateMethod() {
        // Accessible only within this class.
    }

    protected void protectedMethod() {
        // Accessible within this package and by subclasses in different packages.
    }

    void defaultMethod() {
        // Accessible within this package (default access).
    }
}
```
