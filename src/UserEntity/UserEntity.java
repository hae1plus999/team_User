package UserEntity;

public class UserEntity { //고객관리 속성클래스

    private int id; // 아이디 - 자동생성 (21091301)21년9월13일01째
    private String name; // 이름
    private String tel; // 연락처
    private String email; // 이메일
    private String pw; // 비번 최대20자 암호화
    private String address; // 주소 동까지만
    private long joinedDate; // 가입날짜 20210901
    private String grade; // 회원등급 Basic, Standard, Premiun

    public UserEntity() {}

    public UserEntity(int id, String name, String tel, String email, String pw, String address,
                      long joinedDate, String grade) {

        this.setId(id);
        this.setName(name);
        this.setTel(tel);
        this.setEmail(email);
        this.setPw(pw);
        this.setAddress(address);
        this.setJoinedDate(joinedDate);
        this.setGrade(grade);

    }

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(long joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
