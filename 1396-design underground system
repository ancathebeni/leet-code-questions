import java.util.*;

class UndergroundSystem {

    HashMap<Integer, CheckIn> checkInMap;
    HashMap<String, Trip> tripMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        tripMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn in = checkInMap.get(id);

        String key = in.station + "-" + stationName;
        int travelTime = t - in.time;

        if (!tripMap.containsKey(key)) {
            tripMap.put(key, new Trip());
        }

        Trip trip = tripMap.get(key);
        trip.totalTime += travelTime;
        trip.count++;

        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "-" + endStation;
        Trip trip = tripMap.get(key);

        return (double) trip.totalTime / trip.count;
    }
}
class CheckIn {
    String station;
    int time;

    CheckIn(String station, int time) {
        this.station = station;
        this.time = time;
    }
}
class Trip {
    int totalTime = 0;
    int count = 0;
}
