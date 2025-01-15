public class Move {
    private Integer Damage = null;
    private String type = null;
    private String statusEffect = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return statusEffect;
    }

    public void setStatus(String status) {
        this.statusEffect = status;
    }

    public Integer getDamage() {
        return Damage;
    }

    public void setDamage(Integer damage) {
        Damage = damage;
    }
}
