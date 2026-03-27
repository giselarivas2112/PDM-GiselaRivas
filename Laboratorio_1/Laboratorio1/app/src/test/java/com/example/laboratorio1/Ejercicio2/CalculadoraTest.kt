package com.example.laboratorio1.Ejercicio2

import org.junit.Test

class CalculadoraTest {

    @Test
    fun probarCalculadora() {

        val calc = Calculadora(marca = "Samsung", aniosDeVida = 11, precio = 12.99)

        println("--- Calculadora ${calc.marca} ---")
        println("Años de vida: ${calc.aniosDeVida}")
        println("Precio: $${calc.precio}")

        println("\n--- Operaciones ---")

        val a = 10.0
        val b = 5.0

        println("$a + $b = ${calc.sumar(a, b)}")
        println("$a - $b = ${calc.restar(a, b)}")
        println("$a * $b = ${calc.multiplicar(a, b)}")
        println("$a / $b = ${calc.dividir(a, b)}")

        // prueba división entre cero 👀
        println("$a / 0 = ${calc.dividir(a, b = 0.0)}")
    }
}