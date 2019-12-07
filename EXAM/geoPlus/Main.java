
/**
 * 
 * @author Victor Gerlich <cow.illuminati@gmail.com>
 * @version sqrt(2)
 * 
 * 
 */
abstract public class main {


    public static void main(String[] args) {

        // imports in unefficient i was told to last min.
        input input = new input();
        checkShape checkShape = new checkShape();

        // asks for amount of sides
        // shape must be concave!
        System.out.print("Amount of sides (must be over 2): ");
        int sides = 0;

        // until awns is valid
        while (sides < 3) {
            // gets amount of sides
            sides = input.keyInt();
        }

        // declairs points
        int pointx[] = new int[sides];
        int pointy[] = new int[sides];

        // gets each point's x;y
        for (int x = 0; x < sides; x++) {
            pointx[x] = point.x(x);
            pointy[x] = point.y(x);
        }

        // declaires && resets values
        double area = 0;
        double perim = 0;

        // for loop thru all points
        // this step can be compressed and added to the prompting module above, but it
        // makes the code really unclear.
        // if you want to do this, copy the for in the previous module and replace FOR
        // line with "if (x>2) {}"
        for (int x = 1; x < sides; x++) {

            // gets length of each side of imaginairy triangle // {x, (x-1), 0}: will do
            // this with every side and add them up

            // x to x-1
            double a = Math.sqrt(Math.pow((pointx[x] - pointx[x - 1]), 2) + Math.pow((pointy[x] - pointy[x - 1]), 2));

            // x to 0
            double b = Math.sqrt(Math.pow((pointx[x] - pointx[0]), 2) + Math.pow((pointy[x] - pointy[0]), 2));

            // x-1 to 0
            double c = Math.sqrt(Math.pow((pointx[0] - pointx[x - 1]), 2) + Math.pow((pointy[0] - pointy[x - 1]), 2));

            // calcs 'p' of Huron's formula
            double p = (a + b + c) / 2;

            // ads smaller area to total
            area += Math.sqrt(p * (p - a) * (p - b) * (p - c));

            // adds val to perimiter
            perim += a;
        }
        // side 0 to max
        perim += Math.sqrt(Math.pow((pointx[sides - 1] - pointx[0]), 2) + Math.pow((pointy[sides - 1] - pointy[0]), 2));

        // prints final values
        System.out.print("\n\nAREA:" + area);
        System.out.print("\nPERIMETER:" + perim);

        System.out.print("\nBEST GUESS: ");
        
        // estimates shape
        // triangle

        //it's alot easyer to do than to ask for shape and THEN check,
        //but you can do if you want

        if (sides == 3 && checkShape.rectTri(pointx[0], pointy[0], pointx[1], pointy[1], pointx[2], pointy[2])) {
            System.out.print("Rectangle Triangle");
        } else if (sides == 3 && checkShape.equTri(pointx[0], pointy[0], pointx[1], pointy[1], pointx[2], pointy[2])) {
            System.out.print("Equilateral Triangle");
        } else if (sides == 3 && checkShape.isoTri(pointx[0], pointy[0], pointx[1], pointy[1], pointx[2], pointy[2])) {
            System.out.print("Isosceles Triangle");
        } else if (sides == 4 && checkShape.square(pointx[0], pointy[0], pointx[1], pointy[1], pointx[2], pointy[2],
                pointx[3], pointy[3])) {
            System.out.print("Square");
        } else if (sides == 4 && checkShape.rectangle(pointx[0], pointy[0], pointx[1], pointy[1], pointx[2], pointy[2],
                pointx[3], pointy[3])) {
            System.out.print("Rectangle");
        } else if (sides == 4 && checkShape.parral(pointx[0], pointy[0], pointx[1], pointy[1], pointx[2], pointy[2],
                pointx[3], pointy[3])) {
            System.out.print("Parralelogram");
        } else {
            System.out.print(checkShape.getName(sides));
        }
    }
}
