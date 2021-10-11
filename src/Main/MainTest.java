package Main;

import java.util.Scanner;

import UserController.UserController;

public class MainTest {
    public static void main(String[] args) { //고객관리 메인클래스

//        public enum menuUser { //고객등록 값
//            ZERO,
//            ADD_USER,
//            SEARCH_USER,
//            PRINT_USER,
//            UPDATE_USER,
//            DELETE_USER,
//            RETURN_USER,
//            QUIT
//        }

            Scanner stdIn = new Scanner(System.in);
            UserController controller = new UserController();

            while (true) {

                controller.showUerMenu();//고객정보관리 메뉴

                int menu;
                menu = stdIn.nextInt();

                if (!(1<=menu && menu<=7)) {
                    System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 7)");
                    break;
                }

                switch (menu)
                {
                    case 1: //ADD_USER:
                        System.out.println("고객관리 메뉴에서 신규고객 등록 함수 호출!!\n");
                        controller.showAddUserMenu(); //신규회원 등록메뉴 함수
                        menu = stdIn.nextInt();
                        if (menu==1) {
                            controller.showAddPrivateUserMenu();
                            menu = stdIn.nextInt();
                            if (menu==1) {
                                controller.addNewStudentUser();
                            }
                            else if (menu==2) {
                                controller.addNewworkerUser();
                            }
                            else if (menu==3) {
                                controller.showAddUserMenu(); //신규회원 등록메뉴 함수
                            }
                        }
                        else if (menu==2) {
                            controller.showAddCompanyUserMenu();
                            menu = stdIn.nextInt();
                            if (menu==1) {
                                controller.addNewPersonalCoporateUser();
                            }
                            else if (menu==2) {
                                controller.addNewCorporateUser();
                            }
                            else if (menu==3) {
                                controller.showAddUserMenu(); //신규회원 등록메뉴 함수
                            }
                        }
                        else if (menu==3) {
                            controller.showUerMenu();//고객정보관리 메뉴
                        }
                        break;

                    case 2: //SEARCH_USER:
                        System.out.println("고객관리 메뉴에서 고객검색 함수 호출!!\n");
                        controller.searchUser(); //고객정보 검색
                        break;

                    case 3: //PRINT_USER:
                        System.out.println("고객관리 메뉴에서 고객출력 함수 호출!!\n");
                        controller.printUserList(); //고객정보 출력
                        break;

                    case 4: //UPDATE_USER:
                        System.out.println("고객관리 메뉴에서 고객수정 함수 호출!!\n");
                        controller.updateUser(); //고객정보 수정
                        break;

                    case 5: //DELETE_USER:
                        System.out.println("고객관리 메뉴에서 고객삭제 함수 호출!!\n");
                        controller.deleteUser(); //고객정보 삭제
                        break;

                    case 6: //RETURN_USER:
                        System.out.println("고객관리 메뉴에서 되돌아가기 함수 호출!!\n");
                        //controller.ReturnMenu();;
                        break;
                }

                if (menu == 7)
                {
                    System.out.println("이용해 주셔서 감사합니다~ \n");
                    break;
                }
            } //end Of switch

        }

    }

