package Lesson_Pr_4_5and6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char x, y;
        int id;
        String login;
        String password;
        String name;
        double gpa;
        double salary;

        User[] users = new User[100];
        int count_users = 0;

        int i_count;
        String i_name;

        do {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            x = in.next().charAt(0);
            switch (x) {
                case '1':
                    System.out.println("PRESS [1] TO ADD STUDENT");
                    System.out.println("PRESS [2] TO ADD STAFF");
                    y = in.next().charAt(0);
                    switch (y) {
                        case '1':
                            System.out.println("Insert ID?");
                            id = in.nextInt();
                            System.out.println("Insert Login?");
                            login = in.next();
                            System.out.println("Insert Password?");
                            password = in.next();
                            System.out.println("Insert Name?");
                            name = in.next();
                            System.out.println("Insert GPA?");
                            gpa = in.nextDouble();
                            users[count_users] = new Student(id, login, password, name, gpa);
                            System.out.println("Insert count Courses?");
                            i_count = in.nextInt();
                            for (int i=1; i<=i_count; i++){
                                System.out.println("Insert " + i +" course");
                                i_name = in.next();
                                ((Student) users[count_users]).addCourse(i_name);
                            }
                            count_users++;
                            break;
                        case '2':
                            System.out.println("Insert ID?");
                            id = in.nextInt();
                            System.out.println("Insert Login?");
                            login = in.next();
                            System.out.println("Insert Password?");
                            password = in.next();
                            System.out.println("Insert Name?");
                            name = in.next();
                            System.out.println("Insert Salary?");
                            salary = in.nextDouble();
                            users[count_users] = new Staff(id, login, password, name, salary);
                            System.out.println("Insert count Subject?");
                            i_count = in.nextInt();
                            for (int i=1; i<=i_count; i++){
                                System.out.println("Insert " + i +" subject");
                                i_name = in.next();
                                ((Staff) users[count_users]).addSubject(i_name);
                            }
                            count_users++;
                            break;
                        default:
                            System.out.println("PRESS [1] OR [2] OR [0]");
                            break;
                    }
                    break;
                case '2':
                    System.out.println("PRESS [1] LIST STUDENTS");
                    System.out.println("PRESS [2] LIST STAFFS");
                    y = in.next().charAt(0);
                    switch (y) {
                        case '1':
                            for (int i = 0; i < users.length; i++)
                                if (users[i] instanceof Student){
                                    System.out.println(users[i].getData());
                                    ((Student) users[i]).printCourse();
                                }
                            break;
                        case '2':
                            for (int i = 0; i < users.length; i++)
                                if (users[i] instanceof Staff){
                                    System.out.println(users[i].getData());
                                    ((Staff) users[i]).printSubject();
                                }
                            break;
                        default:
                            System.out.println("PRESS [1] OR [2]");
                            break;
                    }
                    break;
                case '0':
                    System.out.println("Program completed");
                    break;
                default:
                    System.out.println("PRESS [1] OR [2] OR [0]");
                    break;
            }
        } while (x != '0');
    }
}