public class Main {
    public static void main(String[] args){
        CustomStringMethods methods = new CustomStringMethods();
        String str = methods.starBetween("apple");
        System.out.println(str);
        str = methods.starBetween("Hey what's up?");
        System.out.println(str);

    }
}