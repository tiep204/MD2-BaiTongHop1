package ra.entity;

import ra.interfake.IBook;

import java.util.Scanner;

public class Author implements IBook {
    int authorid;
    String authorName;
    Boolean authorStatus;

    public Author() {
    }

    public Author(int authorid, String authorName, Boolean authorStatus) {
        this.authorid = authorid;
        this.authorName = authorName;
        this.authorStatus = authorStatus;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getAuthorStatus() {
        return authorStatus;
    }

    public void setAuthorStatus(Boolean authorStatus) {
        this.authorStatus = authorStatus;
    }
    Scanner sc = new Scanner(System.in);
    @Override

    public void inphutData(Scanner sc) {
        System.out.println("nhap ten tac gia vao day: ");
        do {
            this.authorName = sc.nextLine();
            if(this.authorName.trim().length()>=6 &&
                    this.authorName.trim().length() <=50){
                break;
            }else{
                System.out.println("xin ban nhap ten tu 6-50 ky tu:");
            }
        }while (true);
        System.out.println("hay nhap trang thai cua tac gia");
        this.authorStatus = Boolean.getBoolean(sc.nextLine());

    }

    @Override
    public void displayData() {
        System.out.println("id tac gia: "+this.authorid + "   ten tac gia: "+this.authorName+ "    trang thai cua tac gia:  "+ this.authorStatus);
    }
    public void getData(){

    }
    public void insertData(){

    }
}
