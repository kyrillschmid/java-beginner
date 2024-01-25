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
//   <b>Method References</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 01 Method References.java -->
// <!-- slides/module_112_language/topic_700_method_references.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Introduction
// - You use lambda expressions to create anonymous methods
// - Sometimes, however, a lambda expression does nothing but call an existing method
// - In those cases, it's often clearer to refer to the existing method by name
// - Method references enable you to do just this

// %% tags=["slide", "keep"] slideshow={"slide_type": "slide"}
import java.time.LocalDate;
import java.time.Period;

public class Person {

    private LocalDate birthday;
    private int age;
    private String name;
    private String gender;

    public Person(LocalDate birthday, int age, String name, String gender) {
        this.birthday = birthday;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    
    public int getAge() {
        // Calculate age based on the current date and the birthday
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        // Compare based on age
        return Integer.compare(a.getAge(), b.getAge());
    }

        public String toString() {
        return "Person{" +
               "age=" + age +
               ", name='" + name + '\'' +
               ", gender='" + gender + '\'' +            
               '}';
    }
}

// %% tags=["slide", "keep"] slideshow={"slide_type": "slide"}
public Person[] createPeopleArray() {
    return new Person[] {
        new Person(LocalDate.of(1988, 3, 14), 35, "Eve", "Female"),
        new Person(LocalDate.of(1990, 1, 15), 33, "Alice", "Female"),
        new Person(LocalDate.of(2000, 8, 30), 23, "Charlie", "Male"),
        new Person(LocalDate.of(1995, 12, 10), 28, "Diana", "Female"),
        new Person(LocalDate.of(1985, 5, 22), 38, "Bob", "Male")
    };   
}

// %% tags=["slide", "keep"] slideshow={"slide_type": "slide"}
public void printPersons(Person[] people){
    for (Person p : people) {
        System.out.println(p);
    }
}

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Sample Usage
// - Assume you want to sort the array by age
// - We can use the `Arrays.sort` method to sort the array
// - To sort the array by age, we need to provide an implementation of the `Comparator` interface

// %% tags=["start"]
class PersonAgeComparator implements Comparator<Person> {
}

// %%

// %% tags=["keep"]
printPersons(people);

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Using Lambda Expression
// - The `sort` mehod has the following signature:
// ``` java
// public static <T> void sort(T[] a, Comparator<? super T> c)
// ```
// - The interface `Comparator` is a functional interface
// - Therefore, we could as well use a lambda expression instead of a class

// %% tags=["keep"]
Person[] people = createPeopleArray();

// %% tags=["keep"]
Arrays.sort(people,
    (Person a, Person b) -> {
        return a.getBirthday().compareTo(b.getBirthday());
    }
);

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Using Method Reference
// - However, this method to compare the birth dates of two Person instances already exists as `Person.compareByAge`
// - You can invoke this method instead in the body of the lambda expression

// %% tags=["keep"]
Person[] people = createPeopleArray();

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Because this lambda expression invokes an existing method, you can use a method reference instead of a lambda expression

// %% tags=["keep"]
Person[] people = createPeopleArray();

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Properties of Method Reference
// - The method reference `Person::compareByAge` is semantically the same as the lambda expression `(a, b) -> Person.compareByAge(a, b)`
// - Each has the following characteristics:
//      - Its formal parameter list is copied from `Comparator<Person>.compare`, which is `(Person, Person)`
//      - Its body calls the method `Person.compareByAge`

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Kinds of Method References
// There are four kinds of method references:
//
// **Reference to a static method**
// ```java 
// ContainingClass::staticMethodName
// ```
// **Reference to an instance method of a particular object**
// ```java
// containingObject::instanceMethodName
// ```
// **Reference to an instance method of an arbitrary object of a particular type**
// ```java
// ContainingType::methodName
// ```
// **Reference to a constructor**
// ```java
// ClassName::new
// ```

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Reference to a Static Method
// - The method references `Person::compareByAge` is a reference to a static method

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Reference to an Instance Method of a Particular Object
// - The following is an example of a reference to an instance method of a particular object:

// %%

// %%


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Reference to an Instance Method of an Arbitrary Object of a Particular Type
// - The following is an example of a reference to an instance method of an arbitrary object of a particular type:

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Reference to a Constructor
// - You can reference a constructor in the same way as a static method by using the name new
// - The following method copies elements from one collection to another:

// %% tags=["slide", "keep"] slideshow={"slide_type": "slide"}
public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Overview
// When to use lambas (or method references), anonymous classes, nested classes or local classes?

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// **Lambda expression:**
// - Use it if you are encapsulating a single unit of behavior that you want to pass to other code
// - You want a certain action performed on each element of a collection
// - You need a simple instance of a functional interface and none of the preceding criteria apply (dont need a constructor, a named type, fields, or additional methods)

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// **Anonymous class**
// - Use it if you need to declare fields or additional methods

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// **Nested classes** 
// - Logically group classes that are only used in one place
// - Increase the use of encapsulation
// - Create more readable and maintainable code

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// **Local class**
// - Often used inside methods to develop more readable and maintainable code
// - You need to create more than one instance of a class and access its constructor
// - Introduce a new, named type (because, for example, you need to invoke additional methods later)

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// **Nested class**: 
// - Use it if your requirements are similar to those of a local class, you want to make the type more widely available 
// - Use a non-static nested class (or inner class) if you require access to an enclosing instance's non-public fields and methods
// - Use a static nested class if you don't require this access
