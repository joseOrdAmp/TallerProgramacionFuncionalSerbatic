package c_introduccion_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Predicate;



public class EjercicioLambdas1 {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Predicate op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            }
            else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            }
            else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }

}


class MyMath {

    public static boolean checker(Predicate<Integer> p, int num) {
     return p.test(num);
    }
    
    public Predicate<Integer> isOdd() {
        //Responder aqui con return (lambda);
    }

    public Predicate<Integer> isPalindrome() {
      //Responder aqui con return (lambda);
    }

    public Predicate<Integer> isPrime() {
      //Responder aqui con return (lambda);
    }
}
    






/*ENTRADA1
5
1 4
2 5
3 898
1 3
2 12

 FIN ENTRADA1*/

/*RESULT1
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
 */


/*ENTRADA2
6
3 344
3 454
2 68
2 67
1 12
1 3

 FIN ENTRADA2*/

/*Resultado2
NOT PALINDROME
PALINDROME
COMPOSITE
PRIME
EVEN
ODD
 */