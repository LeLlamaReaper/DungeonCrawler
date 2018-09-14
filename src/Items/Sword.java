package Items;

public class Sword {
    double minDmg;
    double maxDmg;
    
    public Sword() {}
    public Sword(double minDmg, double maxDmg) {this.minDmg = minDmg; this.maxDmg = maxDmg;}
    
    public void setSword(double minDmg, double maxDmg) 
    {
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }
    public double getMinDmg(double minDmg) 
    {
        return minDmg;
    }
    public double getMaxDmg(double maxDmg)
    {
        return maxDmg;
    }
}
