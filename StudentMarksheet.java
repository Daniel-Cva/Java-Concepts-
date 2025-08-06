public class StudentMarksheet {
    public static void main(String[]args){
        Student.Marksheet S1 = new Student.Marksheet();
        S1.RegNo = "001";
        S1.Tamil = 80;
        S1.English =75;
        S1.Mathematics = 80;
        S1.Science=90;
        S1.Social = 70;
        S1.total= S1.Tamil + S1.English + S1.Mathematics + S1.Science + S1.Social;
        S1.SCount++;
        Student.Marksheet S2 = new Student.Marksheet();
        S2.Tamil = 75;
        S2.English =80;
        S2.Mathematics = 90;
        S2.Science=80;
        S2.Social = 80;
        S2.total= S2.Tamil + S2.English + S2.Mathematics + S2.Science + S2.Social;
        S2.SCount++;
        S2.RegNo = "002";
        System.out.println("Student Marksheet");
        System.out.println( "Register Number: "+ S1.RegNo + "\n" + "Tamil: "+S1.Tamil + "\n" + "English: " + S1.English + "\n" + "Mathematics: " + S1.Mathematics + "\n" + "Science: " + S1.Science +  "\n" +"Social: " + S1.Social + "\n" +"Total Marks: " + S1.total);
        System.out.println("-----------------------------------------");
        System.out.println( "Register Number: "+ S2.RegNo + "\n" + "Tamil: "+S2.Tamil + "\n" + "English: " + S2.English + "\n" + "Mathematics: " + S2.Mathematics + "\n" + "Science: " + S2.Science +  "\n" +"Social: " + S2.Social + "\n" +"Total Marks: " + S2.total);
        System.out.println("Total Students: " + Student.Marksheet.SCount);
    }
}
class Student{
    static class Marksheet{
         String RegNo;
         int Tamil;
         int English;
         int Mathematics;
         int Science;
         int Social;
         int total;
         static int SCount;
    }
}
