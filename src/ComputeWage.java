public class ComputeWage {
    double calculateSalary(Employee e){
        return e.workHour*e.wagePerHour;
    }
    double calculateIncome(Employee e,int totalWorkHour){
        return totalWorkHour*e.wagePerHour;
    }
}
