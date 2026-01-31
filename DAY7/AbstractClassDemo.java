public class AbstractClassDemo {
    public static void main(String[] args) {
        // Primitive
        char a = 's';

        // Boxing (primitive → object)
        Character obj = Character.valueOf(a);

        // Auto-boxing (Java does it automatically)
        Character obj2 = a;

        // Unboxing (object → primitive)
        char b = obj2.charValue();

        // Auto-unboxing
        char c = obj2;

        System.out.println("Primitive a: " + a);
        System.out.println("Boxed object: " + obj);
        System.out.println("Unboxed value: " + b);
        System.out.println("Auto-unboxed value: " + c);
    }
}
