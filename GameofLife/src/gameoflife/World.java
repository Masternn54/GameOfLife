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
public class World {

    private static World middleEarth;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private World() {

    }

    public static World getWorldInstance() {
        if (middleEarth instanceof World) {
            //do nothing   
        } else {
            middleEarth = new World();
        }
        middleEarth.name = "MiddleEarth";
        return middleEarth;
    }

}
