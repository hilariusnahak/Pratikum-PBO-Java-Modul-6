public class BelajarPewarisan {
    public static void main(String[] args) throws Exception {
        SuperClass instant1 = new SuperClass();
        SubClass instant2 = new SubClass();
        System.out.println(instant1.cetak());
        System.out.println(instant2.cetak());
    }
}

class SuperClass {
    String cetak() {
        return "cetak SuperClass";
    }
}

/*
class SubClass extends SuperClass {
    @Override
    String cetak() {
        return "cetak SubClass";
    }
}
*/

// Modifikasi atau menambahkan class SubClass agar dapat memanggil dari superclass
class SubClass extends SuperClass {
    @Override
    String cetak() {
        return "cetak SubClass" + super.cetak() + " " + "cetak Subclass";
    }
}