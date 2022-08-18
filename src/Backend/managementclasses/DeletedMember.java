package Backend.managementclasses;


public class DeletedMember extends Member {
    private String reason;

    public DeletedMember(String reason, String name, String age, String email, String password, String address, String cnic, String gender, String startingDate, String endingDate, String plan) {
        super(name, age, email, password, address, cnic, gender, startingDate, endingDate, plan);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
               Reason: %s
               """.formatted(super.getId(), super.getName(), super.getAge(), super.getEmail(), super.getPassword(),
                       super.getAddress(), super.getCnic(), super.getGender(), getPlan().toString(), super.getStartingDate(),
                       super.getEndingDate(), getReason());
    }
    
    
}
