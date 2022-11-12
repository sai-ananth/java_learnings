package interfaces;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(); // ball1 is object of type Ball
        RubberBall ball2 = new RubberBall(BallSize.BIG); // ball2 is object of type RubberBall

        // RubberBall extends Ball
        // objects do not extend other objects

//        Bounceable.MAX_BOUNCE_FACTOR = 100; // cannot change final variables
//        ball1.bounceFactor // cannot access as it is not public
        ball1.setBounceFactor(Bounceable.MAX_BOUNCE_FACTOR);
        ball2.setBounceFactor(10);

        ball1.bounce();
        ball2.bounce();

        ball1.bounce(15);
        ball2.bounce(25);


        Math mathObj = new Math();
        Varargs varargs = new Varargs();

        System.out.println(mathObj.add(1,2));
        System.out.println(mathObj.add(1,2,3));
        System.out.println(varargs.add("",1,2));
        System.out.println(varargs.add("",1,2,3));
        System.out.println(varargs.add("",1,2,3,4,5));

    }
}
