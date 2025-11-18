# Trabajo Practico 2 - Programacion 1

---

# Estructuras Implementadas

## Nodo
Estructura básica que contiene:
- Un dato genérico
- Una referencia al siguiente nodo

## ListaEnlazada
Implementación propia con métodos:
- `agregar()`
- `obtener()`
- `eliminar()`
- `size()`
- `esVacia()`
- Recorrido completo por nodos

---

# Adaptación del Sistema Educativo

Las clases que antes usaban arrays ahora usan:

- `ListaEnlazada<Materia>`
- `ListaEnlazada<Estudiante>`
- `ListaEnlazada<Profesor>`

Esto se aplica en:
- `Universidad`
- `Estudiante`
- `Profesor`
- Procesos de búsqueda, listado y ordenamiento

---

# Arrays vs Listas Enlazada

## Arrays
- Tamaño fijo
- Acceso rápido por índice
- Inserciones/eliminaciones costosas

## Listas Enlazadas
- Tamaño dinámico
- Acceso secuencial
- Inserciones/eliminaciones más simples

---

# Ventajas y Desventajas del Cambio

## Ventajas
- Permiten crecer sin límite
- Modificaciones más simples (agregar/eliminar nodos)
- Representan mejor las estructuras de datos vistas en clase

## Desventajas
- Acceso más lento a posiciones específicas
- Código más extenso y propenso a errores si no se maneja con cuidado
