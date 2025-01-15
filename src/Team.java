import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Team {
    private HashMap<Integer, Monster> monsterList;
    private ArrayList<Monster> team;

    public Team() {
        this.monsterList = generateMonsters();
        this.team = generateTeam(monsterList);
    }

    @Override
    public String toString() {
        String str = "Team = \n";
        for (Monster m: team){
           str += m.toString()+ "\n";
        }
        return str;
    }


    public static HashMap<Integer,Monster> generateMonsters(){
        HashMap<Integer,Monster> t = new HashMap<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/Pokemon.txt"));
            String line = reader.readLine();
            //Skip the headers in the file
            line = reader.readLine();
            Integer counter = 1;
            while (line != null) {
                String[] arr = line.split(",");
                t.put(counter, new Monster(arr[0],arr[1],arr[2],
                        Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5]),Integer.parseInt(arr[6]),
                        Integer.parseInt(arr[7]),Integer.parseInt(arr[8])));
                counter++;
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static ArrayList<Monster> generateTeam(HashMap<Integer, Monster> database){
        ArrayList<Monster> t = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            t.add(database.get(random.nextInt(1,1026)));
        }
        return t;
    }
}