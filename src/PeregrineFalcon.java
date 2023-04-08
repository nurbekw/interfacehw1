public class PeregrineFalcon implements CanFly {
    @Override
    public void KmH() {
        System.out.println("Km/h: 300");
    }

    @Override
    public void PredatorOrNotPredator() {
        System.out.println("Predator");
    }

    @Override
    public String toString() {
        return "\tPeregrineFalcon";
    }
}
