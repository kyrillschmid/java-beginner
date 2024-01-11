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
//   <b>Control Structures</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 08 Control Structures.java -->
// <!-- slides/grundkurs/topic_007_Kontrollstrukturen_If.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## `if` statements
//
// - We want to write a program that determines if a number is a lucky number or not:
//     - 7 is a lucky number
//     - all other numbers are not.
// - We need the `if` statement for this:

// %% tags=["subslide"] lang="en" slideshow={"slide_type": "subslide"}

// %% lang="en"

// %% lang="en"


// %% lang="en" tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
void isLuckyNumber(int number){
    System.out.println("Is " + number + " a lucky number?");

    if (number == 7){
        System.out.println("Yes!");
    } else {
        System.out.println("Unfortunately no.");
    }

    System.out.println("We wish you all the best.");
}

// %% lang="en" tags=["keep"]
isLuckyNumber(1)

// %% lang="en" tags=["keep"]
isLuckyNumber(7)


// %% lang="en" tags=["subslide", "keep"] slideshow={"slide_type": "subslide"}
void isLuckyNumber2(int number){
    if (number == 7){
        System.out.println(number + " is a lucky number!");
        System.out.println("You must be having a great day!");
    } else {
        System.out.println(number + " is unfortunately not a lucky number.");
        System.out.println("Maybe you should stay in bed today.");
        System.out.println("We wish you all the best anyway.");
    }
}

// %% lang="en" tags=["keep"]
isLuckyNumber2(1)

// %% lang="en" tags=["keep"]
isLuckyNumber2(7)

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Structure of an `if` statement (incomplete):
// ```java
// if (<condition>){
//     body that is executed if <condition> is true
// } else {
//     body that is executed if <condition> is false
// }
// ```
// - Only the `if` and the first body are necessary

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Mini workshop: Adult

// %% [markdown] lang="en"
//
// Write a function `printOfAge(int age)` that prints `of age` on the screen if
// `age >= 18` and `minor` otherwise.

// %% lang="en"

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Test `printOfAge(int age)` with the values 17 and 18.

// %% lang="en"
// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Mini-Workshop: Even number

// %% [markdown] lang="en"
//
// Write a function `isEven(int number)` that returns `true`,
// if `number` is even and `false` if `number` is odd.

// %% lang="en"

// %% tags=["keep"]
// %maven org.junit.jupiter:junit-jupiter-api:5.8.2
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Write assertions that check that `is_even()` returns the correct result
// for arguments 0, 1 and 8.

// %% lang="en"


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Write a function `printIsEven(int number)` that
//
// - prints `{number} is even.` on the screen if `number` is even and
// - Prints `{number} is odd.` to the screen if `number` is not
//   is straight.
//
// Use the `isEven()` function to check if `number` is even.

// %% lang="en"

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Test `printIsEven(int number)` with the values 0, 1 and 8.

// %% lang="en"
// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Mini-Workshop: Shortened output


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Write a function `fitsInLine(String text, int lineLength)`,
// that returns `true` or `false` depending on whether the string `text`
// can be printed in a line of length `line_length`:
// ```java
// >>> fitsInLine("Hello", 72)
// true
// >>> fitsInLine("Hello", 3)
// false
// ```
//
// *Hint:* You can determine the length of a string with the function `length()`:
// ```java
// >>> "abcd".length()
// 4
// ```

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%

// %%


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// Write a function `printLine(String text, int lineLength)`,
// that
// * prints `text` on the screen, if that is possible in a line of length
//   `lineLength`
// * prints `...` if that is not possible.
//
// ```java
// >>> printLine("Hello", 72)
// Hello
// >>> printLine("Hello", 3)
// ...
// >>>
// ```

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%

// %%
