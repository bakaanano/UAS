import java.util.*;

class CRUDP {
    public static void main(String[] args) {
        List<MahasiswaP> dt = new ArrayList<MahasiswaP>();
        Scanner scn = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int ph;
        do {
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println(" Silakan Pilih : ");
            ph = scn.nextInt();

            switch (ph) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    int mnim = scn.nextInt();

                    System.out.print("Masukkan Nama: ");
                    String mnama = s.nextLine();

                    System.out.print("Masukkan Kelas: ");
                    int kelas = scn.nextInt();

                    dt.add(new MahasiswaP(mnim, mnama, kelas));
                    break;
                case 2:
                    System.out.println("---------------");
                    Iterator<MahasiswaP> i = dt.iterator();
                    while (i.hasNext()) {
                        MahasiswaP e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("---------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Pilih NIM untuk di update: ");
                    int mhsnim = scn.nextInt();
                    System.out.println("---------------");
                    ListIterator<MahasiswaP> li = dt.listIterator();
                    while (li.hasNext()) {
                        MahasiswaP e = li.next();
                        if (e.getMhsnim() == mhsnim) {
                            System.out.print("Masukkan Nama baru: ");
                            mnama = s.nextLine();

                            System.out.print("Masukkan NIM baru: ");
                            mhsnim = scn.nextInt();

                            System.out.print("Masukkan Kelas baru: ");
                            kelas = scn.nextInt();
                            li.set(new MahasiswaP(mhsnim, mnama, kelas));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("NIM tidak ditemukan");
                    } else {
                        System.out.println("Data berhasil diganti");
                    }
                    System.out.println("---------------");
                    break;
                case 4:
                    found = false;
                    System.out.println("Pilih NIM untuk dihapus: ");
                    mhsnim = scn.nextInt();
                    System.out.println("---------------");
                    i = dt.iterator();
                    while (i.hasNext()) {
                        MahasiswaP e = i.next();
                        if (e.getMhsnim() == mhsnim) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("NIM tidak ditemukan");
                    } else {
                        System.out.println("NIM berhasil dihapus");
                    }
                    System.out.println("---------------");
                    break;

            }
        } while (ph != 0);
    }
}