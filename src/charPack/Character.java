package charPack;
import java.util.*;

public class Character {
    private double str, vit, HP;
    private List<Double> inv = new ArrayList<>();
    Inventory Inv = new Inventory();
    
    public Character() {}
    public Character(List inv)
    {
        Inv.setInv(inv);
        Inv.addItem(null);
       
    }
    
}
