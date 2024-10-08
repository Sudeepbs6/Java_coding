class Calculator
{
    int num=6;
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}


public class Heap_stack 
{
    public static void main(String[] args) {
        // int data =10;

        Calculator cal= new Calculator();
        Calculator cal1= new Calculator();
        // int r1 = cal.add(3, 5);
        cal.num = 8;
        System.out.println(cal.num);
        System.out.println(cal1.num);
    }
}
