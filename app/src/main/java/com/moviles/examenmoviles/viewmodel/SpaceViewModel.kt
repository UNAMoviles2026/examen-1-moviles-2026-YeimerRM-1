package com.moviles.examenmoviles.viewmodel

import androidx.lifecycle.ViewModel
import com.moviles.examenmoviles.data.Space
import com.moviles.examenmoviles.repository.SpaceRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SpaceViewModel : ViewModel() {
    private val repository = SpaceRepository()
    
    private val _spaces = MutableStateFlow<List<Space>>(emptyList())
    val spaces: StateFlow<List<Space>> = _spaces.asStateFlow()

    init {
        _spaces.value = repository.getSpaces()
    }

    fun getSpaceById(id: Int): Space? {
        return repository.getSpaceById(id)
    }
}
