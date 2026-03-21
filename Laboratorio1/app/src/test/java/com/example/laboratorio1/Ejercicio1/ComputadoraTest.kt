package com.example.laboratorio1.Ejercicio1

import org.junit.Test

class ComputadoraTest {

    @Test
    fun pruebaComputadora() {
        val compu = Computadora(ram = 16, almacenamiento = 256, sistemaOperativo = "Windows")

        compu.encender()

        println("-- Datos iniciales --")
        println("RAM: ${compu.ram} GB")
        println("Almacenamiento: ${compu.almacenamiento} GB")
        println("Sistema Operativo: ${compu.sistemaOperativo}")

        compu.agregarPrograma(Programa(nombre = "Notion 2026"))
        compu.agregarPrograma(Programa(nombre = "Pinterest 2026"))
        compu.agregarPrograma(Programa(nombre = "TikTok 2026"))
        compu.agregarPrograma(Programa(nombre = "Facebook 2024"))

        val lista2026 = compu.programasDel2026()
        println("Programas del 2026: $lista2026")

        compu.actualizar(ramNueva = 32, almacenamientoNuevo = 500, soNuevo = "Linux")

        println("-- Después de actualizar --")
        println("Nueva RAM: ${compu.ram} GB")
        println("Nuevo Almacenamiento: ${compu.almacenamiento} GB")
        println("Nuevo SO: ${compu.sistemaOperativo}")

        compu.apagar()
    }
}