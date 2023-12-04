package com.example.zenithrajbhandari_mapd711_assign4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zenithrajbhandari_mapd711_assign4.db.UserRepository
import com.example.zenithrajbhandari_mapd711_assign4.model.User
import kotlinx.coroutines.launch

class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {
//    private val _users = MutableLiveData<List<User>>()
//    val users: LiveData<List<User>>
//        get() = _users
//
//    init {
//        getAllUsers()
//    }

    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>>
        get() = _users

//    init {
//        getUsers()
//    }

    private fun getUsers() {
        viewModelScope.launch {
            val result = userRepository.getAllUsers()
            _users.value = result
        }
    }

    suspend fun getAllUsers(): List<User> {
        return userRepository.getAllUsers()
//        viewModelScope.launch {
//            val result = userRepository.getAllUsers()
////            _users.value = result
//        }
    }

    fun insertUser(user: User) {
        viewModelScope.launch {
            userRepository.insertUser(user)
        }
    }

    fun updateUser(user: User) {
        viewModelScope.launch {
            userRepository.updateUser(user)
        }
    }

    fun deleteUser(user: User) {
        viewModelScope.launch {
            userRepository.deleteUser(user)
        }
    }

    fun deleteAll() {
        viewModelScope.launch {
            userRepository.deleteAll()
        }
    }
}