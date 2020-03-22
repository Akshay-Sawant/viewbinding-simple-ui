package com.akshay.vbsimpleui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.akshay.vbsimpleui.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var mActivityMainBinding: ActivityMainBinding
    private lateinit var mMainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mActivityMainBinding.root)

        mMainViewModel = MainViewModel()

        Glide.with(this@MainActivity)
            .load(R.drawable.ic_people)
            .error(R.drawable.ic_launcher_foreground)
            .into(mActivityMainBinding.imageViewProfilePic)

        mActivityMainBinding.textViewFirstName.text = mMainViewModel.mFirstName
        mActivityMainBinding.textViewLastName.text = mMainViewModel.mLastName
        mActivityMainBinding.textViewEmailId.text = mMainViewModel.mEmailId
        mActivityMainBinding.textViewMobileNo.text = mMainViewModel.mMobileNumber

        mActivityMainBinding.buttonNextScreen.setOnClickListener {
            Toast.makeText(this@MainActivity, "Clicked..!", Toast.LENGTH_SHORT).show()
        }
    }
}
