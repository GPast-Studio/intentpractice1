package com.gpaststudio.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

//            입력한 새 닉네임이 뭔지, 새 변수로 저장.
            val inputNewNickname = newNicknameEdt.text.toString()

//            입력된 닉네임을 갖고 다시 메인 activity로 복귀.

//            입력한 닉네임을 담아두기 위한 용도의 intent
           val resultIntent = Intent()
            resultIntent.putExtra("nickname",inputNewNickname)
//            버튼을 눌러서 돌아가야 한다, 단순 back 버튼 눌러서 가는 걸로는 안된다. 검증 필요

            setResult(RESULT_OK,resultIntent)
//            돌아가자

            finish()

        }


    }
}