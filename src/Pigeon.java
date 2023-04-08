public class Pigeon implements CanFly{
    @Override
    public void KmH() {
        System.out.println("Km/h: 35-60");
    }

    @Override
    public void PredatorOrNotPredator() {
        System.out.println("Not predator");
    }

    @Override
    public String toString() {
        return "\tPigeon";
    }
}
