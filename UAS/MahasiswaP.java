import java.util.*;

class MahasiswaP {
    private int mhsnim;
    private String mhsnama;
    private int kelas;

    MahasiswaP(int mhsnim, String mhsnama, int kelas) {
        this.mhsnim = mhsnim;
        this.mhsnama = mhsnama;
        this.kelas = kelas;
    }

    public int getMhsnim() {
        return mhsnim;
    }

    public String getMhsnama() {
        return mhsnama;
    }

    public int getKelas() {
        return kelas;
    }

    public String toString() {
        return mhsnim + " " + mhsnama + " " + kelas;
    }
}