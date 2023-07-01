package Lesonse49;

public class Test { //Рекурсия
    public static void main(String[] args) {

//        4!= 4 * 3 * 2 * 1  Факториал
//        1! = 1
//       15! = 15 * 14 * 13 * ... * 1
//        0! = 1
        System.out.println(fac(4));
    }
//    4 * 6 = 24  fac(4) = 24
//    3 * 2 = 6   fac(3) = 6
//    2 + 1 = 2   fac(2) = 2
//    fac(1) = return 1
    private static int fac(int n){
        if (n ==1)
            return 1;
        return n * fac(n - 1);
    }
}
