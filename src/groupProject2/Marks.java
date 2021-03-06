package groupProject2;

 abstract class Marks{
    //Marks constructor with 3 subjects
    public Marks(double mathMark, double scienceMark, double physicsMark) {
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.physicsMark = physicsMark;
    }

    double mathMark;
    double scienceMark;
    double physicsMark;

    //abstract method
    abstract double getPercentage();
}
public class A extends Marks {

    //constructor for A student
    public A(double mathMark, double scienceMark, double physicsMark) {
        super(mathMark, scienceMark, physicsMark);
    }
    //giving implementation to the method
    @Override
    double getPercentage() {
        double averageMark = (mathMark + scienceMark + physicsMark) / 3;
        return averageMark;
    }
}
class B extends Marks {

    double chemistryMark;
    //constructor for B student
    public B(double mathMark, double scienceMark, double physicsMark, double chemistryMark) {
        super(mathMark, scienceMark, physicsMark);
        this.chemistryMark=chemistryMark;
    }

    //abstract method implementation
    @Override
    double getPercentage() {
        double averageMark = (mathMark + scienceMark + physicsMark+chemistryMark) / 4;
        return averageMark;
    }
}
public class Tester {
    public static void main(String[] args) {

        A a=new A(2.4,5.5,6.7);
        System.out.println(a.getPercentage());
    }
}
}