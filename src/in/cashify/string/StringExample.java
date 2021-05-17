package in.cashify.string;

import java.nio.charset.StandardCharsets;

public class StringExample {


    public final String name;


    public StringExample(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StringExample{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

// StringSample obj = new StringSample("Obj");
// System.out.println(obj);

        StringExample obj1 = new StringExample(new String("Obj1"));
        System.out.println(obj1);

        char[] array = {'A','n','a','n','y','a'};
        StringExample obj2 = new StringExample(new String(array));
        System.out.println(obj2);

        StringExample obj3 = new StringExample(new String(array,3,5));
        System.out.println(obj3);

        StringExample obj4 = new StringExample(new String("Cashify".getBytes(StandardCharsets.UTF_8)));
        System.out.println(obj4);




    }
}

