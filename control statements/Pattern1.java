package pattern;

import java.util.regex.Pattern;

class pattern {
    int a;
    int b;
   // int number=1;
 //   int row =6;
    void  get (){
        for (a=0; a<=6; a++) {
            int number=1;
            for (b=0; b<=a; b++) {
                System.out.print(number+ "");
                number++;
            }
            System.out.println();

        }
    }
}

    public class Pattern1 {
        public static void main(String[] args) {
            pattern p = new pattern();
            p.get();
        }
    }

