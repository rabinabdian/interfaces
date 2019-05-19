abstract class Shape {

    // Create an abstract class Shape with an abstract draw function , but a fully implemented move(int deltaX, int deltaY ) function
     int deltaX;

     int deltaY;




    public abstract void draw();

    public static void moveAndDraw (Shape s)
    {
        // Write in class Example a static function moveAndDraw which accepts a shape as a parameter   , moves it 1 on x, 1 on y, and then draws it

        s.deltaX++;
        s.deltaY++;


    }


}
