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
//   <b>Inheritance</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 02 Inheritance.java -->
// <!-- slides/module_111_classes/topic_192_inheritance.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Inheritance
//
// We have implemented the following class:

// %% tags=["keep"]
import java.util.Random;


// %% tags=["keep"]
public class Point {
    double x;
    double y;
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    void randomize(){
        Random random = new Random();
        x = 2 + 0.5 * random.nextGaussian();
        y = 3 + 0.5 * random.nextGaussian();
    }
}


// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
Point p = new Point(1, 1);
p

// %% tags=["keep"]
p.move(2, 3);
p

// %% tags=["keep"]
p.randomize();
p


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// How can we introduce colored points without having to re-implement the
// entire functionality of `Point`?


// %%


// %% tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
ColorPoint cp = new ColorPoint(2, 3, "black");
cp


// %% tags=["keep"]
System.out.println(cp.x == 2.0);
System.out.println(cp.y == 3.0);
System.out.println(cp.color.equals("black"));

// %% tags=["keep"]
cp.color = "red";

// %% tags=["keep"]
System.out.println(cp.x == 2.0);
System.out.println(cp.y == 3.0);
System.out.println(cp.color.equals("red"));

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
cp.move(2, 3);
cp

// %% tags=["keep"]
System.out.println(cp.x == 4.0);
System.out.println(cp.y == 6.0);
System.out.println(cp.color.equals("black"));

// %% tags=["keep"]
cp.randomize();
cp

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Workshop: Employees
//
// In the following we will implement a class hierarchy for employees of a company:
//
// - Employees can be either workers or managers
// - Each employee of the company has a name, a personnel number and a
//   base salary
// - For each worker, the accumulated overtime and the hourly wage
//   are stored in attributes.
// - A worker's salary is calculated as 13/12 times the
//   base salary plus overtime pay
// - Each manager has an individual bonus
// - A manager's salary is calculated as 13/12 times the
//   base salary plus bonus
//
// Implement Java classes `Employee`, `Worker` and `Manager` with
// appropriate attributes and a method `salary()` that calculates the salary.

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%

// %%

// %% [markdown]
// Create a worker named Hans, personnel number 123, a base salary of
// 36000.0 Euros, who worked 3.5 hours of overtime at 40.0 euros each.
// Print out the salary.

// %%

// %% [markdown]
// Assert statements to test the functionality of the class `Worker`.

// %%

// %% [markdown] lang="en"
// Create a manager named Sepp, personnel number 834, who is a
// base salary of 60000.0 euros and a bonus of 30000.0 euros. Print out
// the salary.

// %%

// %% [markdown] lang="en"
// Test the functionality of the class `Manager`.

// %%


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// A visualization for `super()` calls in inheritance with Java Tutor is
// [here](shorturl.at/efDKW).

