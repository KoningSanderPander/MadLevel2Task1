package nl.svdoetelaar.madlevel2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nl.svdoetelaar.madlevel2task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init(){

    }
}