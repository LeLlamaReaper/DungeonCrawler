/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charPack.classes;
import attributes.*;
import Items.Sword;
public class Berzerker {
    HealthPoints hp = new HealthPoints();
    Attributes att = new Attributes();
    Sword sw = new Sword();
    double str;
    double vit;
    double HP;
    
    public Berzerker() {}
    
    public Berzerker(Attributes att, HealthPoints hp) 
    {
        this.att.setStr(str);
        this.att.setVit(vit);
        this.hp.setHP(HP);
        sw.setSword(10, 20);
    }
    public void setBerzerker(double str, double vit, double HP)
    {
        this.str = str;
        this.vit = vit;
        this.HP = HP;
    }
    public double getHP()
    {
        return HP;
    }
    public double getStr()
    {
        return str;
    }
    public double getVit()
    {
        return vit;
    }
}
