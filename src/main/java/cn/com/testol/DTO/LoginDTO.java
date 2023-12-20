package cn.com.testol.DTO;

import lombok.Data;

@Data
public class LoginDTO {
    private String name;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
