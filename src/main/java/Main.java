import java.math.BigInteger;

public class Main {


    byte aByte = 8;
    short aShort = 100;
    int age = 25;
    long distance = 277528822;
    float aFloat = 2.2f;
    double aDouble = 2.5;
    char sign = '$';
    boolean man = true;

    String name = "Andrey";

    public static void main(String[] args) {
        System.out.println(calculate(2.2f, 2f, 7f,4.3f));
        System.out.println(compareNumber(20,9));
        checkNumber(-3);
        sayName("vala");
    }


    public static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean compareNumber(int a, int b){
        int sum = a + b;

        if(sum >= 10 && sum <=20){
            return true;
        }else {
            return false;
        }
    }

    public static void checkNumber(int a){
        if(a%2<=0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void sayName(String name){
        System.out.println("Привет, " + name);
    }




}
