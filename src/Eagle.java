public class Eagle implements CanFly{
    @Override
    public void KmH() {
        System.out.println("Km/h: 200");
    }

    @Override
    public void PredatorOrNotPredator() {
        System.out.println("Predator");
    }

    @Override
    public String toString() {
        return "\tEagle";
    }
}
