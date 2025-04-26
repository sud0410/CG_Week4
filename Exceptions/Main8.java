import java.util.*; public class Main {
    public static void Main8(String[] args) { Scanner sc = new Scanner(System.in); try {

        int[] arr={10, 20, 30}; System.out.print("Enter index: "); int index=sc.nextInt();
        try {

            System.out.print("Enter divisor: "); int divisor=sc.nextInt();
            int result=arr[index] / divisor; System.out.println("Result: " + result);
        } catch (ArithmeticException e) { System.out.println("Cannot divide by zero!");
        }

    } catch (ArrayIndexOutOfBoundsException e) { System.out.println("Invalid array index!");
    }

    }

}
