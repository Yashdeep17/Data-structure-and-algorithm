package Patterns;

public class halfpyramid {
    
    public static void main(String[] args) {
    

        for (int i=1; i<=4; i++) {
            for (int star=1; star<=i; star++) {
                System.out.print(star);
            }
            System.out.println();
            
        }
    }
}
