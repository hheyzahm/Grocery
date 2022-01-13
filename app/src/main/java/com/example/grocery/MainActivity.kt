package com.example.grocery

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var submit_button : Button = findViewById(R.id.submit_button)

        submit_button.setOnClickListener(View.OnClickListener { view ->

        var display_layout : RelativeLayout =findViewById(R.id.display_RelativeLayout);

            display_layout.visibility=View.VISIBLE

        var editTextNumber_Product1_name : EditText = findViewById(R.id.editTextNumber_Product1_name);
        var editTextNumber_Product2_name : EditText = findViewById(R.id.editTextNumber_Product2_name);
        var editTextNumber_Product3_name : EditText = findViewById(R.id.editTextNumber_Product3_name);
        var editTextNumber_Product4_name : EditText = findViewById(R.id.editTextNumber_Product4_name);
        var editTextNumber_Product5_name : EditText = findViewById(R.id.editTextNumber_Product5_name);

        var editTextNumber_Product1_price : EditText = findViewById(R.id.editTextNumber_Product1_price);
        var editTextNumber_Product2_price : EditText = findViewById(R.id.editTextNumber_Product2_price);
        var editTextNumber_Product3_price : EditText = findViewById(R.id.editTextNumber_Product3_price);
        var editTextNumber_Product4_price : EditText = findViewById(R.id.editTextNumber_Product4_price);
        var editTextNumber_Product5_price : EditText = findViewById(R.id.editTextNumber_Product5_price);

        val product_name = arrayOf(
            editTextNumber_Product1_name.text, editTextNumber_Product2_name.text, editTextNumber_Product3_name.text,
            editTextNumber_Product4_name.text,editTextNumber_Product5_name.text
        )
        val product_price = arrayOf(
            editTextNumber_Product1_price.text, editTextNumber_Product2_price.text, editTextNumber_Product3_price.text,
            editTextNumber_Product4_price.text,editTextNumber_Product5_price.text
        )


        // access the listView from xml file
            // use arrayadapter and define an array
            val arrayAdapter: ArrayAdapter<*>
            val SR_Num = arrayOf(
                "1", "2", "3",
                "4", "5"
            )
        var mListView = findViewById<ListView>(R.id.product_SR_list)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, SR_Num)
        mListView.adapter = arrayAdapter
        // access the listView from xml file
        var mListView2 = findViewById<ListView>(R.id.product_name_list)
        val arrayAdapter2: ArrayAdapter<*>
        arrayAdapter2 = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, product_name)
        mListView2.adapter = arrayAdapter2
        // access the listView from xml file
        var mListView3 = findViewById<ListView>(R.id.product_price_list)
        val arrayAdapter3: ArrayAdapter<*>
        arrayAdapter3 = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, product_price)
        mListView3.adapter = arrayAdapter3



        });
    }
}