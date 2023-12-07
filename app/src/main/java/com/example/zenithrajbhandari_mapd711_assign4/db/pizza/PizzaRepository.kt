package com.example.zenithrajbhandari_mapd711_assign4.db.pizza

import com.example.zenithrajbhandari_mapd711_assign4.model.Pizza


class PizzaRepository(
    private val PizzaDAO: PizzaDAO
){
    suspend fun insertPizza(pizza: Pizza){
        PizzaDAO.insertPizza(pizza)
    }

    suspend fun getAllPizza(): List<Pizza>{
        return PizzaDAO.getAllPizza()
    }

    suspend fun updatePizza(pizza: Pizza) {
        PizzaDAO.updatePizza(pizza)
    }

    suspend fun deletePizza(pizza: Pizza) {
        PizzaDAO.deletePizza(pizza)
    }

    suspend fun deleteAll() {
        PizzaDAO.deleteAll()
    }

}