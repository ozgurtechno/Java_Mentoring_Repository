package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Worker> list = new ArrayList<>();

    public Company(String name){
        this.name = name;
    }
    public void addWorker(Worker worker){
        list.add(worker);
    }
    public void removeWorker(){
        showAllWorkers();
        Scanner in = new Scanner(System.in);
        System.out.print("choose number to remove: ");
        int num = in.nextInt();

        list.remove(num-1);
    }
    public void showAllWorkers(){
        for(int i=0; i<list.size(); i++){
            System.out.println((i+1) + ". " + list.get(i));
        }
    }

    public void showWorkersByPosition(){
        System.out.println("1. QA Engineer");
        System.out.println("2. Developer");
        System.out.println("3. Freelance developer");
        System.out.println("4. Project manager");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        for(Worker worker : list){
            if(worker instanceof QAEngineer && choice == 1)
                System.out.println(worker);
            if(worker instanceof Developer && choice == 2)
                System.out.println(worker);
            if(worker instanceof FreelanceDeveloper && choice == 3)
                System.out.println(worker);
            if(worker instanceof ProjectManager && choice == 4)
                System.out.println(worker);
        }
    }

    public double totalSalaryToPayThisMonth(){
        double totalSalary = 0;
        for(Worker worker : list){
            if(!worker.isOnVacation())
                totalSalary += worker.calculateMonthSalary();
        }
        return totalSalary;
    }
}
