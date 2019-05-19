public class Rectangle implements Shape,HasCorners{


    int deltaX;
    int deltaY;

    int numberOfCorners;

    public Rectangle(int x, int y, int numberOfCorners) {
        this.deltaX=x;
        this.deltaY=y;
        this.numberOfCorners=numberOfCorners;
    }


    // Create class Circle and Rectangle which extend the abstract class and override draw
// Write in class Example a static function moveAndDraw which accepts a shape as a parameter   , moves it 1 on x, 1 on y, and then draws it
//  Make Rectangle only implement the interface ( Circle does not have corners )




    @Override
    public void draw() {
        //  draw should print something like "Circle at xPos=5 yPos= 10"
        System.out.println("Rectangle at xPos= " +this.deltaX + " yPos= " +this.deltaY );}

    @Override
    public void moveAndDraw() {
        this.deltaX ++;
        this.deltaY++;
    }

    @Override
    public void whoAmI() {

        System.out.println("Class Type Is :  " + this.getClass().getName());




    }


    @Override
    public int getNumberOfCorners() {
        return numberOfCorners;
    }
}
