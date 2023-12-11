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
//   <b>While-loops</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 09 While-loops.java -->
// <!-- slides/grundkurs/topic_009_While.java -->
//
//

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## While loops
//
//  Sometimes we want to run a part of a program over and over again:
//
//  - Number of guesses until the right number is found
//  - Physics simulation until the result is accurate enough
//  - Processing of user input in interactive programs
//
//  When we don't know the number of iterations upfront, we typically
//  use a while loop to do that.

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Terminating loops
//
// Sometimes it's easier to determine whether to terminate a loop inside the body
// rather than in the loop condition. With the `break` statement you can
// exit a loop early:

// %%

// %%

// %%

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Mini-Workshop: Guess the number
//
// - Write a program that generates a random number between 1 and 100
// - and lets the user guess until they have guessed the number.
// - After each attempt, the user should be shown whether the guessed number
//   was too big or too small.
// - Add a limit to the number of attempts in your program.
//   If the user guesses the number in less than 6 attempts, the message
//   `Well guessed!` should be output, otherwise `Badly guessed!`.


// %%

// %%

// %% [markdown] lang="en"
//
// - Add a limit to the number of attempts in your program.
//   If the user guesses the number in less than 6 attempts, the message
//   `Well guessed!` should be output, otherwise `Badly guessed!`.
// - Extend the program so that after the end of the game the number of
//   attempts required is output.


// %%

// %%

// %% [markdown] lang="en"
//
// - Extend the program so that the user can decide whether they want to play again.

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Mini-Workshop: Run an experiment
//
// - Write a program that runs an experiment
// - The experiment consists of generating a random number and checking
//   whether it is greater than 0.8.
// - If the experiment was successful, `Success!` should be output,
//   otherwise `Failure.`.
// - Run the experiment until it was successful.
// - Output the number of attempts required.
//

// %% tags=["slide"] slideshow={"slide_type": "slide"}

// %%

// %%
