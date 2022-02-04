
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import controller.*;
import value.*;

public class Simulator {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> command = Arrays.asList(bufferedReader.readLine().split("\n"));
        DirectionController directionController = new DirectionController();

        bufferedReader.close();
    }
}
