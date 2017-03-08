package ss.labs.pokemon;

/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonData{
    public PokemonData(int id,String name,String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    int id;
    String name;
    String type;
    public int getId()
    {
        return id;
    }
    //TODO implement get function for name and type


}
