package UserEntity;

public class PrivateUserEntity extends UserEntity { //개인고객 속성클래스

    private String personalNumber; //주민등록번호
    private String favoriteGenre; //선호하는 장르

    public PrivateUserEntity() {}

    public PrivateUserEntity(int id, String name, String tel, String email, String pw, String address,
                      long joinedDate, String grade, String personalNumber, String favoriteGenre) {

        super(id, name, tel, email, pw, address, joinedDate, grade);
        this.setPersonalNumber(personalNumber);
        this.setFavoriteGenre(favoriteGenre);
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(String favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }

}
