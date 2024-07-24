package array;

public class subarray {
    public static void printsubarrays(int number[]){
        for (int i=0; i<number.length; i++) {
            int start= i;
            
            for (int j=0; j<number.length; j++) {
                int end= j;
                
                for (int k=start; k<=end; k++) {
                    System.out.print(number[k]+ " ");
        }
        System.out.println();
    }
    System.out.println();

    }
}

public static void main(String[] args) {
    int number[] = {2, 5, 6, 10, 15, 17, 20};
    printsubarrays(number);
}
}
