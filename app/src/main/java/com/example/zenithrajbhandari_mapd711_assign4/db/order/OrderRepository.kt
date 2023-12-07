package com.example.zenithrajbhandari_mapd711_assign4.db.order

import com.example.zenithrajbhandari_mapd711_assign4.model.Order


class OrderRepository(
    private val orderDAO: OrderDAO
){
    suspend fun insertOrder(order: Order){
        orderDAO.insertOrder(order)
    }

    suspend fun getAllOrder(): List<Order>{
        return orderDAO.getAllOrder()
    }

    suspend fun updateOrder(order: Order) {
      orderDAO.updateOrder(order)
    }

    suspend fun deleteOrder(order: Order) {
        orderDAO.deleteOrder(order)
    }

    suspend fun deleteAll() {
        orderDAO.deleteAll()
    }

}