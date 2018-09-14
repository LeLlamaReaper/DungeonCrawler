/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charPack;
import charPack.classes.*;
public class classChooser {
    Fighter fight = new Fighter();
    Berzerker berz = new Berzerker();
    
    public classChooser() {
        fight.setFighter(13, 10, 150);
        berz.setBerzerker(20, 5, 130);
    }
}
