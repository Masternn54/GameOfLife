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
    
    }
}
    
