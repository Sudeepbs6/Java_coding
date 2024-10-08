class Students{
    int rollno;
    String name;
    int marks;
}

public class Student_array{
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.rollno = 1;
        s1.name = "name1";
        s1.marks = 78;

        Students s2 = new Students();
        s2.rollno = 2;
        s2.name = "name2";
        s2.marks = 88;

        Students s3 = new Students();
        s3.rollno = 3;
        s3.name = "name3";
        s3.marks = 98;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name+" : "+students[i].marks);
        }
    }
}


// Practise

// class Vehicles{
//     int year;
//     String Make;
//     String Model;
//     int price;
// }
// public class Student_array {

//     public static void main(String[] args) {
//         Vehicles v1 = new Vehicles();
//         v1.year = 2019;
//         v1.Make = "Honda";
//         v1.Model = "Accord";
//         v1.price = 32000;

//         Vehicles v2 = new Vehicles();
//         v2.year = 2019;
//         v2.Make = "Merc";
//         v2.Model = "G";
//         v2.price = 55000;

//         Vehicles v3 = new Vehicles();
//         v3.year = 2019;
//         v3.Make = "Kia";
//         v3.Model = "K5";
//         v3.price = 27000;

//         Vehicles cars[] = new Vehicles[3];
//         cars[0] = v1;
//         cars[1] = v2;
//         cars[2] = v3;

//         for(int i=0; i<cars.length; i++){
//             System.out.println(cars[i].Make+" : "+cars[i].Model+" : "+cars[i].price+" : "+cars[i].year);
//         }

//     }
// }
