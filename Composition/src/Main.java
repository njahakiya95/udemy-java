public class Main {

    public static void main(String[] args) {
        //Walls 1-4 represent the four walls of a bedroom
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        //Size of the ceiling using a Ceiling object
        Ceiling ceiling = new Ceiling(12, 55);

        //Style of the bed using a Bed object
        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        //Type of lamp and battery rating
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Nick", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
