public class Student {
    private int age;
    private int residencyYears;
    private int workMonths;
    private int parentsResidencyYears;
    private boolean volunteered;
    private int householdIncome;

    public Student(int age, int residencyYears, int workMonths, int parentsResidencyYears, boolean volunteered, int householdIncome) {
        this.age = age;
        this.residencyYears = residencyYears;
        this.workMonths = workMonths;
        this.parentsResidencyYears = parentsResidencyYears;
        this.volunteered = volunteered;
        this.householdIncome = householdIncome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getResidencyYears() {
        return residencyYears;
    }

    public void setResidencyYears(int residencyYears) {
        this.residencyYears = residencyYears;
    }

    public int getWorkMonths() {
        return workMonths;
    }

    public void setWorkMonths(int workMonths) {
        this.workMonths = workMonths;
    }

    public int getParentsResidencyYears() {
        return parentsResidencyYears;
    }

    public void setParentsResidencyYears(int parentsResidencyYears) {
        this.parentsResidencyYears = parentsResidencyYears;
    }

    public boolean isVolunteered() {
        return volunteered;
    }

    public void setVolunteered(boolean volunteered) {
        this.volunteered = volunteered;
    }

    public int getHouseholdIncome() {
        return householdIncome;
    }

    public void setHouseholdIncome(int householdIncome) {
        this.householdIncome = householdIncome;
    }
}
