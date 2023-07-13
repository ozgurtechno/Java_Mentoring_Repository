package project;

public class FreelanceDeveloper extends Developer {
    private int workedHours;

    public FreelanceDeveloper(String name, int salary, boolean isOnVacation, Level level, int workedHours) {
        super(name, salary, isOnVacation, level);
        this.workedHours = workedHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double calculateMonthSalary(){
        if(workedHours > 200)
            return super.calculateMonthSalary() + 1000;
        else
            return super.calculateMonthSalary();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", worked for " + workedHours + " hours";
    }
}
