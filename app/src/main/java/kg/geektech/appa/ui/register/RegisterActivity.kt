package kg.geektech.appa.ui.register

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import by.kirich1409.viewbindingdelegate.viewBinding
import kg.geektech.appa.R
import kg.geektech.appa.databinding.ActivityRegisterBinding
import kg.geektech.appa.ui.chats.ChatsFragment
import kg.geektech.appa.ui.enter_phone_number.EnterPhoneNumberFragment
import kg.geektech.appa.utils.replaceFragment

class RegisterActivity : AppCompatActivity(R.layout.activity_register) {

    private val mBinding: ActivityRegisterBinding by viewBinding()
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinding.toolbar
        title = "Ваш номер"
        setSupportActionBar(mToolbar)
        replaceFragment(EnterPhoneNumberFragment())
    }
}