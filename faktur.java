
class faktur extends barang implements pembayaran {
    private String no_faktur;
    private String nama_customer;
    private String noHP;
    private String alamat;

    public faktur(String no_faktur, String nama_customer, String nama_barang, double harga_barang, int jumlah_barang,String noHP,String alamat) {
        super(nama_barang, harga_barang, jumlah_barang);
        this.no_faktur = no_faktur;
        this.nama_customer = nama_customer;
        this.noHP = noHP;
        this.alamat = alamat;
    }

    public String getNo_faktur() {
        return no_faktur;
    }

    public String getNama_customer() {
        return nama_customer;
    }

     public String getNoHP() {
        return noHP;
    }

    public String getAlamat() {
        return alamat;
    }
    
    @Override
    public double calculateTotal() {
        return getHarga_barang() * getJumlah_Barang();
    }
}
