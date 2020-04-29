package baitaplon;

public class DSSV {
    private SV dssv[];
    private int soSV;

    public DSSV(int n) {
        dssv = new SV[n];
        soSV = 0;
    }

    public SV[] layDS() {
        return dssv;
    }

    public int laysoSV() {
        return soSV;
    }

    public void themSV(SV sinhvienmoi) {
        dssv[soSV] = sinhvienmoi;
        soSV++;
    }

    public boolean remove(int mssv) {
        boolean status = false ;
        for (int i = 0; i < soSV; i++) {
            if(dssv[i] != null){
                if(dssv[i].layMso() == mssv){
                    dssv[i] = null ;
                    status = true ;
                }
            }
        }
        return status ;
    }

    public void edit(int mssv,float diemmoi){
        for(int i = 0 ; i < soSV ; i++){
            if(dssv[i] !=null){
                if(dssv[i].layMso() == mssv){
                    dssv[i].nhapDiemtrungbinh(diemmoi) ;
                }
            }
        }
    }

    public void hienthi() {
        System.out.println("Danh sach sinh vien :");
        for (int i = 0; i < soSV; i++) {
            if (dssv[i] != null) {
                System.out.println("Hoten : " + dssv[i].layHoten());
                System.out.println("MSSV : " + dssv[i].layMso());
                System.out.println("DTB :" + dssv[i].layDiemtrungbinh());
                System.out.println("-------------------------------------------");
            }
        }
    }

    public int sosanh(String str1,String str2) {
        char c1, c2;
        int min_length = str1.length();
        if (min_length > str2.length()) {
            min_length = str2.length();
        }

        for (int i = 0; i < min_length; i++) {
            if (dssv[i] != null) {
                c1 = str1.charAt(i);
                c2 = str2.charAt(i);
                if (c1 == c2) continue;
                else if (c1 > c2) return 1;
                else return 0;
            }
        }
       if(str1.length() > str2.length()) return 1 ;
       else if(str1.length() < str2.length()) return -1 ;
       else return 0 ; // 2 xau bang nhau
    }

        public void sapxep () {
            SV tg = null;
            for (int i = 0; i < soSV; i++) {
                for (int j = i + 1; j < soSV; j++) {
                    if (dssv[i] != null) {
                        if(sosanh(dssv[i].layHoten(),dssv[j].layHoten())==1){
                            tg =  dssv[j] ;
                            dssv[j] = dssv[i] ;
                            dssv[i] = tg ;
                        }
                    }
                }
            }
        }

        public void timkiem(float diem){
           for(int i = 0 ; i < soSV ; i++){
               if(dssv[i] != null){
                   if(dssv[i].layDiemtrungbinh() == diem){
                       System.out.println("Hoten : " + dssv[i].layHoten());
                       System.out.println("MSSV : " + dssv[i].layMso());
                       System.out.println("DTB :" + dssv[i].layDiemtrungbinh());
                       System.out.println("-------------------------------------------");
                   }
               }
           }
        }
}
