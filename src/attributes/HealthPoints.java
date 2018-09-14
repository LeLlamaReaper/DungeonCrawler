package attributes;
import charPack.*;
public class HealthPoints {
    private double HP;
    private Attributes att;
    private double vit;
    
    public HealthPoints() {
        
    }
    
    public HealthPoints(double HP, double vit) {
        this.HP = HP;
        this.vit = vit;
    }
    public double getHP(double HP, double vit) {
        HP+=(vit*5);
        return HP;
    }
    public void setHP(double HP) {
        this.HP = HP;
    }
}
