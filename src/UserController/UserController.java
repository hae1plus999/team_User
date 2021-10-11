package UserController;

import java.util.*;

import UserEntity.UserEntity;
import UserEntity.PrivateUserEntity;
import UserEntity.StudentUserEntity;
import UserEntity.WorkerUserEntity;
import UserEntity.CompanyUserEntity;
import UserEntity.PersonalCoporateUserEntity;
import UserEntity.CorporateUserEntity;

import java.util.ArrayList;
import java.util.Scanner;

/*
	public void userMethod() {
		public void showMenu()  //메뉴함수
		public void addNewUser() //등록함수
		public void searchUser() //검색함수
		public void printUserList() //출력함수
		public void updateUser() //수정함수
		public void deleteUser() //삭제함수
		}
		*/

public class UserController { //고객관리 기능 클래스

    int cntOfRegisterUser;
    Scanner userStdIn = new Scanner(System.in); //고객정보 입력

    private ArrayList<UserEntity> userList;
    private ArrayList<PrivateUserEntity> privateUserList;
    private ArrayList<StudentUserEntity> studentUserList;
    private ArrayList<WorkerUserEntity> workerUserList;
    private ArrayList<CompanyUserEntity> companyUserList;
    private ArrayList<PersonalCoporateUserEntity> personalCoporateUserList;
    private ArrayList<CorporateUserEntity> corporateUserList;

    public ArrayList<StudentUserEntity> getStudentUserList() {
        return studentUserList;
    }

    public void setStudentUserList(ArrayList<StudentUserEntity> studentUserList) {
        this.studentUserList = studentUserList;
    }

    public int getStudentUserListSize() { //학생고객리스트 크기 반환함수
        return studentUserList.size();
    }

    public ArrayList<WorkerUserEntity> getWorkerUserList() {
        return workerUserList;
    }

    public void setWorkerUserList(ArrayList<WorkerUserEntity> workerUserList) {
        this.workerUserList = workerUserList;
    }

    public int getWorkerUserListSize() { //직장인고객리스트 크기 반환함수
        return workerUserList.size();
    }

    public ArrayList<PersonalCoporateUserEntity> getPersonalCoporateUserList() {
        return personalCoporateUserList;
    }

    public void setPersonalCoporateUserList(ArrayList<PersonalCoporateUserEntity> personalCoporateUserList) {
        this.personalCoporateUserList = personalCoporateUserList;
    }

    public int getPersonalCoporateUserListSize() { //개인기업고객리스트 크기 반환함수
        return personalCoporateUserList.size();
    }

    public ArrayList<CorporateUserEntity> getCorporateUserList() {
        return corporateUserList;
    }

    public void setCorporateUserList(ArrayList<CorporateUserEntity> corporateUserList) {
        this.corporateUserList = corporateUserList;
    }

    public int getCorporateUserListSize() { //법인고객리스트 크기 반환함수
        return corporateUserList.size();
    }

    public UserController() {
        userList = new ArrayList<UserEntity>();
        privateUserList = new ArrayList<PrivateUserEntity>();
        companyUserList = new ArrayList<CompanyUserEntity>();

        personalCoporateUserList = new ArrayList<PersonalCoporateUserEntity>();
        personalCoporateUserList.add(new PersonalCoporateUserEntity(21091301,"현대 미술관", "010-1234-5678","aja@hanmail.net","12345", "부산광역시 부산진구 진로동", 20210903L, "Basic", "123-45-56777","TV"));

        corporateUserList = new ArrayList<CorporateUserEntity>();
        corporateUserList.add(new CorporateUserEntity(21091301,"난지 레지던시", "010-1234-5678","aja@hanmail.net","12345", "부산광역시 부산진구 진로동", 20210903L, "Basic", "123-45-56777","TV","재단"));

        studentUserList = new ArrayList<StudentUserEntity>();
        studentUserList.add(new StudentUserEntity(21091301,"천해원", "010-1234-5678","aja@hanmail.net","12345", "부산광역시 부산진구 진로동", 20210903L, "Basic", "123456-1234567", "다큐", "동아대",4));
        studentUserList.add(new StudentUserEntity(21091301,"아이웨이웨이", "010-1234-5678","aja@hanmail.net","12345", "부산광역시 부산진구 진로동", 20210903L, "Basic", "123456-1234567", "다큐", "동아대",4));

        workerUserList = new ArrayList<WorkerUserEntity>();
        workerUserList.add(new WorkerUserEntity(21091301,"마리나 아브라모비치", "010-1234-5678","aja@hanmail.net","12345", "부산광역시 부산진구 진로동", 20210903L, "Basic", "123456-1234567", "다큐", "동아대","사원"));
        workerUserList.add(new WorkerUserEntity(21091301,"주디 시카고", "010-1234-5678","aja@hanmail.net","12345", "부산광역시 부산진구 진로동", 20210903L, "Basic", "123456-1234567", "다큐", "동아대","대리"));

    }

    public void showUerMenu() { //고객메뉴 관리함수

        System.out.println("---------- 고객관리 메뉴 ---------- ");
        System.out.println(" 1. 신규회원 등록 ");
        System.out.println(" 2. 고객정보 검색 ");
        System.out.println(" 3. 고객정보 출력 ");
        System.out.println(" 4. 고객정보 수정 ");
        System.out.println(" 5. 고객정보 삭제 ");
        System.out.println(" 6. 뒤로가기 ");
        System.out.println(" 7. 종료 ");
        System.out.println("-------------------------------- ");
        System.out.println(" 고객관리 메뉴숫자를 입력하세요. >>   ");

    }

    public void showAddUserMenu() { //신규고객 등록메뉴 관리함수

        System.out.println("---------- 1. 신규고객 등록메뉴 ---------- ");
        System.out.println(" 1. 개인고객 등록 ");
        System.out.println(" 2. 기업고객 등록 ");
        System.out.println(" 3. 뒤로가기 ");
        System.out.println("-------------------------------- ");
        System.out.println(" 신규고객 등록메뉴숫자를 입력하세요. >>   ");

    }

    public void showAddPrivateUserMenu() { //개인회원 등록메뉴 관리함수

        System.out.println("---------- 1. 개인고객 등록메뉴 ---------- ");
        System.out.println(" 1. 학생고객 등록 ");
        System.out.println(" 2. 직장인고객 등록 ");
        System.out.println(" 3. 뒤로가기 ");
        System.out.println("-------------------------------- ");
        System.out.println(" 개인고객 등록메뉴숫자를 입력하세요. >>   ");

    }

    public void showAddCompanyUserMenu() { //기업회원 등록메뉴 관리함수

        System.out.println("---------- 2. 기업고객 등록메뉴 ---------- ");
        System.out.println(" 1. 개인기업고객 등록 ");
        System.out.println(" 2. 법인기업고객 등록 ");
        System.out.println(" 3. 뒤로가기 ");
        System.out.println("-------------------------------- ");
        System.out.println(" 기업고객 등록메뉴숫자를 입력하세요. >>   ");

    }

    public void addNewworkerUser() { //직장인고객등록함수

        int i;
        System.out.println("직장인고객 등록함수 호출완료!!");
        System.out.println("********** 직장인고객 정보입력 시작 **********");

        for (i = 0; i < workerUserList.size(); i++)
        {
            if(workerUserList.get(i) == null) {

                System.out.println(" 1. 직장인고객 아이디 : ");
                int id = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 2. 직장인고객 이 름 : ");
                String name = userStdIn.nextLine();
                System.out.println(" 3. 직장인고객 연락처 : ");
                String tel = userStdIn.nextLine();
                System.out.println(" 4. 직장인고객 이메일 : ");
                String email = userStdIn.nextLine();
                System.out.println(" 5. 직장인고객 비밀번호 : ");
                String pw = userStdIn.nextLine();
                System.out.println(" 6. 직장인고객 주 소 : ");
                String address = userStdIn.nextLine();
                System.out.println(" 7. 직장인고객 가입날짜 : ");
                long joinedDate = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 8. 직장인고객 회원등급 : ");
                String grade = userStdIn.nextLine();
                System.out.println(" 9. 직장인고객 주민번호 : ");
                String personalNumber = userStdIn.nextLine();
                System.out.println(" 10. 직장인고객 선호하는 장르 : ");
                String favoriteGenre = userStdIn.nextLine();
                System.out.println(" 11. 직장인고객 회사 : ");
                String workerPlace = userStdIn.nextLine();
                System.out.println(" 12. 직장인고객 직급 : ");
                String job = userStdIn.nextLine();

                workerUserList.add(new WorkerUserEntity(id, name, tel, email, pw, address, joinedDate,
                        grade, personalNumber, favoriteGenre, workerPlace, job));

                System.out.println( "i + 1" + "번째 직장인고객 정보입력 완료.");
                break;
            }
        }
        System.out.println("직장인고객 등록함수 종료!!");

    }

    public void addNewStudentUser() { //학생고객등록함수

        int i;
        System.out.println("학생고객 등록함수 호출완료!!");
        System.out.println("********** 학생고객 정보입력 시작 **********");

        for (i = 0; i < studentUserList.size(); i++)
        {
            if(studentUserList.get(i) == null) {

                System.out.println(" 1. 학생고객 아이디 : ");
                int id = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 2. 학생고객 이 름 : ");
                String name = userStdIn.nextLine();
                System.out.println(" 3. 학생고객 연락처 : ");
                String tel = userStdIn.nextLine();
                System.out.println(" 4. 학생고객 이메일 : ");
                String email = userStdIn.nextLine();
                System.out.println(" 5. 학생고객 비밀번호 : ");
                String pw = userStdIn.nextLine();
                System.out.println(" 6. 학생고객 주 소 : ");
                String address = userStdIn.nextLine();
                System.out.println(" 7. 학생고객 가입날짜 : ");
                long joinedDate = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 8. 학생고객 회원등급 : ");
                String grade = userStdIn.nextLine();
                System.out.println(" 9. 학생고객 주민번호 : ");
                String personalNumber = userStdIn.nextLine();
                System.out.println(" 10. 학생고객 선호하는 장르 : ");
                String favoriteGenre = userStdIn.nextLine();
                System.out.println(" 11. 학생고객 학교 : ");
                String school = userStdIn.nextLine();
                System.out.println(" 12. 학생고객 학년 : ");
                int year = Integer.parseInt(userStdIn.nextLine());

                studentUserList.add(new StudentUserEntity(id, name, tel, email, pw, address, joinedDate,
                        grade, personalNumber, favoriteGenre, school, year));

                System.out.println( "i + 1" + "번째 학생고객 정보입력 완료.");
                break;
            }
        }
        System.out.println("학생고객 등록함수 종료!!");

    }

    public void addNewPersonalCoporateUser() { //개인기업고객등록함수

        int i;
        System.out.println("개인기업고객 등록함수 호출완료!!");
        System.out.println("********** 개인기업고객 정보입력 시작 **********");

        for (i = 0; i < personalCoporateUserList.size(); i++)
        {
            if(personalCoporateUserList.get(i) == null) {

                System.out.println(" 1. 개인기업고객 아이디 : ");
                int id = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 2. 개인기업고객 이 름 : ");
                String name = userStdIn.nextLine();
                System.out.println(" 3. 개인기업고객 연락처 : ");
                String tel = userStdIn.nextLine();
                System.out.println(" 4. 개인기업고객 이메일 : ");
                String email = userStdIn.nextLine();
                System.out.println(" 5. 개인기업고객 비밀번호 : ");
                String pw = userStdIn.nextLine();
                System.out.println(" 6. 개인기업고객 주 소 : ");
                String address = userStdIn.nextLine();
                System.out.println(" 7. 개인기업고객 가입날짜 : ");
                long joinedDate = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 8. 개인기업고객 회원등급 : ");
                String grade = userStdIn.nextLine();
                System.out.println(" 9. 개인기업고객 사업자번호 : ");
                String businessLicenseNumber = userStdIn.nextLine();
                System.out.println(" 10. 개인기업고객 선호하는 콘텐츠 : ");
                String favoriteContents = userStdIn.nextLine();
                System.out.println(" 11. 개인기업고객 기업유형 : ");
                String corporateType = userStdIn.nextLine();

                personalCoporateUserList.add(new PersonalCoporateUserEntity(id, name, tel, email, pw, address, joinedDate,
                        grade, businessLicenseNumber,favoriteContents));

                System.out.println( "i + 1" + "번째 개인기업고객 정보입력 완료.");
                break;
            }
        }
        System.out.println("개인기업고객 등록함수 종료!!");

    }
    
    public void addNewCorporateUser() { //법인기업고객등록함수

        int i;
        System.out.println("법인기업고객 등록함수 호출완료!!");
        System.out.println("********** 법인기업고객 정보입력 시작 **********");

        for (i = 0; i < corporateUserList.size(); i++)
        {
            if(corporateUserList.get(i) == null) {

                System.out.println(" 1. 법인기업고객 아이디 : ");
                int id = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 2. 법인기업고객 이 름 : ");
                String name = userStdIn.nextLine();
                System.out.println(" 3. 법인기업고객 연락처 : ");
                String tel = userStdIn.nextLine();
                System.out.println(" 4. 법인기업고객 이메일 : ");
                String email = userStdIn.nextLine();
                System.out.println(" 5. 법인기업고객 비밀번호 : ");
                String pw = userStdIn.nextLine();
                System.out.println(" 6. 법인기업고객 주 소 : ");
                String address = userStdIn.nextLine();
                System.out.println(" 7. 법인기업고객 가입날짜 : ");
                long joinedDate = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 8. 법인기업고객 회원등급 : ");
                String grade = userStdIn.nextLine();
                System.out.println(" 9. 법인기업고객 사업자번호 : ");
                String businessLicenseNumber = userStdIn.nextLine();
                System.out.println(" 10. 법인기업고객 선호하는 콘텐츠 : ");
                String favoriteContents = userStdIn.nextLine();
                System.out.println(" 11. 법인기업고객 기업유형 : ");
                String corporateType = userStdIn.nextLine();

                corporateUserList.add(new CorporateUserEntity(id, name, tel, email, pw, address, joinedDate,
                        grade, businessLicenseNumber,favoriteContents, corporateType));

                System.out.println( "i + 1" + "번째 법인기업고객 정보입력 완료.");
                break;
            }
        }
        System.out.println("법인기업고객 등록함수 종료!!");

    }

    public void searchUser() { //검색함수

        System.out.println("고객정보 검색함수 호출완료!!");

        System.out.println("********** 고객 정보 검색 시작 **********");
        System.out.println("고객이름 : ");
        String name = userStdIn.nextLine();
        System.out.println("고객정보 입력완료.");

        int i;
        for (i = 0; i < workerUserList.size(); i++)
        {
            if (workerUserList.get(i).getName().contains(name))
            {
                System.out.println(i + 1 + "번째 회원 정보 출력");
                System.out.println(i + 1 + "번째 회원 아이디 : " + workerUserList.get(i).getId());
                System.out.println(i + 1 + "번째 회원 이 름 : " + workerUserList.get(i).getName());
                System.out.println(i + 1 + "번째 회원 연락처 : " + workerUserList.get(i).getTel());
                System.out.println(i + 1 + "번째 회원 이메일 : " + workerUserList.get(i).getEmail());
                System.out.println(i + 1 + "번째 회원 비밀번호 : " + workerUserList.get(i).getPw());
                System.out.println(i + 1 + "번째 회원 주 소 : " + workerUserList.get(i).getAddress());
                System.out.println(i + 1 + "번째 회원 가입날짜 : " + workerUserList.get(i).getJoinedDate());
                System.out.println(i + 1 + "번째 회원 등  급 : " + workerUserList.get(i).getGrade());
                System.out.println(i + 1 + "번째 회원 주민번호 : " + workerUserList.get(i).getPersonalNumber());
                System.out.println(i + 1 + "번째 회원 선호하는 장르 : " + workerUserList.get(i).getFavoriteGenre());
                System.out.println(i + 1 + "번째 회원 회  사 : " + workerUserList.get(i).getWorkerPlace());
                System.out.println(i + 1 + "번째 회원 직  급 : " + workerUserList.get(i).getJob());

                break;
            }
            else if (studentUserList.get(i).getName().contains(name)) {
                
                System.out.println(i + 1 + "번째 회원 정보 출력");
                System.out.println(i + 1 + "번째 회원 아이디 : " + studentUserList.get(i).getId());
                System.out.println(i + 1 + "번째 회원 이 름 : " + studentUserList.get(i).getName());
                System.out.println(i + 1 + "번째 회원 연락처 : " + studentUserList.get(i).getTel());
                System.out.println(i + 1 + "번째 회원 이메일 : " + studentUserList.get(i).getEmail());
                System.out.println(i + 1 + "번째 회원 비밀번호 : " + studentUserList.get(i).getPw());
                System.out.println(i + 1 + "번째 회원 주 소 : " + studentUserList.get(i).getAddress());
                System.out.println(i + 1 + "번째 회원 가입날짜 : " + studentUserList.get(i).getJoinedDate());
                System.out.println(i + 1 + "번째 회원 등  급 : " + studentUserList.get(i).getGrade());
                System.out.println(i + 1 + "번째 회원 주민번호 : " + studentUserList.get(i).getPersonalNumber());
                System.out.println(i + 1 + "번째 회원 선호하는 장르 : " + studentUserList.get(i).getFavoriteGenre());
                System.out.println(i + 1 + "번째 회원 학  교 : " + studentUserList.get(i).getSchool());
                System.out.println(i + 1 + "번째 회원 학  년 : " + studentUserList.get(i).getYear());

                break;
            }

            else if (corporateUserList.get(i).getName().contains(name)) {

                System.out.println(i + 1 + "번째 회원 정보 출력");
                System.out.println(i + 1 + "번째 회원 아이디 : " + corporateUserList.get(i).getId());
                System.out.println(i + 1 + "번째 회원 이 름 : " + corporateUserList.get(i).getName());
                System.out.println(i + 1 + "번째 회원 연락처 : " + corporateUserList.get(i).getTel());
                System.out.println(i + 1 + "번째 회원 이메일 : " + corporateUserList.get(i).getEmail());
                System.out.println(i + 1 + "번째 회원 비밀번호 : " + corporateUserList.get(i).getPw());
                System.out.println(i + 1 + "번째 회원 주 소 : " + corporateUserList.get(i).getAddress());
                System.out.println(i + 1 + "번째 회원 가입날짜 : " + corporateUserList.get(i).getJoinedDate());
                System.out.println(i + 1 + "번째 회원 등  급 : " + corporateUserList.get(i).getGrade());
                System.out.println(i + 1 + "번째 회원 사업자번호 : " + corporateUserList.get(i).getBusinessLicenseNumber());
                System.out.println(i + 1 + "번째 회원 선호하는 콘텐츠 : " + corporateUserList.get(i).getFavoriteContents());
                System.out.println(i + 1 + "번째 회원 법인기업 유형 : " + corporateUserList.get(i).getCorporateType());

                break;
            }

            else if (personalCoporateUserList.get(i).getName().contains(name)) {

                System.out.println(i + 1 + "번째 회원 정보 출력");
                System.out.println(i + 1 + "번째 회원 아이디 : " + personalCoporateUserList.get(i).getId());
                System.out.println(i + 1 + "번째 회원 이 름 : " + personalCoporateUserList.get(i).getName());
                System.out.println(i + 1 + "번째 회원 연락처 : " + personalCoporateUserList.get(i).getTel());
                System.out.println(i + 1 + "번째 회원 이메일 : " + personalCoporateUserList.get(i).getEmail());
                System.out.println(i + 1 + "번째 회원 비밀번호 : " + personalCoporateUserList.get(i).getPw());
                System.out.println(i + 1 + "번째 회원 주 소 : " + personalCoporateUserList.get(i).getAddress());
                System.out.println(i + 1 + "번째 회원 가입날짜 : " + personalCoporateUserList.get(i).getJoinedDate());
                System.out.println(i + 1 + "번째 회원 등  급 : " + personalCoporateUserList.get(i).getGrade());
                System.out.println(i + 1 + "번째 회원 사업자번호 : " + personalCoporateUserList.get(i).getBusinessLicenseNumber());
                System.out.println(i + 1 + "번째 회원 선호하는 콘텐츠 : " + personalCoporateUserList.get(i).getFavoriteContents());

                break;
            }
            
            System.out.println("일치하는 회원 정보가 없습니다.");
        }

//        System.out.println("회원검색를 계속 진행할까요?");

        System.out.println("회원정보 검색함수 종료!!");
    }

    public void printUserList() { //출력함수

        //배열 정렬하는 법
        //Arrays.sort(UserList);
        
        int i;

        System.out.println("********** 회원 정보 출력 시작 **********");

        for (i = 0; i < workerUserList.size(); i++)
        {
            System.out.println(i + 1 + "번째 회원 정보 출력");
            System.out.println(i + 1 + "번째 회원 아이디 : " + workerUserList.get(i).getId());
            System.out.println(i + 1 + "번째 회원 이 름 : " + workerUserList.get(i).getName());
            System.out.println(i + 1 + "번째 회원 연락처 : " + workerUserList.get(i).getTel());
            System.out.println(i + 1 + "번째 회원 이메일 : " + workerUserList.get(i).getEmail());
            System.out.println(i + 1 + "번째 회원 비밀번호 : " + workerUserList.get(i).getPw());
            System.out.println(i + 1 + "번째 회원 주 소 : " + workerUserList.get(i).getAddress());
            System.out.println(i + 1 + "번째 회원 가입날짜 : " + workerUserList.get(i).getJoinedDate());
            System.out.println(i + 1 + "번째 회원 등  급 : " + workerUserList.get(i).getGrade());
            System.out.println(i + 1 + "번째 회원 주민번호 : " + workerUserList.get(i).getPersonalNumber());
            System.out.println(i + 1 + "번째 회원 선호하는 장르 : " + workerUserList.get(i).getFavoriteGenre());
            System.out.println(i + 1 + "번째 회원 회  사 : " + workerUserList.get(i).getWorkerPlace());
            System.out.println(i + 1 + "번째 회원 직  급 : " + workerUserList.get(i).getJob());
        }

        for (i = 0; i < studentUserList.size(); i++)
        {
            System.out.println(i + 1 + "번째 회원 정보 출력");
            System.out.println(i + 1 + "번째 회원 아이디 : " + studentUserList.get(i).getId());
            System.out.println(i + 1 + "번째 회원 이 름 : " + studentUserList.get(i).getName());
            System.out.println(i + 1 + "번째 회원 연락처 : " + studentUserList.get(i).getTel());
            System.out.println(i + 1 + "번째 회원 이메일 : " + studentUserList.get(i).getEmail());
            System.out.println(i + 1 + "번째 회원 비밀번호 : " + studentUserList.get(i).getPw());
            System.out.println(i + 1 + "번째 회원 주 소 : " + studentUserList.get(i).getAddress());
            System.out.println(i + 1 + "번째 회원 가입날짜 : " + studentUserList.get(i).getJoinedDate());
            System.out.println(i + 1 + "번째 회원 등  급 : " + studentUserList.get(i).getGrade());
            System.out.println(i + 1 + "번째 회원 주민번호 : " + studentUserList.get(i).getPersonalNumber());
            System.out.println(i + 1 + "번째 회원 선호하는 장르 : " + studentUserList.get(i).getFavoriteGenre());
            System.out.println(i + 1 + "번째 회원 학  교 : " + studentUserList.get(i).getSchool());
            System.out.println(i + 1 + "번째 회원 학  년 : " + studentUserList.get(i).getYear());
        }

        for (i = 0; i < corporateUserList.size(); i++)
        {
            System.out.println(i + 1 + "번째 회원 정보 출력");
            System.out.println(i + 1 + "번째 회원 아이디 : " + corporateUserList.get(i).getId());
            System.out.println(i + 1 + "번째 회원 이 름 : " + corporateUserList.get(i).getName());
            System.out.println(i + 1 + "번째 회원 연락처 : " + corporateUserList.get(i).getTel());
            System.out.println(i + 1 + "번째 회원 이메일 : " + corporateUserList.get(i).getEmail());
            System.out.println(i + 1 + "번째 회원 비밀번호 : " + corporateUserList.get(i).getPw());
            System.out.println(i + 1 + "번째 회원 주 소 : " + corporateUserList.get(i).getAddress());
            System.out.println(i + 1 + "번째 회원 가입날짜 : " + corporateUserList.get(i).getJoinedDate());
            System.out.println(i + 1 + "번째 회원 등  급 : " + corporateUserList.get(i).getGrade());
            System.out.println(i + 1 + "번째 회원 사업자번호 : " + corporateUserList.get(i).getBusinessLicenseNumber());
            System.out.println(i + 1 + "번째 회원 선호하는 콘텐츠 : " + corporateUserList.get(i).getFavoriteContents());
            System.out.println(i + 1 + "번째 회원 법인기업 유형 : " + corporateUserList.get(i).getCorporateType());
        }

        for (i = 0; i < personalCoporateUserList.size(); i++)
        {
            System.out.println(i + 1 + "번째 회원 정보 출력");
            System.out.println(i + 1 + "번째 회원 아이디 : " + personalCoporateUserList.get(i).getId());
            System.out.println(i + 1 + "번째 회원 이 름 : " + personalCoporateUserList.get(i).getName());
            System.out.println(i + 1 + "번째 회원 연락처 : " + personalCoporateUserList.get(i).getTel());
            System.out.println(i + 1 + "번째 회원 이메일 : " + personalCoporateUserList.get(i).getEmail());
            System.out.println(i + 1 + "번째 회원 비밀번호 : " + personalCoporateUserList.get(i).getPw());
            System.out.println(i + 1 + "번째 회원 주 소 : " + personalCoporateUserList.get(i).getAddress());
            System.out.println(i + 1 + "번째 회원 가입날짜 : " + personalCoporateUserList.get(i).getJoinedDate());
            System.out.println(i + 1 + "번째 회원 등  급 : " + personalCoporateUserList.get(i).getGrade());
            System.out.println(i + 1 + "번째 회원 사업자번호 : " + personalCoporateUserList.get(i).getBusinessLicenseNumber());
            System.out.println(i + 1 + "번째 회원 선호하는 콘텐츠 : " + personalCoporateUserList.get(i).getFavoriteContents());

        }
        
        System.out.println("********** 회원 정보 출력 완료 **********");
    }

    public void updateUser() { //수정함수

        String UpdateName = "";
        String personalNumber = "";
        String favoriteGenre = "";
        String workerPlace = "";
        String job = "";
        String tel = "";
        String email = "";
        String pw = "";
        String grade = "";
        String address = "";
        String school = "";
        String businessLicenseNumber = "";
        String favoriteContents = "";
        String corporateType = "";
        long joinedDate = 0;
        int i = 0;
        int id = 0;
        int year = 0;

        System.out.println("회원 정보 수정 함수 호출 완료!!\n");
        System.out.println("********** 수정할 회원 정보 입력 시작 **********");
        System.out.println("회원 이름 : ");
        String name = userStdIn.nextLine();
        System.out.println("회원 정보 입력 완료.");

        for (i = 0; i < workerUserList.size(); i++)
        {
            if (workerUserList.get(i).getName().contains(name))
            {
                System.out.println("********** 수정할 아이디부터 다시 입력해주세요. **********");

                System.out.println(" 1. 직장인고객 아이디 : ");
                id = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 2. 직장인고객 이 름 : ");
                UpdateName = userStdIn.nextLine();
                System.out.println(" 3. 직장인고객 연락처 : ");
                tel = userStdIn.nextLine();
                System.out.println(" 4. 직장인고객 이메일 : ");
                email = userStdIn.nextLine();
                System.out.println(" 5. 직장인고객 비밀번호 : ");
                pw = userStdIn.nextLine();
                System.out.println(" 6. 직장인고객 주 소 : ");
                address = userStdIn.nextLine();
                System.out.println(" 7. 직장인고객 가입날짜 : ");
                joinedDate = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 8. 직장인고객 회원등급 : ");
                grade = userStdIn.nextLine();
                System.out.println(" 9. 직장인고객 주민번호 : ");
                personalNumber = userStdIn.nextLine();
                System.out.println(" 10. 직장인고객 선호하는 장르 : ");
                favoriteGenre = userStdIn.nextLine();
                System.out.println(" 11. 직장인고객 회사 : ");
                workerPlace = userStdIn.nextLine();
                System.out.println(" 12. 직장인고객 직급 : ");
                job = userStdIn.nextLine();

                workerUserList.get(i).setId(id);
                workerUserList.get(i).setName(UpdateName);
                workerUserList.get(i).setTel(tel);
                workerUserList.get(i).setEmail(email);
                workerUserList.get(i).setPw(pw);
                workerUserList.get(i).setAddress(address);
                workerUserList.get(i).setJoinedDate(joinedDate);
                workerUserList.get(i).setGrade(grade);
                workerUserList.get(i).setPersonalNumber(personalNumber);
                workerUserList.get(i).setFavoriteGenre(favoriteGenre);
                workerUserList.get(i).setWorkerPlace(workerPlace);
                workerUserList.get(i).setJob(job);

                break;
            }
        }

        for (i = 0; i < corporateUserList.size(); i++)
        {
            if (corporateUserList.get(i).getName().contains(name))
            {
                System.out.println("********** 수정할 아이디부터 다시 입력해주세요. **********");

                System.out.println(" 1. 법인기업고객 아이디 : ");
                id = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 2. 법인기업고객 이 름 : ");
                UpdateName = userStdIn.nextLine();
                System.out.println(" 3. 법인기업고객 연락처 : ");
                tel = userStdIn.nextLine();
                System.out.println(" 4. 법인기업고객 이메일 : ");
                email = userStdIn.nextLine();
                System.out.println(" 5. 법인기업고객 비밀번호 : ");
                pw = userStdIn.nextLine();
                System.out.println(" 6. 법인기업고객 주 소 : ");
                address = userStdIn.nextLine();
                System.out.println(" 7. 법인기업고객 가입날짜 : ");
                joinedDate = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 8. 법인기업고객 회원등급 : ");
                grade = userStdIn.nextLine();
                System.out.println(" 9. 법인기업고객 사업자번호 : ");
                businessLicenseNumber = userStdIn.nextLine();
                System.out.println(" 10. 법인기업고객 선호하는 콘텐츠 : ");
                favoriteContents = userStdIn.nextLine();
                System.out.println(" 11. 법인기업고객 기업유형 : ");
                corporateType = userStdIn.nextLine();

                corporateUserList.get(i).setId(id);
                corporateUserList.get(i).setName(UpdateName);
                corporateUserList.get(i).setTel(tel);
                corporateUserList.get(i).setEmail(email);
                corporateUserList.get(i).setPw(pw);
                corporateUserList.get(i).setAddress(address);
                corporateUserList.get(i).setJoinedDate(joinedDate);
                corporateUserList.get(i).setGrade(grade);
                corporateUserList.get(i).setBusinessLicenseNumber(businessLicenseNumber);
                corporateUserList.get(i).setFavoriteContents(favoriteContents);
                corporateUserList.get(i).setCorporateType(corporateType);

                break;
            }
        }

        for (i = 0; i < personalCoporateUserList.size(); i++)
        {
            if (personalCoporateUserList.get(i).getName().contains(name))
            {
                System.out.println("********** 수정할 아이디부터 다시 입력해주세요. **********");

                System.out.println(" 1. 개인기업고객 아이디 : ");
                id = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 2. 개인기업고객 이 름 : ");
                UpdateName = userStdIn.nextLine();
                System.out.println(" 3. 개인기업고객 연락처 : ");
                tel = userStdIn.nextLine();
                System.out.println(" 4. 개인기업고객 이메일 : ");
                email = userStdIn.nextLine();
                System.out.println(" 5. 개인기업고객 비밀번호 : ");
                pw = userStdIn.nextLine();
                System.out.println(" 6. 개인기업고객 주 소 : ");
                address = userStdIn.nextLine();
                System.out.println(" 7. 개인기업고객 가입날짜 : ");
                joinedDate = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 8. 개인기업고객 회원등급 : ");
                grade = userStdIn.nextLine();
                System.out.println(" 9. 개인기업고객 사업자번호 : ");
                businessLicenseNumber = userStdIn.nextLine();
                System.out.println(" 10. 개인기업고객 선호하는 콘텐츠 : ");
                favoriteContents = userStdIn.nextLine();
                System.out.println(" 11. 개인기업고객 기업유형 : ");
                corporateType = userStdIn.nextLine();

                personalCoporateUserList.get(i).setId(id);
                personalCoporateUserList.get(i).setName(UpdateName);
                personalCoporateUserList.get(i).setTel(tel);
                personalCoporateUserList.get(i).setEmail(email);
                personalCoporateUserList.get(i).setPw(pw);
                personalCoporateUserList.get(i).setAddress(address);
                personalCoporateUserList.get(i).setJoinedDate(joinedDate);
                personalCoporateUserList.get(i).setGrade(grade);
                personalCoporateUserList.get(i).setBusinessLicenseNumber(businessLicenseNumber);
                personalCoporateUserList.get(i).setFavoriteContents(favoriteContents);

                break;
            }
        }

        for (i = 0; i < studentUserList.size(); i++)
        {
            if (studentUserList.get(i).getName().contains(name))
            {
                System.out.println("********** 수정할 아이디부터 다시 입력해주세요. **********");

                System.out.println(" 1. 학생고객 아이디 : ");
                id = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 2. 학생고객 이 름 : ");
                UpdateName = userStdIn.nextLine();
                System.out.println(" 3. 학생고객 연락처 : ");
                tel = userStdIn.nextLine();
                System.out.println(" 4. 학생고객 이메일 : ");
                email = userStdIn.nextLine();
                System.out.println(" 5. 학생고객 비밀번호 : ");
                pw = userStdIn.nextLine();
                System.out.println(" 6. 학생고객 주 소 : ");
                address = userStdIn.nextLine();
                System.out.println(" 7. 학생고객 가입날짜 : ");
                joinedDate = Integer.parseInt(userStdIn.nextLine());
                System.out.println(" 8. 학생고객 회원등급 : ");
                grade = userStdIn.nextLine();
                System.out.println(" 9. 학생고객 주민번호 : ");
                personalNumber = userStdIn.nextLine();
                System.out.println(" 10. 학생고객 선호하는 장르 : ");
                favoriteGenre = userStdIn.nextLine();
                System.out.println(" 11. 학생고객 학교 : ");
                school = userStdIn.nextLine();
                System.out.println(" 12. 학생고객 학년 : ");
                year = Integer.parseInt(userStdIn.nextLine());

                studentUserList.get(i).setId(id);
                studentUserList.get(i).setName(UpdateName);
                studentUserList.get(i).setTel(tel);
                studentUserList.get(i).setEmail(email);
                studentUserList.get(i).setPw(pw);
                studentUserList.get(i).setAddress(address);
                studentUserList.get(i).setJoinedDate(joinedDate);
                studentUserList.get(i).setGrade(grade);
                studentUserList.get(i).setPersonalNumber(personalNumber);
                studentUserList.get(i).setFavoriteGenre(favoriteGenre);
                studentUserList.get(i).setSchool(school);
                studentUserList.get(i).setYear(year);

                break;
            }
        }

        System.out.println("********** 변경이 완료되었습니다. **********");
    }

    public void deleteUser() { //삭제함수

        int i, j;
        System.out.println("********** 삭제할 고객 정보 입력 시작 **********");
        System.out.println("고객 이름 : ");
        String name = userStdIn.nextLine();
        System.out.println("고객 정보 입력 완료.");

        for (i = 0; i < corporateUserList.size(); i++)
        {
            if (corporateUserList.get(i).getName().contains(name))
            {
                corporateUserList.remove(i);
            }
            break;
        }

        for (i = 0; i < personalCoporateUserList.size(); i++)
        {
            if (personalCoporateUserList.get(i).getName().contains(name))
            {
                personalCoporateUserList.remove(i);
            }
            break;
        }

        for (i = 0; i < studentUserList.size(); i++)
        {
            if (studentUserList.get(i).getName().contains(name))
            {
                studentUserList.remove(i);
            }
            break;
        }

        for (i = 0; i < workerUserList.size(); i++)
        {
            if (workerUserList.get(i).getName().contains(name))
            {
                workerUserList.remove(i);
            }
            break;
        }
        System.out.println("********** 고객 정보 삭제 완료 **********");
    }

}
