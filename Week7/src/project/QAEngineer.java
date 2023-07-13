package project;
import project.Worker;

public class QAEngineer extends Worker {
    private int projectsAmount;

    public QAEngineer(String name, int salary, boolean isOnVacation, int projectsAmount) {
        super(name, salary, isOnVacation);
        this.projectsAmount = projectsAmount;
    }

    public int getProjectsAmount() {
        return projectsAmount;
    }

    public void setProjectsAmount(int projectsAmount) {
        this.projectsAmount = projectsAmount;
    }

    @Override
    public double calculateMonthSalary(){
        return getSalary() + ((projectsAmount - 1) * 200);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", working on " + projectsAmount + " projects";
    }
}
