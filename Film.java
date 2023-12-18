public class Film {
    private int id;
    private String tieude;
    private String theloai;
    private String daodien;
    private String ngaycongchieu;
    public Film(){}
    public Film(int id,String tieude,String theloai,String daodien,String ngaycongchieu){
        this.id=id;
        this.tieude=tieude;
        this.theloai=theloai;
        this.daodien=daodien;
        this.ngaycongchieu=ngaycongchieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getDaodien() {
        return daodien;
    }

    public void setDaodien(String daodien) {
        this.daodien = daodien;
    }

    public String getNgaycongchieu() {
        return ngaycongchieu;
    }

    public void setNgaycongchieu(String ngaycongchieu) {
        this.ngaycongchieu = ngaycongchieu;
    }
    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", tieu de='" + tieude + '\'' +
                ", the loai=" + theloai +
                ", dao dien='" + daodien +
                 ", ngay cong chieu='"+ngaycongchieu+ '\'' +
                '}';
    }
}
