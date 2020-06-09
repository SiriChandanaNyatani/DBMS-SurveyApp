package com.example.dbms;

public class AgricultureQB_Answers {
    private String fid;
    private String rid;
    private String qbid;
    private String eid;
    private String Answer1;
    private String Answer2;
    private String Answer3;
    private String Answer4;
    private String Answer5;
    public AgricultureQB_Answers(){}

    public AgricultureQB_Answers(String fid, String rid, String Answer1, String Answer2, String Answer3, String Answer4, String Answer5) {
        this.fid = fid;
        this.rid=rid;
        qbid=Integer.toString(4);
        eid=Increment.eid;
        this.Answer1 = Answer1;
        this.Answer2 = Answer2;
        this.Answer3 = Answer3;
        this.Answer4 = Answer4;
        this.Answer5 = Answer5;
    }

    public String getFid() {
        return fid;
    }

    public String getRid() {
        return rid;
    }

    public String getQbid() {
        return qbid;
    }

    public String getEid() { return eid;}

    public String getAnswer1() {
        return Answer1;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public String getAnswer3() {
        return Answer3;
    }

    public String getAnswer4() {
        return Answer4;
    }

    public String getAnswer5() {
        return Answer5;
    }
}
