package com.moviles.examenmoviles.repository

import com.moviles.examenmoviles.data.Space

class SpaceRepository {
    private val spaces = listOf(
        Space(
            id = 1,
            name = "Sala de Juntas A",
            description = "Sala equipada con proyector y capacidad para 10 personas.",
            location = "Piso 2, Ala Norte",
            capacity = 10,
            pricePerHour = 25.0
        ),
        Space(
            id = 2,
            name = "Escritorio Individual",
            description = "Espacio tranquilo con silla ergonómica y conexión de alta velocidad.",
            location = "Piso 1, Área Abierta",
            capacity = 1,
            pricePerHour = 10.0
        ),
        Space(
            id = 3,
            name = "Oficina Privada",
            description = "Oficina con aire acondicionado y vista a la ciudad.",
            location = "Piso 3, Oficina 305",
            capacity = 4,
            pricePerHour = 50.0
        )
    )

    fun getSpaces(): List<Space> = spaces

    fun getSpaceById(id: Int): Space? = spaces.find { it.id == id }
}
