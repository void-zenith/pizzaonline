package com.example.zenithrajbhandari_mapd711_assign4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zenithrajbhandari_mapd711_assign4.db.order.OrderRepository
import com.example.zenithrajbhandari_mapd711_assign4.model.Order
import kotlinx.coroutines.launch

class OrderViewModel(
    private val orderRepository: OrderRepository
) : ViewModel() {
//    private val _users = MutableLiveData<List<User>>()
//    val users: LiveData<List<User>>
//        get() = _users
//
//    init {
//        getAllUsers()
//    }

    private val _users = MutableLiveData<List<Order>>()
    val users: LiveData<List<Order>>
        get() = _users

//    init {
//        getUsers()
//    }

    private fun getUsers() {
        viewModelScope.launch {
            val result = orderRepository.getAllOrder()
            _users.value = result
        }
    }

    suspend fun getAllUsers(): List<Order> {
        return orderRepository.getAllOrder()
//        viewModelScope.launch {
//            val result = userRepository.getAllUsers()
////            _users.value = result
//        }
    }

    fun insertUser(order: Order) {
        viewModelScope.launch {
            orderRepository.insertOrder(order)
        }
    }

    fun updateUser(order: Order) {
        viewModelScope.launch {
            orderRepository.updateOrder(order)
        }
    }

    fun deleteUser(order: Order) {
        viewModelScope.launch {
            orderRepository.deleteOrder(order)
        }
    }

    fun deleteAll() {
        viewModelScope.launch {
            orderRepository.deleteAll()
        }
    }
}