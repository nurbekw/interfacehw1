public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        System.out.println(eagle);
        eagle.PredatorOrNotPredator();
        eagle.KmH();

        PeregrineFalcon peregrineFalcon = new PeregrineFalcon();
        System.out.println(peregrineFalcon);
        peregrineFalcon.PredatorOrNotPredator();
        peregrineFalcon.KmH();

        Crow crow = new Crow();
        System.out.println(crow);
        crow.PredatorOrNotPredator();
        crow.KmH();

        Pigeon pigeon = new Pigeon();
        System.out.println(pigeon);
        pigeon.PredatorOrNotPredator();
        pigeon.KmH();
    }
}