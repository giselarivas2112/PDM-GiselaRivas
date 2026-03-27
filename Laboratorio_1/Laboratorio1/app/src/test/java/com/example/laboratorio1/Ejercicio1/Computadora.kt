package com.example.laboratorio1.Ejercicio1

class Computadora(
    var ram: Int,
    var almacenamiento: Int,
    var sistemaOperativo: String
) {

    var encendida: Boolean = false
    var programasInstalados: MutableList<Programa> = mutableListOf()

    fun encender() {
        encendida = true
        println("Computadora encendida")
    }

    fun apagar() {
        encendida = false
        println("Computadora apagada")
    }

    fun actualizar(ramNueva: Int, almacenamientoNuevo: Int, soNuevo: String) {
        ram = ramNueva
        almacenamiento = almacenamientoNuevo
        sistemaOperativo = soNuevo
        println("Computadora actualizada")
    }

    fun agregarPrograma(programa: Programa) {
        programasInstalados.add(programa)
    }

    fun programasDel2026(): List<String> {
        return programasInstalados
            .filter { it.nombre.contains(other = "2026") }
            .map { it.nombre }
    }
}