# Fractions-V2
Project from CSS 143 UWB course

I built two classes (Fraction and FractionCounter) and a Driver for use in counting the number of unique fractions read from a text file. I used the
ObjectList class I built in lab CSSSKL 143 to store the list of unique FractionCounters, instead of directly using arrays or the ArrayList. Rather than designing a monolithic chunk of code in main like I did in the previous homework, I practiced distributing the code into containers (called classes) that I designed specifically to tackle this same problem in a different and more logically organized fashion.

Requirements to remember:

NO DECIMALS!

Handle input of any length

My project is to read in a series of fractions from a text file, which will have each line formatted asfollows: “A/B”. A sample text file known as fractions is posted and the purpose of my program is to read in one line at a time and build a Fraction object from A and B. For each unique Fraction seen, my program will create a FractionCounter object used to track the number of occurrences of that specific fraction. When all the input is consumed, my program will print out its ObjectList of unique FractionCounters, which should report the fraction and its count – see output below. My program must reduce fractions, as demonstrated in the output below.

Sample text file input:

6/3

7/3

6/3

2/1

Sample output:

2/1 has a count of 3

7/3 has a count of 1
