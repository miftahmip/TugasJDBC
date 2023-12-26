
class barang {
    private String nama_barang;
    private double harga_barang;
    private int jumlah_barang;

    public barang(String nama_barang, double harga_barang, int jumlah_barang) {
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
        this.jumlah_barang = jumlah_barang;
    }

    public double getHarga_barang() {
        return harga_barang;
    }

    public int getJumlah_Barang() {
        return jumlah_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }
}
