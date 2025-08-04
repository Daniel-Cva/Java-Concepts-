public class Stringbuffer {
    public static void main(String[]args){
        StringBuffer a = new StringBuffer("Hello World!");
        /*********************append()************************/
        System.out.println(a.append("This is Java...   This Is append Method"));
        /*********************insert()************************/
        System.out.println(a.insert(25,"This is Insert Method "));
        /*********************replace()************************/
        System.out.println(a.replace(6,11,"Dani"));
        /*********************delete()************************/
        System.out.println(a.delete(49,52));
        /*********************reverse()************************/
        System.out.println(a.reverse());
        System.out.println(a.reverse());
    }
}
