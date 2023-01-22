public class Main {

    public static void main(String[] args) {

     /*   for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        int i = 1;
        boolean isReady = false;
        do {
            if (i > 5) {
                break;
            }
            System.out.println(i);
            i++;
            isReady = (i> 0);
        }while (isReady);*/

        int number = 0;
        while (number < 50 ) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.println(number + " _");
        }
    } 

}