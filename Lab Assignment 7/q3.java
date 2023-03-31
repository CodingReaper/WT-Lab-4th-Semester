class Course{
    int credit;
    String medium;
    public Course(int a,String b){
        credit = a;
        medium = b;
    }
    public int number(int entered){
        int x = 2;
        if(entered >= x){
            return entered;
        }
        else{
            return 0;
        }
    }
    public void display(int entered){
        int x =2;
        if(entered >= x){
            System.out.println("Medium:"+medium+" "+"Credit:"+credit+" "+"IS FLOATED");
        }
        else{
            System.out.println("Medium:"+medium+" "+"Credit:"+credit+" "+"IS NOT FLOATED");
        }
    }
}

class CourseA extends Course{
    int registered;
    public CourseA(int credit,String medium,int registered){
        super(credit, medium);
        this.registered=registered;
    }

    public void displaydetails(){
        System.out.println("Course A has " + number(registered) + " students registered.");
        display(number(registered));
    }
}

class CourseB extends Course{
    int reg;
    public CourseB(int credit,String medium,int registered){
        super(credit, medium);
        reg  =registered;
    }

    public void displaydetails(){
        System.out.println("Course B has " + number(reg) + " students registered.");
        display(number(reg));
    }
}



public class q3{
    public static void main(String[] args){
        CourseA ashu = new CourseA(4, "AI", 7);
        ashu.displaydetails();
        CourseB satya = new CourseB(6, "ML", 0);
        satya.displaydetails();
    }
    
}
