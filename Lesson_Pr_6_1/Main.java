package Lesson_Pr_6_1;

public class Main {
    public static void main(String[] args){
        Users[] users = new Users[10];
        users[0] = new Users("John", "Doe");
        users[1] = new Users("Jack", "Dawson");
        users[2] = new Users("Jim", "Smith");
        users[3] = new Users("Jim", "Carrey");
        users[4] = new Users("Adam", "Smith");
        users[5] = new Users("Math", "Smith");
        users[6] = new Users("Piter", "Gologen");
        users[7] = new Users("Natali", "Smith");
        users[8] = new Users("Mariya", "Saimon");
        users[9] = new Users("Sasha", "Bill");

        UserBeanImp userBeanImp = new UserBeanImp(users);
        userBeanImp.getAllUsers();
        System.out.println();
        userBeanImp.getUsersByName("John");
        System.out.println();
        userBeanImp.getUsersBySurname("Smith");
    }
}