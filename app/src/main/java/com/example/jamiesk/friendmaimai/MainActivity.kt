package com.example.jamiesk.friendmaimai

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var firstTime: Int = 1
    val friends = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        friendButton.setEnabled( false )

        adapter = ArrayAdapter( this,
                android.R.layout.simple_list_item_1,
                friends )
        friendListView.adapter = adapter

        if( firstTime == 1 ) {
            initialAddFriend()
        }
    }

    fun initialAddFriend() {
        for( i in 1 until 10 step 1 ) {
            friends.add("Varit Ass " + i)
            firstTime = 0
        }
        adapter?.notifyDataSetChanged()
    }

    fun friendbuttonClicked(view: View) {
        // Do nothing
    }

    fun chatbuttonClicked(view: View) {
        val intent = Intent(this, ChatActivity::class.java )
        startActivity( intent )
    }

    fun timelinebuttonClicked(view: View) {
        val intent = Intent(this, TimelineActivity::class.java )
        startActivity( intent )
    }

    fun settingsbuttonClicked(view: View) {
        val intent = Intent(this, SettingsActivity::class.java )
        startActivity( intent )
    }

}
