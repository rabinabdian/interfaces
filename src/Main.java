public class Main {



    public static void main(String[] args) {

//         System.out.println("Hello World!");


// Excercise 9:
// Create an abstract class Shape with an abstract draw function , but a fully implemented move(int deltaX, int deltaY ) function
// Create class Circle and Rectangle which extend the abstract class and override draw
//  draw should print something like "Circle at xPos=5 yPos= 10"
// Write in class Example a static function moveAndDraw which accepts a shape as a parameter   , moves it 1 on x, 1 on y, and then draws it
// Test your code

//        Circle c = new Circle();
//        c.deltaX=1;
//        c.deltaY=1;
//
//        c.draw();
//       c.moveAndDraw();
//        System.out.println("------- after calling moveAndDraw -------- ");
//        c.draw();

//Interfaces
// Excercise 10:
// Turn your abstract class Shape into an interface
// What changes do you need to make?


// Excercise 11:
//  Add a new interface called HasCorners which has 1 function  int getNumberOfCorners()
//  Make Rectangle only implement the interface ( Circle does not have corners )
//  Add a new static function void printCornerInformation which accepts a variable of type HasCorners, and nicely prints the  number of corners
//  Check that your printCornerInformation works for Rectangle, but not for Circle

Rectangle r = new Rectangle(1,1,3);

      //  printCornerInformation(r);

//r.whoAmI();

   //     Circle c= new Circle();

//        printCornerInformation(c); // printCornerInformation
//        (HasCorners)
//                in Main cannot be applied
//                to
//        (Circle)




    }

    private static void printCornerInformation(HasCorners r) {




        System.out.println("------- after calling HasCorners-------- ");

        System.out.println("Number Of Corners : " + r.getNumberOfCorners());



    }
}
