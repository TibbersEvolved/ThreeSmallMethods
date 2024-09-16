[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/w3C2UwVE)
# Three small methods

## Get started

Do this in the terminal:

1. `git clone git@github.com:saltsthlm/template-jfs-test-threeSmallMethods.git`
2. `cd template-jfs-test-threeSmallMethods`
3. `mvn clean test` to run the tests
4. Open the project with IntelliJ by opening the `pom.xml` file and choosing _import as project_

## Instructions

In this test you will write 3 methods to fulfill some tests that we have supplied.

You will write your solution code in the file called `ThreeSmallMethods.java`, inside the `src/main/java` folder. We have only supplied a few tests for you to get started with. You will need to add more test to ensure that your code works as expected.

You can run these tests with `mvn test` and from inside the ide. Make sure that you don't get any warnings or errors from the compiler.

## The tasks

1. In the `ThreeSmallMethods.java` -file

   - Implement the method called `isYoung`
   - It takes one parameter `age` which you can assume always will be an int.
   - Return `true` if the parameter is equal or below 30 and `false` otherwise

2. In the `ThreeSmallMethods.java` -file

   - See the background information on PersonNummer below
   - Implement the method called `hasLegalGenderManInSweden`
   - That takes a parameter `personnummer` of type `string`
   - Check that the `personnummer` parameter is 10-characters long and return `false` if not.
   - Return `true` if the second to last number is odd, and `false` if it is even (which is the way personnummer indicates legal gender)
   - You ONLY need to validate the second to last number and do not have to validate that it is a correctly formatted personnummer

3. In the `ThreeSmallMethods.java` -file

   - Implement the method called `firstTwoDigitInteger`
   - That takes an array of integers and returns the first two-digit integer.
   - You can assume only integers in the array, and don't need to check for non-integer input
   - Loop over the elements with a `for` -loop
   - Return the first integer in the array that consists of two digits
   - If there is no such integer in the array, return -1

### Error handling

This is just a programming exercise and in this particular case no additional error handling is needed, than the one described in the tasks.

### A quick comment on PersonNummer, for non-Swedes

PersonNummer (literally PersonNumber) is social security number, in Swedish. It is the public key of your identity to just about everything in Sweden.

According to the rules of PersonNummer, we can get learn some personal details about each individual.
The PersonNummer is structured like this [YY]YYMMDDNNNN. The four last NNNN is basically just any old digits from 0-9 but the position holds extra information, as the PersonNummer rules are stated. For example, the second to last digit indicates the legal gender of a person.

In this exercise we will only care about the length of the number and that second to last digit, so no need to parse other things. Here are a few examples;

920525-1045 - (4 == even) a woman
811228-9872 - (7 == odd) a man
080124-1234 - a man
100319-1243 - a woman

We are using this exercise as a celebration of our (companies) Swedish inheritance. Also, parsing numbers like these is a very common thing to do as a developer.

### Evaluation

1. We will run another suite of tests against your code and count the number of passing tests
2. We will check your code for formatting and syntax correctness
3. We will see how easy your code is to read

## Handing in the solution

Commit your code.

# FAQ

I've written a test file, do you want to have that file too, or should I just hand in the `ThreeSmallMethods.java` file?

> For this test please dont add any new files

Can I assume that the arguments will be of the specified type?

> Yes, for this test!

Am I supposed to throw exceptions?

> No, not in this test.

Do I have to use a normal `for` loop in the `firstTwoDigitInteger` task?

> Yes, in this test that's what we want you to use.
