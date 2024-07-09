package com.rohit.sixthenthapplication

import android.util.Log
import android.util.Size
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rohit.sixthenthapplication.databinding.ActivityAdapterBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var binding : ActivityAdapterBinding? =null
    var arraySize = 0
    val TAG = "RecyclerAdapter"
    class ViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var text_no : TextView = view.findViewById(R.id.text_no)
        var text_name : TextView = view.findViewById(R.id.text_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arraySize
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e(TAG, "onBindViewHolder: position $position", )

        holder.text_no.setText(position.toString())
    }
    fun UpdateArray(arraySize: Int) {
        this.arraySize = arraySize
        notifyDataSetChanged()

    }

}