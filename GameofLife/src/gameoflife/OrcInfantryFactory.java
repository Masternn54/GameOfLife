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
public class OrcInfantryFactory extends InfantryFactory {

    public InfantryUnit createUnit(int techLevel) {

        InfantryUnit character;

        switch (techLevel) {

            case 1:

                character = new Orc(10, 5, 16, 15);

                break;

            case 2:

                character = new OrcBadass(8, 6, 17, 20);

                break;

            case 3:

                character = new Orcbomber(14, 3, 15, 22);

                break;

            case 4:

                character = new MasterOrc(17, 6, 18, 22);

                break;

            case 5:

                character = new OrcLeader(15, 8, 18, 26);

                break;
            default:
                character = null;
                break;
        }
        return character;
    }

}
