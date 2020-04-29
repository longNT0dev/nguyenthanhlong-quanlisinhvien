package baitaplon;

import java.util.Date;

public class SV {
    private String hoten ;
    private  int masosinhvien ;
    private  float diemtrungbinh ;
    public SV(String ht,int mssv,float dtb){
        hoten = ht ;
        diemtrungbinh = dtb ;
        masosinhvien = mssv ;
    }
    public String layHoten(){ return  hoten ;}
    public String nhapHoten(String ht){ return  hoten = ht ;}
    public int layMso(){ return  masosinhvien ; }
    public int nhapMSo(int ms){ return  masosinhvien = ms ;}
    public float layDiemtrungbinh(){ return diemtrungbinh ;}
    public  float nhapDiemtrungbinh(float dtb){ return diemtrungbinh = dtb ;}

    public void hienthi(){
        System.out.println("Hoten : " + hoten) ;
        System.out.println("MSSV : " + masosinhvien);
        System.out.println("DiemTB : " + diemtrungbinh) ;
    }
}
