# Sistema de Registro de Vehículos

Aplicación de consola en Java para gestionar vehículos en memoria.

## Funcionamiento

El programa se ejecuta mediante un ciclo `while` controlado por un menú de 3 opciones:

1. **Registrar vehículo:**
   - Verifica disponibilidad en el arreglo (`máximo 5`).
   - Solicita **marca, modelo, año y placa**.
   - Valida que el **año** sea numérico y esté entre `1900` y `2026`.
   - Guarda el objeto `vehiculo` en el arreglo e incrementa el contador.

2. **Mostrar vehículos:**
   - Si no hay registros, notifica que la lista está vacía.
   - Si existen registros, recorre el arreglo e imprime los datos de cada vehículo.

3. **Salir:**
   - Finaliza la ejecución del programa.

