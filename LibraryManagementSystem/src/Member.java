public class Member {

    private String name;
    private String email;
    private String memberID;

    Member(String name, String email, String memberID) {
        this.name = name;
        this.email = email;
        this.memberID = memberID;
    }

    public String getName(String name) {
        return name;
    }

    public String getEmail(String email) {
        return email;
    }

    public String getMemberID(String memberID) {
        return memberID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
}
