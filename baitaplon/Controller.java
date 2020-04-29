package baitaplon;

import java.util.Scanner;

public class Controller {
    private DSSV danhsach = new DSSV(1000)  ;
    private Scanner scanner = new Scanner(System.in) ;
    public Controller(){}
    public void add(){
        String ht ;
        do{
            System.out.println("Nhap vao ho ten sinh vien ") ;
            ht = scanner.next() ;
            if(ht == null){
                System.out.println("Ban chua nhap ho ten sinh vien");
            }
        }while(ht == null) ;

        int maso ;
        do {
            System.out.println("Nhap vao ma so sinh vien ");
            maso = scanner.nextInt() ;
            if(maso < 0){
                System.out.println("Ma so sinh vien khong hop le, moi nhap lai");
            }
        }while (maso < 0) ;

        float dtb ;
        do {
            System.out.println("Nhap vao diem trung binh sinh vien");
             dtb = scanner.nextFloat();
             if(dtb < 0 || dtb > 10){
                 System.out.println("Ban nhap sai, moi nhap lai ");
             }
        }while(dtb < 0 || dtb > 10);

        SV sinhvienmoi = new SV(ht,maso,dtb) ;
        danhsach.themSV(sinhvienmoi) ;
        System.out.println("Ban da nhap thanh cong !");
        danhsach.hienthi();
    }
    public void del(){
        danhsach.hienthi();
        int maso ;
        do{
        System.out.println("Nhap vao vi tri ID sinh vien ban muon xoa ");
        maso = scanner.nextInt() ;
        if(maso <= 0 || maso > danhsach.laysoSV() ){
            System.out.println("ID khong ton tai, moi nhap lai");
        }
        }while(maso <= 0 || maso > danhsach.laysoSV());
        if(danhsach.remove(maso)){
            System.out.println("Xoa thanh cong");
            danhsach.hienthi();
        }
    }

    public void edit(){
        danhsach.hienthi(); ;
        int maso ;
        float diemmoi ;
        do{
            System.out.println("Nhap vao vi tri ID sinh vien ban muon chinh sua ");
            maso = scanner.nextInt() ;
            if(maso <= 0 || maso > danhsach.laysoSV()){
                System.out.println("ID khong ton tai, moi nhap lai");
            }else{
                System.out.println("Nhap vao so diem moi");
                diemmoi = scanner.nextFloat() ;
                danhsach.edit(maso,diemmoi) ;
                System.out.println("Sua diem thanh cong");
                danhsach.hienthi();
            }

        }while(maso <= 0 || maso > danhsach.laysoSV() );

    }

    public void hienthi(){
        danhsach.hienthi();
    }
    public void sapxep(){
        danhsach.sapxep() ;
        System.out.println("Danh sach da duoc sap xep ");
    }
    public  void timkiem(){
        float diem ;
        do{
            System.out.println("Nhap vao diem so muon tim kiem");
            diem = scanner.nextFloat() ;
        }while(diem > 10 || diem < 0) ;
        System.out.println("Danh sach sinh vien co diem so da nhap la :");
        danhsach.timkiem(diem);
    }
}
