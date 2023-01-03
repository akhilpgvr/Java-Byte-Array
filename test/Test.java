public class Test{
    public static void main(String[] args){
        String name = "akhil";
        byte[] nameAsByte = name.getBytes();
        for(byte nameByte : nameAsByte){
            System.out.println(nameByte);
        }
        System.out.println(nameAsByte);    
    }
}
