package charPack;
import java.util.*;
import Items.Sword;
public class Inventory {
    List<Double> inv = new ArrayList<Double>();
    double minDmg;
    double maxDmg;
    public Inventory() {}
    
    public Inventory(List inv) 
    {
        this.inv = inv;
    }
    public void setInv(List inv)
    {
        this.inv = inv;
    }
    public List getInv(List inv)
    {
        return inv;
    }
    public void addItem(Sword sw)
    {
        sw = new Sword();
        sw.setSword(minDmg, maxDmg);
        inv.addAll((Collection<? extends Double>) sw);
    }
}
