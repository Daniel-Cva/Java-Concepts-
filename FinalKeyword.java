
public final class FinalKeyword {
    public static void main(String[]args){
        final int variable = 50;
        variable = 70; //final variable value cannot be changed.
    }
}
final class Parent{
    final void display(){
        System.out.println("iam display method of parent class");
    }
    void show(){
        System.out.println("iam show method of parent class");
    }
}
class Child1 extends Parent{ // cannot inherit from final Parent
    void display(){ //final method cannot override
        System.out.println("iam display method of child1 class");
    };
    void show(){
        System.out.println("iam show method of Child1 class");
    }
}
