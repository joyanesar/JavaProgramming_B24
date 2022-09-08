package Office_Hours_10_21_2021;

public class Sport {

    private  String name;
    private  int numberOfPlayers;
    private  boolean isTeamBased;

    public Sport(String name, int numberOfPlayers, boolean isTeamBased) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.isTeamBased = isTeamBased;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public boolean isTeamBased() {
        return isTeamBased;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setTeamBased(boolean teamBased) {
        isTeamBased = teamBased;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", isTeamBased=" + isTeamBased +
                '}';
    }
}
/*
Create a class called Sport
- instance variables: name, number of players, team based (boolean)

- Create a constructor to initialize the three fields

- Encapsulate the variables

- Bonus: pervent negative number of players to assigned and null or empty space to be assigned to name
 */