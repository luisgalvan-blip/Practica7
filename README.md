# Sistema de Monitoreo de Hardware Distribuido

Este proyecto fue desarrollado como parte de la práctica de herencia en la materia de Programación Orientada a Objetos. El objetivo principal es simular un sistema capaz de gestionar distintos tipos de sensores electrónicos, aplicando conceptos fundamentales como herencia, clases abstractas y polimorfismo en Java.

El sistema está diseñado a partir de una clase base llamada DispositivoElectronico, de la cual se deriva la clase Sensor. A partir de esta clase abstracta se crean diferentes tipos de sensores como SensorTemperatura, SensorPresion y SensorAceleracion, cada uno con su propio comportamiento al momento de realizar lecturas.

El programa permite crear varios sensores, almacenarlos en una lista y ejecutar sus métodos de forma polimórfica. Esto significa que todos los sensores son tratados como objetos del mismo tipo base, pero cada uno responde de manera diferente al ejecutar el método leerValor.

El proyecto incluye las siguientes clases:

DispositivoElectronico
Define las características generales de cualquier dispositivo, como modelo, fabricante, consumo de energía y estado. También incluye métodos para encender, apagar y consultar su estado.

Sensor
Es una clase abstracta que representa un sensor genérico. Define atributos como la unidad de medida y el estado de calibración, además de declarar el método abstracto leerValor que debe ser implementado por las subclases.

SensorTemperatura
Simula un sensor que mide temperatura generando valores aleatorios dentro de un rango definido.

SensorPresion
Simula un sensor de presión atmosférica con valores aleatorios dentro de un rango específico.

SensorAceleracion
Simula un sensor de aceleración en tres ejes, mostrando valores en X, Y y Z y calculando la magnitud total.

SistemaMonitoreo
Es la clase principal donde se crean los sensores, se almacenan en una lista y se ejecutan sus métodos para demostrar el uso del polimorfismo.


Este proyecto permite entender de manera práctica cómo se puede organizar el código utilizando herencia, así como la importancia de las clases abstractas para definir estructuras comunes y el uso del polimorfismo para trabajar con diferentes objetos de forma general.
