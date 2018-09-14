package dmg;
import Items.Sword;
import attributes.Attributes;
import charPack.classes.*;
public class Damage {
    double dmg;
    double minDmg;
    double maxDmg;
    Attributes att = new Attributes();
    Fighter test = new Fighter();
    double str;
    public Damage() { }
    
    public double getMinDmg(double minDmg) 
    {
        minDmg += (1.3*att.getStr(test.getFighterStr(str)));
        return minDmg;
    }
    public double getMaxDmg(double maxDmg)
    {
        maxDmg += (1.3*att.getStr(test.getFighterStr(str)));
        return maxDmg;
    }
        
}
