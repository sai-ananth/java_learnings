package interfaces;

public class Varargs {

    public int add(String s, int... arr){
        int tot = 0;
        for(int a: arr){
            tot += a;
        }
        return tot;
    }

}
