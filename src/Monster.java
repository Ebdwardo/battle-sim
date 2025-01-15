import java.util.ArrayList;

public class Monster {
    private String name = null;
    private String type1 = null;
    private String type2 = null;
    private Integer health = null;
    private Integer attack = null;
    private Integer defense = null;
    private Integer spAttack = null;
    private Integer spDefense = null;
    private Integer Speed = null;
    private String status = null;
    private ArrayList<Move> moveSet= new ArrayList<>();

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", spAttack=" + spAttack +
                ", spDefense=" + spDefense +
                ", Speed=" + Speed +
                ", status='" + status + '\'' +
                '}';
    }

    public Monster(String name, String type1, String type2, Integer health, Integer attack, Integer defense, Integer spAttack, Integer spDefense, Integer speed) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        Speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(Integer spAttack) {
        this.spAttack = spAttack;
    }

    public Integer getSpDefense() {
        return spDefense;
    }

    public void setSpDefense(Integer spDefense) {
        this.spDefense = spDefense;
    }

    public Integer getSpeed() {
        return Speed;
    }

    public void setSpeed(Integer speed) {
        Speed = speed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String statusEffect) {
        this.status = statusEffect;
    }

    public ArrayList<Move> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(ArrayList<Move> moveSet) {
        this.moveSet = moveSet;
    }

}
