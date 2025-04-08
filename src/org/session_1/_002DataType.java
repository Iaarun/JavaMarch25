package org.session_1;

public class _002DataType {
    public static void main(String[] args) {
        // Primitive Data Type
        // byte, short, int, long, float, double, char, boolean

        // Non Primitive Data Type
        // String, Array, Class, Interface

         byte b = 127;
         short s = 32767;
         int i = 2147483647;
         long l = 9223372036854775807L;
         float f = 3.14f;
         double d = 3.14;
         char c = 'A';
         boolean bool = true;

        String name = "Selenium with Java";
        System.out.println(name);

        //implicit type casting
        short s1 =125;
        long l1 = s1; //short to long
        System.out.println(s1+" converted to "+l1);

        //explicit type casting
        long l2 = 9223372036854775807L;
        short s2=(short)l2;

        System.out.println(l2+" converted to "+s2);
    }
}
