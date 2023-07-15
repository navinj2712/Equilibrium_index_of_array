import java.util.Scanner;

public class EquilibriumIndexOfArray {

    public static int findEquilibrium(int[] array){
        int size = array.length;
        int[] prefixSumArray = new int[size];
        int counter = 0;
        prefixSumArray[0] = array[0];
        for(int i = 1; i < size; i++){
            prefixSumArray[i] = prefixSumArray[i-1] + array[i];
        }
        for (int i = 1; i < size; i++){
            if(prefixSumArray[i - 1] == prefixSumArray[size - 1] - prefixSumArray[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int output = findEquilibrium(array);
        System.out.println("Output : " + output);

    }
}
