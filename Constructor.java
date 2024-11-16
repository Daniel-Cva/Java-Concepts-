public class Constructor {
    public String FirstName;
    public String LastName;
    public int Age;
    public Constructor( String fname, String lname, int age ){
        this.FirstName = fname;
        this.LastName = lname;
        this.Age = age;
        System.out.println("Name : "+fname + " " + lname);
        System.out.println("Age: " + age);
    }
    public static void main(String [] args){
        Constructor c1 = new Constructor(" Daniel","Cva", 25);
        Constructor c2 = new Constructor("Dani-Jesus-Cva ","🤍❤🧡💜💙🤎🖤💛", 20 );
    }
}
