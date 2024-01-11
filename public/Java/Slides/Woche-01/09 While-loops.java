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
//   <b>While-loops</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 09 While-loops.java -->
// <!-- slides/grundkurs/topic_008_While.java -->
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
void rocketLaunch(int countdown) {
    System.out.println("Welcome to the Rocket Launch Countdown Simulator!");
    while (countdown > 0) {
        System.out.printf("Rocket launches in %d seconds...%n", countdown);
        countdown -= 1;
    }
    System.out.println("Liftoff! 🚀");
}

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
rocketLaunch(10)

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Terminating loops
//
// Sometimes it's easier to determine whether to terminate a loop inside the body
// rather than in the loop condition. With the `break` statement you can
// exit a loop early:

// %%
int i = 1;
while (i < 10) {
    System.out.println(i);
    if (i % 3 == 0) {
        break;
    }
    i += 1;
}
System.out.printf("After the loop: %d%n", i);

// %%
import java.util.Scanner; 
Scanner s = new Scanner(System.in);

// %%
void annoyUser() {
    while (true) {
        System.out.print("Say hi: "); 
        String text = s.next(); 
        if (text.toLowerCase().equals("hi")) {
            break;
        } else {
            System.out.printf("You chose %s%n", text);
        }
    }
}

// %%
// annoyUser()

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
import java.util.Random;
import java.util.Scanner; 
Scanner s = new Scanner(System.in);

void guessNumber() {
    Random random = new Random();
    int solution = random.nextInt(100) + 1;
    System.out.println("Welcome to the number guessing game!");
    System.out.println("I have thought of a number between 1 and 100. Try to guess it!");
    while (true) {
        System.out.print("Please enter a number: "); 
        String text = s.next(); 
        int guess = Integer.parseInt(text);
        if (guess < solution) {
            System.out.println("Too low!");
        } else if (guess > solution) {
            System.out.println("Too high!");
        } else {
            System.out.println("Congratulations! You guessed the number!");
            break;
        }
    }
}

// %%
guessNumber()

// %% [markdown] lang="en"
//
// - Add a limit to the number of attempts in your program.
//   If the user guesses the number in less than 6 attempts, the message
//   `Well guessed!` should be output, otherwise `Badly guessed!`.
// - Extend the program so that after the end of the game the number of
//   attempts required is output.


// %%
void guessNumber() {
    Random random = new Random();
    int solution = random.nextInt(100) + 1;
    System.out.println("Welcome to the number guessing game!");
    System.out.println("I have thought of a number between 1 and 100. Try to guess it!");
    int tries = 0;
    while (tries < 6) {
        System.out.print("Please enter a number: ");
        String text = s.next();
        int guess = Integer.parseInt(text);
        if (guess < solution) {
            System.out.println("Too low!");
        } else if (guess > solution) {
            System.out.println("Too high!");
        } else {
            System.out.println("Congratulations! You guessed the number!");
            break;
        }
        tries += 1;
    }
    if (tries < 6) {
        System.out.println("Well guessed!");
    } else {
        System.out.println("Badly guessed!");
    }
}

// %%
guessNumber()

// %% [markdown] lang="en"
//
// - Extend the program so that the user can decide whether they want to play again.

// %%
void guessNumber() {
    Random random = new Random();
    int solution = random.nextInt(100) + 1;
    System.out.println("Welcome to the number guessing game!");
    System.out.println("I have thought of a number between 1 and 100. Try to guess it!");
    while (true) {
        int tries = 0;
        while (tries < 6) {
            System.out.print("Please enter a number: ");
            String text = s.next();
            int guess = Integer.parseInt(text);
            if (guess < solution) {
                System.out.println("Too low!");
            } else if (guess > solution) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                break;
            }
            tries += 1;
        }
        if (tries < 6) {
            System.out.println("Well guessed!");
        } else {
            System.out.println("Badly guessed!");
        }
        System.out.print("Do you want to play again? (y/n) ");
        String again = s.next();
        if (!again.equals("y")) {
            break;
        }
    }
}

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
import java.util.Random;

// %%
void runExperiment() {
    Random random = new Random();
    int attempts = 0;
    while (true) {
        attempts++;
        double number = random.nextDouble();
        System.out.print("Attempt " + attempts + ": ");
        if (number > 0.8) {
            System.out.println("Success!");
            break;
        } else {
            System.out.println("Failure.");
        }
    }
}

// %%
runExperiment()
