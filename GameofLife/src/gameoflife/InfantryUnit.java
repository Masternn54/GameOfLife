package gameoflife;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nichlas
 */
public abstract class InfantryUnit {
       private int range;
       private int armor;
       private int hits;
       private int damage;
    
    
    public InfantryUnit(int range, int armor, int hits, int damage) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        if (damage > reduction) {
        hits = hits - (damage - reduction);    
    
   }
}

public void attack(InfantryUnit unit) {
        int attackDamage = (int) (Math.random() * damage) + 1;
        unit.takeDamage(attackDamage);
    }

    public int getHits() {
        return hits;
    }


  
}
