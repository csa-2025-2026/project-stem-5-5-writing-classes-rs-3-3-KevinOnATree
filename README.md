[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21474497)
# unit-5-5-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since the shape classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Classwork
Follow along in class and create the Dog class in the file named Dog.java.

## Problem 1 - Person Class
Create a class named `Person` which will represent a unique person. The class should store the following information in appropriate (private) variables:

* The first name of the person
* The last name of the person
* The age of the person (in years)
* The social security number (SSN) of the person

You'll need to add member variables (fields) to your class to store the information for a person - make sure you choose the names of these carefully to avoid a conflict with the names of the parameters you use in your constructor.

Create setters and getters for your class, and test each function.  Also create the `toString()` method, which should return a string representing the Player in the format shown below.  You **MUST** include the tabs using the tab escape character `\t`.
```
SSN: Social Security Number
	Name: Person's Name
	Age: Person's age
```

**Sample run**
```
Enter the person's first name:
Jon
Enter the person's last name: 
Doe
Enter the person's age: 
35
Enter the person's social security number: 
123456789

Output:
SSN: 123456789
	Name: Jon Doe
	Age: 35
```

## Problem 2 - Oven Class
Finish writing the `Oven` class that represents an oven. This class has the variables, constructors and methods detailed below. You should write code implementing the methods and constructors so they behave as described.

### Variables

* `private int maxTemp` - the maximum temperature of the oven. This value should not be changed after the oven is constructed. If the temperature is greater than 500 or less than 0, it should be changed to 500.
* `private int currentTemp` - the current temperature of the oven. Should not be greater than maxTemp or less than 0. If currentTemp is greater than maxTemp, it should be set to maxTemp. If currentTemp is less than 0, it should be set to 0.

### Methods
* `public int getMaxTemp()` - returns the `maxTemp` of the oven.
* `public int getCurrentTemp()`- returns the currentTemp of the oven.
* `public void turnOff()` - sets the `currentTemp` of the oven to 0 if the `currentTemp` of the oven is greater than 0.
* `public boolean isOn()` - return true if `currentTemp` of the oven is greater than 0.
* `public void preheat(int temp)` - sets `currentTemp` of the oven to temp. If `temp` is greater than `maxTemp`, then set `currentTemp` to `maxTemp`. If `temp` is less than or equal to 0, do nothing.
* `public String toString()` - Returns a String of the format `"New oven with a maximum temperature of maxTemp and a starting temperature of currentTemp"`

**Sample run**
```
Maximum oven temperature: 
450
Starting temperature of the oven: 
70
New oven with a maximum temperature of 450 and a starting temperature of 70 degrees.
To preheat the oven enter "p", to turn the oven off enter "o", to restart enter "r", to quit enter "q"
p
Enter the temperature to preheat the oven to: 
350
Current temperature of the oven is now 350 degrees

New oven with a maximum temperature of 450 and a starting temperature of 350 degrees.
To preheat the oven enter "p", to turn the oven off enter "o", to restart enter "r", to quit enter "q"
o
Turning the oven off.

New oven with a maximum temperature of 450 and a starting temperature of 0 degrees. 
To preheat the oven enter "p", to turn the oven off enter "o", to restart enter "r", to quit enter "q"
q
```

**Hint** - Start by writing the 3 accessor methods - `getMaxTemp`, `getCurrentTemp` and `isOn`. These methods just need to return the relevant member variables. Then you can focus on writing and testing the more difficult remaining methods.
