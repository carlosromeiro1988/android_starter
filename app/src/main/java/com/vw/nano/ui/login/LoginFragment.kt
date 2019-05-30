package com.vw.nano.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vw.nano.databinding.FragmentLoginBinding
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * Fragment for Login
 */
class LoginFragment : Fragment() {

    /**
     * ViewModel
     */
    private val viewModel: LoginViewModel by viewModel()

    /**
     * OnCreateView
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return with(FragmentLoginBinding.inflate(inflater, container, false)) {
            viewModel = this@LoginFragment.viewModel
            lifecycleOwner = viewLifecycleOwner
            root
        }
    }
}
