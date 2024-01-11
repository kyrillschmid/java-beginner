// -*- coding: utf-8 -*-
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
//   <b>Abstract classes</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Abstract classes.java -->
// <!-- slides/module_111_classes/topic_200_abstract_classes.java -->


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
//
// - We had the following class hierarchy in an exercise on inheritance:

// %% tags=["keep"]
class Employee {
 
}

// %% tags=["keep"]
class Manager extends Employee {
 
}

// %% tags=["keep"]
class Worker extends Employee {
 
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// - `Employee` only serves to define the common behavior of `Manager` and `Worker`
// - It should be impossible to create instances of `Employee`
// - At the moment this is possible

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Abstract classes
//
// - Classes that cannot have direct instances
// - Have `abstract` keyword in Java
// - Allow use of the `abstract` keyword before methods to define abstract methods

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### The abstract `Employee` class

// %%
abstract class Employee {
    abstract double salary();
}

// %%
// Employee e = new Employee();

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### The `Manager` and `Worker` classes

// %% tags=["alt"]
class Manager extends Employee {
    @Override
    double salary() {
        return 100_000.0;
    }
}

// %%
Manager m = new Manager();
System.out.println(m);

// %%
System.out.println(m.salary());


// %% tags=["slide", "keep"] slideshow={"slide_type": "slide"}
class Worker extends Employee {
    @Override
    double salary() {
        return 50_000.0;
    }
}


// %%
Worker w = new Worker();
System.out.println(w);

// %%
System.out.println(w.salary());

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### The `Company` class
//
// - We define a class that manages a list of `Employee` objects

// %% tags=["alt"]
class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    double monthlyExpenses() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.salary();
        }
        return total;
    }
}

// %%
Company c = new Company(new Employee[]{m, w});
c;

// %%
c.monthlyExpenses();

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// - Abstract methods can provide an implementation
// - Classes that inherit from an abstract class but do not override all abstract
//   methods are themselves abstract.

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
abstract class MyBase {
    void myMethod() {
        System.out.println("Hi!");
    }
}


// %%
abstract class MyClass extends MyBase {
    // Some code here
}


// %%
// MyClass mc = new MyClass();


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
class YourClass extends MyBase {
    @Override
    void myMethod() {
        super.myMethod();
        System.out.println("Hello!");
    }
}


// %%
YourClass yc = new YourClass();
yc.myMethod();

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Workshop: Shapes
//
// In this workshop, you will implement geometric shape classes using abstract
// classes.
//
// - Create a base class called `Shape` with abstract
//   methods for calculating area and perimeter.
// - Create concrete subclasses for rectangles and circles that inherit from the
//  `Shape` class and implement the abstract methods.
// - Test your implementation with different dimensions.

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### Notes
//
// - You can use the `Math` class for the value of π.
// - The area of a rectangle is calculated as `width * height`, its perimeter is
//   `2 * (width + height)`.
// - The area of a circle is calculated as `π * radius ^ 2`, its perimeter is
//   `2 * π * radius`.

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
// import java.lang.Math;

// %% tags=["alt"]
public abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

// %% tags=["alt"]
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle width=" + width + ", height=" + height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

// %% tags=["alt"]
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle radius=" + radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// %% tags=["alt"]
Rectangle rectangle = new Rectangle(4, 5);

// %% tags=["alt"]
rectangle.area() == 20;

// %% tags=["alt"]
rectangle.perimeter() == 18;

// %% tags=["alt"]
Circle circle = new Circle(3);

// %% tags=["alt"]
circle.area();

// %% tags=["alt"]
circle.perimeter();

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### Bonus Tasks:
//
// - Feel free to extend the workshop by creating additional shape classes like
//   `Triangle`, inheriting from `Shape` and implementing their respective
//   methods.
// - Create a class Drawing that stores a list of shapes and implements methods for
//   calculating the total area and perimeter of all shapes in the drawing (assuming
//   they don't overlap).


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getBase() {
        return a;
    }

    public double getHeight() {
        return 0.5 / a * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
    }

    public String toString() {
        return "Triangle(a=" + a + ", b=" + b + ", c=" + c + ")";
    }

    public double area() {
        return 0.5 * getBase() * getHeight();
    }

    public double perimeter() {
        return a + b + c;
    }
}

// %% tags=["alt"]
Triangle triangle = new Triangle(3, 4, 5);

// %% tags=["alt"]
triangle.area() == 6;

// %% tags=["alt"]
triangle.perimeter() == 12;


// %% tags=["alt"]
public class Drawing {
    private List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = new ArrayList<>(shapes);
    }

    public double getTotalArea() {
        return shapes.stream().mapToDouble(Shape::area).sum();
    }

    public double getTotalPerimeter() {
        return shapes.stream().mapToDouble(Shape::perimeter).sum();
    }
}

// %% tags=["alt"]
Drawing drawing = new Drawing(Arrays.asList(rectangle, circle, triangle));

// %% tags=["alt"]
Math.abs(drawing.getTotalArea() - rectangle.area() - circle.area() - triangle.area()) < 1e-4;;

// %% tags=["alt"]
Math.abs(drawing.getTotalPerimeter() - rectangle.perimeter() - circle.perimeter() - triangle.perimeter()) < 1e-4;
