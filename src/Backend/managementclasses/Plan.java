package Backend.managementclasses;


public class Plan {
    private String name;
    private String details;
    private int price;

    public Plan(String name, String details,int price) {
        this.name = name;
        this.details = details;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return """
               %s
               %s
               %s""".formatted(name, details, ""+price);
    }
    
    
   
    
    
}
