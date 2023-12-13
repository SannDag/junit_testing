package sanndag;

public class Fail {

    public static double raiz(double num){
        if (num <0)
            throw new IllegalArgumentException("num debe ser positivo");
        return Math.sqrt(num);
    }
}
