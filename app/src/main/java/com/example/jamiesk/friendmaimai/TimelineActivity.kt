package com.example.jamiesk.friendmaimai

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.example.jamiesk.friendmaimai.R.id.timelineButton
import kotlinx.android.synthetic.main.activity_timeline.*

class TimelineActivity : AppCompatActivity() {

    var firstTime: Int = 1
    val timeline = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeline)
        timelineButton.setEnabled( false )

        adapter = ArrayAdapter( this , android.R.layout.simple_list_item_1 , timeline )
        timelineListView.adapter = adapter
        if( firstTime == 1 ) {
            initialAddHistory()
        }
    }

    fun initialAddHistory() {
        timeline.add( "Kong beats Jacky in Hackaton 2018!!! \n\t Kong wins the 1st price in Hackaton 2018 while Jacky gets 2nd price." )
        timeline.add( "Varit is the billionaire : He is the famous pilot, \n\t Varit Ass is the richest man in Kasetsart University." )
        timeline.add( "Varit gets grade A in oop1 and oop2!!! : \n\t He is the genius student in SKE14 and gets king scholarship about computer science in 2018." )
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
       // Do nothing
    }

    fun settingsbuttonClicked(view: View) {
        val intent = Intent(this, SettingsActivity::class.java )
        startActivity( intent )
    }

}
