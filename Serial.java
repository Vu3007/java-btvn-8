public class Serial extends Film {
    private int sotap;
    private int thoiluongtrungbinh;
    public Serial(int id,String tieude,String theloai,String daodien,String ngaycongchieu,int sotap,int thoiluongtrungbinh)
    {
       super(id, tieude, theloai, daodien, ngaycongchieu);
        this.sotap=sotap;
        this.thoiluongtrungbinh=thoiluongtrungbinh;

    }
    @Override
    public String toString() {
        return "Serial: (" +
                "sotap: " + sotap +
                ", thoiLuongtrungbinh: " + thoiluongtrungbinh+
                ") " + super.toString();
    }
}
