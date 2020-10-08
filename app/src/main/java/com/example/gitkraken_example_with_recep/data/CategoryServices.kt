package com.example.gitkraken_example_with_recep.data

import com.example.gitkraken_example_with_recep.data.models.CategoriesModel

interface CategoryServices {
    fun getCategories(serviceCallback: ServiceCallback<List<CategoriesModel>>)}