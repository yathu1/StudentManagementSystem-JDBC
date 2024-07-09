package sms.objects;

public class Student {

    private int id;
    private String name;
    private int age;
    private String department;
    private String district;
    private String nic;
    private String gender;
    private int performance;
    
       public  Student(){
         }
       
    public  Student(int id,String name,int age,String department,String district,String nic,String gender,int performance){
        this.id=id;
        this.name=name;
        this.age=age;
        this.department=department;
        this.district=district;
        this.nic=nic;
        this.gender=gender;
        this.performance=performance;
        
    }
    
       public  Student(String name,int age,String department,String district,String nic,String gender,int performance){
        this.name=name;
        this.age=age;
        this.department=department;
        this.district=district;
        this.nic=nic;
        this.gender=gender;
        this.performance=performance;
        
    }
       
       // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }
}
