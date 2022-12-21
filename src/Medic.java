public class Medic extends Hero {
    private int healPoint=30;

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил способность FastHealer");
    }
    public int getHealPoints(){
        return healPoint;
    }
    public void increaseLife()
    {
      int let = 0 ;
      let +=healPoint*10;
      healPoint += let / 100;
    }

}
