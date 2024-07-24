package array;

public class Pair {
    public static void printpair(int number[]){
        
        for (int i=0; i<number.length; i++) {
            int curr = number[i];

            for (int j=i+1; j<number.length; j++) {
                System.out.print("("+curr+","+number[j]+")");
                
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = {2, 5, 6, 10, 15, 17, 20};
        printpair(number);
        

    }
}
