<style>
/* for inline code */
:not(pre):not(.hljs) > code {
    color: #018a23; /* Change the old color so it seems less like an error */
    background-color: #f1f1f1;
    padding: 2px;
}   
H3 {
    color: #018a23; /* Change the old color so it seems less like an error */
    background-color: #f1f1f1;
    padding: 2px;  
    text-align: center;
}
</style>

### Introduction to Computer Science II
# Tutorial 1


## Objectives  

Basic Java programming: loops, branching, arrays, and input/output.    


## Notes

Part One is asking you to read some basic working Java code. This is to help you familiarize yourself with the 
Java programming language. Everything in this code is something that you would have been able to do in COMP 1005/1405.

Part Two is asking you to complete two (static) methods. You will need to use variables, loops and branching to complete this. 

Part Three is asking you to use nested loops to draw some simple Q-pictures (squares and triangles)

Reading: explore the `String` and `StringBuilder` documentation to see what objects of these classes can do. 

The rest of the tutorial is OPTIONAL. If you want extra practice, you can do this (or not).  


---

**Complete the Tutorial 1 quiz in Brightspace to receive a grade in this tutorial.**

---   

## Part One : Sample Code

Compile and run the provided `BasicJava.java`. Compile and run the `SampleJavaCodeProgram.java`. This contains code that allows you to do the things you have done in COMP 1005/1405. **This is also an assigned reading for the course**. 

---

## Part Two : Basic (Static) Methods

An integer A is a `divisor` of an integer B if A divides B evenly (that is, when you divide B by A the remainder is zero). In the `Parttwo.java` file, complete the `numberOfDivisors()` method that counts the number of the (unique) divisors of the input number. For example, the number 30 has eight divisors: 1, 2, 3, 5, 6, 10, 15 and 30.  

Hint: All divisors of a number N are greater then or equal to 1 and less than or equal to N. 

Hint: if `n % d` is zero (this gives the remainder when dividing n by d) then d is a divisor of n. 

Hint: Using a loop, check all numbers between 1 and the input number and count how many of them evenly divide the input number. 


Next, complete the (static) method `isPrime()` that checks is a number is prime or not. A prime number is a positive integer that only has two divisors (1 and the number itself). Examples: 2, 3, 5, 11, and 29 are prime, but 4, 10 and 25 are not. 

Hint: You can use `numberOfDivisors()` as a helper method in your `isPrime()` method. 

---


## Part Three : Printing Qs

Modify the provided `PrintQs.java` program. The program currently asks the user to enter an integer (call it the number N).  You will modify the program so that it will draw an NxN grid of Q's. For example, if you enter 7, the program will print to the screen

```
QQQQQQQ
QQQQQQQ
QQQQQQQ
QQQQQQQ
QQQQQQQ
QQQQQQQ
QQQQQQQ
```

There are 7 lines printed and each line has 7 Q's printed (without spaces). Use nested **for** loops and only print a single Q at a time. This example will call `System.out.print('Q')` 49 times and `System.out.print()` 7 times.  

Running the program with the value 2 will print

```
QQ
QQ
```

Next, modify your code so that your program displays an additional 4 triangles based on the input N. For example, if the input was 4, then the following four triangles of Q's should also be displayed on the screen

```
Q
QQ
QQQ
QQQQ

QQQQ
QQQ
QQ
Q

QQQQ
 QQQ
  QQ
   Q

   Q
  QQ
 QQQ
QQQQ
```

---


## Reading : The `String` and `StringBuilder` classes

Strings allows us to have text in our programs. They are _immutable_ sequences of characters. Explore 
the API for the `String` class. 
	 
[Link to Java's String class API](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html)

The API (Application Programming Interface) provides you with all methods that are in the given class. Use this to find methods that are equivalent to the following Python string behaviour:

```python
word = "kitten "
character = word[4]      # get a single character at index position 4
substring = word[1:3]    # get a substring of length 2 
stripped  = word.strip() # remove leading/trailing whitespace
WORD = word.upper()      # upper case version of word
WORD == 'KITTEN'         # check if two strings are the same
```

Write a short program whose `main()` method has the above code translated to Java and also prints each to the screen. You can name the class that has your main method anything you wish. 

The `StringBuilder` class provides _mutable_ sequences of characters. This class is especially useful when you need to iteratively build up a string. Consider the two strings `text1` and `text2` in the following:

```java
String text1 = "";
for(int i=0; i<size; i+=1){ // 
   text1 = text1 + ">";
}

StringBuilder text_sb = new StringBuilder();
for(int i=0; i<size; i+=1){
   text_sb.append(">");
}
String text2 = text_sb.toString();
```

Both strings have the same characters in them. It is more _efficient_ to construct `test2` though (especially if `size` is large). Find and then explore the `StringBuilder` API. 

---
---
---

## Part 4 : Babylonian Square Roots (OPTIONAL)

In the provided `Babylonian.java` file, complete the static method that computes square roots of a number using the _Babylonian method_.

[Wikipedia Link for Babylonian Square Root Method](https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Babylonian_method)

It is an _iterative_ method that keeps making better and better approximations to the square root of a number. The
algorithm is terminated when the improvement in successive approximations becomes small.

Pseudocode for the Babylonian method to find the square root of a number N is as follows:

1. Let M1 := N/2 be our first guess
2. Let M2 := average of M1 and N/M1
3. If |M1-M2| < epsilon then stop and output M2
4. Otherwise, Let M1 := M2 and go back to step 2

Here, `|x|` is the absolute value of x and epsilon is a small positive number (like 0.0001). We use `:=` to denote assignment in the pseudocode above.

Python code for a function that implements this is as follows:

```python
def babylonian(N, epsilon):
   m1 = 0.5*N           # N/2
   m2 = 0.5*(m1+N/m1)   # average of m1 and N/m1
   while abs(m1-m2) >= epsilon:
      m1 = m2
      m2 = 0.5*(m1+N/m1)
   return m2 
```

Your task is to translate this (pseudocode or python) into Java and complete the `babylonian()` method. A `main()` method is provided so that you can test your method.
 
Note that the `Math` class can provide useful functions to help with math. In particular, `Math.abs()` should be used in your code.

[Link to Java's Math Class API](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html)

Once you have implemented the method properly, modify the `main()` method so that the program repeatedly prompts the user to enter a positive number (or "end", triggering the end of the program). Print the number, its square root using both `Math.sqrt()` and your Babylonian method, and the difference between them (like the original code did for the hard-coded number) if the input number is non-negative. Print a message like "Only enter positive numbers" if the number is negative. Exit the program when the user input is the string "end".

---

## Part Five : Arrays (Next week's topic... OPTIONAL)

Write a static method 

```java
public static char[] filter(char[] list, char target)
```

The method will take an array of `char`s as input and another `char`. It will then create a new array that has all the `char`s from the input array (in the same order) except that all instances of `target` are removed. For example,

```java
char[] in = {'a', 'b', 'a' 'c', 'd'};
char[] out = filter(in, 'a');
// assert : out == {'b', 'c', 'd'}  
out = filter(in, 'b');
// assert : out == {'a', 'a', 'c', 'd'}
```
Note: the `length` of the output array should only be as big as needed. 

---
---

---
---

## Part Six : More Extra (OPTIONAL) 

Create a java program (java class with a `main()` method) that translates the following python code to java. You can name your class whatever you wish for this. 

```python
def main():
    size = 10
    numbers = [0]*size
    for i in range(size):
        if i < 3:
            numbers[i] = i
        elif i < 6:
            numbers[i] = i + 10
        else:
            numbers[i] = i*10

    for i in numbers:
        print(numbers[i], end=',')
		
    print(numbers)
```

---
