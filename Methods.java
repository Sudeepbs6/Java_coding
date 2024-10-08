// class Computer{
//     public void playMusic()
//     {
//         System.out.println("playing music");
//     }

//     public String getMeAPen(int cost)
//     {
//         if(cost>10)
//             return "Pen";
//         return "nothing";
//     }
// }
// public class Methods {
//     public static void main(String[] args) {
//         Computer obj = new Computer();
//         obj.playMusic();
//         String str = obj.getMeAPen(10);
//         System.out.println(str);
//     }
    
// }


//Method Overloading

class Calculator
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1, int n2)
    {
        return n1+n2;
    }

}

public class Methods {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(3,4);
        System.out.println(r1);
    }
    
}
