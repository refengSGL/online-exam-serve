package cn.com.testol.DTO;

import lombok.Data;

@Data
public class LoginDTO {
    private String name;

    private String password;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
