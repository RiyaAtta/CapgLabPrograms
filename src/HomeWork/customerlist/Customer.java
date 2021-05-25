package HomeWork.customerlist;

public class Customer {
    private int cid;
    private String custname;
    private int age;
    private String dob;
    private String email;
    private String mobileNumber;

//    Constructors
    Customer() {}
    public Customer(int cid, String custname, int age, String dob, String email, String mobileNumber) {
        this.cid = cid;
        this.custname = custname;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

//    Getters
    public int getCid() { return cid; }
    public String getCustname() { return custname; }
    public int getAge() { return age; }
    public String getDob() { return dob; }
    public String getEmail() { return email; }
    public String getMobileNumber() { return mobileNumber; }

//    Setters
    public void setCid(int cid) { this.cid = cid; }
    public void setCustname(String custname) { this.custname = custname;}
    public void setAge(int age) { this.age = age; }
    public void setDob(String dob) { this.dob = dob; }
    public void setEmail(String email) { this.email = email; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
}