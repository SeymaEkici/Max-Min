import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many will you enter number? ");
        int arrayNum = input.nextInt();

        System.out.println("Now enter the numbers: ");
        int array[] = new int[arrayNum];

        for (int i = 0 ; i < arrayNum ; i++){
            array[i] = input.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1 ; i < arrayNum ; i++){

            if ( array[i] > max){
                max = array[i];
            }

            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Max: " + max + "\tMin: " + min);
    }
}
