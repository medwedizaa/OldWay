package com.example.oldway

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.oldway.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportFragmentManager.commit {
////            setReorderingAllowed(true)
//            add(R.id.main_container, BackgrounFragment())
////            add<WelcomeFragment>(R.id.main_container)
//        }

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.main_container, WelcomeFragment())
        }

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.main_container, BackgrounFragment())
//            add<WelcomeFragment>(R.id.main_container)
        }


//        binding.conditionToggle.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//                Toast.makeText(
//                    this,
//                    resources.getString(R.string.condition_enabled),
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else {
//                Toast.makeText(
//                    this,
//                    resources.getString(R.string.condition_disables),
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//        }
    }
}

fun myFunction1(str: String): Int {
    return str.length
}

fun myFunction2(str: String) = str.length