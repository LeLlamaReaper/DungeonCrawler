package charPack.classes;
import attributes.*;

public class Fighter {
    private double str;
    private double vit;
    private double HP;
    HealthPoints hp = new HealthPoints();
    Attributes att = new Attributes();
    
    public Fighter() 
    {
       
    }
    
    public Fighter(Attributes att, HealthPoints hp)
    {
        this.att.setStr(str);
        this.att.setVit(vit);
        this.hp.setHP(HP);
        
        
    }

    public void setFighter(double str, double vit, double HP)
    {
        this.str = str;
        this.vit = vit;
        this.hp.setHP(HP);
    }
    public double getFighterStr(double str)
    {
        return str;
    }
    
    
}