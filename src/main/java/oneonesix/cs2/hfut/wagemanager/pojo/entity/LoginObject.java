package oneonesix.cs2.hfut.wagemanager.pojo.entity;

import javax.validation.constraints.NotNull;

/**
 * 用于登录判断时传post参数
 */
public class LoginObject {
    @NotNull
    private String id;
    @NotNull
    private String password;
    @NotNull
    private String which;

    public LoginObject() {
    }

    public LoginObject(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public LoginObject(@NotNull String id, @NotNull String password, @NotNull String which) {
        this.id = id;
        this.password = password;
        this.which = which;
    }

    public String getWhich() {
        return which;
    }

    public void setWhich(String which) {
        this.which = which;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginObject{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
