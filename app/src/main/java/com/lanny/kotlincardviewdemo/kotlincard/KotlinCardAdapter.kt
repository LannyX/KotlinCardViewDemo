package com.lanny.kotlincardviewdemo.kotlincard

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lanny.kotlincardviewdemo.R

class KotlinCardAdapter(val dataset: ArrayList<String>) : RecyclerView.Adapter<KotlinCardAdapter.ViewHolder>() {

    class ViewHolder(v : View): RecyclerView.ViewHolder(v) {
        val ktv1 : TextView
        val ktv2 : TextView
        val ktv3 : TextView

        //bind view with id and set listeners
        init {
            ktv1 = v.findViewById(R.id.ktv1)
            ktv2 = v.findViewById(R.id.ktv2)
            ktv3 = v.findViewById(R.id.ktv3)

            ktv1.setOnClickListener {
                Log.e(TAG, "KTV 1 selected!")
            }
        }


    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): KotlinCardAdapter.ViewHolder {

        val v = LayoutInflater.from(p0.context).inflate(R.layout.kotlin_row_layout, p0, false)
        return ViewHolder(v)
    }

    //replace return dataset.sizr in the class
    override fun getItemCount() = dataset.size


    override fun onBindViewHolder(p0: KotlinCardAdapter.ViewHolder, p1: Int) {

//        p0.ktv1.text = dataset.get(0)
        p0.ktv1.text = "hello"
        p0.ktv2.text = "from the other side"
        p0.ktv3.text = "cannot be"


    }

    companion object {
        private val TAG = "KotlinCardAdapter"
    }


}