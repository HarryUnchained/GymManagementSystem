package Backend.managementclasses;


public class Member {

    private String name;
    private String age;
    private String email;
    private String password;
    private String address;
    private String cnic;
    private String gender;
    private int plan = 0;
    private String startingDate;
    private String endingDate;
    private String id;

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public Member(String name, String age, String email, String password, String address, String cnic, String gender, String startingDate, String endingDate,String plan) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.address = address;
        this.cnic = cnic;
        this.gender = gender;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.plan = Integer.parseInt(plan);
    }

 

    public Member() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Plan getPlan() {
        if (plan == 1) {
            return new Plan("Premium package", "Gym + Trainer + Diet", 8000);
        } else if (plan == 2) {
            return new Plan("Pro package", "Gym + Diet", 5000);
        } else if (plan == 3) {
            return new Plan("Basic package", "Gym", 2500);
        }
        return new Plan("None","None",0);
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }
    
    public int getPlanNumber(){
        return plan;
    }

    @Override
    public String toString() {

        return """
               Member ID: %s
               Name: %s
               Age: %s
               Email: %s
               Password: %s
               Address: %s
               CNIC: %s
               Gender: %s
               %s
               Starting Date: %s
               Ending Date: %s
               """.formatted(id, name, age, email, password, address, cnic, gender, getPlan().toString(), startingDate, endingDate);
    }
    
    
}   
