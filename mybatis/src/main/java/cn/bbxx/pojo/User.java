package cn.bbxx.pojo;

import java.util.List;

public class User {
    private String username;
    private Integer id;
    private String password;
    private Integer sex;
    private String birthday;
    private String userinof;
    private String address;
    private String phone;
    private String clazzId;
    private List<Article> list;

    public List<Article> getList() {
        return list;
    }

    public void setList(List<Article> list) {
        this.list = list;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUserinof() {
        return userinof;
    }

    public void setUserinof(String userinof) {
        this.userinof = userinof;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClazzId() {
        return clazzId;
    }

    public void setClazzId(String clazzId) {
        this.clazzId = clazzId;
    }
}
