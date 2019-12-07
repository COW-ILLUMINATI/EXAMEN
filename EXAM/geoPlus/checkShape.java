
/**
 * 
 * @author Cow_illuminati <cow.illuminati@gmail.com>
 * @version sqrt(2)
 * 
 * 
 */


class checkShape {

    /**
     * @param (p1x,p1y,p2x,p2y,p2x,p2y)
     * 
     * @return true if it is a rectangle triangle
     */

     public boolean rectTri(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y) {
        // if a^2+b^2=c^2 then true

        // gets side length
        double s1 = Math.sqrt(Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2));
        double s2 = Math.sqrt(Math.pow((p1x - p3x), 2) + Math.pow((p1y - p3y), 2));
        double s3 = Math.sqrt(Math.pow((p3x - p2x), 2) + Math.pow((p3y - p2y), 2));

        // a^2+b^2=c^2
        // since we have limied precision i round to the 1st decimal

        // if is useless: i just use bool operation
        return Math.round((Math.pow(s1, 2) + Math.pow(s2, 2)) * 10) == Math.round(Math.pow(s3, 2) * 10)
                || Math.round((Math.pow(s1, 2) + Math.pow(s3, 2)) * 10) == Math.round(Math.pow(s2, 2) * 10)
                || Math.round((Math.pow(s3, 2) + Math.pow(s2, 2)) * 10) == Math.round(Math.pow(s1, 2) * 10);
    }

    /**
     * @param (p1x,p1y,p2x,p2y,p3x,p3y)
     * 
     * @return true if it is a equilateral triangle
     */

    public boolean equTri(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y) {

        // calcs sides
        double s1 = Math.sqrt(Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2));
        double s2 = Math.sqrt(Math.pow((p1x - p3x), 2) + Math.pow((p1y - p3y), 2));
        double s3 = Math.sqrt(Math.pow((p3x - p2x), 2) + Math.pow((p3y - p2y), 2));

        // for some reson i cant s1==s2==s3 ?
        return Math.round(s1) == Math.round(s2) && Math.round(s2) == Math.round(s3);
    }

    /**
     * @param (p1x,p1y,p2x,p2y,p3x,p3y)
     * 
     * @return true if it is a Isosceles triangle
     */

    public boolean isoTri(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y) {

        // calcs sides
        double s1 = Math.sqrt(Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2));
        double s2 = Math.sqrt(Math.pow((p1x - p3x), 2) + Math.pow((p1y - p3y), 2));
        double s3 = Math.sqrt(Math.pow((p3x - p2x), 2) + Math.pow((p3y - p2y), 2));

        // at least 2 sides are ==
        return s1 == s2 || s2 == s3 || s3 == s1;
    }

    /**
     * @param p1x,p1y,p2x,p2y,p3x,p3y,p4x,p4y
     * 
     * @return true if it is a square
     */

    public boolean square(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y, int p4x, int p4y) {

        // calcs sides
        double s1 = Math.sqrt(Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2));
        double s2 = Math.sqrt(Math.pow((p2x - p3x), 2) + Math.pow((p2y - p3y), 2));
        double s3 = Math.sqrt(Math.pow((p3x - p4x), 2) + Math.pow((p3y - p4y), 2));
        double s4 = Math.sqrt(Math.pow((p4x - p1x), 2) + Math.pow((p4y - p1y), 2));

        // all sides are rectangle triangles and sides are equ
        return (Math.round(s1) == Math.round(s2) && Math.round(s2) == Math.round(s3)
                && Math.round(s3) == Math.round(s4)) && rectTri(p1x, p1y, p2x, p2y, p3x, p3y)
                && rectTri(p2x, p2y, p3x, p3y, p4x, p4y) && rectTri(p3x, p3y, p4x, p4y, p1x, p1y)
                && rectTri(p4x, p4y, p1x, p1y, p2x, p2y);
    }

    /**
     * @param p1x,p1y,p2x,p2y,p3x,p3y,p4x,p4y
     * 
     * @return true if it is a rectange *NOTICE* -- squares are rectangles!!!
     */
    public boolean rectangle(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y, int p4x, int p4y) {

        // calcs sides
        double s1 = Math.sqrt(Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2));
        double s2 = Math.sqrt(Math.pow((p2x - p3x), 2) + Math.pow((p2y - p3y), 2));
        double s3 = Math.sqrt(Math.pow((p3x - p4x), 2) + Math.pow((p3y - p4y), 2));
        double s4 = Math.sqrt(Math.pow((p4x - p1x), 2) + Math.pow((p4y - p1y), 2));

        // all sides are rectangle triangles and sides are equ in paires of 2
        return (s1 == s3 && s2 == s4) && rectTri(p1x, p1y, p2x, p2y, p3x, p3y) && rectTri(p2x, p2y, p3x, p3y, p4x, p4y)
                && rectTri(p3x, p3y, p4x, p4y, p1x, p1y) && rectTri(p4x, p4y, p1x, p1y, p2x, p2y);
    }

    /**
     * @param p1x,p1y,p2x,p2y,p3x,p3y,p4x,p4y
     * 
     * @return true if it is a parralelogram
     */
    public boolean parral(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y, int p4x, int p4y) {

        // calcs sides
        double s1 = Math.sqrt(Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2));
        double s2 = Math.sqrt(Math.pow((p2x - p3x), 2) + Math.pow((p2y - p3y), 2));
        double s3 = Math.sqrt(Math.pow((p3x - p4x), 2) + Math.pow((p3y - p4y), 2));
        double s4 = Math.sqrt(Math.pow((p4x - p1x), 2) + Math.pow((p4y - p1y), 2));

        // all sides are equ in paires of 2
        return (s1 == s3 && s2 == s4);
    }

    /**
     * 
     * 
     * @param amount of sides the chape has (3 to 12)
     * @return name of the shape - if the shape isn't valid, will return " (sides) +
     *         '-gon' "
     */

    public String getName(int sides) {

        // checks for name
        if (sides == 3) {
            return "Triangle";
        } else if (sides == 4) {
            return "Quadrilateral";
        } else if (sides == 5) {
            return "Pentagon";
        } else if (sides == 6) {
            return "Hexagon";
        } else if (sides == 7) {
            return "Heptagon";
        } else if (sides == 8) {
            return "Octogon";
        } else if (sides == 9) {
            return "Nonagon";
        } else if (sides == 10) {
            return "Decagon";
        } else if (sides == 11) {
            return "Hendecagon";
        } else if (sides == 12) {
            return "Dodecagon";
        } else {
            return sides + "-gon";
        }
    }
}