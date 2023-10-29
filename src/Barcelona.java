class Barcelona implements Observer {
    @Override
    public void update(String team, double cost) {
        if (team.equals("Barcelona")) {
            System.out.println("Barcelona received a notification: Jersey cost is now $" + cost);
        }
    }
}