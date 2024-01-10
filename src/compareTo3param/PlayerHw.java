package compareTo3param;

public class PlayerHw implements Comparable<PlayerHw>{
    private int ranking;
    private String name;
    private int age;

    public PlayerHw(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(PlayerHw pl) {
        int playerName = getName().compareTo(pl.getName());
        int playerAge = Integer.compare(getAge(),pl.getAge());
        // int playerRanking = Integer.compare(getRanking(),pl.getRanking());
        if (playerName==0&&playerAge==0){
            return Integer.compare(getRanking(),pl.getRanking());
        }
        return playerName==0 ? Integer.compare(getAge(),pl.getAge()): playerName;
    }

    @Override
    public String toString() {
        return "PlayerHw " +
                "ranking= " + ranking +
                ", name= " + name  +
                ", age= " + age;
    }
}
