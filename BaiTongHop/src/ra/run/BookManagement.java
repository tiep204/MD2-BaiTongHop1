package ra.run;

import ra.entity.Author;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    static ArrayList<Author> authorsList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //////////////////////////  QUẢN LÝ CỦA HÀNG////////////////////////

        do {
            System.out.println("********************QUẢN LÝ CỬA HÀNG SÁCH***************");
            System.out.println("1. Quản lý tác giả");
            System.out.println("2. Quản lý sách");
            System.out.println("3. Thoát");
            System.out.println("Sự lựa chọn của bạn ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    BookManagement.quanLyTacGia(sc);
                    break;
                case 2:
                    BookManagement.quanLySach(sc);
                    break;
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Vui long nhap tu 1-3");
            }
        } while (true);
    }


    ///////////////////////////QUẢN LÝ TÁC GIẢ///////////////////////////////////


    public static void quanLyTacGia(Scanner sc) {
        boolean check = false;

        do {
            System.out.println("********************QUẢN LÝ TÁC GIẢ***********************");
            System.out.println("1. Danh sách tác giả");
            System.out.println("2. Thêm các tác giả");
            System.out.println("3. Cập nhật thông tin tác giả");
            System.out.println("4. Cập nhật trạng thái tác giả");
            System.out.println("5. Thoát");
            System.out.println("Su lua chon cua ban: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    BookManagement.danhSachTacGia(sc);
                    break;
                case 2:
                    BookManagement.themCacTacGia(sc);
                    break;
                case 3:
                    BookManagement.capNhatThongTinTacGia(sc);
                    break;
                case 4:

                    break;
                case 5:
                    check = true;
                    break;
                default:
                    System.out.println("Vui long nhap tu 1-5");
            }


        } while (!check);
    }

    public static void themCacTacGia(Scanner sc) {
        System.out.println("Mời bạn nhập số lượng mà bạn muốn thêm:  ");
        int tacGia = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tacGia; i++) {
            Author listAuthor = new Author();
            listAuthor.inphutData(sc);
            authorsList.add(listAuthor);
        }
    }

    public static void danhSachTacGia(Scanner sc) {
        System.out.println("Danh sách tác giả là: ");
        for (Author au : authorsList) {
            au.displayData();
        }
        System.out.println("\n");
    }

    public static void capNhatThongTinTacGia(Scanner sc) {
        System.out.println("Mời bạn cập nhật danh sách tác giả: ");
        String authorid = sc.nextLine();
        ////kiem tra xem id tac gia co ton tại không? nếu mà có thì cập nhật thôi
        boolean thoatTacGia = false;




    }


    ///////////////////////////END QUẢN LÝ TÁC GIẢ///////////////////////////////////


    ///////////////////////////QUẢN LÝ SÁCH///////////////////////////////////


    public static void quanLySach(Scanner sc) {
        boolean check = false;

        do {
            System.out.println("********************QUẢN LÝ SÁCH*************************");
            System.out.println("1. Danh sách sách");
            System.out.println("2. Thêm các sách");
            System.out.println("3. Cập nhật thông tin sách");
            System.out.println("4. Cập nhật trạng thái sách");
            System.out.println("5. Tính lợi nhuận sách");
            System.out.println("6. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("7. Tìm kiếm sách theo tên sách, tên tác giả");
            System.out.println("8. Bán sách");
            System.out.println("9. Thoát");
            System.out.println("Su lua chon cua ban ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    check = true;
                    break;
                default:
                    System.out.println("vui long chon tu 1-9");
            }

        } while (!check);

    }
    ///////////////////////////END QUẢN LÝ SÁCH///////////////////////////////////


    ///////////////////////////END QUẢN LÝ CỦA HÀNG///////////////////////////////////

}
