package QLSVTITV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FunctionSV {
    ArrayList<SV> danhSachSV = new ArrayList<>();
    public FunctionSV() {
        danhSachSV = new ArrayList<>();
    }
    public FunctionSV(ArrayList<SV> danhSachSV) {
        this.danhSachSV = danhSachSV;
    }
    public void addSV(SV sv) {
        this.danhSachSV.add(sv);
    }
    public boolean checkSVisEmpty() {
        if(danhSachSV.isEmpty()) {
            return true;
        }
        return false;
    }
    public void xuat() {
        System.out.println(danhSachSV.toString());
    }
    public int getSLSV() {
        return danhSachSV.size();
    }
    public void clearSV() {
        danhSachSV.clear();
    }
    public void searchSV(Scanner sc) {
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String id_search = sc.nextLine();

        boolean timThay = false;

        for(SV sv1 : danhSachSV) {
            if(sv1.getMaSV().equals(id_search)) {
                System.out.print("Tìm thấy sinh viên có mã " + id_search + ": ");
                System.out.println(sv1.toString());

                timThay = true;
                break;
            }
        }

        if(!timThay) {
            System.out.println("Không tìm thấy sinh viên có mã " + id_search);
        }
    }
    public void removeSV(Scanner sc) {
        String id_search = sc.nextLine();
        boolean timThay = false;
        for(SV sv1 : danhSachSV) {
            if(sv1.getMaSV().equals(id_search)) {
                danhSachSV.remove(sv1);
                timThay = true;
                break;
            }
        }
        if(!timThay) {
            System.out.println("Not found");
        }else{
            System.out.println("Correct " + id_search);
        }
    }
    public void searchNameSV(String ten) {
        for(SV sv1 : danhSachSV) {
            if(sv1.getHoTen().indexOf(ten) >= 0) {
                System.out.println(sv1);
            }
        }
    }
    public void sapXepSV() {
        Collections.sort(this.danhSachSV, new Comparator<SV>() {
            public int compare(SV sv1, SV sv2) {
                if(sv1.getDiemTB() < sv2.getDiemTB()) {
                    return -1;
                }else if(sv1.getDiemTB() > sv2.getDiemTB()) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
    }


    public void PrintSVArrangePoints() {
        for(int i = 0;  i < danhSachSV.size() - 1;i++) {
            for(int j = i + 1; j < danhSachSV.size(); j++) {
                    if(danhSachSV.get(i).getDiemTB() > danhSachSV.get(j).getDiemTB()) {
                        Collections.swap(danhSachSV, i, j);
                    }
            }

        }
    }
    }

