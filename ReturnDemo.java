public class ReturnDemo {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println(t); //before the return-true
        if (t){
            return;
        } 
        System.out.println(!t); //after the return-false but its compile time error
    }
}
