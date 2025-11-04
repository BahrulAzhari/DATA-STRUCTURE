package DataPegawai;

public class Link {

    private String nama;
    private long no;
    Link next;
    
    public Link(String nama, long no){
        this.nama = nama;
        this.no = no;
        next = null;
    }
    
    public void displayLink(){
        System.out.print("Nama : " + nama + ", No : " + no);
        System.out.println("");
    }
    
    public long getNo(){
        return no;
    }
    
    public String getNama(){
        return nama;
    }

    public void setNo(long no){
        this.no = no;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}
