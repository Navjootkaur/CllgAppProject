package com.navjoot.cllgappproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class BaseAdapterClass(var itemList:MutableList<ItemDataClassEntity>) : BaseAdapter()
{
    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): Any {
          return  itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return itemList[position].itemQuantity?:0L
    }

    override fun getView(position: Int, p1: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.base_adapter,parent,false)
        var tvIN=view.findViewById<TextView>(R.id.tvIN)
        var tvIQ=view.findViewById<TextView>(R.id.tvIQ)
        tvIN.setText("${itemList[position].itemName}")
        tvIQ.setText("${itemList[position].itemQuantity}")
        return view
    }

}