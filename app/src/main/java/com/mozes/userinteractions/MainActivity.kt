package com.mozes.userinteractions

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {


    lateinit var showToast: Button
    lateinit var showSnackbar: Button
    lateinit var myLayout: ConstraintLayout
    lateinit var showDialogMessage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast = findViewById(R.id.buttonShowToast)
        showSnackbar = findViewById(R.id.buttonShowSnackbar)
        myLayout = findViewById(R.id.myLayout)
        showDialogMessage = findViewById(R.id.buttonDialogMessage)

        showToast.setOnClickListener {

            Toast.makeText(applicationContext, "this is a toast message", Toast.LENGTH_LONG).show()

        }

        showSnackbar.setOnClickListener {

            Snackbar.make(myLayout
                , "this is a snackbar message"
                , Snackbar.LENGTH_SHORT)
                .setAction("Close", View.OnClickListener {

                }).show()

        }


        showDialogMessage.setOnClickListener {


            showAlertDialog()



        }

    }

    fun showAlertDialog ()
    {
        var alertDialog = AlertDialog.Builder(this@MainActivity)
        alertDialog.setTitle("Change")
            .setMessage("Do you want to change the text of the button ?")
            .setIcon(R.drawable.warning)
            .setCancelable(false)
            .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, which ->

                dialogInterface.cancel()

            })

            .setPositiveButton("yes", DialogInterface.OnClickListener{ dialogInterface, which: Int ->

                showDialogMessage.text = "Alert Dialog"
            })


        alertDialog.create().show()

    }

}

