package com.manumanu.goodwishes.views.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.manumanu.goodwishes.R
import com.manumanu.goodwishes.data.Wish
import com.vicpin.krealmextensions.save
import kotlinx.android.synthetic.main.layout_create_wish.*
import java.util.*

/**
 * Created by manu on 25/04/17.
 */

class RegisterActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_create_wish)
        fab_accept.setOnClickListener {
            createWish()
        }
    }

    fun createWish(){
        if(validate()){
            Wish(UUID.randomUUID().toString(),et_name.text.toString(),et_description.text.toString()).save()
            finish()
        }
    }

    fun validate() : Boolean{
        var validate = true
        if(et_name.text.isEmpty()){
            validate = false
            til_name.error = "Este cmapo no puede estar vacío"
        }
        if(et_description.text.isEmpty()){
            validate = false
            til_description.error = "Este cmapo no puede estar vacío"
        }
        return validate

    }


}
