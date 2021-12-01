package com.example.mystudyapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity2 : AppCompatActivity(),ItemClickListener {
    lateinit var clMainK: ConstraintLayout
    var myItems = ArrayList<String>()
    var myContent = ArrayList<String>()
    var myDetails = listOf<String>()
    lateinit var myRecycleA: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android2)

        myDetails = listOf("// mutable (changeable value)\n" +
                "val name : String = “Arwa”\n" +
                "// immutable (unchangeable value)\n" +
                "var num : Int = 0 \n",
        "// String\n" +
                "val name : String = “Wasan”\n" +
                "// Integer \n" +
                "val num : Int = 5 \n" +
                "// Float \n" +
                "val num2 : Float = 10f\n" +
                "//Boolean \n" +
                "val isNumber : Boolean = true \n" +
                "//inferred: kotlin understands without specifying the type e.g:\n" +
                "val/var inferredStr = “ ” OR val/var checkedBool = true\n",
        "//  addition\n" +
                "         num = num + 1\n" +
                "           num += 1\n" +
                "            num ++\n" +
                "        //subtraction\n" +
                "         num = num - 1\n" +
                "         num --\n" +
                "         num -= 1\n" +
                "       // multiplication\n" +
                "          num = num * 1\n" +
                "          num *= 1\n" +
                "       //division\n" +
                "          num = num / 2\n" +
                "          num /= 2\n",
        "//Try/Catch: to handle errors thrown by user entering wrong data type for example\n" +
                "try {\n" +
                "\t// Code blocks that might cause crashing\n" +
                "} catch (exception_variable_name: Exception_Type){\n" +
                "\t// What to do after crashing\n" +
                "}\n",
            "// If statement\n" +
                    "if (condition){\n" +
                    "do this}\n" +
                    "if(), if() else, &&, ||, and ! are included.\n" +
                    "\n" +
                    "// When \n" +
                    "In Kotlin, there is an equivalence of switch() which is when. It either can be:\n" +
                    "- when {}: without a variable (a way to clean multiple ifs that are not necessarily related).\n" +
                    "- when (variable) {}: with a variable to apply conditions on it.\n" +
                    "when(variable){\n" +
                    "Case1 -> do this code\n" +
                    "Case2 -> do this code\n" +
                    "…\n",
        "// array\n" +
                "Arrays are mutable. We can change each item at any time.\n" +
                "val pets = arrayOf(\"Fluffy\", \"Snoopy\", \"Spud\")\n" +
                "\n" +
                "// list \n" +
                "Lists are immutable. Once we create a List, we cannot make any changes to it.\n" +
                "   val myList = listOf(\"Car\", 15, false, 19, \"Bike\")\n" +
                "\n" +
                "// ArrayList \nvar arraylist = ArrayList<String>()\n" +
                "    //adding String elements in the list\n" +
                "    arraylist.add(\"Geeks\")")
        //link var to ui,
        myRecycleA = findViewById<RecyclerView>(R.id.rvAnd)
        myRecycleA.adapter = RVAdapterA(myItems, myContent, this)
        myRecycleA.layoutManager = LinearLayoutManager(this)

        clMainK = findViewById(R.id.clAndroid)
        addContent()
    }

   private fun addContent(){
       myItems.add("Mutability")
       myContent.add("Kotlin variables are created using either var or " +
               "val keywords and then an equal sign = is used to assign a value to those created variables.\n" +
               "Mutable means that the variable can be reassigned to a different value after initial assignment. " +
               "To declare a mutable variable, we use the var keyword\n"+"A read-only variable can be declared using val " +
               "(instead of var) and once a value is assigned, it can not be re-assigned.")

       myItems.add("Data Type")
       myContent.add("Kotlin built in data type can be categorized as follows:\n" +
               "\n" +
               "Number\n" +
               "\n" +
               "Character\n" +
               "\n" +
               "String\n" +
               "\n" +
               "Boolean\n" +
               "\n" +
               "Array")

       myItems.add("Basic Operations")
       myContent.add("Arithmetic Operators\n" +
               "+\tAddition\tAdds together two values\tx + y\n" +
               "-\tSubtraction\tSubtracts one value from another\tx - y\n" +
               "*\tMultiplication\tMultiplies two values\tx * y\n" +
               "/\tDivision\tDivides one value by another\tx / y\n" +
               "%\tModulus\tReturns the division remainder\tx % y" +
               "Relational Operators\n" +
               ">\tgreater than\tx > y\n" +
               "<\tless than\tx < y\n" +
               ">=\tgreater than or equal to\tx >= y\n" +
               "<=\tless than or equal to\tx <= y\n" +
               "==\tis equal to\tx == y\n" +
               "!=\tnot equal to\tx != y" +
               "Assignment Operators\n" +
               "Kotlin assignment operators are used to assign values to variables.\n" +
               "Unary Operators\n" +
               "+\tunary plus\t+x\n" +
               "-\tunary minus\t-x\n" +
               "++\tincrement by 1\t++x\n" +
               "--\tdecrement by 1\t--x\n" +
               "!\tinverts the value of a boolean\t!x\n" +
               "Logical Operators\n" +
               "&&\tLogical and\tReturns true if both operands are true\tx && y\n" +
               "||\tLogical or\tReturns true if either of the operands is true\tx || y\n" +
               "!\tLogical not\tReverse the result, returns false if the operand is true\t!x\n" +
               "Bitwise Operations\n" +"Kotlin does not have any bitwise operators but Kotlin provides a list of helper functions to perform bitwise operations."
              )

       myItems.add("Try/Catch\n")
       myContent.add("All exception classes in Kotlin inherit the Throwable class. Every exception has a message, a stack trace, and an optional cause.\n" +
               "To throw an exception object, use the throw expression.\n " +
               "To catch an exception, use the try... catch expression:")

       myItems.add("Condition")
       myContent.add("Kotlin if...else expressions works like an if...else expression in any other Modern Computer Programming.\n" +
               "Kotlin when matches its argument against all branches sequentially until some branch condition is satisfied." +
               "Consider a situation when you have large number of conditions to check." +
               " Though you can use if..else if expression to handle the situation," +
               " but Kotlin provides when expression to handle the situation in nicer way. " +
               "Using when expression is far easy and more clean in comparison to writing many if...else if expressions. " +
               "Kotlin when expression evaluates a section of code among many alternatives ")

       myItems.add("Collections")
       myContent.add("Collections are a common concept for most programming languages. A collection usually contains a number of objects of the same type and Objects in a collection are called elements or items.\n" +
               "\n" +
               "The Kotlin Standard Library provides a comprehensive set of tools for managing collections. The following collection types are relevant for Kotlin:\n" +
               "\n" +
               "Kotlin List - List is an ordered collection with access to elements by indices. Elements can occur more than once in a list.\n" +
               "\n" +
               "Kotlin Set - Set is a collection of unique elements which means a group of objects without repetitions.\n" +
               "\n" +
               "Kotlin Map - Map (or dictionary) is a set of key-value pairs. Keys are unique, and each of them maps to exactly one value.")

    }
    override fun onClick(id: Int) {
        // first we create a variable to hold an AlertDialog builder
        val dialogBuilder = AlertDialog.Builder(this)
        // here we set the message of our alert dialog
        dialogBuilder.setMessage(myDetails[id])
            // positive button text and action
            .setPositiveButton("ok", DialogInterface.OnClickListener { dialog, id ->
                dialog.dismiss()
            })
        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle(myItems[id])
        // show alert dialog
        alert.show()
    }
}