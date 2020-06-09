package com.example.dbms;

public class RespDetails {
    private String fid;
    private String rid;
    private String qbid;
    private String eid;
   // private String Answer1;
    private String Surveyor_ID;
    private String  Name;
    private String Age;
    private String Sex;
    private String Village;
    private String NoOfFamilyMembers;
    private String MaritalStatus;
    public RespDetails(){}

    public RespDetails(String rid, String Surveyor_ID, String Name, String Age, String Sex,String Village,String NoOfFamilyMembers,String MaritalStatus) {
        this.fid = fid;
        this.rid=rid;
        qbid=Integer.toString(2);
        eid=Increment.eid;
        //this.Answer1 = Answer1;
        this.Surveyor_ID = Surveyor_ID;
        this.Name = Name;
        this.Age = Age;
        this.Sex = Sex;
        this.Village = Village;
        this.NoOfFamilyMembers = NoOfFamilyMembers;
        this.MaritalStatus = MaritalStatus;
    }

  //  public String getFid() {
   //     return fid;
  //  }

    public String getRid() {
        return rid;
    }

    public String getQbid() {
        return qbid;
    }

    public String getEid() { return eid;}

  //  public String get() {return Answer1;}

    public String getSurveyor_ID() {
        return Surveyor_ID;
    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public String getSex() {
        return Sex;
    }
    
    public String getVillage() {
        return Village;
    }

    public String getNoOfFamilyMembers() {
        return NoOfFamilyMembers;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }
}
