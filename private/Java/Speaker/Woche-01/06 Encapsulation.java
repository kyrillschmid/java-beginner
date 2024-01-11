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
//   <b>Encapsulation</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 06 Encapsulation.java -->
// <!-- slides/grundkurs/topic_005_Sichtbarkeit.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Visibility of Instance Variables
//
// - Idea class: combine data and methods that belong together (encapsulation)
// - Data is stored in instance variables, methods access these variables
// - It is therefore important that the variables can be read and written (only) by the methods of the class
// - In Java there are four levels of visibility: `public`, `protected`, `package-private` (no keyword required) and `private`

// %% [markdown] lang="en"
//
// In Java, there are four levels of visibility: `public`, `protected`, `package-private` (no keyword needed), and `private`.

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### `public` Visibility
// `public` variables are accessible from anywhere in the program (other classes, other packages).

// %%
public class PublicExample {
    public int publicVar;
}

// %%
PublicExample p = new PublicExample();
p.publicVar;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### `private` Visibility
// `private` variables are accessible only within the class in which they are declared.

// %%
public class PrivateExample {
    private int privateVar;
}

// %%
PrivateExample p = new PrivateExample();
p.privateVar;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### `protected` Visibility
// `protected` variables are accessible within their own class, in all classes in the same package, and in all subclasses.

// %%
public class ProtectedExample {
    protected int protectedVar;
}

// %%
ProtectedExample p = new ProtectedExample();
p.protectedVar;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### Package-Private Visibility
// Variables without a visibility modifier are accessible only within their own package.

// %%
public class PackagePrivateExample {
    int packagePrivateVar;
}

// %%
PackagePrivateExample p = new PackagePrivateExample();
p.packagePrivateVar;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## `Getter` and `Setter` Methods
// - Instance variables should be `private` to ensure encapsulation
// - Access to the variables via `public` methods
// - `Getter` methods return the value of a variable

// %%
public class PrivateExample {
    private int privateVar;

    public int getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }
}

// %%
PrivateExample p = new PrivateExample();
p.setPrivateVar(42);
p.getPrivateVar();

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Workshop: Access Levels (Part 1)
//
// In this workshop, we will explore the different access levels (`public`, `private`, `protected`, `package-private`) using a practical example.

// %% [markdown] lang="en"
// Define a class `Car` with different access levels for its instance variables:
// - `public String brand` (Brand)
// - `protected int year` (Year)
// - `private String licensePlate` (License Plate)
// - Without access modifier: `int mileage` (Mileage)

// %%
public class Car {
    public String brand;
    protected int year;
    private String licensePlate;
    int mileage;

    // Constructor
    public Car(String brand, int year, String licensePlate, int mileage) {
        this.brand = brand;
        this.year = year;
        this.licensePlate = licensePlate;
        this.mileage = mileage;
    }

    // Getter
    public String getLicensePlate() {
        return licensePlate;
    }
}

// %% [markdown] lang="en"
// Create an instance of `Car` and experiment with accessing the different variables.

// %%
Car myCar = new Car("Volkswagen", 2020, "XYZ-1234", 5000);

// %%
System.out.println("Brand: " + myCar.brand);

// %%
System.out.println("Year: " + myCar.year);

// %%
System.out.println("License Plate: " + myCar.getLicensePlate());

// %%
System.out.println("Mileage: " + myCar.mileage);
