public class Crow implements CanFly{
    @Override
    public void KmH() {
        System.out.println("Km/h: Unknown ");
    }

    @Override
    public void PredatorOrNotPredator() {
        System.out.println("Not predator");
    }

    @Override
    public String toString() {
        return "\tCrow";
    }
}
