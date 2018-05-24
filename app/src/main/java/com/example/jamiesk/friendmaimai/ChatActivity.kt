package com.example.jamiesk.friendmaimai

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {

    var firstTime: Int = 1
    val chatHistory = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        chatButton.setEnabled( false )

        adapter = ArrayAdapter( this,
                android.R.layout.simple_list_item_1,
                chatHistory )
        chatListView.adapter = adapter

        if( firstTime == 1 ) {
            initialAddHistory()
        }
    }

    fun initialAddHistory() {
        for( i in 1 until 19 step 1 ) {
            chatHistory.add( "Varit Ass " + i + "\n\t Hello Varit Ass " + i + ". How are you today?" )
        }
        firstTime = 0
        adapter?.notifyDataSetChanged()
    }

    fun friendbuttonClicked(view: View) {
        val intent = Intent(this, MainActivity::class.java )
        startActivity( intent )
    }

    fun chatbuttonClicked(view: View) {
        // Do nothing
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
