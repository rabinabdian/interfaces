public class Circle implements Shape{

int deltaX;
    int deltaY;




    // Create class Circle and Rectangle which extend the abstract class and override draw




    @Override
    public void draw() {
        //  draw should print something like "Circle at xPos=5 yPos= 10"
        System.out.println("Circle at xPos= " +this.deltaX + " yPos= " +this.deltaY );
    }

    @Override
    public void moveAndDraw() {
        this.deltaX ++;
        this.deltaY++;
    }
}
