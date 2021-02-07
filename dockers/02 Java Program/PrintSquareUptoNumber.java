import java.util.stream.*;

public class PrintSquareUptoNumber {

    public static void main(String[] args) {
        if(args.length!=1) {
            System.out.println("Number of arguments must be 1. Exiting Program..");
            System.exit(1);
        }
        int number = Integer.parseInt(args[0]);
        IntStream.range(1, number).forEach(i -> System.out.printf("Square of %d=%d%n",i,(i * i)));
    }
}