import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Bus {
    int kursi;
    int biaya;

    public Bus(int kursi, int biaya) {
        this.kursi = kursi;
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public boolean mampuMenampung(int penumpang) {
        return kursi >= penumpang;
    }
}

public class AgentTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Bus> buses = new ArrayList<>();
        buses.add(new Bus(60, 2300000));
        buses.add(new Bus(45, 2000000));
        buses.add(new Bus(32, 1800000));
        buses.add(new Bus(18, 1500000));
        buses.add(new Bus(12, 1300000));

        int minBiaya = Integer.MAX_VALUE;

        for (Bus bus : buses) {
            if (bus.mampuMenampung(n)) {
                minBiaya = Math.min(minBiaya, bus.getBiaya());
            }
        }

        if (minBiaya == Integer.MAX_VALUE) {
            System.out.println("Tidak ada bus yang dapat menampung.");
        } else {
            System.out.println(minBiaya);
        }

        scanner.close();
    }
}
