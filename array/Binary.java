package array;

public class Binary {
    public static int binarysearch(int number[], int key){
        int start = 0, end= number.length-1;
        while (start <= end) {
            int mid = (start + end)/2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 5, 6, 10, 15, 17, 20};
        int key=15;

        int index = binarysearch(number, key);

        if (index==-1) {
            System.out.println("Not Found!!!");
        }
        else{
            System.out.println(key+" is on the "+index+" index");
        }
    }
}
