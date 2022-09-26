import java.util.Scanner;

public class J04003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        PhanSo phanSo = new PhanSo(a, b);

        phanSo.toiGianPhanSo();
        long tuSo = phanSo.getTuSo();
        long mauSo = phanSo.getMauSo();

        System.out.println(tuSo + "/" + mauSo);
    }
}

class PhanSo {
    private long tuSo, mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }

    public long timUSCLN(long a, long b) {
        if (a == 0) return b;

        return timUSCLN(b % a, a);
    }

    public void toiGianPhanSo() {
        long i = timUSCLN(this.getTuSo(), this.getMauSo());
        tuSo = this.getTuSo() / i;
        mauSo = this.getMauSo() / i;
    }
}
