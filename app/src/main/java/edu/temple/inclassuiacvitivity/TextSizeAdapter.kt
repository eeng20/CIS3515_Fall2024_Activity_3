package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val numberArray: Array<Int>) : BaseAdapter() {


    override fun getCount(): Int {
        return numberArray.size
    }

    override fun getItem(position: Int): Any {
        return numberArray[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if (convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)

        }
        textView.text = numberArray[position].toString()
        textView.setPadding(5, 10, 0, 10)
        textView.textSize = 20f

        return textView


    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView

        if (convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)
            textView.setPadding(5, 10, 0, 10)
        }

        // Set the text size for dropdown items
        textView.textSize = numberArray[position].toFloat()
        textView.text = "${numberArray[position]}" // Optional: Displaying the size

        return textView
    }

}