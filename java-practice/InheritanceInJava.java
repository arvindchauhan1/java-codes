class Employee {
    int sal = 40000;
}

class Programmar extends Employee { // single inheritance
    int bonus = 10000;
}

class ReactDeveloper extends Programmar {
    int incentive = 5000;
}

class HrManager extends Employee {// Hierarchical Inheritance
    int workingHours = 12;
}

class Tester extends Employee {// Hierarchical Inheritance
    int holidays;
}

public class InheritanceInJava {
    public static void main(String[] args) {
        Programmar obj = new Programmar(); // single level
        System.out.println("Programmar salary=" + obj.sal);
        System.out.println("Programmar bonus=" + obj.bonus + "\n");

        ReactDeveloper obj2 = new ReactDeveloper(); // multilevel
        System.out.println("ReactDeveloper salary=" + obj2.sal);
        System.out.println("ReactDeveloper bonus=" + obj2.bonus);
        System.out.println("ReactDeveloper incentive=" + obj2.incentive);

        // Hierarchical Inheritance
        HrManager obj3 = new HrManager();
        Tester obj4 = new Tester();

        System.out.println("HrManager Salary=" + obj3.sal);
        System.out.println("HrManager working hours=" + obj3.workingHours);

        System.out.println("Tester Salary=" + obj4.sal);
        System.out.println("Tester holidays=" + obj4.holidays);

    }
}
