package content;

public class Customer {
    private String name = new String();
    private String city = new String();
    
    public String getName(){
        return this.name;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }
}
