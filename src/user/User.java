package user;

import java.time.LocalDate;
import java.time.Period;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private LocalDate dob;
    private Integer empresaId;


    public User(){}

    public User(Integer id, String name, String email, String password, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dob = dob;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Integer getEmpresaId() {
        return empresaId;
    }
    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }
}
