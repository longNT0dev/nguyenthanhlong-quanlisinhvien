package baitaplon;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //Giao dien lua chon chuc nang
       Background background = new Background() ;
       background.hienthi() ;
       //Control
        Controller controller = new Controller() ;
        //Condition
        Scanner scanner = new Scanner(System.in) ;
        while(true) {
            System.out.println("Nhap lua chon cua ban :") ;
            int inputUser = scanner.nextInt() ;
            System.out.println("Ban da chon " + inputUser);
            switch (inputUser) {
                case 1 :
                    controller.add() ;
                    break ;
                case 2 :
                    controller.del() ;
                    break ;
                case 3 :
                    controller.edit() ;
                    break ;
                case 4 :
                    controller.hienthi() ;
                case 5 :
                    controller.sapxep() ;
                    break ;
                case 6 :
                    controller.timkiem();
                case 0 :
                    System.out.println("Ban da thoat khoi chuong trinh");
                    break ;
                default :
                    System.out.println("Khong hop le");
                    break ;
            }
        }


    }
}
