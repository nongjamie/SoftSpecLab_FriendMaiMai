package com.example.jamiesk.friendmaimai

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    var firstTime: Int = 1
    val settingsList = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        settingButton.setEnabled( false )

        adapter = ArrayAdapter( this , android.R.layout.simple_list_item_1 , settingsList )
        settingsListView.adapter = adapter
        if( firstTime == 1 ) {
            initialAddHistory()
        }
    }

    fun initialAddHistory() {
        settingsList.add("Profile")
        settingsList.add("Password")
        settingsList.add("Notification")
        settingsList.add("Log out")
        firstTime = 0
        adapter?.notifyDataSetChanged()
    }

    fun friendbuttonClicked(view: View) {
        val intent = Intent(this, MainActivity::class.java )
        startActivity( intent )
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
        // Do nothing
    }

}
