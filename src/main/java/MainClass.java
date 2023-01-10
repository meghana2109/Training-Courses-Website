import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Date d1 = new Date(1998,10,10);
        Date d2 = new Date(1993,12,07);

        Course c1 = new Course(1,"JAVA training","Technology",32,"An exemplary course to learn JAVA in 32 days with practical project ecperience");
        Course c2 = new Course(2,"Yoga Training","Health",91,"An elaborated training on Yoga with basics");

        User u1 = new User(001,"John","Doe","john123","!Jo12Do",d1,c1);
        User u2 = new User(001,"Jane","Doe","jane323","123Jan12Do",d2,c2);

        System.out.println("==================================================================================================");

        System.out.println("User details with course enrolled : ");
        System.out.println("Name : "+u1.firstName+" "+u1.lastName);
        System.out.println("Course enrolled : "+u1.course.name);
        System.out.println("Course Description : "+u1.course.description);

        System.out.println("==================================================================================================");

        System.out.println("Name : "+u2.firstName+" "+u2.lastName);
        System.out.println("Course enrolled : "+u2.course.name);
        System.out.println("Course Description : "+u2.course.description);

        System.out.println("==================================================================================================");



    }
}
