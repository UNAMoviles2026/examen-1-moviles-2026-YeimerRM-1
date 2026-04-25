package com.moviles.examenmoviles.repository

import com.moviles.examenmoviles.data.Space

class SpaceRepository {
    private val spaces = listOf(
        Space(1, "Sala de Juntas A", "Sala equipada con proyector y capacidad: 10 personas.", 15000.0),
        Space(2, "Escritorio Individual", "Espacio tranquilo con silla y conexión de alta velocidad.", 5000.0),
        Space(3, "Oficina Privada", "Oficina con aire acondicionado y ventaja grande.", 25000.0)
    )

    fun getSpaces(): List<Space> = spaces

    fun getSpaceById(id: Int): Space? = spaces.find { it.id == id }
}
