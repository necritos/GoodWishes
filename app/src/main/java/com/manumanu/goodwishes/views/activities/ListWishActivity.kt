package com.manumanu.goodwishes.views.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.manumanu.goodwishes.R
import com.manumanu.goodwishes.data.Wish
import com.manumanu.goodwishes.views.adapters.WishAdapter
import io.realm.Realm
import io.realm.Sort
import kotlinx.android.synthetic.main.layout_list_wishes.*



/**
 * Created by manu on 25/04/17.
 */

class ListWishActivity() : AppCompatActivity() {
    lateinit var wishAdapter: WishAdapter
    var listWishes = listOf<Wish>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_list_wishes)
        rv_wishes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_wishes.setHasFixedSize(true)
        wishAdapter = WishAdapter(listWishes)
        rv_wishes.adapter = wishAdapter
        fab_add.setOnClickListener {
            val intent = Intent (this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        renderData()
    }


    fun renderData() {
        val realm = Realm.getDefaultInstance()
        realm.use { realm ->
            val wishes = realm.where(Wish::class.java).findAllSorted("name", Sort.DESCENDING)
            listWishes = realm.copyFromRealm(wishes)
            wishAdapter.items = listWishes
            wishAdapter.notifyDataSetChanged()
        }
    }

}
