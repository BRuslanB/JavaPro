package Lesson_Pr_4_5and6;

public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;

    public User() {

    }

    public User(int id, String login, String password, String name) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getData(){
        return "ID: " + id + ", Login: " + login + ", Password: " + password + ", Name: " + name;
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

    public void setName(){
        this.name = name;
    }
}
