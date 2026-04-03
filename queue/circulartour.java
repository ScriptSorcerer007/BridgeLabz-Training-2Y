package queue;

public class circulartour {
    public static int canCompleteCircuit(int[] petrol, int[] distance) {
        int totalPetrol = 0;
        int totalDistance = 0;
        for (int i = 0; i < petrol.length; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];
        }
        if (totalPetrol < totalDistance) return -1;

        int start = 0;
        int currentPetrol = 0;
        for (int i = 0; i < petrol.length; i++) {
            currentPetrol += (petrol[i] - distance[i]);
            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        System.out.println("Starting point: " + canCompleteCircuit(petrol, distance));
    }
}

