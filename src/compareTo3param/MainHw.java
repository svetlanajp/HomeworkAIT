package compareTo3param;

import java.util.Arrays;

public class MainHw {
    public static void main(String[] args) {
        PlayerHw player1=new PlayerHw(3,"Jack",22);
        PlayerHw player2=new PlayerHw(1,"Simon",19);
        PlayerHw player3=new PlayerHw(2,"Alex",24);
        PlayerHw player4=new PlayerHw(2,"Jack",12);
        PlayerHw player5=new PlayerHw(3,"Alex",24);
        PlayerHw player6=new PlayerHw(1,"Jack",19);
        PlayerHw[] team={player1,player2,player3,player4,player5,player6};
        Arrays.sort(team);
        for (PlayerHw player:team){
            System.out.println(player);
        }
    }
}
