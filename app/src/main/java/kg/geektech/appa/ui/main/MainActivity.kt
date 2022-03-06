package kg.geektech.appa.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import by.kirich1409.viewbindingdelegate.viewBinding
import kg.geektech.appa.R
import kg.geektech.appa.databinding.ActivityMainBinding
import kg.geektech.appa.objects.AppDrawer
import kg.geektech.appa.ui.chats.ChatsFragment
import kg.geektech.appa.ui.register.RegisterActivity
import kg.geektech.appa.utils.replaceActivity
import kg.geektech.appa.utils.replaceFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val mBinding: ActivityMainBinding by viewBinding()
    private lateinit var mToolbar: Toolbar
    private lateinit var mAppDrawer: AppDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        if (false){
            setSupportActionBar(mToolbar)
            mAppDrawer.create()
            replaceFragment(ChatsFragment())
        } else {
            replaceActivity(RegisterActivity())
        }

    }

    private fun initFields() {
        mToolbar = mBinding.toolbar
        mAppDrawer = AppDrawer(this, mToolbar)
    }
}