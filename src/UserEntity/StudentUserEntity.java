package UserEntity;

public class StudentUserEntity extends PrivateUserEntity { //학생고객 속성클래스

    private String school; //학교
    private int year; //학년

    public StudentUserEntity() {}

    public StudentUserEntity(int id, String name, String tel, String email, String pw, String address,
                             long joinedDate, String grade, String personalNumber, String favoriteGenre,
                             String school, int year) {

        super(id, name, tel, email, pw, address, joinedDate, grade, personalNumber, favoriteGenre);
        this.setSchool(school);
        this.setYear(year);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
