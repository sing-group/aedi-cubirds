/*
 * Copyright 2024 María Novo, Reyes Pavón, Rosalía Laza, Víctor Mondelo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Clase de Entrada de datos
 */
package es.uvigo.esei.cubirds.iu;

import java.util.Scanner;

public class ES {

    public static Scanner leer = new Scanner(System.in);

    public static String pideCadena(String mensaje) {
        // Poner el mensaje
        System.out.println(mensaje);

        // Pedir
        return leer.nextLine();
    }

    public static int pideNumero(String mensaje) {

        System.out.println(mensaje);

        // Pedir
        return Integer.parseInt(leer.nextLine());
    }
}
