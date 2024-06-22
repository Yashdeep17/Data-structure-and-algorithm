package Patterns;

public class inveerted {

public static void main(String[] args) {
    

    for (int i=1; i<=4; i++) {
        for (int star=1; star<=4-i+1; star++) {
            System.out.print(star);
        }
        System.out.println();
        
    }
}
}
