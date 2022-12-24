import java.util.Scanner;
public class Main {

    public  static  void main(String[] args)
    {
        String text = "";
        String key = "";
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.print("Text: ");
            text = scanner.nextLine();
            System.out.print("Key: ");
            key = scanner.nextLine();

        }catch (Exception ex) {
            System.out.println(ex);
        }
        Vingere vg = new Vingere();
        String cipher = vg.ency(text,key);
        String plain = vg.decry(cipher,key);
        System.out.println("================================");
        System.out.println("Input Data");
        System.out.println("Text:" +text);
        System.out.println("Key:" +key);
        System.out.println("================================");
        System.out.println("================================");
        System.out.println("Encrypt and Decrypt Text");
        System.out.println("Encrtypt:"+cipher);
        System.out.println("Decrypt:"+plain);
    }

}
