public interface Fly {

    void takeOff();
    void land();
    int ascend(int meters);
    int descend(int meters);
    default void glide(){System.out.println("It glides into the air.");}
}