package kg.geektech.appa.ui.enter_code

import androidx.core.widget.addTextChangedListener
import by.kirich1409.viewbindingdelegate.viewBinding
import kg.geektech.appa.R
import kg.geektech.appa.base.BaseFragment
import kg.geektech.appa.databinding.FragmentEnterCodeBinding
import kg.geektech.appa.utils.showToast

class EnterCodeFragment : BaseFragment(R.layout.fragment_enter_code) {

    private val mBinding: FragmentEnterCodeBinding by viewBinding()

    override fun onStart() {
        super.onStart()

        initListeners()
    }

    private fun initListeners() {
        mBinding.etCode.addTextChangedListener {
            if (it?.toString()?.length == 6) {
                verificationCode()
            }
        }
    }

    private fun verificationCode() {
        requireContext().showToast("Ok")
    }
}