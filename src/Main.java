public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BiCycle objBicycle = new BiCycle(4,5,6);
        MountainBike objMountainBike = new MountainBike(4,5, 6, 2);
        System.out.println(String.valueOf(objMountainBike.getGear()));
        MountainBike objMountainBike2 = new MountainBike(4,5, 6, 2);
        System.out.println(String.valueOf(objMountainBike2.gear));

        Point objPoint = new Point(4, 4);
        Rectangle objRect = new Rectangle(objPoint, 5, 5);

        System.out.println(String.valueOf(objRect.area()));


    }
}
