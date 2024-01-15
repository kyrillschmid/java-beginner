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
//   <b>Classes</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 05 Classes.java -->
// <!-- slides/grundkurs/topic_004_Klassen.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Custom data types
//
// Let us now turn to the definition of user-defined data types (classes):

// %%
public class PointV0 {

}

// %% [markdown] lang="en"
//
// Class names are in pascal case (i.e. capital letters separate components of
// names), e.g. `MyVerySpecialClass`.

// %% [markdown] lang="en"
//
// In the following we will use
// [Python Tutor](https://pythontutor.com/render.html#code=public%20class%20MyPoint%20%7B%0A%20%20%0A%20%20public%20static%20void%20main%28String%5B%5D%20args%29%7B%0A%20%20%7D%0A%7D&cumulative=false&curInstr=1&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false) to implement
// the `Point` class.

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Instances of user-defined classes are created by calling the class's
// constructor. Some functions can also be used without further implementation,
// e.g. `equals()`:

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
PointV0 p1 = new PointV0();
p1

// %%
PointV0 p2 = new PointV0();
p1.equals(p2)

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// So far our class has no attributes and no methods

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// If we want to extend the `Point` class with attributes, we can simply
// specify them in the class definition:

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
public class MyPoint {
    double x;
    double y;
}

// %%
MyPoint p1 = new MyPoint();
MyPoint p2 = new MyPoint();

// %% tags=["keep"]
void printPoint(MyPoint p) {
    System.out.println("(" + p.x + ", " + p.y + ")");
}

// %%
printPoint(p1);
printPoint(p2);

// %%
p1.equals(p2);

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// The values of attributes can be changed:

// %%
p1.x = 1.0;
p1.y = 2.0;
printPoint(p1);
printPoint(p2);


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Constructor
//
// In many cases, when constructing an object, we would like to specify the attributes
// of the instance. This is possible by defining a constructor that takes additional
// arguments.

// %% tags=["alt"]
public class MyPoint {
    double x;
    double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

// %%
MyPoint p1 = new MyPoint(1.0, 2.0);
MyPoint p2 = new MyPoint(3.0, 4.0);
printPoint(p1);
printPoint(p2);

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// A class can have multiple constructors that differ in the number and type of
// arguments. Java chooses the appropriate constructor based on the arguments.

// %% tags=["alt"]
public class MyPoint {
    double x;
    double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(double x) {
        this.x = x;
        this.y = 0.0;
    }
}

// %%
MyPoint p1 = new MyPoint(1.0, 2.0);
MyPoint p2 = new MyPoint(3.0);
printPoint(p1);
printPoint(p2);

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Mini Workshop: Motor Vehicles (Part 1)
//
// Define a class `MotorVehicle` whose instances describe motor vehicles.
// Every car should have attributes `manufacturer` and `license_plate`.


// %% lang="en"
public class MotorVehicle {
    String manufacturer;
    String license_plate;

    public MotorVehicle(String manufacturer, String license_plate) {
        this.manufacturer = manufacturer;
        this.license_plate = license_plate;
    }
}

// %% [markdown] lang="en"
// Create two motor vehicles:
// - a BMW with license plate "M-BW 123"
// - a VW with license plate "WOB-VW 246"
// and store them in variables `bmw` and `vw`

// %% lang="en"
MotorVehicle bmw_en = new MotorVehicle("BMW", "M-BW 123");
MotorVehicle vw_en = new MotorVehicle("VW", "WOB-VW 246");

// %% [markdown] lang="en"
// Create a new instance of `MotorVehicle` with manufacturer BMW and registration number
// "M-BW 123" and store it in a variable `bmw2`.

// %% lang="en"
MotorVehicle bmw2_en = new MotorVehicle("BMW", "M-BW 123")

// %% [markdown] lang="en"
//
// How can you determine whether `bmw` and `bmw2` (or `bmw` and `vw`) describe
// the same vehicle?

// %% lang="en"
bmw_en.manufacturer.equals(bmw2_en.manufacturer) && bmw_en.license_plate.equals(bmw2_en.license_plate)
