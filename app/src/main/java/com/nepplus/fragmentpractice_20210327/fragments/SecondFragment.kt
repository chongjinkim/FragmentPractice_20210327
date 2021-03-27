package com.nepplus.fragmentpractice_20210327.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nepplus.fragmentpractice_20210327.R
import kotlinx.android.synthetic.main.fragment_second.*
import kotlin.math.log

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        seclogBtn.setOnClickListener {
            //Toast.makeText(this, "두번째 Fragment에서 실행", Toast.LENGTH_SHORT).show()

            Log.d("두번째 Fragment에서 실행", "테스트용 로그 출력")
        }
    }
}