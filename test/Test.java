import java.nio.charset.Charset;

public class Test{
    public static void main(String[] args){
        String name = "akhil";
        byte[] nameAsByte = name.getBytes();
        for(byte i : nameAsByte){
            System.out.println(i);
        }
        System.out.println(new String(nameAsByte));
        System.out.println(name1AsByte);
    }
}