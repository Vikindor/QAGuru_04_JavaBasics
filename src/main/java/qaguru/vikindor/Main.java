package qaguru.vikindor;

public class Main {

    public static void main(String[] args) {

        //// Primitive Data Types
        // Integer Types
        byte aByte = 0; // 8b -128 + 127
        short aShort = 0; // 16b -32768 +32767
        int aInt = 0; // 32b (-2^32) .. (+2^32 -1)
        long aLong = 0; // 64b
        // Floating point types
        float aFloat = 0.0F;
        double aDouble = 0.00;
        // Character Type
        char aChar = 'x'; //16-bit Unicode character
        // Boolean Type
        boolean aBoolean = true;

        //// Object Types (String and many others)
        String helloWorld = "Hello world!";

        //// Operators

        // Simple Assignment Operator

        // =       Simple assignment operator
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 35;
        String line1 = "aaa";
        String line2 = "bbb";
        float float1 = 2.5F;
        double double1 = 1.55;

        // Arithmetic Operators

        // +       Additive operator (also used for String concatenation)
        System.out.println("a + b = " + (a + b));
        System.out.println("line1 + line2 = " + line1 + line2);
        System.out.println("line1 + _ + line2 = " + line1 + " " + line2);
        System.out.println("a + float1 = " + a + float1);
        System.out.println("a + double1 = " + a + double1);
        System.out.println("float1 + double1 = " + float1 + double1);

        // -       Subtraction operator
        System.out.println("a - b = " + (a - b));
        System.out.println("float1 - double1 = " + (float1 - double1));

        // *       Multiplication operator
        System.out.println("a * b = " + (a * b));
        System.out.println("float1 * a = " + (float1 * a));
        System.out.println("double1 * a = " + (double1 * a));
        System.out.println("float1 * double1 = " + (float1 * double1));

        // /       Division operator
        System.out.println("b / a = " + (b / a));
        System.out.println("float1 / a = " + (float1 / d));
        System.out.println("double1 / a = " + (double1 / d));

        // %       Remainder operator
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("float1 % a = " + (float1 % d));
        System.out.println("double2 % a = " + (double1 % d));

        // Unary Operators

        // +       Unary plus operator; indicates positive value (numbers are positive without this, however)
        System.out.println("+a = " + +a);

        // -       Unary minus operator; negates an expression
        System.out.println("-a = " + -a);

        // ++      Increment operator; increments a value by 1
        System.out.println("d++ = " +  (d++)); //Shows 35, then adds 1 -> 36
        System.out.println("++d = " +  (++d)); //Adds 1 -> 37, and only then shows

        // --      Decrement operator; decrements a value by 1
        System.out.println("a-- = " +  (a--)); //Shows 10, then takes 1 -> 9

        // !       Logical complement operator; inverts the value of a boolean
        System.out.println("a == b = " + (!(a == b))); //false -> true

        // Equality and Relational Operators

        // ==      Equal to
        System.out.println("a == b = " + (a == b));

        // !=      Not equal to
        System.out.println("a != b = " + (a != b));

        // >       Greater than
        System.out.println("a > b = " + (a > b));

        // >=      Greater than or equal to
        System.out.println("b >= a = " + (b >= a));

        // <       Less than
        System.out.println("a < b = " + (a < b));

        // <=      Less than or equal to
        System.out.println("b <= a = " + (b <= a));

        // Conditional Operators
        boolean t = true;
        boolean f = false;
        int one = 1;
        int two = 2;

        // &&      Conditional-AND (if BOTH not equal zero, then true)
        System.out.println("true && false = " + (t && f));
        System.out.println((one == 777) && (two == 777));
        System.out.println((one == 777) && (two == 2));
        System.out.println((one == 1) && (two == 777));
        System.out.println((one == 1) && (two == 2)); //true

        // ||      Conditional-OR (if any not equal zero, then true)
        System.out.println("true || false = " + (t || f));
        System.out.println((one == 777) || (two == 777));
        System.out.println((one == 777) || (two == 2)); //true
        System.out.println((one == 1) || (two == 777)); //true
        System.out.println((one == 1) || (two == 2)); //true

        // ?:      Ternary (shorthand for if-then-else statement)
        System.out.println((one == 777) ? "A" : "B");

        // Type Comparison Operator
        // instanceof      Compares an object to a specified type
        System.out.println(helloWorld instanceof String);

        // ERROR EXAMPLES

        // ArithmeticException: / by zero
        //System.out.println(one / 0);

        // Cannot cast 'int' to 'java.lang.Integer'
        //System.out.println(aInt instanceof Integer);

        // Numeric overflow in expression: A constant holding the maximum value an int can have 2^31 - 1.
        int intOverflow = 2_147_483_647;
        System.out.println(intOverflow + 1);
        System.out.println(Integer.MAX_VALUE + 1); //Same problem, but using wrapper

        // java.lang.NullPointerException
        //String testNull = null;
        //if (testNull.length() != 5) {
        //    System.out.println("Success");
        //};
    }
}