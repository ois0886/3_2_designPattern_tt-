package Practice01;

public class Client {
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw();

        RoadDisplayWithLane roadWithLane = new RoadDisplayWithLane();
        roadWithLane.draw();
    }
}
