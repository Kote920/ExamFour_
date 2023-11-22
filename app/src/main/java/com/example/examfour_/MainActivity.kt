package com.example.examfour_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examfour_.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val items = mutableListOf<MutableList<ButtonBlank>>()
    private lateinit var binding: ActivityMainBinding
    val fragment = GameFragment()
    val bundle = Bundle()

    private lateinit var bindingItem: RowRecyclerAdapter
    private lateinit var adapter: RowRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            if(binding.btn3x3.isChecked){
                binding.btn4x4.isClickable = false
                binding.btn5x5.isClickable = false
                bundle.putString("dimension", "3")
                Toast.makeText(this, "fads", Toast.LENGTH_SHORT).show()
            }
            else if(binding.btn4x4.isChecked){
                binding.btn3x3.isClickable = false
                binding.btn5x5.isClickable = false
                bundle.putString("dimension", "4")
            }
            else if(binding.btn5x5.isChecked){
                binding.btn3x3.isClickable = false
                binding.btn4x4.isClickable = false
                bundle.putString("dimension", "5")
            }
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.bruh, fragment)
                .addToBackStack(null)
                .commit()

        }



    }


    fun setup(){

    }


}
