package Lesson_Pr_5_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String login;
        String password;
        String name;
        String surname;
        String group;
        String nickname;
        String status;
        double gpa;

        ERPSystem erpSystem1 = new ERPSystem();
        User u;

        Scanner in = new Scanner(System.in);
        char x, y, z;
        int index;

        int count_users = 0;
        String name_subject;

        do {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");
            x = in.next().charAt(0);
            switch (x) {
                case '1':
                    System.out.println("PRESS [1] TO ADD STUDENT");
                    System.out.println("PRESS [2] TO ADD TEACHER");
                    y = in.next().charAt(0);
                    switch (y) {
                        case '1':
                            System.out.println("Insert Login:");
                            login = in.next();
                            System.out.println("Insert Password:");
                            password = in.next();
                            System.out.println("Insert Name:");
                            name = in.next();
                            System.out.println("Insert SurName:");
                            surname = in.next();
                            System.out.println("Insert Group:");
                            group = in.next();
                            System.out.println("Insert GPA:");
                            gpa = in.nextDouble();

                            count_users++;
                            u = new Student(count_users, login, password, name, surname, group, gpa);
                            erpSystem1.addUser(u);
                            break;
                        case '2':
                            System.out.println("Insert Login:");
                            login = in.next();
                            System.out.println("Insert Password:");
                            password = in.next();
                            System.out.println("Insert Nick Name:");
                            nickname = in.next();
                            System.out.println("Insert Status:");
                            status = in.next();

                            count_users++;
                            u = new Teacher(count_users, login, password, nickname, status);

                            do {
                                System.out.println("PRESS [1] TO ADD SUBJECT");
                                System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                                z = in.next().charAt(0);
                                switch (z) {
                                    case '1':
                                        System.out.println("Insert Subject:");
                                        name_subject = in.next();
                                        ((Teacher)u).addSubject(name_subject);
                                       break;
                                    case '0':
                                        System.out.println("Finish adding");
                                        break;
                                    default:
                                        System.out.println("PRESS [1] OR [0]");
                                        break;
                                }
                            } while (z != '0');
                            erpSystem1.addUser(u);
                            break;
                        default:
                            System.out.println("PRESS [1] OR [2]");
                            break;
                    }
                    break;
                case '2':
                    System.out.println("PRESS [1] LIST STUDENTS");
                    System.out.println("PRESS [2] LIST TEACHERS");
                    y = in.next().charAt(0);
                    switch (y) {
                        case '1':
                                erpSystem1.printAllUsers(1);
                            break;
                        case '2':
                                erpSystem1.printAllUsers(2);
                            break;
                        default:
                            System.out.println("PRESS [1] OR [2]");
                            break;
                    }
                    break;
                case '3':
                    System.out.println("Enter Index:");
                    index = in.nextInt();
                    erpSystem1.printUser(index);
                    break;
                case '0':
                    System.out.println("Program completed");
                    break;
                default:
                    System.out.println("PRESS [1] OR [2] OR [3] OR [0]");
                    break;
            }
        } while (x != '0');
    }
}