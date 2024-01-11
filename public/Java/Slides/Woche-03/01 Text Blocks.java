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
//   <b>Text Blocks</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 01 Text Blocks.java -->
// <!-- slides/module_160_strings/topic_110_text_blocks.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// * Java supports many character sets using UTF encoding.
// * Multiline strings are not intuitive and more difficult to code.
// * The text block feature brings several simplifications here.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// Motivation: What did it look like before text block?

// %% tags=["keep"]
var stringMitPunkt = "Das ist ein Punkt \u2022.";
stringMitPunkt += "\nUnd hier die zweite Zeile";

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Text Blocks
// - Text blocks are a means to easily write multiline strings
// - No need for cumbersome concatenation and escaping of special characters

// %%
"""
- This is a text block.
- It can contain multiple lines.
- It is delimited by three double quotes.
""" 

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Indentation
// - The closing three double quotes define the indentation of the text block
// - If no indentation is desired, the closing three double quotes should be on the same line as the opening three double quotes:

// %% tags=["keep"]
var block = """
          | This is a text block.
          |   The lines are indented...
          |     according to the indentation of the closing three double quotes.
          """;
block

// %% tags=["keep"]
"""
    - This is a text block.
    - It can contain multiple lines.
    - It is delimited by three double quotes.""" 

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// Before Text Blocks were introduced, we had to write:

// %% tags=["keep"]
String code = "function helloWorld{} \n" +
              "  print(\"Hello World!\"); \n" +
              "}\n" + 
              "helloWorld();";

// %%
code

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// Now, we can write:

// %%
String code = """
              function helloWorld{} 
                print("Hello World!"); 
              }
              helloWorld();""";

// %%
code

// %% tags=["keep"]
var helloWorldOld = "<html>\n" +
                    "  <body>\n" +
                    "    <h1>Hello World!</h1>\n" +
                    "  </body>\n" +
                    "</html>";

// %% tags=["keep"]
var helloWorldNew = """
                    <html>
                      <body>
                        <h1>Hello World!</h1>
                      </body>
                    </html>""";


// %%
String sql = """
             SELECT * FROM users
             WHERE name = "John"
             """;

// %% tags=["keep"]
"""This will result in an error 
because there is a character after the opening three double quotes"""


// %%
""" 
Text-Blocks can contain triple quotes: """

// %%
String text = "This is a very long text that is split " +
              "over multiple lines " +
              " to improve readability.";

// %%

// %%
String text = """
              This is a very long text that is split 
              over multiple lines 
              to improve readability.
              """;

// %%

// %%
String text = """
              This is a very long text that is split \
              over multiple lines \
              to improve readability.
              """;

// %%

// %%
"""
    Whitespace at the end of a line is removed.     """
// %%
String text = """
              Max    \s
              Mustermann
              """;

// %%

// %% tags=["keep"]
"""
    Maximilian\s
    Paul      \s
    Mary      \s
    """

// %%
"""
    Maximilian
    Paul     \s
    Mary     \s
    """

// %%
String template = """
                  Hello %s,
                  How are you today?
                  """;

// %%
String name = "Max";
String greeting = String.format(template, name);

// %%
greeting

// %%
String template = """
                  Hello %s,
                  How are you today?
                  """.formatted(name);
template

// %%
String json = """
              {
                "name": "Max",
                "age": 30
              }
              """;
json 

// %% tags=["keep"]
long zähleSubstringVorkommnisse(String text, String substring) {
    int idx = 0;
    long counter = 0;
    while ((idx = text.indexOf(substring, idx + substring.length())) > 0) {
        counter++;
    }
    return counter;
}

// %%
zähleSubstringVorkommnisse("Dann sagt er, dann sagt sie, dann sagen wir alle.", "sag")

// %% tags=["keep"]
var zitat = """
Von Johann Wolfgang von Goethe:
"Wichtige Dinge dürfen nie den unwichtigen untergeordnet werden".
""";

// %% tags=["keep"]
System.out.println("--\n" + zitat + "--");

// %% tags=["keep"]
"Das Zitat enthält %s Line Feeds (erwartet 2)".formatted(zähleSubstringVorkommnisse(zitat, "\n"));


// %% tags=["keep"]
"Das Zitat enthält %s Carriage Returns (erwartet 0)".formatted(zähleSubstringVorkommnisse(zitat, "\r"));


// %% tags=["keep"]
"Das Zitat enthält %s Carriage Return + Line Feed (erwartet 0)".formatted(zähleSubstringVorkommnisse(zitat, "\r\n"));


// %%
String html = "<html>\n" +
              "  <body>\n" +
              "    <h1>Hello, World!</h1>\n" +
              "  </body>\n" +
              "</html>";

// %%
html

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// Remove indentation and make sure all lines have the same length in the following text-block:

// %%
String html = """
                There are many variations of passages of Lorem Ipsum available,
                but the majority have suffered alteration in some form, by injected humour,
                or randomised words which don't look even slightly believable.
              """;

// %%
String umrandeInhalt(String str){
    return Arrays.stream(str.split("\n")).map(zeile -> "|" + zeile + "|").reduce("", (a, b) -> a + "\n" + b);
}

// %% tags=["keep"]
umrandeInhalt("Hallo Welt.");

// %% tags=["keep"]
umrandeInhalt("""
          Hallo Welt.
          Mit einer zweiten Zeile."""
);

// %%
umrandeInhalt("""
   Hallo
      Welt.
""");

// %%
umrandeInhalt("""
   Hallo
      Welt.
         """);
