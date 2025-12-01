fun main() {

    // El problema pot tenir múltiples casos de prova.
    // Llegeix la primera línia: A (casos) i B (tamany del banc)
    val firstLine = readLine()!!.split(" ")
    val numCases = firstLine[0].toInt() // A
    // No necesitem B (tamany) ja que llegirem la línia completa

    // Bucle principal: Itera sobre el número de casos de prova (A)
    for (caseIndex in 0 until numCases) {

        // --- LECTURA DEL CAS ACTUAL ---

        // Primera línia: Tipus de Pokèmon (ej: "1 2 3 14 2 1")
        val typesInput = readLine()!!.split(" ")

        // Segona línia: Nivells de Pokèmon (ej: "5 20 50 55 27 2")
        val levelsInput = readLine()!!.split(" ")

        // Obtenim el tamany real del banc
        val bankSize = typesInput.size

        // --- 2. MAPA DE MÀXIMS NIVELLS ---

        // mapOfMaxLevels: Un mapa per guardar el TIPUS (String) i el NIVELL MÀXIM (Int) trobat per a aquest tipus.
        // Aquí utilitzarem un MutableMap (diccionario) per guardar la lògica de filtrat.
        val mapOfMaxLevels = mutableMapOf<String, Int>()

        // Bucle per recórrer el banc i determinar el nivell màxim de cada tipus
        for (i in 0 until bankSize) {

            val currentType = typesInput[i]
            val currentLevel = levelsInput[i].toInt()

            // Lògica de COMPARACIÓ:

            // 1. Comprovem si el tipus ja existeix al mapa.
            // .get(currentType) retorna l'últim nivell màxim guardat, o null si no existeix.
            val storedMaxLevel = mapOfMaxLevels[currentType]

            if (storedMaxLevel == null) {
                // CAS A: El tipus és nou (no existeix al mapa).
                // L'afegim amb el seu nivell actual.
                mapOfMaxLevels[currentType] = currentLevel

            } else {
                // CAS B: El tipus ja existeix. Comprovem si el nivell actual és superior.
                if (currentLevel > storedMaxLevel) {
                    // Si és superior, actualitzem el mapa amb el nou nivell màxim.
                    mapOfMaxLevels[currentType] = currentLevel
                }
                // Si és inferior, no fem res (la clau es queda amb el nivell més alt anterior).
            }
        }

        // --- 3. FILTRAT I IMPRESSIÓ FINAL (Mantenint l'Ordre) ---

        var outputLine = ""

        // Tornem a recórrer el banc en l'ordre original de l'entrada
        for (i in 0 until bankSize) {

            val currentType = typesInput[i]
            val currentLevel = levelsInput[i].toInt()

            // Obtenim el nivell MÀXIM que hauria de tenir aquest tipus segons el mapa.
            val requiredMaxLevel = mapOfMaxLevels[currentType]

            // Comprovem dues coses:
            // 1. Si el nivell actual (currentLevel) és EXACTAMENT el nivell màxim (requiredMaxLevel)
            //    que hem calculat per a aquest tipus.
            if (currentLevel == requiredMaxLevel) {

                // 2. Si és el màxim, l'afegim a la sortida.
                outputLine += "$currentType "

                // TRUC CLAU: Un cop hem imprès el Pokèmon de nivell MÀXIM, hem d'eliminar-lo del mapa
                // o canviar el seu nivell màxim guardat a un valor impossible (-1, per exemple)
                // Això garanteix que si hi ha un altre Pokèmon del mateix tipus més endavant,
                // no es tornarà a imprimir, ja que hem de mantenir l'ordre i només imprimir el MÀXIM un cop.
                mapOfMaxLevels[currentType] = -1 // Marcar com 'imprès'
            }
        }

        // --- SORTIDA ---
        println(outputLine)
    }
}