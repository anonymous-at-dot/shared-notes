#### Shared Java notes

~~..Obadiah, his servants. There shall, in that time, be rumours of things going astray, erm, and there shall be a great confusion as to where things really are, and nobody will really know where lieth those little things wi-- with the sort of raffia work base that has an attachment. At this time, a friend shall lose his friend's hammer and the young shall not know where lieth the things possessed by their fathers that their fathers put there only just the night before, about eight o'clock. Yea, it is written in the book of Cyril that, in that time, shall the third one.~~ Oh don't bother, few notes shared with our __H__ thats' it

<details><summary> **The answer to life, the universe and everything** </summary>
```
 ____   _     _
|  __ \(_)   | |
| |  | |_ ___| |_ __ _ _ __   ___ ___
| |  | | / __| __/ _` | '_ \ / __/ _ \
| |__| | \__ \ || (_| | | | | (_|  __/
|_____/|_|___/\__\__,_|_| |_|\___\___|
                   ______
                  / /___ \
                 / /  __) |
                < <  |__ <
                 \ \ ___) |
                  \_\____/
         __  __       _       _        _
        |  \/  |     (_)     | |      (_)
        | \  / | __ _ _ _ __ | |_ __ _ _ _ __
        | |\/| |/ _` | | '_ \| __/ _` | | '_ \
        | |  | | (_| | | | | | || (_| | | | | |
        |_|  |_|\__,_|_|_| |_|\__\__,_|_|_| |_|
```
<!---
general purpose, highlevel, object oriented programming
platform independant
lowlevel : 0,1 (binary digits)
assembly : pnemonic codes (mov,jump, reg, sub, add)
high level: like english (print, scanner(scanf)
assembler : convert assembly code into machine code
compiler: hll to machine code
interpretor: hll to machine code ( .class into machine code)

JDK : Java Development kit  (code)
JRE : Java Runtime environment (run)

compiler - compiles the .java code : .class(bytecode)
<!--- Comments are Fun --->
class >> JRE (JVM >> java virtual machine >> interpretor) >> binary digits (0,1) -->

#### • Principium
** •identifiers **
- User defined ➛ variables, classes, functions
- In context and relevant
  `eg: firstname, age, phone, employeecode`

•keywords
   <!--- --> is working :)
  Reserved set of words with an agreed upon meaning
  ex:
  - `int  -- whole numbers`
  - `float -- decimal numbers`
  - `break  -- stop the execution`


```java
package oops;
    import java.util.Scanner;
    public class Books
    {
      private int bookid;
      private String bookname;
      private float price;
      public void getBooks() //user defined methods
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bookid, name and price:");
        bookid = sc.nextInt();
        bookname = sc.next();
        price = sc.nextFloat();
        }
    
      public void showBooks()
      {
        System.out.println("Book id:" + bookid);
        System.out.println("Book Name:" + bookname);
        System.out.println("Price:" + price);
      }
        }
```
----------
### • variable
  - user defined placeholder that points to a temporary memory location
  - Enables the easy ___ identification-storage-and-retrieval__ memory location(store/retrieve)


  declaration
  ----------
```java
      datatype variablename1, var2....var n;
```


  ex

    int age;

    String name,address;


  rules:
  -----

  1. starts with alphapets
  2. dont use keywords
  3. spl characters not allowed except _
  4. case sensitive (age, AGE)
  5. max length : 32 chars

Constants:
----------
  value of the variable cannot be changed - during the time of execution

  final - keyword

  ex:

    final float PI=3.14f;
    final int CODE=123;

DataTypes:
----------

  specifies the type of data to be stored into a variable , return value of the method.


** primitive types

** non primitive types

primitive types
----------------

  directly assign values

  >> int , short, long
  >> float, double
  >> char     -any characters/ numbers denoted within single quot 'a', '3' ...
  >> boolean    - true / false
  >> byte

non-primitive
-------------
  String
  object

characterset
--------------
alphapets a-z, A-Z
numbers   0-9
spl chars !@~#$%^&*()_+\][{}|"':;?/>.<,-
white spaces  horiz, verti

Operators
----------

  Symbol which performs specific tasks

assignment    =

arithmetic    + - * / %

relational/comparison   < <= > >= == !=       true/false

Logical     && || !         true/false

increment   ++

decrement   --

conditional     ?:    condition ? true : false


Basic input / output
---------------------

  output:

    System.out.println("msg to be print");

  input:

    import java.util.Scanner;   //importing the library files (packages)

    Scanner obj = new Scanner(System.in);

Structure of java program
-------------------------


package;

in-built package; (JRE lib)

class definition
{

  //variables.

  //methods

}

----------------------

program compile & execution
---------------------------

  compilation:

      javac classname.java

  execution
      java classname


Editors
----------

  * notepad
  * netbeans
  * eclipse
  * intellij ide


Statements:
------------

  decison making statements

if
switch-case


if:
---
  Simple if
  if-else (2 branch)
  else-if ladder (multi branches)
  nested if


  if ( condition )
  {

    //true part
  }

  else
  {
    //false part
  }


Looping
-------

  Repeated execution of a stmt / block of statements


for
while
dowhile

for:
  entry control loop
  countable - known no of times

  for(initial value; condition; iteration (inc/dec)
  {

    //body of loop
  }


while:
  uncountable - unknown no of times until the condition is valid

  entry control loop


  while(condition)
  {

    //loop;
  }

do-while
---------
  uncountable - exit control (condition checked atlast) - even if the coniditon is false, the loop will be executed atleast once


  atm

  do
  {

    //loop
  }while(condition)

----------------------------------------------
switch-case, do- while
----------------------
Enter 2 nos
5
3

choices are :

1.add
2.sub
3.mul
4.div

ur choice: 1
5+3=8

do u wish to continue 1.yes/2.no


-----------
multiply

Enter table no: 2

Enter range to print: 5

1*2=2
2*2=4
3*2=6
4*2=8
5*2=10



Arrays
------
  derived type

  Group of similar type of data which shares a common name


  element - value in an array

  can be accessed by using array index (position /location / address)

  array index always starts with 0


  declaration
  -----------

    datatype[] arrayname = new datatype[size];

  ex:
    int []marks = new int[5]; where [size] subscription/rank

  row & column wise

types
-------
  1. one dimensional array : array with one subscription
  2. Multi dimensional array : array with more than one subscription


Advanced For / foreach
------------- ---------

  jdk1.7 & above

Multidimensional Array
------------------------
  1 2
  3 4

```int [][]arrayname = new int[rowsize [colsize];``


  ex:

    int [][]matrix = new int[2][2];



String methods
--------------

  in-built

import java.lang.*; //default


12:45 PM 12/24/2018
---------------------

Object oriented programming concepts (OOPs)
------------------------------------
  secure
  easy/simplify

object
  real world entity

  behavior/functionality

  eg: peacock - dancing, dog - barking


class

  collection of similar objects

  objects & its functionalities - tied together


  ex:
    flowers  --- class
      rose
      jasmine
      lilly   --- objects

  a class  can have n no of objects

  can create n no objects for a class


data abstraction

  specifies the essential feature of object

  ex: chair


data encapsulation

  capsule

  hiding the data - into the class (Wrapping up of the data )

inheritance

  deriving/creating a new class from existing class

  reusability

  ex: student details (admin office)

    lib
    exam cell
    sports
polymorphism

  poly - many

  ability to take more than one action

message passing

  passing data among objects


class definition
------------------

  visibilitylabel/accessspecifier class classname
  {

    //variables
    //constants
    //lib functions

    //user defined methods
  }

visibility labels / Access specifier
------------------------------------
  default  -- public scope
  private ( within the class)
  public (within class, outside)
  protected -- private scope in derived class


creation of object / instantiation
---------------------------------


  classname objectname/referencevariable/instance = new Constructor();
               (classname)

accessing class members using object
----------------------------------

  object/instance . classmembers = value;

  var = object.classmember;


user defined method
-------------------

  method: small piece of code - which performs certain task and returns a value

  reusability


  visibilitylabel returntype methodname([arg1,arg2... arg n])
  {
    //method body goes here
  }

12:42 PM 12/26/2018
----------------------

Constructor

  constructing the objects

  automatically initializing the objects and its variables (allocating the memory)


  >> it is a special method -(classname and method name will be the same)
  >> it has no return type - it wont return any values
  >> it may / maynot consume input(arguments/parameters)
  >> no need create object to invoke the constructor, it automatically invoked when creating object for      that class
  >> it should be public

types:
------

  1. default constructor :
  -------------------------
    ** constructor with no arguments

    ** if there is no constructor specified in a class explicitly, then the java compiler supplies

    the default one.

  2. parameterized constructor
  --------------------------

    a constructor that takes one or more arguments

    arguments may be any type

---------------------------------------------------------

Naming convention
-----------------

Welcometojava

class :   WeclomeToJava

variable: welcome_to_java

package:  welcometojava

constant: WELCOMETOJAVA

method:   welcomeToJava


inheritance
---------------

  derivation

obtaining the properties of a class into another

creating a new class from the existing classs


  new class : Derived class, sub class, child class

  exisitng class: base class, super class, parent class


code reusability


syntax:
----------
class newclass extends existingclass
{
}


types:
--------
>> Single
>> multilevel
>> multiple **
>> hiearachical
>> hybrid **


Single inheritance:
------------------

creating a new class from the existing class ( one base class, one derived class)

multilevel:
-----------

  deriving a new class from already derived class

Student --- Marks --- Result

Multiple:
-------

more than one base classes - one derived class

  ambiguity (diamond problem)

hybrid
--------
  any combination of inheritances
