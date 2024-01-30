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
//   <b>JShell</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 10 JShell.java -->
// <!-- slides/module_113_tools/topic_002_jshell.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Context before `jshell`

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// * Java is an object-oriented, statically typed and strictly typed programming language.
// * Some languages on the JVM have introduced dynamic concepts.
// * All JVM languages are based on the concept
//   1. Write code.
//   1. Compile with `javac`.
//   1. Run with `java`.
//
// ![Javac process](img/classic-javac-process.png "javac Prozess")

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Dynamics lead to `jshell`
//
// * The support for dynamic elements in the JVM leads to
//   * a REPL (Read-Evaluate-Print Loop)
// * REPLs are now common in many other programming languages.
// * The Java kernel of `jupyter` uses `jshell` intensively.

// %% tags=["keep"]
var ersterWert = "eins";
var zweiterWert = "zwei";
var ergebnis = ersterWert + " " + zweiterWert;
ergebnis

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Using `jshell`
//
// * In the jshell no class has to be created.
// * The last expression in a REPL line is output.

// %% tags=["keep"]
var ersterWert = "eins";
var zweiterWert = "zwei";
var ergebnis = ersterWert + " " + zweiterWert;
System.out.println(ergebnis);
ergebnis

// %% tags=["keep"]
public class Abc {
    public Abc() {
        System.out.println("Hi");
    }
}
new Abc();

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## `jshell` features
// * Semicolon at the end of a line is (partly) optional.
// * No need to care about exceptions.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Useful `jshell` commands
// * `/vars` - shows all variables
// * `/methods` - shows all methods
// * `/!` - shows all previous commands

// %% [markdown] tags=["notes"] slideshow={"slide_type": "notes"}
// <div style='background:yellow'>
// # `jshell` Konsole
//
// 1. open jshell in console
// 2. enter some expressions
// 3. use cells in jupyter
// </div>
