public class Hangar {
    public static void main(String[] args) {
        Car maVoiture = new Car("Clio", 10000);
        Boat monBateau = new Boat("Titanic", 5000);
        
        System.out.println(maVoiture.doStuff());
        System.out.println(monBateau.doStuff());
    }
}
