package com.gpaststudio.intentpractice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1005
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        kakaoStoreBtn.setOnClickListener {


//            앱 업데이트 화면 노출 용
            val myUri 용 Uri.parse("https://naver.com")
            val myIntent = Intent(Intent.ACTION_VIEW,myUri)
            startActivity(myIntent)

        }

        naverWebBtn.setOnClickListener {

            val myUri = Uri.parse("https://naver.com")
            val myIntent = Intent(Intent.ACTION_VIEW,myUri)
            startActivity(myIntent)

        }






        smsBtn.setOnClickListener {

//            sms 로 본인 인증하기

         기  val inputPhoneNumb = phoneNumbEdt.text.toString()
            val myUri = Uri.parse("smsto : ${inputPhoneNumb}")
            val myIntent = Intent(Intent.ACTION_SENDTO,myUri)
            myIntent.putExtra("sms_body","미리내용입력")
            startActivity(myIntent)


        }




        callBtn.setOnClickListener {


            val inputPhoneNumb = phoneNumbEdt.text.toString()
            val myUri = Uri.parse("tel : ${inputPhoneNumb}")
            val myIntent = Intent(Intent.ACTION_CALL,myUri)
            startActivity(myIntent)




        }


//        dial 액션 예제

        dialBtn.setOnClickListener {

//            phoneNumbEdt에 입력된 전화번호를 가져와 여기에 연결

            val inputPhoneNumb = phoneNumbEdt.text.toString()

            val myUri = Uri.parse("tel : ${inputPhoneNumb}")

            val myIntent = Intent(Intent.ACTION_DIAL,myUri)

            startActivity(myIntent)




        }



        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent,REQUEST_FOR_NICKNAME)

        }

        sendMessageBtn.setOnClickListener {

//            입력한 메시지를 변수에 저장.
            val inputMessage = messageEdt.text.toString()

//            비행기 티권 발권
            val myIntent = Intent(this, MessageActivity::class.java)

//            수화물 첨부
            myIntent.putExtra("message",inputMessage)

//            실제 출발
            startActivity(myIntent)



        }



        moveToOtherBtn.setOnClickListener {

//            다른화면으로 이동하기(main=>other)

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)




        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        돌아온 이유가 닉네임을 받으러 다녀온 게 맞는지?
        if(requestCode == REQUEST_FOR_NICKNAME){


//            추가 질문 : 확인을 눌러서 돌아온 게 맞는가?

            if(resultCode == RESULT_OK) {

//                실제 첨부된 새 닉네임을 꺼내서 텍스트뷰에 반영

                val newNickname = data?.getStringExtra("nickname")
                nicknameTxt.text = newNickname
            }
        }
    }

}