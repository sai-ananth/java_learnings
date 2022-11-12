package interfaces;

public final class Tyre implements Bounceable{
    @Override
    public void bounce() {
        System.out.println("bouncing the Tyre");
    }

    @Override
    public void setBounceFactor(int bf) {

    }
}


//class smallTyre extends Tyre{
//
//}
