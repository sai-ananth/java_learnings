package interfaces;

class Ball implements Bounceable{
    BallSize size;
    int bounceFactor;

    public Ball(){
        this.size = BallSize.SMALL;
    }

    public Ball(BallSize sz){
        this.size = sz;
    }

    @Override
    public void bounce() {
        System.out.println("bouncing the ball by a factor of "
                + this.bounceFactor
                + " and radius of "
                + this.size.getRadius());
    }

    @Override
    public void setBounceFactor(int bf) { // final int bf
        if (bf > Bounceable.MAX_BOUNCE_FACTOR){
            bf = Bounceable.MAX_BOUNCE_FACTOR; // Access statics with class name
        }
//        Bounceable.MAX_BOUNCE_FACTOR = 75; // this is invalid as it is final
        this.bounceFactor = bf;
    }

    public void bounce(int bf){
        System.out.println("bouncing the "+ size +" ball by a factor of "+ bf);
    }
}

class RubberBall extends Ball {

    public RubberBall(BallSize sz){
        super(sz);
    }
    @Override
    public void bounce(){
        System.out.println("do some thing else");
    }
}

enum BallSize {
    SMALL(5),
    MEDIUM(10),
    BIG(15);

    private final int radius;

    BallSize(int r){ // constructor for enum
        this.radius = r;
    }

    public int getRadius(){
        return this.radius;
    }
}
