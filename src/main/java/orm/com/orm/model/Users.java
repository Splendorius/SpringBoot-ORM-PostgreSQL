package orm.com.orm.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "users", schema = "usr")
public class Users {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @EmbeddedId
    private int userid;
    @NotNull
    private String usernick;
    @NotNull
    private String userpassword;
    private String role;

    public String getusernick() {
        return usernick;
    }

    public void setusernick(String usernick) {
        this.usernick = usernick;
    }

    public String getuserpassword() {
        return userpassword;
    }

    public void setuserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getId() {
        return userid;
    }

    public void setId(int userid) {
        this.userid = userid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
