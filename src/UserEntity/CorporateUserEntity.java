package UserEntity;

public class CorporateUserEntity extends CompanyUserEntity { //법인기업고객 속성클래스

    private String corporateType; //법인기업유형

    public CorporateUserEntity() {}

    public CorporateUserEntity(int id, String name, String tel, String email, String pw, String address,
                                      long joinedDate, String grade, String businessLicenseNumber,
                                      String favoriteContents, String corporateType) {

        super(id, name, tel, email, pw, address, joinedDate, grade, businessLicenseNumber, favoriteContents);
        this.setCorporateType(corporateType);
    }

    public String getCorporateType() {
        return corporateType;
    }

    public void setCorporateType(String corporateType) {
        this.corporateType = corporateType;
    }

}
