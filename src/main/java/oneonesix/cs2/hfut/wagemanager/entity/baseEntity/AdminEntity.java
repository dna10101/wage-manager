package oneonesix.cs2.hfut.wagemanager.entity.baseEntity;

public class AdminEntity {
    private String name;
    private String password;

    public AdminEntity() {
    }

    public AdminEntity(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
