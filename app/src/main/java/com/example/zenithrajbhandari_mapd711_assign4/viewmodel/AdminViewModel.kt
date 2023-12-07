package com.example.zenithrajbhandari_mapd711_assign4.viewmodel

import Admin
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zenithrajbhandari_mapd711_assign4.db.admin.AdminRepository
import kotlinx.coroutines.launch

class AdminViewModel(
    private val adminRepository: AdminRepository
) : ViewModel() {
//    private val _users = MutableLiveData<List<User>>()
//    val users: LiveData<List<User>>
//        get() = _users
//
//    init {
//        getAllUsers()
//    }

    private val _users = MutableLiveData<List<Admin>>()
    val users: LiveData<List<Admin>>
        get() = _users

//    init {
//        getUsers()
//    }

    private fun getUsers() {
        viewModelScope.launch {
            val result = adminRepository.getAllAdmin()
            _users.value = result
        }
    }

    suspend fun getAllUsers(): List<Admin> {
        return adminRepository.getAllAdmin(

        )
//        viewModelScope.launch {
//            val result = userRepository.getAllUsers()
////            _users.value = result
//        }
    }

    fun insertUser(admin: Admin) {
        viewModelScope.launch {
            adminRepository.insertAdmin(admin)
        }
    }

    fun updateUser(admin: Admin) {
        viewModelScope.launch {
          adminRepository.updateAdmin(admin)
        }
    }

    fun deleteUser(admin: Admin) {
        viewModelScope.launch {
            adminRepository.deleteAdmin(admin)
        }
    }

    fun deleteAll() {
        viewModelScope.launch {
            adminRepository.deleteAll()
        }
    }
}