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
//   <b>Methods</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 07 Methods.java -->
// <!-- slides/grundkurs/topic_006_Methoden.java -->


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Methods
//
// - Classes can contain methods.
// - Methods are functions that "belong to an object".
// - Methods are called using "dot-notation": `myObject.method()`.

// %% tags=["keep"]
public class MyClass {
    public void method() {
        System.out.println("Called method on " + this);
    }
}


// %% tags=["keep"]
MyClass myObject = new MyClass();
myObject.method();
System.out.println(myObject);

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// We can add a method to move a point to our `Point` class:

// %% tags=["alt"]
class Point {
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
}

// %% tags=["keep"]
void printPoint(Point p) {
    System.out.println("Point: x = " + p.x + ", y = " + p.y);
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
Point p = new Point(2, 3);
printPoint(p)

// %%
p.move(3, 5);
printPoint(p)

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## The keyword `this`
//
// - The keyword `this` refers to the current object on which the method is called
// - It can be used to reference attributes and methods of the current object

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// For the moment: The use of this:
// - `this`: refers to the current object
// - `this.variable`: accesses instance variable of the current object
// - `this.variable = variable` : sets the value of the instance variable to the value of the local variable or parameter

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Mini-Workshop: Motor Vehicles (Part 2)
//
// In Part 1 we defined the following class `MotorVehicle`:
//
// ```java
// public class MotiveVehicle{
//
//     public String manufacturer;
//     public String licensePlate;
//
//     public MotiveVehicle(String hersteller, String kennzeichen){
//         this.manufacturer = manufacturer
//         this.licensePlate = licensePlate
//         }
// }
// ```


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Extend the `MotorVehicle` class with a method
// `changeRegistration(String newLicensePlate)`,
// which changes the vehicle's license plate.


// %% lang="en" tags=["alt"]
public class MotorVehicle {

    public String manufacturer;
    public String licensePlate;

    public MotorVehicle(String manufacturer, String licensePlate){
        this.manufacturer = manufacturer
        this.licensePlate = licensePlate
        }

    public void changeRegistration(String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// We can use the following function to print vehicles:


// %% lang="en" tags=["keep"]
void printMotorVehicle(MotorVehicle vehicle) {
    System.out.println(
        "Motor vehicle: " + vehicle.manufacturer + " "
        "with license plate " + vehicle.licensePlate
    );
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// We can then again create the following instances:

// %% lang="en" tags=["keep"]
MotiveVehicle bmw_en = new MotiveVehicle("BMW", "M-BW 123");
MotiveVehicle bmw2_en = new MotiveVehicle("BMW", "M-BW 123");
MotiveVehicle vw_en = new MotiveVehicle("VW", "WOB-VW 246");

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Change the registration of the VW generated above so that it has the new
// license plate  "BGL-A 9". How can you tell if changing the registration
// resulted in the change you wanted?

// %% lang="en"
vw_en.changeRegistration("BGL-A 9")

// %% lang="en"
printMotorVehicle(vw_en)

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Change the registration of the BMW saved in `bmw` (to the new registration
// number "F-B 21"). Does the change affect the car saved in `bmw2`?

// %% lang="en"
bmw_en.changeRegistration("F-B 21")

// %% lang="en"
printMotorVehicle(bmw_en);
printMotorVehicle(bmw2_en)
