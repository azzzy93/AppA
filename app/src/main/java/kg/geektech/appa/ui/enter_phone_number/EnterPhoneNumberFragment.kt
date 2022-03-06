package kg.geektech.appa.ui.enter_phone_number

import by.kirich1409.viewbindingdelegate.viewBinding
import kg.geektech.appa.R
import kg.geektech.appa.base.BaseFragment
import kg.geektech.appa.databinding.FragmentEnterPhoneNumberBinding
import kg.geektech.appa.ui.enter_code.EnterCodeFragment
import kg.geektech.appa.utils.replaceFragment
import kg.geektech.appa.utils.showToast

class EnterPhoneNumberFragment : BaseFragment(R.layout.fragment_enter_phone_number) {

    private val mBinding: FragmentEnterPhoneNumberBinding by viewBinding()

    override fun onStart() {
        super.onStart()

        mBinding.fabNext.setOnClickListener {
            sendCode()
        }
    }

    private fun sendCode() {
        val phoneNumber = mBinding.etPhoneNumber.text.toString().trim()
        if (phoneNumber.isEmpty()) {
            requireContext().showToast("Введите номер телефона")
        } else {
            replaceFragment(EnterCodeFragment())
        }
    }

}