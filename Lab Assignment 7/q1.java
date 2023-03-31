abstract class Student {
    private int rollNo;
    private int regNo;
    
    public Student(int rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public int getRegNo() {
        return regNo;
    }
    
    public abstract void course();
}

class Kiitian extends Student {
    public Kiitian(int rollNo, int regNo) {
        super(rollNo, regNo);
    }
    
    public void course() {
        System.out.println("Kiitian CSE");
    }
    
    public void printDetails() {
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Reg No: " + getRegNo());
    }
}

public class q1 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian(12345, 67890);
        k.printDetails(); 
    }
}
