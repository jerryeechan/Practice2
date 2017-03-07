package ss.labs.pokemon.character;

/**
 * Created by jerry on 2017/3/7.
 * AbstractCharacter is an abstract class
 * why???
 */
public abstract class AbstractCharacter {
    //give attribute to character
    protected String name;
    protected String job;
    //TODO give parameter to constructor
    public AbstractCharacter(String name, String job)
    {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name+job;
    }
}
