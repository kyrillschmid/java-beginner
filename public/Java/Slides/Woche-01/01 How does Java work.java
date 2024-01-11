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
//   <b>How does Java work?</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 01 How does Java work.java -->
// <!-- slides/grundkurs/topic_000_Funktionsweise.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// # Introduction
// We answer the following questions:
// - How is Java code executed?
// - What development environments are there?
// - How do you work with notebooks?

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// # How does Java work?

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
// <img src="img/java_compilation.png" width="600">

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # First Java Program

// %% tags=["keep"]
public class HelloJava{
    public static void main(String[] args){
        System.out.println("Hallo Welt!");
    } 
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Compiling with javac
// ```bash
// - javac HelloJava.java
// ```

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Running with java
// ```bash
// - java HelloJava
// ```

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Development environments:
// - IntelliJ
// - Eclipse
// - Netbeans
// - Visual Studio Code

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// # Mini-Workshop: Running Java
//
// 1. Save the code below in the file ```Factorial.java``` in your local working directory.
// 1. Compile and run with ```javac Factorial.java``` and ```java Factorial```.

// %% tags=["keep"]
public class Factorial {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("ERR missing input");
            return;
        }

        final var n = Integer.parseInt(args[0]);
        final var fac = factorialUsingRecursion(n);
        System.out.println(fac);
    }

    static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }
}

// %%
Factorial.main(new String[]{"5"});

