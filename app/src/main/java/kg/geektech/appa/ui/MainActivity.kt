package kg.geektech.appa.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kg.geektech.appa.R
import kg.geektech.appa.databinding.ActivityMainBinding
import kg.geektech.appa.objects.AppDrawer
import kg.geektech.appa.ui.chats.ChatsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mToolbar: Toolbar
    private lateinit var mAppDrawer: AppDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        setSupportActionBar(mToolbar)
        mAppDrawer.create()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, ChatsFragment()).commit()
    }

    private fun initFields() {
        mToolbar = mBinding.toolbar
        mAppDrawer = AppDrawer(this, mToolbar)
    }
}