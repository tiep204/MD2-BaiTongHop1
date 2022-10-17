package ra.entity;

import ra.interfake.IBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Book implements IBook {
    String bookId;
    String bookName;
    Float importPrice;
    Float exportPrice;
    Float profit;
    int quantity;
    ArrayList<Author> listAuthor;
    String title;
    String content;
    String publishing;
    Boolean bookStatus;

    public Book() {
    }

    public Book(String bookId, String bookName, Float importPrice, Float exportPrice, Float profit, int quantity, ArrayList<Author> listAuthor, String title, String content, String publishing, Boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.quantity = quantity;
        this.listAuthor = listAuthor;
        this.title = title;
        this.content = content;
        this.publishing = publishing;
        this.bookStatus = bookStatus;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Float importPrice) {
        this.importPrice = importPrice;
    }

    public Float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(Float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public Float getProfit() {
        return profit;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<Author> getListAuthor() {
        return listAuthor;
    }

    public void setListAuthor(ArrayList<Author> listAuthor) {
        this.listAuthor = listAuthor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }
Scanner sc = new Scanner(System.in);
    @Override
    public void inphutData(Scanner sc) {
        System.out.println("moi ban nhap id sach: ");
        do {
            this.bookId =sc.nextLine();
            if(this.bookId.trim().length()>=5&&this.bookId.trim().length()=='B'){
                break;
            }else{
                System.out.println("xin ban hay nhap ma sach gom 5 ky tu va bat dau bang chu 'B" );
            }
        }while (true);
        System.out.println("hay nhap ten sach: ");
        do {
            this.bookName = sc.nextLine();
            if(this.bookName.trim().length()>=10 &&
                this.bookName.trim().length()<=100){
                break;
            }else{
                System.out.println("moi ban nhap ten sach tu 10-100 ky tu: ");
            }

        }while (true);
        System.out.println("moi ban nhap gia tien sach: ");
        do {
            this.importPrice = Float.parseFloat(sc.nextLine());
            if(this.importPrice>0){
                break;
            }else{
                System.out.println("moi ban nhap gia ban lon hon 0d");
            }
        }while (true);
        System.out.println("moi ban nhap gia ban sach: ");
        do {
            this.exportPrice = Float.parseFloat(sc.nextLine());
            if(this.exportPrice > (this.importPrice *20/100)+this.exportPrice){
                break;
            }else{
                System.out.println("hay nhap gia ban lon hon it nhat 20% gia nhap: ");
            }
        }while (true);
        System.out.println("so luong con lai cua sach la: ");
            this.quantity = Integer.parseInt(sc.nextLine());

        System.out.println("moi ban nhap tieu de cho sach");
            do {
                this.title = sc.nextLine();
                if(this.title.trim().length() >=30 && this.title.trim().length() <=100 ){
                    break;
                }else{
                    System.out.println("moi ban nhap tieu de cua sach it nhat 30-100 ky tu vao day");
                }
            }while (true);
        System.out.println("xin moi ban nhap noi dung sach ");
        this.content = sc.nextLine();
        System.out.println("xin moi ban nhap nha xuat ban ");
        this.publishing = sc.nextLine();
        System.out.println("moi ban nhap trang thai sach ");
        this.bookStatus = Boolean.parseBoolean(sc.nextLine());
        }

    @Override
    public void displayData() {
        System.out.println("Mã sach: "+this.bookId +
                            "     Tên sách:  "+this.bookName +
                             "    Giá nhập sách: "+this.importPrice+
                             "     Gia Bán Sách:  "+ this.exportPrice+
                             "     Lợi nhuận: "+ this.profit+
                             "      số lượng còn lại: "+this.quantity+
                              "      danh sách tác giả viết sách:  "+this.listAuthor+
                              "       tiêu đề sách:   "+ this.title+
                                "      nhà suất bản:  "+ this.publishing+
                                "      trang thái:   "+this.bookStatus);

    }
    public void getData(){

    }
    public void insertData(){

    }

    public void calProfit(){
        this.profit = this.exportPrice-this.importPrice;
        System.out.println(this.profit);
    }
    public void buyBook(int number){


    }

}
