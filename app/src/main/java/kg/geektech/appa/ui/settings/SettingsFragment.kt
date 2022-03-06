package kg.geektech.appa.ui.settings

import android.view.Menu
import android.view.MenuInflater
import by.kirich1409.viewbindingdelegate.viewBinding
import kg.geektech.appa.R
import kg.geektech.appa.base.BaseFragment
import kg.geektech.appa.databinding.FragmentSettingsBinding

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    private val mBinding: FragmentSettingsBinding by viewBinding()

    override fun onResume() {
        super.onResume()

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings, menu)
    }
}