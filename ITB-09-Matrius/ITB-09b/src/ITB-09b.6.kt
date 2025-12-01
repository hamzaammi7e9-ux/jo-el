fun main() {

    // Leemos el número de casos de prueba (T)
    val totalCases = readLine()!!.toInt()

    // Bucle para iterar sobre cada caso de prueba
    for (caseCount in 0 until totalCases) {

        // --- LECTURA INICIAL DE F Y C ---
        val fcInput = readLine()!!.split(" ")
        val rows = fcInput[0].toInt() // F
        val cols = fcInput[1].toInt() // C

        // --- CREACIÓN DE MATRICES ---

        // 1. Matriz de juego: Guarda los '1' (gatos) y '0' (vacío).
        val gameBoard = MutableList(rows) { mutableListOf<Int>() }

        // 2. Matriz de seguimiento: Inicializada a FALSE. True si el gato ya se usó.
        val usedMatrix = MutableList(rows) { MutableList(cols) { false } }

        // --- LLENAR LA MATRIZ DE JUEGO ---
        for (r in 0 until rows) {
            val rowInput = readLine()!!.split(" ")
            for (c in 0 until cols) {
                gameBoard[r].add(rowInput[c].toInt())
            }
        }

        // --- 2. ALGORITMO PRINCIPAL: BÚSQUEDA ---

        var totalLinesCount = 0

        // Direcciones a verificar: (dr, dc)
        // Solo necesitamos chequear 4 direcciones (Derecha, Abajo, Diagonales)
        val dr = intArrayOf(0, 1, 1, 1)    // Cambio en filas (Down/Vertical)
        val dc = intArrayOf(1, 0, 1, -1)   // Cambio en columnas (Right/Horizontal/Diagonal)


        // Bucle Anidado Principal: Recorre CADA celda de la matriz (r, c)
        for (r in 0 until rows) {
            for (c in 0 until cols) {

                // Si encontramos un '1' (Gato), chequeamos todas las direcciones
                if (gameBoard[r][c] == 1) {

                    // Bucle para chequear las 4 direcciones
                    for (d in 0 until 4) {

                        // Coordenadas de los 3 puntos de la línea: P1, P2, P3
                        // P1 es (r, c)
                        val r2 = r + dr[d]      // Fila P2
                        val c2 = c + dc[d]      // Columna P2
                        val r3 = r + 2 * dr[d]  // Fila P3
                        val c3 = c + 2 * dc[d]  // Columna P3

                        // 1. Verificación de LÍMITES (P3 es el punto más lejano)
                        val isWithinBounds = (r3 >= 0 && r3 < rows) && (c3 >= 0 && c3 < cols)

                        if (isWithinBounds) {

                            // 2. Verificación de GATOS (P1, P2, y P3 deben ser '1')
                            val isThreeCats = gameBoard[r2][c2] == 1 && gameBoard[r3][c3] == 1

                            // 3. Verificación de USO (Ninguno de los 3 puntos debe haber sido usado antes)
                            val isNotUsed = !usedMatrix[r][c] && !usedMatrix[r2][c2] && !usedMatrix[r3][c3]

                            if (isThreeCats && isNotUsed) {
                                // ¡LÍNEA ENCONTRADA Y VÁLIDA!
                                totalLinesCount++

                                // 4. MARCAR COMO USADO (No Reutilización)
                                usedMatrix[r][c] = true
                                usedMatrix[r2][c2] = true
                                usedMatrix[r3][c3] = true
                            }
                        }
                    }
                }
            }
        }

        // --- 3. SALIDA ---
        println(totalLinesCount)
    }
}