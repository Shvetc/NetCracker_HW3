# NetCracker_HW3
Tasks from Cay Horstmann Big Java

     
 ******************************
 - Chapter 3: Implementing Classes
 ******************************

    -> section "Programming projects"  

[ex. 3.1:](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/p3_1_2/CashRegister.java)

Enhance the CashRegister class so that it counts the purchased items. Provide a getItemCount method that returns the count.

__

                                                                  

[ex. 3.2:](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/p3_1_2/CashRegister.java)

Support computing sales tax in the CashRegister class. The tax rate should be supplied
when constructing a CashRegister object. Add recordTaxablePurchase and getTotalTax methods. (Amounts added with recordPurchase are not taxable.) The giveChange
method should correctly reflect the sales tax that is charged on taxable items.

[Test ex. 3.1-3.2](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/TestCashRegister.java)

__


[ex. 3.4:](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/p3_4/Sheet.java)

Most countries (with the exception of Canada, Colombia, the Dominican Republic,
Mexico, and the United States) follow the ISO 216 standard for paper sizes. An A0
sheet has dimensions 841 × 1189 millimeters. An A1 sheet is obtained by cutting an
A0 sheet in half along the larger dimension, yielding a 594 × 841 sheet. An A2 sheet
is obtained by cutting it in half again, yielding a 420 × 594 sheet, and so on. Implement a class Sheet whose constructor makes an A0 sheet. Provide a method cutInHalf
that yields a Sheet object of half the size. Also provide methods width, height, and name,
returning the width and height in millimeters, as well as the name (such as "A2").

[Test ex. 3.4](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/TestSheet.java)

__


[ex. 3.6:](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/p3_6/Person.java) 

A Person has a name (just a first name for simplicity) and friends. Store the names of
the friends in a string, separated by spaces. Provide a constructor that constructs a
person with a given name and no friends. Provide methods

     public void befriend(Person p)
     
     public void unfriend(Person p)
     
     public String getFriendNames()

[Test ex. 3.6](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/TestPerson.java)

__


[ex. 3.7:](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/p3_6/Person.java)

Add a method
public int getFriendCount()
to the Person class of Exercise •• 3.6

[Test ex. 3.7](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/TestPerson.java)

__



[ex. 3.8:](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/p3_8/Student.java)

Implement a class Student. For the purpose of this exercise, a student has a name
and a total quiz score. Supply an appropriate constructor and methods getName(),
addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the average,
you also need to store the number of quizzes that the student took.
Supply a StudentTester class that tests all methods.

[Test ex. 3.8](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/TestStudent.java)

__


[ex. 3.9:](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/p3_9/Battery.java)

Write a class Battery that models a rechargeable battery. A battery has a constructor

      public Battery(double capacity) 
      
where capacity is a value measured in milliampere hours. A typical AA battery has a
capacity of 2000 to 3000 mAh. The method

     public void drain(double amount)
     
drains the capacity of the battery by the given amount. The method

    public void charge()
    
charges the battery to its original capacity.

The method

    public double getRemainingCapacity()
    
gets the remaining capacity of the battery.

[Test ex. 3.9](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch3/TestBattery.java)



 ******************************

- Chapter 8: Designing Classes
 ******************************

    -> section "Programming projects" 
  

[ex. 8.1:](https://github.com/Shvetc/NetCracker_HW3/tree/main/src/com/netcracker/horstmannbigjava/ch8)


Declare a class ComboLock that works like the combination lock
in a gym locker, as shown here. The lock is constructed with
a combination—three numbers between 0 and 39. The reset
method resets the dial so that it points to 0. The turnLeft and
turnRight methods turn the dial by a given number of ticks to the
left or right. The open method attempts to open the lock. The lock opens if the user first turned it right to the first number in the combination, then left
to the second, and then right to the third.

     public class ComboLock
     
     {
     
     . . .
     
     public ComboLock(int secret1, int secret2, int secret3) { . . . }
     
     public void reset() { . . . }
     
     public void turnLeft(int ticks) { . . . }
     
    public void turnRight(int ticks) { . . . }
    
    public boolean open() { . . . }
    
    }
    







 ******************************
- Chapter 9: Inheritance
 ******************************

 
    -> section "Programming projects" 
    

[ex. 9.1:](https://github.com/Shvetc/NetCracker_HW3/tree/main/src/com/netcracker/horstmannbigjava/ch9/p9_1)

Implement a class ChessPiece with method setPosition(String coordinates). The coordinate string identifies the row and column in chess notation, such as "d8" for the initial position of the black queen. Also provide a method ArrayList<String> canMoveTo()
that enumerates the valid moves from the current position. Provide subclasses Pawn,
Knight, Bishop, Rook, Queen, and King.

[Test ex. 9.1](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch9/TestChessPosition.java)

__


[ex. 9_1](https://github.com/Shvetc/NetCracker_HW3/tree/main/src/com/netcracker/horstmannbigjava/ch9/ex9_1)

[Test ex. 9_1](https://github.com/Shvetc/NetCracker_HW3/blob/main/src/com/netcracker/horstmannbigjava/ch9/TestEmployee.java)


