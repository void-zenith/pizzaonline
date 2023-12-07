package com.example.zenithrajbhandari_mapd711_assign4.db.admin

import Admin

class AdminRepository(
    private val AdminDAO: AdminDAO
){
    suspend fun insertAdmin(admin: Admin){
        AdminDAO.insertAdmin(admin)
    }

    suspend fun getAllAdmin(): List<Admin>{
        return AdminDAO.getAllAdmin()
    }

    suspend fun updateAdmin(admin: Admin) {
        AdminDAO.updateAdmin(admin)
    }

    suspend fun deleteAdmin(admin: Admin) {
        AdminDAO.deleteAdmin(admin)
    }

    suspend fun deleteAll() {
        AdminDAO.deleteAll()
    }

}