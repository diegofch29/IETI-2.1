package escuelaing.TaskPlaner.Entities;

public class User {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;

    public User(String id,String name,String email,String phoneNumer){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumer;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
