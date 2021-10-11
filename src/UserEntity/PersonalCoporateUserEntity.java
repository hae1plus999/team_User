package UserEntity;

public class PersonalCoporateUserEntity extends CompanyUserEntity { //개인기업고객 속성클래스

    public PersonalCoporateUserEntity() {}

    public PersonalCoporateUserEntity(int id, String name, String tel, String email, String pw, String address,
                                  long joinedDate, String grade, String businessLicenseNumber, String favoriteContents) {

        super(id, name, tel, email, pw, address, joinedDate, grade, businessLicenseNumber, favoriteContents);
    }
}
