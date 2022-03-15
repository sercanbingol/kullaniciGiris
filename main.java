
import java.util.Scanner;
 class KullaniciGirisi27 {
    public static void main(String[] args) {
        // username : patika , password : java123
        String userName, password;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = scan.nextLine();
        System.out.print("Şifreniz : ");
        password = scan.nextLine();
        // String'lerde eşitlik için ".equals" ifadesi kullanılır. Daha sonraki derslerde nedeni açıklanacak.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı.");
        } else if (!userName.equals("patika") && password.equals("java123")) {
            System.out.println("Kullanıcı adını yanlış girdiniz");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Şifreniz yanlış !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ?\n1=Evet.\n2=Hayır. ");
            int resetpassword ;
            resetpassword = scan.nextInt();
            switch (resetpassword) {
                case 1 :
                    System.out.print("Yeni Şifreniz : " + scan.nextLine());
                    String newPassword = scan.nextLine();
                    if (newPassword.equals ("java123")) {
                        System.out.println("Yeni şifre , eski şifreyle aynı olamaz.");
                        break;
                    }else {
                        System.out.println("Şifreniz başarıyla değiştirildi.");
                        break;
                    }
                case 2 :
                    System.out.println("Şifre sıfırlanmadı.");
                    break;
            }
        }else {
            System.out.println("Bilgilerinizi kontrol ediniz !");
        }

    }
}