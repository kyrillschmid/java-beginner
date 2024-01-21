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
//   <b>Anonymous Classes</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Anonymous Classes.java -->
// <!-- slides/module_111_classes/topic_500_anonymous_classes.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Anonymous classes
// - Enable you to declare and instantiate a class at the same time. 
// - They are like local classes except that they do not have a name.
// - Use them if you need to use a local class only once.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## This notebook covers the following topics:
// - Declaring Anonymous Classes
// - Syntax of Anonymous Classes
// - Accessing Local Variables of the Enclosing Scope, and Declaring and Accessing Members of the Anonymous Class
// - Examples of Anonymous Classes

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Declaring Anonymous Classes
// - While local classes are class declarations, anonymous classes are expressions, which means that you define the class in another expression.

// %% tags=["keep"]
interface HelloWorld {
    public void greet();
    public void greetSomeone(String someone);
}

// %% tags=["start"]
class EnglishGreeting implements HelloWorld {
}

// %%

// %% tags=["slide"] slideshow={"slide_type": "slide"}

// %% tags=["slide", "keep"] slideshow={"slide_type": "slide"}
HelloWorld spanishGreeting = new HelloWorld() {
    String name = "mundo";
    public void greet() {
        greetSomeone("mundo");
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hola, " + name);
    }
};

// %%

// %%


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Syntax of Anonymous Classes
// - As mentioned previously, an anonymous class is an expression. 
// - The syntax of an anonymous class expression is like the invocation of a constructor, except that there is a class definition contained in a block of code.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - The anonymous class expression consists of the following:
//     - The `new` operator
//     - The name of an interface to implement or a class to extend. In this example, the anonymous class is implementing the interface HelloWorld.
//     - Parentheses that contain the arguments to a constructor, just like a normal class instance creation expression (not needed with interfaces)
//     - A body, which is a class declaration body. More specifically, in the body, method declarations are allowed but statements are not. 


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Accessing Local Variables of the Enclosing Scope
// - Like local classes, anonymous classes can capture variables
// - They have the same access to local variables of the enclosing scope.

// %% [markdown] lang="en" tags=["slide"
// Anonymous classes in Java have the ability to access variables from their enclosing scope.
// - Local Variables: Anonymous classes can access final or effectively final local variables. A local variable is effectively final if its value is not changed after initialization.
// - Instance Variables: Anonymous classes can freely access instance variables of the enclosing class.


// %% tags=["keep"]
public class OuterClass {

    private int instanceVariable = 10; // Instance variable

    public void method() {
        int localVariable = 5; // Local variable (effectively final)

        // Anonymous class implementing Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // Accessing instance variable
                System.out.println("Instance variable: " + instanceVariable);

                // Accessing local variable
                System.out.println("Local variable: " + localVariable);
            }
        };

        runnable.run();
    }
}

// %%


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// You can declare the following in anonymous classes:
// - Fields
// - Extra methods (even if they do not implement any methods of the supertype)
// - Instance initializers
// - Local classes
// - However, you cannot declare constructors in an anonymous class.


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Examples of Anonymous Classes
// - Anonymous classes are often used in graphical user interface (GUI) applications.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Mini-Workshop: Music Player
//
// In the following we will implement a functional music player using Anonymous Classes.
//
// - We would have an interface `MusicPlayer` with a method `play()`.
// - A local class `RockMusic` will implement the `MusicPlayer` interface.
// - We'll then use Anonymous Classes to implement other types of music: Classical and Jazz.
//
// Let's start implementing our music player!

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - First implement the `MusicPlayer` interface with a method `play()`.

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Now let's implement the interface with a local class for Rock music

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Let's play some rock music by creating an instance of the `RockMusic` class and calling the `play()` method.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Our rock music player is working perfectly. Now let's use anonymous classes to create players for other types of music.
// - Implement the `MusicPlayer` interface using an anonymous class for Classical music:

// %%

// %% [markdown]
// - Now let's create a Jazz music player using an anonymous class.

// %%

