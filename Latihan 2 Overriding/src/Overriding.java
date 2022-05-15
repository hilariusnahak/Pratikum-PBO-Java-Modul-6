public class Overriding {
    public static void main(String[] args) throws Exception {
        Sapi perah = new Sapi("Perah", 4);
        perah.bersuara();
        Kucing tom = new Kucing("Tom", 4);
        tom.bersuara();
        Kucing tery = new Kucing("Tery", 4);
        tery.bersuara();
        Ayam jago = new Ayam("Jago", 2);
        jago.bersuara();
    }
}

class Hewan {
    private String jenis;
    private int jumlahKaki;

    Hewan() {
    }

    Hewan(String jenis, int jumlahKaki) {
        this.jenis = jenis;
        this.jumlahKaki = jumlahKaki;
    }

    public void bersuara() {
        System.out.print("Suara Hewan " + jenis + " berkaki " + jumlahKaki);
    }
}

class Sapi extends Hewan {
    Sapi(String jenis, int jumlahKaki) {
        super(jenis, jumlahKaki);
    }
    public void bersuara() { // overriding method
        super.bersuara();
        System.out.println(" Mouwww...");
    }
}

class Kucing extends Hewan {
    Kucing(String jenis, int jumlahKaki) {
        super(jenis, jumlahKaki);
    }

    public void bersuara() { // overriding method
        super.bersuara();
        System.out.println(" Meeeooo...");
    }
}

// tugas 1 : menambahkan class Ayam yang merupakan turunan dari class hewan.
class Ayam extends Hewan {
    Ayam(String jenis, int jumlahKaki) {
        super(jenis, jumlahKaki);
    }
    public void bersuara() { // overriding method
        super.bersuara();
        System.out.println(" Kukuruyuk...");
    }
}