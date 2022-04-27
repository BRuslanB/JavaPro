package Lesson_Pr_5_4;

public class ERPSystem {
    private User[] memory = new User[1000];
    private int sizeOfUsers = 0;

    public void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printAllUsers(int usertype) {
        switch (usertype) {
            case 1:
                for (int i = 0; i < sizeOfUsers; i++)
                    if (memory[i] instanceof Student)
                        System.out.println(memory[i].getUserData());
                break;
            case 2:
                for (int i = 0; i < sizeOfUsers; i++)
                    if (memory[i] instanceof Teacher)
                        System.out.println(memory[i].getUserData());
                break;
        }
    }

    public void printUser(int index){
        if (index > sizeOfUsers)
            System.out.println("No such user in this index");
        else
            System.out.println(memory[index].getUserData());
    }
}