package com.example.zenithrajbhandari_mapd711_assign4.db.Customer

import com.example.zenithrajbhandari_mapd711_assign4.model.Customer


class CustomerRepository(
    private val customerDAO: CustomerDAO
){
    suspend fun insertCustomer(customer: Customer){
        customerDAO.insertCustomer(customer)
    }

    suspend fun getAllCustomer(): List<Customer>{
        return customerDAO.getAllCustomer()
    }

    suspend fun updateCustomer(customer:Customer) {
        customerDAO.updateCustomer(customer)
    }

    suspend fun deleteCustomer(customer:Customer) {
        customerDAO.deleteCustomer(customer)
    }

    suspend fun deleteAll() {
        customerDAO.deleteAll()
    }

}