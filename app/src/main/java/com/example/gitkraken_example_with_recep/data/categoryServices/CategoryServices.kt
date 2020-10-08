package com.example.gitkraken_example_with_recep.data.categoryServices

import com.example.gitkraken_example_with_recep.data.ServiceCallback
import com.example.gitkraken_example_with_recep.data.models.CategoriesModel

interface CategoryServices {
    fun getCategories(serviceCallback: ServiceCallback<List<CategoriesModel>>)}