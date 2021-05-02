package project;

public class Janitor extends Administrator {

    private boolean isCleaning;

    public Janitor(String employeeNumber, String name,String department,boolean isCleaning) {
        super(employeeNumber, name);
        this.isCleaning = isCleaning;
    }
    @Override
    public int calculatePay() {
        return 50000;
    }


    }