import java.util.List;
import java.util.Random;

public class RandomMove implements MoveBehaviour{
    public void rand(List<Cell> possibleLocs, Actor a){
        int moveBotChooses = (new Random()).nextInt(possibleLocs.size());
        a.setLocation(possibleLocs.get(moveBotChooses));
    }
}
