package com.zebdul.checkboxwithifelsecondtion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zebdul.checkboxwithifelsecondtion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.button.setOnClickListener {

            if (viewBinding.checkBox1.isChecked && viewBinding.checkBox2.isChecked){
                Toast.makeText(this, "You clicked on Kotlin and ReactJs" , Toast.LENGTH_SHORT).show() }
            else if (viewBinding.checkBox1.isChecked ){
                Toast.makeText(this, "You clicked on Kotlin "
                       , Toast.LENGTH_SHORT).show()}
            else if (viewBinding.checkBox2.isChecked ){
                Toast.makeText(this, "You clicked on ReactJs "
                        , Toast.LENGTH_SHORT).show() }
            else { Toast.makeText(this, "You clicked on nothing "
                , Toast.LENGTH_SHORT).show()
            }
        }


    }
}