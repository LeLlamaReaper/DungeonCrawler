package charPack;

import java.util.Scanner;

public class Name {
    private String name;
    private Scanner nameReader = new Scanner(System.in);
    private String nameInput;
    
    public Name(String name) {
        this.name = name;
    }
    
    public String setName(String name) {
        
        System.out.println("What would you like to be called, besides fagget? ");
        nameInput = nameReader.next();
        name = nameInput;
        
        System.out.println("So you would really like to be called, " + name +", how original");
        return name;
    }
}
