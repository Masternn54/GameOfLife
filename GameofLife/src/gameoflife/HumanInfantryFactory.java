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
public class HumanInfantryFactory extends InfantryFactory {

    public InfantryUnit createUnit(int techLevel) {

        InfantryUnit character;

        switch (techLevel) {

            case 1:

                character = new RockHauler(10, 5, 16, 15);

                break;

            case 2:

                character = new SpearThrower(8,6,17,20);

                break;

            case 3:

                character = new Archer(14,3,15,22);

                break;

            case 4:

                character = new CrossbowMan(17,6,18,22);

                break;

            case 5:

                character = new Musketeer(15,8,18,26);

                break;
            default:
                character = null;
        }
      return character;
    }

}
