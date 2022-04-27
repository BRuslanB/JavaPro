package Lesson_Pr_5_4;

public abstract class User {
    protected int id;
    protected String login;
    protected String password;

    public User() {

    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public abstract String getUserData();

    public int getId(){
        return id;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public void setId(){
        this.id = id;
    }

    public void setLogin(){
        this.login = login;
    }

    public void setPassword(){
        this.password = password;
    }
}