package Lesson_Pr_6_2;

public class Main {
    public static void main(String[] args){
        Staff staff1 = new Staff(1, "Иван", "Иванов", 200000);
        Staff staff2 = new Staff(2, "Петр", "Петров", 250000);
        Staff staff3 = new Staff(3, "Семен", "Семенов", 300000);
        Staff staff4 = new Staff(4, "Надежда", "Климова", 180000);
        Staff staff5 = new Staff(5, "Наталья", "Смирнова", 350000);

        HRManagers hrManagers1 = new HRManagers(6, "Оксана Бойко", 320000);
        HRManagers hrManagers2 = new HRManagers(7, "Виктор Звольский", 380000);
        HRManagers hrManagers3 = new HRManagers(8, "Марат Башаров", 220000);
        HRManagers hrManagers4 = new HRManagers(9, "Олег Газманов", 350000);
        HRManagers hrManagers5 = new HRManagers(10, "Алла Пугачева", 400000);

        Programmers programmers1 = new Programmers(11, "ShowMen", 500000, 200000, 0.8);
        Programmers programmers2 = new Programmers(12, "Strong", 600000, 250000, 0.6);
        Programmers programmers3 = new Programmers(13, "Fastly", 550000, 220000, 0.7);
        Programmers programmers4 = new Programmers(14, "TeamLead", 700000, 300000, 1);
        Programmers programmers5 = new Programmers(15, "Lord", 650000, 280000, 0.9);

        Workers[] workers = {staff1, staff2, staff3, staff4,staff5,
                            hrManagers1, hrManagers2, hrManagers3, hrManagers4, hrManagers5,
                            programmers1, programmers2, programmers3, programmers4, programmers5};

        Workers temp;
        for(int i = 0; i < workers.length; i++)
            for(int j = i; j < workers.length; j++)
                if (workers[i].getSalary() < workers[j].getSalary()) {
                    temp = workers[i];
                    workers[i] = workers[j];
                    workers[j] = temp;
                }

        System.out.println("High Salary" + "\n"+ workers[0].getWorkerData() + "\n" + "List of Workers");

        for(int i = 0; i < workers.length; i++)
            System.out.println(workers[i].getWorkerData());
    }
}
