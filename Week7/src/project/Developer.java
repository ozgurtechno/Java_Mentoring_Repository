package project;

public class Developer extends Worker {
    private Level level;

    public Developer(String name, int salary, boolean isOnVacation, Level level) {
        super(name, salary, isOnVacation);
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public double calculateMonthSalary(){
        double totalSalary = 0;
        switch (level){
            case JUNIOR -> totalSalary = getSalary();
            case MIDDLE -> totalSalary = getSalary() * 1.1;
            case SENIOR -> totalSalary = getSalary() * 1.2;
        }
        return totalSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", developer level: " + level;
    }
}
