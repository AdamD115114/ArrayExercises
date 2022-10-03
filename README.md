# CS4421-ISE

Welcome to the GitHub repository for the CS4421-2022 cohort (ISE) at the University of Limerick!
Here you will find all the exercises and content regarding CS4421. You are free to submit PR's to improve the content.



# Exercise Instructions

So for this exercise, we wil be looking at Arrays in java and using what we've learned so far to implement a solution to the below problem. Arrays in java are just like lists. You can make arrays of any type of object, primative or non primative. The syntax for a arrays is a little differen then the last variable types that we worked with.

You are to clone down this repo, and create a new branch for your work. Once you are done with the exercises, push your answers to github and create a merge request into the master branch.

See below where an example of how to initialize the array, set a value of one of the indexes, and retrieve a value from the array.

```java
    String notAList = "Sample String";
    // How to initial and set the size of an array.
    String[] listOfStrings = new String[10];
    // Adding a value to an array
    // Array indexs start at 0 in java
    listOfStrings[0] = "This value is in the first position of the array of strings";
    System.out.println(listOfString[0]);
    // Outputs: This value is in the first position of the array of strings
    System.out.println(listOfString[1]);
    // Exception of Nullpointer as we have accessed an index in the array that doesn't have a value.
```

## Directory Structure

```bash
src
├───main
│   └───java
│       └───com
│           └───example
│               └───project
│                   └───ArrayExercises.java
└───test
    └───java
        └───com
            └───example
                └───project
                    └───ArrayExercisesTest.java
```


Primary Authors
===============
* __[Adam J. Doherty](https://github.com/AdamD115114)__
    Master student at UL
* __[Ivan Hugo Guevara](https://github.com/IvanHGuevara)__
    PhD researcher at Confirm Centre@UL
* __[Dr. Salim Saay](https://github.com/saaysalim)__
    Lecturer at University of Limerick


Acknowledgements
===============
* __[Prof. Tiziana Margaria](https://www.linkedin.com/in/tiziana-margaria-9044a12/)__
    Full professor and Co-Director of Immersive Software Engineering [1] at University of Limerick
    
References
===============

[1] https://www.software-engineering.ie/