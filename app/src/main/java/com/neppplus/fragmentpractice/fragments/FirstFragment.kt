package com.neppplus.fragmentpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.neppplus.fragmentpractice.R

class FirstFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//    }(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//        val changeTextBtn = view.findViewById<Button>(R.id.changeTextBtn)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val changeTextBtn = view.findViewById<Button>(R.id.changeTextBtn)

        changeTextBtn.setOnClickListener{
            //임시로->텍스트뷰 문구를 안녕하세요 라고 변경
            val contentTxt = view.findViewById<TextView>(R.id.contentTxt)
            contentTxt.text="안녕하세요"
        }
    }
}

