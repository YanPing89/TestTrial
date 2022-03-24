package carpark;
import java.util.*;

import carpark.vehicle.*;

public class Main {
    public static final int SIZE = 50;
    static int left = 50;

    public static void main (String[] args){
        List<Vehicle> a = new ArrayList<>();
        vehicleList(a);
        int sum = 0;
        for (Vehicle b : a) {
            sum = sum + b.getSize();
        }
        int remain = left - sum;
        System.out.println("Total Parking Slot left: " + remain);

    }
    public static void vehicleList(List<Vehicle> vehiclesList) {
        Vehicle la = new Vehicle(Vehicle.big, "LorryA");
        Vehicle lb = new Vehicle(Vehicle.big, "LorryB");
        Vehicle lc = new Vehicle(Vehicle.big, "LorryC");
        Vehicle ld = new Vehicle(Vehicle.big, "LorryD");
        Vehicle le = new Vehicle(Vehicle.big, "LorryE");
        Vehicle lf = new Vehicle(Vehicle.big, "LorryF");
        Vehicle ca = new Vehicle(Vehicle.medium, "CarA");
        Vehicle cb = new Vehicle(Vehicle.medium, "CarB");
        Vehicle ba = new Vehicle(Vehicle.small, "BikeA");
        Vehicle bb = new Vehicle(Vehicle.small, "BikeB");
        Vehicle bc = new Vehicle(Vehicle.small, "BikeC");
        Vehicle bd = new Vehicle(Vehicle.small, "BikeD");
        Vehicle be = new Vehicle(Vehicle.small, "BikeE");
        Vehicle bf = new Vehicle(Vehicle.small, "BikeF");
        Vehicle bg = new Vehicle(Vehicle.small, "BikeG");
        Vehicle bh = new Vehicle(Vehicle.small, "BikeH");
        Vehicle bi = new Vehicle(Vehicle.small, "BikeI");
        Vehicle bj = new Vehicle(Vehicle.small, "BikeJ");
        Vehicle bk = new Vehicle(Vehicle.small, "BikeK");
        Vehicle bl = new Vehicle(Vehicle.small, "BikeL");
        Vehicle bm = new Vehicle(Vehicle.small, "BikeM");
        Vehicle bn = new Vehicle(Vehicle.small, "BikeN");
        Vehicle bo = new Vehicle(Vehicle.small, "BikeO");
        Vehicle bp = new Vehicle(Vehicle.small, "BikeP");
        Vehicle lg = new Vehicle(Vehicle.big, "LorryG");


        vehiclesList.add(la);
        vehiclesList.add(lb);
        vehiclesList.add(lc);
        vehiclesList.add(ld);
        vehiclesList.add(le);
        vehiclesList.add(lf);
        vehiclesList.add(ca);
        vehiclesList.add(cb);
        vehiclesList.add(ba);
        vehiclesList.add(bb);
        vehiclesList.add(bc);
        vehiclesList.add(bd);
        vehiclesList.add(be);
        vehiclesList.add(bf);
        vehiclesList.add(bg);
        vehiclesList.add(bh);
        vehiclesList.add(bi);
        vehiclesList.add(bj);
        vehiclesList.add(bk);
        vehiclesList.add(bl);
        vehiclesList.add(bm);
        vehiclesList.add(bn);
        vehiclesList.add(bo);
        vehiclesList.add(bp);
        vehiclesList.add(lg);

        for (Vehicle vehicleObject : vehiclesList) {
            System.out.println(vehicleObject);
        }
    }
}
