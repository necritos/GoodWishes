package com.manumanu.goodwishes.data

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by manu on 25/04/17.
 */
open class Wish(@PrimaryKey open var id: String? = "",
                open var name: String = "",
                open var description : String = ""
                ): RealmObject(){
}