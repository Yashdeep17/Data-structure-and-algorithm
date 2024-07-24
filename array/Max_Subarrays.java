package array;

public class Max_Subarrays {
    public static void Maxsubarraysum(int number[]){
        int currSum = 1;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<number.length; i++) {
            int start= i;
            
            for (int j=0; j<number.length; j++) {
                int end= j;
                currSum = 0;
                
                for (int k=start; k<=end; k++) {
                    currSum += number[k];
        }
        System.out.println(currSum);
        if (maxSum < currSum) {
            maxSum = currSum;
        }
    }
}
System.out.println("maxSum ="+ maxSum);
}

public static void main(String[] args) {
    int number[] = {2, 5, 6, 10, 15, 17, 20};
    Maxsubarraysum(number);

    }
}
