package Lesson_Pr_5_4;

public class Teacher extends User{
    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    private int sizeOfSubjects = 0;

    public Teacher(){

    }

    public Teacher(int id, String login, String password, String nickName, String status){
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String getNickName(){
        return nickName;
    }

    public String getStatus(){
        return status;
    }

    public void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }

    @Override
    public String getUserData(){
        return "ID: " + id + ", Login: " + login + ", Password: " + password + ", NikName: " + nickName +
               ", Status: " + status + ", SizeOfSubjects: " + sizeOfSubjects;
    }

    public void setNickName(){
        this.nickName = nickName;
    }

    public void setStatus(){
        this.status = status;
    }
}