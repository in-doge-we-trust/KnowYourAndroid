package itis.kpfu.ru.knowyourandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import itis.kpfu.ru.knowyourandroid.R.layout

class MethodListFragment : MvpAppCompatFragment() {

    companion object {

        fun newInstance(): MethodListFragment {
            return MethodListFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        return inflater.inflate(layout.fragment_list, container, false)
    }
}