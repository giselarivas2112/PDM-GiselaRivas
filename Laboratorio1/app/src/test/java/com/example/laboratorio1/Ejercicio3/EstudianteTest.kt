package com.example.laboratorio1.Ejercicio3

import org.junit.Test

class EstudianteTest {

    @Test
    fun probarEstudiantes() {

        val ciclo01 = mutableListOf<Estudiante>()

        // Programación de Dispositivos Móviles
        ciclo01.add(Estudiante(nombre = "Luz", carnet = "00016124", asignatura = "Programación de Dispositivos Móviles"))
        ciclo01.add(Estudiante(nombre = "Daniel", carnet = "00045824", asignatura = "Programación de Dispositivos Móviles"))
        ciclo01.add(Estudiante(nombre = "Eunice", carnet = "00147124", asignatura = "Programación de Dispositivos Móviles"))

        // Análisis Numérico
        ciclo01.add(Estudiante(nombre = "María", carnet = "0001118", asignatura = "Análisis Numérico"))
        ciclo01.add(Estudiante(nombre = "Pedro", carnet = "0002229", asignatura = "Análisis Numérico"))
        ciclo01.add(Estudiante(nombre = "Sofía", carnet = "0003331", asignatura = "Análisis Numérico"))
        ciclo01.add(Estudiante(nombre = "Jorge", carnet = "0004442", asignatura = "Análisis Numérico"))

        // Filtrar solo Dispositivos Móviles 👀
        val moviles = ciclo01.filter {
            it.asignatura == "Programación de Dispositivos Móviles"
        }

        println("--- Estudiantes de Dispositivos Móviles ---")

        moviles.forEach {
            println("${it.nombre} - ${it.carnet}")
        }
    }
}