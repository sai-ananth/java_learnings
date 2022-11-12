package interfaces;

//public abstract interface Bounceable
public interface Bounceable {
    int MAX_BOUNCE_FACTOR = 50;     // public static final
    void bounce();                 // public abstract void bounce( );
    void setBounceFactor(int bf);   // public abstract void setBounceFactor(int bf);
}
