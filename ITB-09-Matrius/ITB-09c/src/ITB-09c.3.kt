fun main() {

    // El problema podría tener múltiples casos de prueba
    while (true) {

        // --- 1. LECTURA DE F Y C ---
        val sizeInput = readLine() ?: break // Leer ej: "3 5". Salir si no hay más entrada.
        val sizes = sizeInput.split(" ")

        // Convertimos a Int. Si la entrada es incorrecta, el programa fallará aquí
        // (pues no estamos usando manejo de errores avanzado como toIntOrNull).
        val rows = sizes[0].toInt() // F
        val cols = sizes[1].toInt() // C


        // --- 2. CREACIÓN Y LLENADO DE LA MATRIZ ACTUAL (currentBoard) ---

        val currentBoard = MutableList(rows) { mutableListOf<Int>() }

        // Bucle para leer y llenar cada fila de la matriz
        for (r in 0 until rows) {
            val line = readLine().orEmpty() // Lee ej: "00001"
            for (c in 0 until cols) {
                // Convierte el carácter '0' o '1' a su valor entero 0 o 1
                currentBoard[r].add(line[c].toString().toInt())
            }
        }

        // --- 3. CREACIÓN DE LA MATRIZ DE LA PRÓXIMA GENERACIÓN ---

        // nextBoard guarda el estado que vamos a calcular. Inicializada a 0 (Muerta).
        val nextBoard = MutableList(rows) { MutableList(cols) { 0 } }


        // --- 4. ALGORITMO PRINCIPAL: CÁLCULO DE LA PRÓXIMA GENERACIÓN ---

        // Vectores para las 8 direcciones (cambio en fila, cambio en columna)
        val dr = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)
        val dc = intArrayOf(-1, 0, 1, -1, 1, -1, 0, 1)

        // Bucle Anidado: Recorre CADA celda de la matriz (r, c)
        for (r in 0 until rows) {
            for (c in 0 until cols) {

                var liveNeighbors = 0

                // Bucle: Revisa los 8 veïns
                for (d in 0 until 8) {
                    val nr = r + dr[d] // Fila del veí
                    val nc = c + dc[d] // Columna del veí

                    // Verificación de LÍMITES: ¿El veí está dentro de la matriz?
                    val isWithinBounds = (nr >= 0 && nr < rows) && (nc >= 0 && nc < cols)

                    if (isWithinBounds) {
                        // Si está dentro y está vivo (valor 1), cuenta.
                        if (currentBoard[nr][nc] == 1) {
                            liveNeighbors++
                        }
                    }
                }

                // --- APLICACIÓN DE LAS REGLAS DE CONWAY ---

                val currentState = currentBoard[r][c]
                var newState = 0 // Inicialmente Muerta (0)

                if (currentState == 1) { // CASO A: VIVA
                    // Regla 2: Sobrevive con 2 o 3 veïns
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        newState = 1 // Sigue viva
                    }
                    // Altrament, muere (solitud o superpoblación)

                } else { // CASO B: MUERTA
                    // Regla 1: Nace con 2 o 3 veïns (NOTA: El enunciado dice 2 O 3, que es inusual, normalmente es solo 3)
                    // **Aplicando la regla del enunciado (2 o 3):**
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        newState = 1 // Nace
                    }
                    // Altrament, permanece muerta
                }

                // Asigna el estado calculado a la matriz de la próxima generación
                nextBoard[r][c] = newState
            }
        }

        // --- 5. SALIDA (Impresión Final) ---

        // Bucle para imprimir cada fila de la matriz resultante
        for (row in nextBoard) {
            // Une los '1' y '0' sin espacios
            println(row.joinToString(separator = ""))
        }
    }
}