// Databricks notebook source
val variable1 = "Sanika"
val variable1 = "hey" + "sanika"

// COMMAND ----------

var variable2 = "Turang"
//var variable2 = "Hey" + "Turang"

// COMMAND ----------

variable1 = variable1 + "turang"


// COMMAND ----------

variable2 = variable2 + "sanika"
variable2
//variable1
val variable3: String = "vaibhav "

// COMMAND ----------

val variable1
var variable2


// COMMAND ----------

//val value : Int = 4
//val value1 = 5
val byte1: Byte =126



// COMMAND ----------

val value2: Int = 4
print("hello")

// COMMAND ----------

print(f"hello, $value2")

// COMMAND ----------

// Switch Statement
var s: Int= 4
s match{
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("3")
  case 4 => print("4")
  case _ => print("Default")
}

// COMMAND ----------

var a = 2
if (a==2){
  print("value is 2")
}
else{
  print("value not 2")
}

// COMMAND ----------

for (i <- 1 to 4){
println(i)
}

// COMMAND ----------

//var whi =4
//while(whi >= 4)
//{
//  print(f"whi,$whi")
//}

// COMMAND ----------

//var whi =4
//while(whi >= 4)
//{
//  println(f"whi,$whi")
//  whi = whi+1
//}

// COMMAND ----------

/*function def <name of function> (argument:<type>) return datatype int : {
commands
}*/
def square (x: Int): Int = {
  // squaring the value
  x*x
} 
//calling the function
square(3)

// COMMAND ----------

def numdivisor (x:Int,y:Int): Int ={
  // dividing the values
  x/y
}
//calling the function
numdivisor(10,5)

// COMMAND ----------

def primeno (x : Int) : Unit ={
  for(i <- 1 to x){
    if (x%2!=0){
      print(x)
    }
  }
}
primeno(7)

// COMMAND ----------

def third (y:Int, f: Int=>Int) : Int ={
  f(y)
}
third (4,square)


// COMMAND ----------

def division (x:Double, y:Double): Double={
  x/y
}
division(10,5)
def addNumber(var1:Double, var2: Double, func: (Double,Double)=> Double): Double={
  func(var1,var2)
}
addNumber(2,3,division)

// COMMAND ----------

val tup = ("hello", 4)
tup._2

// COMMAND ----------

var list1 = ("sanika","turang",3)
list1.head

// COMMAND ----------

var dict = 1 -> "hello"

dict._1

// COMMAND ----------

var list1 = List("sanika","turang")
var list2 = List("vaibhav","shah")
var list3 = list1 ++ list2

// COMMAND ----------

var newlist =List(1,2,3,4,5,6,7)
newlist.filter ((x:Int) => x<5)

// COMMAND ----------

var liststring = List("hey","hoo")
liststring.map((x:String)=> x.reverse)
liststring.map((x:String)=> x.length)

// COMMAND ----------

var newlist =List(1,2,3,4,5,6,7)
newlist.reduce((x:Int,y:Int)=>x+y)

// COMMAND ----------

var newlist =List(1,2,3,4,5,6,7)
newlist(4)

// COMMAND ----------

var lists = List ("hey", "sanika","how","are","you")
lists.map((x:String)=>(x,2))

// COMMAND ----------

var lista =List ()

// COMMAND ----------

var sa : Byte =124
sa.toInt

