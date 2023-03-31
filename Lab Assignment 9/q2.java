class EmptyStack extends Exception{
    EmptyStack(String s){
        super(s);
    }
}

class Fullstack extends Exception{
    Fullstack(String s){
        super(s);
    }
}

class stack{
    public int maxsize;
    public int []array;
    public int top;

    public stack(int size){
        maxsize=size;
        array = new int[maxsize];
        top = -1;
    }

    public void push(int data) throws Fullstack {
        if(top == maxsize-1){
            throw new Fullstack("STACK FULL\n");
        }
        else{
            array[++top] = data;
        }
    }

    public int pop() throws EmptyStack {
        if(top == -1){
            throw new EmptyStack("STACK EMPTY\n");
        }
        else{
            return array[top--];
        }
    }
}

public class q2{
    public static void main(String[] args) {
        stack ashu = new stack(3);
        try{
            ashu.push(5);
            ashu.push(6);
            ashu.push(7);
            ashu.push(8);
            System.out.println(ashu.pop());
            System.out.println(ashu.pop());
            System.out.println(ashu.pop());
            System.out.println(ashu.pop());
            System.out.println(ashu.pop());
        }
        catch(Fullstack e){
            System.out.println(e);
        }
        catch(EmptyStack f){
            System.out.println(f);

        }
    }
}

