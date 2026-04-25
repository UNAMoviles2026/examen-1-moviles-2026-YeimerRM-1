package com.moviles.examenmoviles.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.moviles.examenmoviles.ui.components.SpaceCard
import com.moviles.examenmoviles.viewmodel.SpaceViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onSpaceClick: (Int) -> Unit,
    viewModel: SpaceViewModel = viewModel()
) {
    val spaces by viewModel.spaces.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Coworking UNA") })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 8.dp)
        ) {
            items(spaces) { space ->
                SpaceCard(
                    space = space,
                    onClick = { onSpaceClick(space.id) }
                )
            }
        }
    }
}
