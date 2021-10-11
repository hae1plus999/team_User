package UserEntity;

public class CompanyUserEntity extends UserEntity { //기업고객 속성클래스

    private String businessLicenseNumber; //사업자번호
    private String favoriteContents; //  선호하는 콘텐츠

    public CompanyUserEntity() {}

    public CompanyUserEntity(int id, String name, String tel, String email, String pw, String address,
                             long joinedDate, String grade, String businessLicenseNumber,
                             String favoriteContents) {

        super(id, name, tel, email, pw, address, joinedDate, grade);
        this.setBusinessLicenseNumber(businessLicenseNumber);
        this.setFavoriteContents(favoriteContents);
    }

    public String getBusinessLicenseNumber() {
        return businessLicenseNumber;
    }

    public void setBusinessLicenseNumber(String businessLicenseNumber) {
        this.businessLicenseNumber = businessLicenseNumber;
    }

    public String getFavoriteContents() {
        return favoriteContents;
    }

    public void setFavoriteContents(String favoriteContents) {
        this.favoriteContents = favoriteContents;
    }

}
