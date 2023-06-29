public class Mika {
    private String name;
    private int money;

    public Mika(String name){
        this.name = name;
        this.money = 100;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){return name;}

    //trinken
    public int lengthOfName()
    {
        int length;
        length = name.length();
        return length;
    }
    public void trinken()
    {
      if (isMoneyBiggerThanZeroAndSmallerThen100(money)){
          money = 0;
      }
      else{
          this.money--;
      }
    }
    public int getMoney(){
        return money;
    }

    public boolean isMoneyBiggerThanZeroAndSmallerThen100(int number){
        if (number > 0 && number < 100){
            return true;
        }
        return false;
    }
}
