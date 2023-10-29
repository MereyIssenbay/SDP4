class RealMadrid implements Observer {
    @Override
    public void update(String team, double cost) {
        if (team.equals("Real Madrid")) {
            System.out.println("Real Madrid received a notification: Jersey cost is now $" + cost);
        }
    }
}