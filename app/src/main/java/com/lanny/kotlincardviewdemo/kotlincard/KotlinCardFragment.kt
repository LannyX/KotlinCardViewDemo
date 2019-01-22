package com.lanny.kotlincardviewdemo.kotlincard


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lanny.kotlincardviewdemo.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class KotlinCardFragment : Fragment() {

    private lateinit var myCardView : CardView
    private lateinit var myRecyclerView: RecyclerView
    private lateinit var layoutManagerType: LayoutManagerType
    private lateinit var layoutManager : RecyclerView.LayoutManager
    private lateinit var dataList : ArrayList<String>


    enum class LayoutManagerType{
        GRID_LAYOUT_MANAGER, LINEAR_LAYOUT_MANAGER
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_kotlin_card, container, false)

        myRecyclerView = rootView.findViewById(R.id.recyclerViewKotlin)
        // same to getActivity in java
        layoutManager = LinearLayoutManager(activity)
        layoutManagerType = LayoutManagerType.GRID_LAYOUT_MANAGER
        myRecyclerView.layoutManager = layoutManager

        myRecyclerView.adapter = KotlinCardAdapter(dataList)
        return rootView
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setting data for dataset
        prepareDataSet()
    }

    private fun prepareDataSet() {

        dataList = ArrayList()
        dataList.add("hi")
        dataList.add("my name is")
        dataList.add("Slim Shady")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        myCardView = view.findViewById(R.id.card_view_kotlin)
    }

}
