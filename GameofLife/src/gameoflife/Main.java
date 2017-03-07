/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author Nichlas
 */
public class Main {

    // int range, int armor, int hits, int damage
    public static void main(String[] args) {
        /*
    RockHauler stone = new RockHauler(10,5,16,15);
    SpearThrower kent = new SpearThrower(8,6,17,20);
    Archer archie = new Archer(14,3,15,22);
    CrossbowMan cross = new CrossbowMan(17,6,18,22);
    Musketeer fernando = new Musketeer(15,8,18,26);
    
    
    
        
     while(stone.getHits()>0 && fernando.getHits()>0){
      stone.attack(fernando);
      fernando.attack(stone);
         System.out.println("Stone has this much life left " + stone.getHits());
         System.out.println("Fernando has this much life left " + fernando.getHits());
         
         if(stone.getHits() <=0){
         System.out.println("Stone is dead");
      
             
     }else{
             System.out.println("Stone is alive");
         }   
        
             if(fernando.getHits() <=0){
         System.out.println("fernando is dead");
      
             
     }else{
             System.out.println("fernando is alive");
         }   
         
    }
    
    /*/

        System.out.println("********************************************");
        World middleEarth = World.getWorldInstance();
        System.out.println("The name of My World is " + middleEarth.getName());
        System.out.println("********************************************");
        System.out.println("To Combatants fight it out");
        System.out.println("*********************************************");

        InfantryFactory humanFactory = FactoryFactory.createInfantryFactory(1);
        InfantryFactory orcFactory = FactoryFactory.createInfantryFactory(2);

        InfantryUnit mercenary = humanFactory.createUnit(5);
        InfantryUnit orcmercenary = orcFactory.createUnit(2);

        while (mercenary.getHits() > 0 && orcmercenary.getHits() > 0) {
            mercenary.attack(orcmercenary);
            orcmercenary.attack(mercenary);
            System.out.println("mercenary has this much life left " + mercenary.getHits());
            System.out.println("orcmercenary has this much life left " + orcmercenary.getHits());

            if (mercenary.getHits() <= 0) {
                System.out.println("mercenary is dead");

            } else {
                System.out.println("mercenary is alive");
            }

            if (orcmercenary.getHits() <= 0) {
                System.out.println("orcmercenary is dead");

            } else {
                System.out.println("orcmercenary is alive");
            }

        }
    }

}
