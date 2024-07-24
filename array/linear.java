package array;

public class linear {
    public static int linearsearch(int number[] , int key){
        for (int i=0; i<number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int number[] = {2, 5, 6, 10, 15, 17, 20};
        int key = 10;

        int index=linearsearch(number, key);
        if (index == -1) {
            System.out.println("Not Found");
        }
        else{
            System.out.println(key+" is at "+index+" Postion in array");
        }


    }
}
