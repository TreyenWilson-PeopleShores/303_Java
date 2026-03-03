public class StoneMonster extends Monster{
    @Override
    public String attack(){
        return "Attack with stones!";
    }


    public StoneMonster(String name){
        super(name);
    }
}
