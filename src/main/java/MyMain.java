import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c)
    {
        if ((a>b && a<c)||(a>c && a<b)){
            return a;
        }
        if ((b>a && b<c)||(b>c && b<a)){
            return b;
        }

        return c;



    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a)>Math.abs(b)){
            return a;}
        return b;// REPLACE WITH YOUR CODE
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(((a*a)+(b*b)));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
//        System.out.println(median(1, 2, 3)); // should be 2
//        System.out.println(magnitude(-7, -1)); // should be -7
//        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("What method do you want to use?");
        String x=scan.nextLine();

        if (x.contains("median")){
            System.out.println("What is the first number?");
            int a=scan.nextInt();
            System.out.println("What is the second number?");
            int b=scan.nextInt();
            System.out.println("What is the third number?");
            int c=scan.nextInt();
            System.out.println(median(a,b,c));
        }
        if (x.contains("magnitude")){
            System.out.println("What is the first number?");
            int a=scan.nextInt();
            System.out.println("What is the second number?");
            int b=scan.nextInt();
            System.out.println(magnitude(a,b));
        }
        if (x.contains("pythagoras")){
            System.out.println("What is the first number?");
            int a=scan.nextInt();
            System.out.println("What is the second number?");
            int b=scan.nextInt();
            System.out.println(pythagoras(a,b));
        }
    }
}
