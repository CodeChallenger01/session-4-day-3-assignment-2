# session-4-day-3-assignment-2

**STEPS TO CHECK EQUALITY IN SCALA**    
**Step 1:** Open IntelliJ and create a new Project of Name **assignment-2 **   
**Step 2:** Create a **EqualityInScala** scala file in src/main/scala/.   
**Step 3:** Inside the EqualityInScala create a class of** EqualityInScala of generic type**.   
**Step 4:** Create **five method with two parameter** that checks the list with same type and different type with different equality check method such as** ==, .equals(), !=, ne, eq** and return the boolean value.   
          **1. equalsCheck**   
          **2.equalsEqualsCheck**    
          **3.notEqualsCheck**    
          **4.neCheck**
          **5.eqCheck**      
**Step 5:** Now create a **Driver scala file and** inside that file creat main object and inside it take to list and create object of **EqualityInScala[Int]** and call all the 5 methods and **check exception handling** and print the result if it Successfull.   
**Step 8:** After that add the scalatest dependencies in build.sbt file    
**Step 9:** Create a **Test Class in** src/test/scala/. Inside the test class extend the AnyFlatSpec with Matchers Class and import the scalatest package in that test class.  
**Step 10:** Inside the test class create instance of Class in each test case with **different scenario and check with assert. **   
**Step 11:** In terminal **run the command sbt test** it show the result that test case is **passed or fail.**
  
  **OUTPUT
sbt compile & sbt run**
![Screenshot from 2023-03-31 20-46-53](https://user-images.githubusercontent.com/124979629/229161510-ca8131b6-7dda-4233-923d-04e100b11377.png)
 
 **sbt test**
![Screenshot from 2023-03-31 20-47-08](https://user-images.githubusercontent.com/124979629/229161515-ed909dcd-f957-4d68-87df-ff1a8d48eafe.png)
