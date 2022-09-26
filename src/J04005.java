import java.util.Scanner;

public class J04005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoten = scanner.nextLine();
        String ngaysinh = scanner.nextLine();
        float diem1 = scanner.nextFloat();
        float diem2 = scanner.nextFloat();
        float diem3 = scanner.nextFloat();

        ThiSinh thiSinh = new ThiSinh(hoten, ngaysinh, diem1, diem2, diem3);
        thiSinh.setTongDiem();
        System.out.println(thiSinh.getHoTen() + " " + thiSinh.getNgaySinh() + " " + thiSinh.getTongDiem());
    }
}

class ThiSinh{
    private String hoTen;
    private String ngaySinh;
    private float diem1, diem2, diem3, tongDiem;

    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem() {
        this.tongDiem = diem1 + diem2 + diem3;
    }
}
