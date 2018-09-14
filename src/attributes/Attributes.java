package attributes;

public class Attributes {
    
private double str;
private double vit;
    
    public Attributes () {}
    
    public Attributes (double str, double vit) {
        this.str = str;
        this.vit = vit;
    }
    public double getVit(double vit) 
    {
        return vit;
    }
    public double getStr(double str) 
    {
        return str;
    }
    public void setStr(double str) 
    {
        this.str = str;
    }
    public void setVit(double vit) 
    {
        this.vit = vit;
    }
}
