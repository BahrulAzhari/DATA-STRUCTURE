package meet2;

public class Kota {

    private String namaKota;
    private int koordinatX;
    private int koordinatY;

    public Kota(String nama, int x, int y){
        this.namaKota = nama;
        this.koordinatX = x;
        this.koordinatY = y;
    }

    public String getnamaKota(){
        return namaKota;
    }

    public int[] getKoordinat(){
        return new int[] {this.koordinatX, this.koordinatY};
    }

    public String toString(){
        return "Kota{" + "nama = " + namaKota + ", x = " + koordinatX + ", y = " + koordinatY+ " }";
    }

    // Menghitung jarak rute (Euclidean) antar kota dalam list
    public static double hitungJarakRute(java.util.List<Kota> rute) {
        double totalJarak = 0.0;
        for (int i = 0; i < rute.size() - 1; i++) {
            int[] k1 = rute.get(i).getKoordinat();
            int[] k2 = rute.get(i + 1).getKoordinat();
            double jarak = Math.sqrt(Math.pow(k1[0] - k2[0], 2) + Math.pow(k1[1] - k2[1], 2));
            totalJarak += jarak;
        }
        return totalJarak;
    }
    
}
