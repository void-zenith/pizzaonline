package com.example.zenithrajbhandari_mapd711_assign4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zenithrajbhandari_mapd711_assign4.db.pizza.PizzaRepository
import com.example.zenithrajbhandari_mapd711_assign4.model.Pizza
import kotlinx.coroutines.launch

class PizzaViewModel(
    private val pizzaRepository: PizzaRepository
) : ViewModel() {
//    private val _users = MutableLiveData<List<User>>()
//    val users: LiveData<List<User>>
//        get() = _users
//
//    init {
//        getAllUsers()
//    }

    private val _users = MutableLiveData<List<Pizza>>()
    val users: LiveData<List<Pizza>>
        get() = _users

//    init {
//        getUsers()
//    }

    private fun getUsers() {
        viewModelScope.launch {
            val result = pizzaRepository.getAllPizza()
            _users.value = result
        }
    }

    suspend fun getAllUsers(): List<Pizza> {
        return pizzaRepository.getAllPizza()
//        viewModelScope.launch {
//            val result = userRepository.getAllUsers()
////            _users.value = result
//        }
    }

    fun insertPizza(order: Pizza) {
        viewModelScope.launch {
            pizzaRepository.insertPizza(Pizza)
        }
    }

    fun updatePizza(order: Pizza) {
        viewModelScope.launch {
            pizzaRepository.updatePizza(Pizza)
        }
    }

    fun deletePizza(pizza: Pizza) {
        viewModelScope.launch {
            pizzaRepository.deletePizza(Pizza)
        }
    }

    fun deleteAll() {
        viewModelScope.launch {
            pizzaRepository.deleteAll()
        }
    }
}