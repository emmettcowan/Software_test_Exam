package ie.gmit.exam;

public class Employee {

    private String Name;
    private String Phone;
    private int ID;
    private int age;

    public Employee(String n, String p, int i, int a){
        setName(n);
        setPhone(p);
        setID(i);
        setAge(a);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length() >= 3 && name.length() <= 25){
            this.Name = name;
        }
        else{
            throw new IllegalArgumentException("invalid Name");
        }
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        if(phone.length() == 8){
            this.Phone = phone;
        }
        else{
            throw new IllegalArgumentException("invalid Phone, should be 8 digits");
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        int lenght = String.valueOf(ID).length();
        if(lenght == 5){
            this.ID = ID;
        }
        else{
            throw new IllegalArgumentException("invalid ID, should be 5 digits");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("invalid Age, must be over 16");
        }
    }
}
