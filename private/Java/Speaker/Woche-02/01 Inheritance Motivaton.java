// ---
// jupyter:
//   jupytext:
//     text_representation:
//       extension: .java
//       format_name: percent
//       format_version: '1.3'
//       jupytext_version: 1.15.2
//   kernelspec:
//     display_name: Java
//     language: java
//     name: java
// ---

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//
// <div style="text-align:center; font-size:200%;">
//   <b>Inheritance: Motivaton</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 01 Inheritance Motivaton.java -->
// <!-- slides/module_111_classes/topic_190_inheritance_intro.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Motivation for Inheritance
//
// We have implemented the following class:

// %% tags=["keep"]
import java.util.Random;

// %% tags=["keep"]
public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void randomize() {
        Random r = new Random();
        this.x = r.nextGaussian();
        this.y = r.nextGaussian();
    }

    public String toString() {
        return "Point: x = " + this.x + ", y = " + this.y;
    }
}

// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
Point p = new Point(2, 3);
p

// %% tags=["keep"]
p.move(2, 3);
p

// %% tags=["keep"]
p.randomize();
p

// %% tags=["keep"]
List<Point> buildRectangle(Point leftLower, Point rightUpper) {
    List<Point> rectangle = List.of(leftLower, rightUpper);
    return rectangle;
}

// %% tags=["keep"]
buildRectangle(new Point(0, 0), new Point(1, 1))

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// How can we introduce colored points?


// %% tags=["alt"]
public class ColorPoint {
    public double x;
    public double y;
    public String color;

    public ColorPoint(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void randomize() {
        Random r = new Random();
        this.x = r.nextGaussian();
        this.y = r.nextGaussian();
    }

    public String toString() {
        return "ColorPoint: x = " + this.x + ", y = " + this.y + ", color = " + this.color;
    }
}

// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
ColorPoint cp = new ColorPoint(2, 3, "black");
cp

// %% tags=["keep"]
cp.color = "red"

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
cp.move(2, 3);
cp

// %% tags=["keep"]
cp.randomize();
cp

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Problems
//
// - Code duplication
// - The Java type system does not know that `ColorPoint` is a `Point`:

// %% tags=["keep"]
Point point = new Point(0, 0);
if (point instanceof Point) {
    System.out.println("Point ist ein Point");
} else {
    System.out.println("Point ist kein Point");
}

// %% tags=["keep"]
// Compile error
/* ColorPoint point = new ColorPoint(0, 0, "red");
if (point instanceof Point) {
    System.out.println("Point ist ein Point");
} else {
    System.out.println("Point ist kein Point");
} */

// %% tags=["keep"]
buildRectangle(new ColorPoint(0, 0, "black"), new ColorPoint(1, 1, "black"))


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## What solutions are there?
//
// - Inheritance: `ColorPoint` inherits from `Point`
// - Interfaces: `ColorPoint` and `Point` implement the same Interface
//
// Result: Subtype (or consistency) relationship
