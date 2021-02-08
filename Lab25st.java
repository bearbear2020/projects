// Lab25st
// This is the student version of the Lab25 assignment.
// Lab 25 is a very open-ended lab assignment.  This student version intentionally provides
// little help.  It is your job to demonstrate knowledge of inheritance and composition with this assignment.
// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: Java7
// Date: 9/15/17
// File Location: H:\Java\Labs\Lab25st
// ***********************************************

// ***********************************************
// Program Abstract
// The purpose of this program is to demonstrate fundamental knowledge of the program logic and syntax of inheritance and composition.
//***********************************************

// ***********************************************
// Program Variable Dictionary
//Bearname is the name of the bear thats passed around, and is assigned to name
// numOfCubs is the number of cubs thats passed around, and is assigned to Cubs
// yearsOld is the bear age thats passed around, and is assigned to age
// numOfWeight is the weight of the bear thats passed around, and is assigned to weight
// colorOfTail is the color of the bears tail thats passed around, and is assigned to color
// numOfTail is the size of the bears tail thats passed around, and is assigned to length
// numSib is how many siblings the cub has thats passed around, and is assigned to siblings
// yearsOld2 is the age of the cub in months thats passed around, and is assigned to age
// numheight is the height of the tree thats passed around, and is assined to height  
// numsInTree is the number of cubs in the tree, and is assigned to numInTree
// cubTail is the number thats passed of the cubs tail size
// cubColorOfTail is the color passed of the color
// ***********************************************   

public class Lab25st
{
	
   public static void main(String args[])
   {
      System.out.println("\nLAB25 80/100-POINT VERSION\n");
      Bear bear1 = new Bear();
      bear1.displayBear();
      ///                   (name,cubs,years old, weight, tail color, tail size)
      Bear bear2 = new Bear("Big One", 2,12,700, "Black", 25);
      bear2.displayBear();
      
      //100 pt
      Cub cub1 = new Cub();
      cub1.displayCub();
      ////  (name,cubs,age,weight,tail color, tail size, cub siblings, cub age in months, tree size, Bears in tree, cub tail color, cub tail size)
      Cub cub2 = new Cub("Big One", 2,12,700, "Black", 25,1,2,200,3,7, "white");
      cub2.displayCub();
   }	
	
}


class Mammal
{
   private int age =0;
   private int weight =0;

   public Mammal()
   {
      age =10; //default
      weight =100; //default
      System.out.println("Mammal Constructor");
   }

   public Mammal(int yearOld, int numofweight)
   {
      age=yearOld;
      weight=numofweight; 
      System.out.println("Mammal Constructor");
   }
   public int getAge() 
   {
      return age;
   }
   public int getWeight() 
   {
      return weight;
   }

}


class Bear extends Mammal
{
   private String name ="";
   private  int Cubs = 0;
   private Tail tailObj;

   public Bear()
   {
      name = "Bear"; //default
      Cubs =1; //default
      System.out.println("Bear Constructor");
      tailObj = new Tail();
   }
   public Bear(String Bearname, int numOfCubs,int yearOld, int numofweight,String colorOfTail, int numOfTail)
   {
      super(yearOld,numofweight);
      name =Bearname;
      Cubs = numOfCubs;
      System.out.println("Bear Constructor");
      tailObj = new Tail(numOfTail,colorOfTail);
   }

   public  void displayBear()
   {
      System.out.println("Bear is named " + name + " has " + Cubs + " cubs, and is " + super.getAge() + " years old with last weight of " + super.getWeight() + " at last weigh in. The tail is colored " + tailObj.getColor() + " and " + tailObj.getLength() + " Bear Tail Units (BTU).");
   }
   
   
   //-------------------------------- 100 pt portion of Bear class
   public String getName() 
   {
      return name;
   }
   public int getCubs() 
   {
      return Cubs;
   }
   public int getLength() 
   { 
      return tailObj.getLength();
   }
   public String getColor() 
   {
      return tailObj.getColor();
   }

//---------------------------------- end of 100 pt portion of bear class
}

class Tail
{
   private int length =0;
   private String color = "";
   public Tail()
   {
      length =10; //default
      color = "Brown"; //default 
      System.out.println("Tail Constructor");
   } 
   public Tail(int numOfTail, String colorOfTail)
   {
      length = numOfTail;
      color = colorOfTail;
      System.out.println("Tail Constructor");
   }
   public int getLength() 
   { 
      return length;
   }
   public String getColor() 
   {
      return color;
   }
}
//----------------------------------------------------------------- 100pt version below
class Cub extends Bear
{
   private int siblings = 0;
   private int age = 0;
   private Tree treeObj;
  private Tail tailObj;
   public Cub()
   {
      siblings =0; //default
      age = 5; //default
      treeObj = new Tree();
      tailObj = new Tail();

   
   }
   public Cub(String Bearname, int numOfCubs,int yearOld, int  numofweight,String colorOfTail, int numOfTail, int numSib, int yearOld2,int numHeight,int numsInTree,int cubTail, String cubColorOfTail)
   {
      super(Bearname,numOfCubs,yearOld, numofweight,colorOfTail,numOfTail);
      siblings = numSib;
      age = yearOld2;
      treeObj = new Tree(numHeight,numsInTree);
      tailObj = new Tail(cubTail,cubColorOfTail);

   
   }
   public  void displayCub()
   {
      System.out.println("The Cub has " + siblings + "  siblings, and is " + age + " months old with tail colored " + tailObj.getColor() + " and " + tailObj.getLength() + " Bear Tail Units (BTU). The bear cub has a tree that is " + treeObj.getHeight() + " Bear Tails Tall (BTU), and that the cub shares with " + treeObj.getnumInTree() + ". The Mother Bear is named " + super.getName() + " has " + super.getCubs() + " cubs, and is " + super.getAge() + " years old with last weight of " + super.getWeight() + " at last weigh in. The tail is colored " + super.getColor() + " and " + super.getLength() + " Bear Tail Units (BTU).");
   }


}

class Tree 
{
   private int height =0;
   private int numInTree =0;
   public Tree()
   {
      height =50; //default
      numInTree =0; //default
      System.out.println("Tree Constructor");
   }

   public Tree(int numHeight, int numsInTree)
   {
      height = numHeight;
      numInTree = numsInTree;
      System.out.println("Tree Constructor");
   }
   public int getHeight()
   {
      return height;
   }
   public int getnumInTree()
   {
      return numInTree;
   }
}

/* run output
  ----jGRASP exec: java Lab25st
 
 LAB25 80/100-POINT VERSION
 
 Mammal Constructor
 Bear Constructor
 Tail Constructor
 Bear is named Bear has 1 cubs, and is 10 years old with last weight of 100 at last weigh in. The tail is colored Brown and 10 Bear Tail Units (BTU).
 Mammal Constructor
 Bear Constructor
 Tail Constructor
 Bear is named Big One has 2 cubs, and is 12 years old with last weight of 700 at last weigh in. The tail is colored Black and 25 Bear Tail Units (BTU).
 Mammal Constructor
 Bear Constructor
 Tail Constructor
 Tree Constructor
 Tail Constructor
 The Cub has 0  siblings, and is 5 months old with tail colored Brown and 10 Bear Tail Units (BTU). The bear cub has a tree that is 50 Bear Tails Tall (BTU), and that the cub shares with 0. The Mother Bear is named Bear has 1 cubs, and is 10 years old with last weight of 100 at last weigh in. The tail is colored Brown and 10 Bear Tail Units (BTU).
 Mammal Constructor
 Bear Constructor
 Tail Constructor
 Tree Constructor
 Tail Constructor
 The Cub has 1  siblings, and is 2 months old with tail colored white and 7 Bear Tail Units (BTU). The bear cub has a tree that is 200 Bear Tails Tall (BTU), and that the cub shares with 3. The Mother Bear is named Big One has 2 cubs, and is 12 years old with last weight of 700 at last weigh in. The tail is colored Black and 25 Bear Tail Units (BTU).
 
  ----jGRASP: operation complete.

*/