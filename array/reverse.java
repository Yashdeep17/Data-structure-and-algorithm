package array;

public class reverse {
    public static void reversearray(int number[]){
        int first = 0, last = number.length-1;


        while (first < last) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;
            
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 5, 6, 10, 15, 17, 20};

        for(int i = 0; i<=number.length-1;i++){
            System.out.print(number[i]+", ");
        }
        System.out.println();


        reversearray(number);

        for(int i = 0; i<=number.length-1;i++){
            System.out.print(number[i]+", ");
        }
    }
}
