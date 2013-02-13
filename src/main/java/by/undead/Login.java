package by.undead;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * User: Dzmitry
 * Date: 13.02.13
 * Time: 22:54
 */
@ManagedBean(name = "Login")
@SessionScoped
public class Login implements Serializable {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String doLogin(){
        return "login";

    }
}
