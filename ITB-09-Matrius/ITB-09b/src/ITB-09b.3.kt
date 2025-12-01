fun main() {

    // --- 1. Lectura de Entrada y Conversión Simple ---

    // Leemos la primera línea (ej: "5 6") y la separamos
    val sizeInput = readLine()!!.split(" ")

    // Convertimos los tamaños a enteros (totalRows, totalCols).
    // Usamos toInt() directamente, asumiendo que la entrada es correcta.
    val totalRows: Int = sizeInput[0].toInt() // F
    val totalCols: Int = sizeInput[1].toInt() // C

    // Leemos la segunda línea (ej: "1 2 3 5") y la separamos
    val rectInput = readLine()!!.split(" ")

    // Las coordenadas vienen en base 1. Restamos 1 inmediatamente para obtener índices base 0.

    // Superior Izquierda: startRowIndex, startColIndex
    val startRowIndex: Int = rectInput[0].toInt() - 1
    val startColIndex: Int = rectInput[1].toInt() - 1

    // Inferior Derecha: endRowIndex, endColIndex
    val endRowIndex: Int = rectInput[2].toInt() - 1
    val endColIndex: Int = rectInput[3].toInt() - 1


    // --- 2. Creación e Inicialización de la Matriz ---

    // Creamos una matriz (List of MutableList) de caracteres (Char)
    // Inicializamos todas las celdas con el carácter de borde '.'
    val rasterMatrix = MutableList(totalRows) {
        MutableList(totalCols) { '.' }
    }


    // --- 3. Dibujo del Rectángulo (Bucles Anidados y Condicionales) ---

    // Bucle externo: Itera sobre las FILAS (i)
    for (rowIndex in 0 until totalRows) {

        // Bucle interno: Itera sobre las COLUMNAS (j)
        for (colIndex in 0 until totalCols) {

            // Condicional: Verificamos si la posición actual está DENTRO de los límites del rectángulo.
            val rowIsInside = rowIndex >= startRowIndex && rowIndex <= endRowIndex
            val colIsInside = colIndex >= startColIndex && colIndex <= endColIndex

            if (rowIsInside && colIsInside) {
                // Si la fila Y la columna están dentro del rango, dibujamos la 'X'
                rasterMatrix[rowIndex][colIndex] = 'X'
            }

            // Si no está dentro, se queda como '.'
        }
    }


    // --- 4. Salida (Impresión Final) ---

    // Bucle para recorrer e imprimir cada fila
    for (row in rasterMatrix) {
        // Imprimimos la fila completa (une los caracteres sin separador)
        println(row.joinToString(separator = ""))
    }
}