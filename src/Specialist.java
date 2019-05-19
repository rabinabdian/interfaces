public class Specialist extends Employee implements HasSpecialization ,HasBonus

{

    int bonus;
    String specialization;


    @Override
    public String getSpecialization() {
        return specialization;
    }

    @Override
    public int hasBonus() {
        return bonus;
    }
}
