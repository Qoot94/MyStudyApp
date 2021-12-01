package com.example.mystudyapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinActivity : AppCompatActivity(), ItemClickListener {
    lateinit var clMainK: ConstraintLayout
    private var myItems = ArrayList<String>()
    private var myContent = ArrayList<String>()
    private var myDetails = listOf<String>()
    lateinit var myRecycle: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        myDetails = listOf(
            "If you have worked with C, C++ or Java programming language then you must have seen that your program starts" +
                    " from main() function. Very similar way, " +
                    "Android system initiates its program with in an Activity starting with a call on onCreate() callback method." +
                    "1\t\n" +
                    "onCreate()\n" +
                    "\n" +
                    "This is the first callback and called when the activity is first created.\n" +
                    "\n" +
                    "2\t\n" +
                    "onStart()\n" +
                    "\n" +
                    "This callback is called when the activity becomes visible to the user.\n" +
                    "\n" +
                    "3\t\n" +
                    "onResume()\n" +
                    "\n" +
                    "This is called when the user starts interacting with the application.\n" +
                    "\n" +
                    "4\t\n" +
                    "onPause()\n" +
                    "\n" +
                    "The paused activity does not receive user input and cannot execute any code and called when the current activity is being paused and the previous activity is being resumed.\n" +
                    "\n" +
                    "5\t\n" +
                    "onStop()\n" +
                    "\n" +
                    "This callback is called when the activity is no longer visible.\n" +
                    "\n" +
                    "6\t\n" +
                    "onDestroy()\n" +
                    "\n" +
                    "This callback is called before the activity is destroyed by the system.\n" +
                    "\n" +
                    "7\t\n" +
                    "onRestart()\n" +
                    "\n" +
                    "This callback is called when the activity restarts after stopping it.",

            "The ViewGroup is a subclass of View and provides invisible container that hold other Views " +
                    "or other ViewGroups and define their layout properties.1\tLinear Layout\n" +
                    "LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.\n" +
                    "\n" +
                    "2\tRelative Layout\n" +
                    "RelativeLayout is a view group that displays child views in relative positions.\n" +
                    "\n" +
                    "3\tTable Layout\n" +
                    "TableLayout is a view that groups views into rows and columns.\n" +
                    "\n" +
                    "4\tAbsolute Layout\n" +
                    "AbsoluteLayout enables you to specify the exact location of its children.\n" +
                    "\n" +
                    "5\tFrame Layout\n" +
                    "The FrameLayout is a placeholder on screen that you can use to display a single view.\n" +
                    "\n" +
                    "6\tList View\n" +
                    "ListView is a view group that displays a list of scrollable items.\n" +
                    "\n" +
                    "7\tGrid View\n" +
                    "GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid.",

            "In order to use TextureView, all you need to do is get its SurfaceTexture.The SurfaceTexture can then be used" +
                    " to render content. In order to do this, you just need to do " +
                    "instantiate an object of this class and implement SurfaceTextureListener interface.to see more :\n" +
                    "https://www.tutorialspoint.com/android/android_textureview.htm",

            "TextView\n" +
                    "This control is used to display text to the user.\n" +
                    "\n" +
                    "2\tEditText\n" +
                    "EditText is a predefined subclass of TextView that includes rich editing capabilities.\n" +
                    "\n" +
                    "3\tAutoCompleteTextView\n" +
                    "The AutoCompleteTextView is a view that is similar to EditText, except that it shows a list of " +
                    "completion suggestions automatically while the user is typing.\n" +
                    "\n" +
                    "4\tButton\n" +
                    "A push-button that can be pressed, or clicked, by the user to perform an action."
        )
        //link var to ui
        myRecycle = findViewById<RecyclerView>(R.id.rvKot)
        myRecycle.adapter = RVAdapterK(myItems, myContent, this)
        myRecycle.layoutManager = LinearLayoutManager(this)

        clMainK = findViewById(R.id.clKotlin)
        addContent()

    }

    private fun addContent() {
        myItems.add("Activities")
        myContent.add(
            "They dictate the UI and handle the user interaction to the smart phone screen.\n" +
                    " the screen a user sees; front of app"
        )
        myItems.add("UI Layouts")
        myContent.add(
            "The basic building block for user interface is a View object which is created from the View class and occupies a rectangular area on " +
                    "the screen and is responsible for drawing and event handling." +
                    " View is the base class for widgets, which are used to create " +
                    "interactive UI components like buttons, text fields, etc."
        )
        myItems.add("TextureView")
        myContent.add(
            "If you want to display a live video stream or any content stream such as video or an OpenGL scene," +
                    " you can use TextureView provided by android in order to do that."
        )
        myItems.add("UI Controls")
        myContent.add(
            "Input controls are the interactive components in your app's user interface." +
                    " Android provides a wide variety of controls you can use in your UI, such as buttons," +
                    " text fields, seek bars, check box, zoom buttons, toggle buttons, and many more."
        )

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