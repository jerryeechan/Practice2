package ss.labs.pokemon.character;

import java.util.ArrayList;

/**
 * Created by jerry on 2017/3/7.
 * In this practice you will see the power of polymorphism
 * practice to inherit and
 */
public class CharacterGenerator {
    ArrayList<AbstractCharacter> characterTemplates;
    public CharacterGenerator()
    {
        characterTemplates = new ArrayList<>();
        AbstractCharacter ch = new NPC("","","");
        //TODO create some characters and put into the template list. At least one for each type of character
        
    }

    public AbstractCharacter getRandomCharacter()
    {
        int rNum = (int)(Math.random()*characterTemplates.size());

        return characterTemplates.get(rNum);
    }
}
