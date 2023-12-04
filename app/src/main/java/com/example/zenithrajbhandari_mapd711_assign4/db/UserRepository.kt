package com.example.zenithrajbhandari_mapd711_assign4.db

import com.example.zenithrajbhandari_mapd711_assign4.model.User

class UserRepository(
    private val userDao: UserDao
) {

    suspend fun insertUser(user: User){
        userDao.insertUser(user)
    }

    suspend fun getAllUsers(): List<User>{
        return userDao.getAllUsers()
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }

    suspend fun deleteAll() {
        userDao.deleteAll()
    }

}