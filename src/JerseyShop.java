import java.util.ArrayList;
import java.util.List;

class JerseyShop {
    private double barcelonaJerseyCost;
    private double realMadridJerseyCost;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setJerseyCost(String team, double cost) {
        if (team.equals("Barcelona")) {
            this.barcelonaJerseyCost = cost;
        } else if (team.equals("Real Madrid")) {
            this.realMadridJerseyCost = cost;
        }
        notifyObservers(team, cost);
    }

    private void notifyObservers(String team, double cost) {
        for (Observer observer : observers) {
            observer.update(team, cost);
        }
    }
}