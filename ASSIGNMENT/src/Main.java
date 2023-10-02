public class Main {
    public static void main(String[] args) {
        Computer c1=new Computer("101","2002",13,225);
        Computer c2=new Computer("102","2002",8,226);
        System.out.println(c2.equals(c1));
        System.out.println(c1.clone());
    }
}