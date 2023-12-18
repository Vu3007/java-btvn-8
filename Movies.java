
public  class Movies extends Film{
    private int thoiluong;
    public Movies(int id,String tieude,String theloai,String daodien,String ngaycongchieu,int thoiluong){
        super(id, tieude, theloai, daodien, ngaycongchieu);
        this.thoiluong=thoiluong;
    }
    @Override
    public String toString() {
        return "Movie: (" +
                "thoiluong: " + thoiluong +
                ") " + super.toString();
    }

}