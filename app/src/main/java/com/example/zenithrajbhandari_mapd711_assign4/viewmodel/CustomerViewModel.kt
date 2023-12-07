package com.example.zenithrajbhandari_mapd711_assign4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zenithrajbhandari_mapd711_assign4.db.Customer.CustomerRepository
import com.example.zenithrajbhandari_mapd711_assign4.model.Customer
import kotlinx.coroutines.launch

class CustomerViewModel(
    private val customerRepository: CustomerRepository
) : ViewModel() {
//    private val _users = MutableLiveData<List<User>>()
//    val users: LiveData<List<User>>
//        get() = _users
//
//    init {
//        getAllUsers()
//    }

    private val _users = MutableLiveData<List<Customer>>()
    val users: LiveData<List<Customer>>
        get() = _users

//    init {
//        getUsers()
//    }

    private fun getUsers() {
        viewModelScope.launch {
            val result = customerRepository.getAllCustomer()
            _users.value = result
        }
    }

    suspend fun getAllUsers(): List<Customer> {
        return customerRepository.getAllCustomer()
//        viewModelScope.launch {
//            val result = userRepository.getAllUsers()
////            _users.value = result
//        }
    }

    fun insertCustomer(customer: Customer) {
        viewModelScope.launch {
            customerRepository.insertCustomer(customer)
        }
    }

    fun updateCustomer(customer: Customer) {
        viewModelScope.launch {
            customerRepository.updateCustomer(customer)
        }
    }

    fun deleteCustomer(customer: Customer) {
        viewModelScope.launch {
            customerRepository.deleteCustomer(customer)
        }
    }

    fun deleteAll() {
        viewModelScope.launch {
            customerRepository.deleteAll()
        }
    }
}