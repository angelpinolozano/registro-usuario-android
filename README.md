# Registro de usuario (Android)

App Android en Kotlin con dos pantallas (Activities) que recoge los datos de un usuario y los muestra en una segunda pantalla.

## Pantalla 1: formulario
- TextView con el título
- Dos EditText: nombre y edad
- Dos CheckBox: Java y Kotlin
- RadioGroup: Mañana / Tarde
- Botón "Enviar"

Al pulsar "Enviar" se validan nombre y edad. Si alguno está vacío, se muestra un Toast con un mensaje de error. Si todo es correcto, los datos se envían a la segunda pantalla con un Intent.

## Pantalla 2: resultado
Muestra el nombre, la edad, las tecnologías seleccionadas y el turno elegido, con un botón "Volver" que cierra la pantalla.

## Conceptos utilizados
- `findViewById`
- `setOnClickListener`
- `Intent`, `putExtra` y `getStringExtra`
- Layouts XML

## Autor
Ángel Pino Lozano
