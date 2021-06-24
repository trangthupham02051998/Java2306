package com.company;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<HocSinh> listHS = new ArrayList<HocSinh>();
        HocSinh hs1 = new HocSinh("Long",1,2,3);
        HocSinh hs2 = new HocSinh("Long1",1,5,3);
        HocSinh hs3 = new HocSinh("Long3",1,2,3);

        listHS.add(hs1);
        listHS.add(hs2);
        listHS.add(hs3);

        for (HocSinh hocSinh : listHS){
            if(hocSinh instanceof HocSinh){
                HocSinh hs = hocSinh;
                System.out.println("Diem Tb: " + hs.tinhDiemTrungBinh());
            } else {


            }
        }
    }
}
