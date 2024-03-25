# PROYECTO DE ALGORITMOS Y ESTRUCTURAS DE DATOS I 

**Curso 2021-2022**



# El Juego: CuBirds

**Historia y  contexto**

CuBirds es un juego de cartas de pájaros para 2-5 jugadores, creado por Stefan Alexander en 2018. El objetivo del juego es conseguir una colección de cartas de pájaros de 7 especies diferentes (de las 8 existentes) o 2 especies con al menos 3 pájaros en cada una.

Los jugadores comienzan cada ronda de CuBirds con 8 cartas de pájaro en su **mano** y 1 carta en su **zona de juego** (que ya formará parte de su colección). Sobre la **mesa** habrá también 4 filas (vallas) con 3 pájaros de diferente especie en cada una. En su turno, el jugador colocará uno o varios pájaros de la misma especie en cualquier extremo de una de las vallas con el objetivo de rodear a pájaros de otra especie (se rodean aquellas cartas que quedan en el medio de dos cartas de la misma especie). Los pájaros rodeados vuelan hacia la mano del jugador y los restantes se mantendrán en la valla sin dejar ningún hueco entre ellos. Cuando un jugador tenga un número suficiente de pájaros de la misma especie en la mano, si lo desea podrá bajar 1 o 2 a su zona de juego formando parte de su colección. 

El objetivo final es lograr ser el primer jugador en acumular en su zona de juego 7 especies de pájaros distintas, o 2 especies con 3 pájaros en cada una. Ten cuidado, ya que, si algún jugador se queda sin cartas en la mano, ¡todos deberán descartar sus cartas y robar nuevas, desbaratando así los planes que tuvieran preparados!



# Bases de juego



**Preparación de la partida**

Se barajarán las cartas y se colocarán en la mesa 4 filas con 3 cartas de pájaro cada una. No puede haber 2 especies iguales en la misma fila. En tal caso,  se siguen sacando cartas hasta conseguir 3 especies distintas, las cartas no utilizadas se devuelven de nuevo al final de la baraja. 

Se colocan las cartas  estantes de la baraja en el centro de la mesa, accesible a todos los jugadores. Cada jugador toma 8 cartas de la baraja que  mantendrá ocultas en su mano, y toma 1 carta adicional, que colocará boca arriba en su zona de juego, que será el primer pájaro de su colección.

Se escoge quien va a ser el jugador que comienza la partida, después continuará el turno en el sentido de las agujas del reloj.



**Desarrollo del Juego**

En cada turno, un jugador puede realizar alguna de estas acciones:

1. Jugar cartas (acción obligatoria)
  * El jugador escoge qué especie de pájaro de su mano quiere colocar y baja todos los pájaros de esa especie, y los sitúa a la derecha o a la izquierda de una de las 4 filas que hay en la mesa.
  *  Si el jugador baja una especie de pájaro que ya se encuentra en la fila, se lleva a la mano todas las cartas situadas entre los pájaros de esa especie y los que acaba de colocar (cartas rodeadas). Después junta los pájaros que han quedado en la fila para que no queden huecos.
  * Puede pasar que al bajar las cartas no se rodee a ningún pájaro. En este caso, el jugador no cogerá pájaros de esa fila, pero si lo desea, puede robar dos cartas del mazo de robo y llevarlas a la mano.
2. Completar una bandada (opcional)
* La forma de añadir cartas de una especie a la colección de cada jugador es completando una bandada de una especie de pájaros. Para ello, se tendrá que revelar y descartar todos los pájaros que se tengan en la mano de la misma especie, siempre que se cumpla la siguiente restricción:
  * Cada carta dispone de 2 números (bandada pequeña/bandada grande), los cuales indican la cantidad mínima de cartas de ese tipo que se deben disponer para crear una bandada pequeña o grande de pájaros de esa especie. En caso de que se disponga en la mano el número de cartas suficientes para crear una bandada pequeña se colocará UNA carta en nuestra zona de juego; en cambio, si se dispone del número
    suficiente para crear una bandada grande se añadirán DOS cartas, formado parte de nuestra colección. El resto de las cartas, en ambos casos, se van al montón de descartes.
* Completar bandadas no es obligatorio, por lo que un jugador aun pudiendo bajar una bandada puede decidir no hacerlo, pero una vez se ha bajado una especie a nuestra colección, ya no se podrá quitar de la misma.
3. Rellenar mesa
  * Si todas las cartas que quedan en la fila son de la misma especie, habrá que añadir cartas del mazo de robo hasta que salga un pájaro de una especie diferente (es obligatorio que en cada fila existan como mínimo 2 especies)

Tras esto, el turno pasa al jugador de la izquierda.



**Fin de la ronda**

Una ronda termina cuando el jugador que está en su turno se queda sin cartas en la mano. En ese momento los demás jugadores se verán obligados a descartarse por completo de su mano y se volverá a repartir 8 cartas nuevas a cada jugador. El jugador que ha provocado el fin de la ronda será el  jugador inicial en la ronda nueva.



**Fin de la partida**

La partida termina cuando un jugador consigue 7 especies diferentes en su colección de pájaros o tiene 2 especies con al menos 3 pájaros cada una al  final de su turno.

También se puede llegar al final de la partida si no es posible repartir cartas del mazo de robo. En este caso el jugador con el mayor número de cartas de pájaro en su colección ganaría la partida.

Si hubiera un empate en el juego, se compartiría la victoria.



**Cartas**

La baraja tendrá un total de 110 cartas. Las cartas que forman parte del juego son las siguientes:

* Curruca de caña (6/9): 20 cartas
* Flamenco (2/3): 7 cartas
* Petirrojo (6/9): 20 cartas
* Tucán (3/4): 10 cartas
* Pato (4/6): 13 cartas
* Urraca (5/7): 17 cartas
* Lechuza (3/4): 10 cartas
* Guacamayo (4/6): 13 cartas

Cada carta tiene dos números separados por una /, que son los que se muestran en el listado entre paréntesis, al lado del nombre de cada carta. Esto  representa el número de cartas iguales que se necesitan para poder formar una bandada. Por ejemplo, el petirrojo tiene 6/9. Eso quiere decir que se necesitan mínimo 6 cartas para crear una bandada. Si se tienen 6 cartas de este tipo (el número mínimo de esa especie) se puede añadir UNA carta de petirrojo a nuestra zona de juego y si se tienen 9 (el número máximo de esa especie) se pueden añadir DOS cartas de petirrojo, las cuales ya formarán parte de nuestra colección.



**Información Adicional**

Se puede consultar información acerca de las reglas de juego en https://dejensever.es/resena- cubirds. Un video ejemplo de cómo jugar se puede consultar en: https://www.youtube.com/watch?v=9mdsxCs6d40



# PROYECTO A ENTREGAR

1. El trabajo será **colaborativo**, es decir se realizará en grupo de 4/5 alumnos/as. No es necesario pertenecer al mismo grupo reducido de AEDI. La  formación de los equipos corre por cuenta de los alumnos e informarán a su profesor/a. Los alumnos no presenciales también deben realizar el proyecto y formarán grupo con otros alumnos no presenciales. Si tienen dificultad para formar grupo deben hablar con su profesor/a, que estudiará cada caso.

2. El trabajo consiste en desarrollar un proyecto que implemente el juego **CuBirds** siguiendolas reglas anteriormente expuestas, utilizando el lenguaje de programación JAVA y el entorno NetBeans.

3. La estructura del proyecto, en la que están identificadas las clases implicadas en el diseño de la aplicación está disponible en Moovi, sección Práctica: Proyecto/ Cubirds. El proyecto está organizado en 2 paquetes: IU y CORE. Algunas clases están completamente implementadas y otras deben ser  desarrolladas por el grupo. 

4. Será necesario repartir el trabajo entre todos los miembros del grupo, de modo que cada uno de los miembros debe ocuparse de desarrollar  alguna/s de la/s clase/s. También sería preciso nombrar un **coordinador de grupo**, siendo el responsable de la coordinación del proyecto. Si algún
   miembro del grupo no cumple sus funciones, el coordinador del grupo debe comunicárselo al profesor/a.

5. Cada miembro del grupo debe ser responsable de su trabajo, de comunicarse con otros miembros del grupo y de conocer todas las partes del  proyecto. Además, debe reflexionar y desarrollar cada clase implementando los métodos. Se debe tener especial cuidado en controlar la visibilidad de los atributos, métodos, además de utilizar los **algoritmos y las estructuras de datos adecuadas** en cada caso. 

6. Para facilitar la implementación, se simplificarán las siguientes acciones:

   - “Escoger jugador inicial”. Puede empezar el juego un jugador al azar, no es necesario que el usuario escoja uno.
   - “Completar una bandada”
     - Completar una bandada permite al jugador añadir una especie de pájaro a su colección, para ello, tendrá que descartar todos los pájaros  que tenga en la mano de la misma especie.
     - Con cada especie solo se crearán bandadas pequeñas (número de la izquierda), con lo cual, solo se colocará UNA carta en la zona de juego del jugador actual. El resto de las cartas se van al montón de descartes. 
     - Completar bandadas no es obligatorio, por lo que un jugador aun pudiendo bajar una bandada puede decidir no hacerlo, pero una vez se ha bajado una especie a nuestra colección, ya no se podrá quitar de la misma.
   - “Fin de la ronda”. No hay el concepto de fin de ronda, simplemente cuando un jugador se queda sin cartas en la mano durante su turno y no ha  ganado, si es posible, cogerá 8 cartas de la baraja. A continuación, el turno pasa al jugador de la izquierda. 
   - “Fin de la partida”
     - La partida termina cuando un jugador consigue 7 especies diferentes, de las 8 existentes, en su colección de pájaros.
     - También puede finalizar, si no hay cartas suficientes en la baraja para realizar las siguientes acciones: rellenar una valla de la mesa porque no tiene 2 especies de pájarosdiferentes o el jugador se queda sin cartas en la mano. En este caso el jugador con el mayor número de cartas de pájaro en su colección ganaría la partida.

7. Respecto al funcionamiento del juego, deben cumplirse las siguientes condiciones:

   - Al principio de la partida, deberá preguntarse por el número de jugadores y el nombre de cada uno.
   - Realizar la validación de datos de entrada por teclado.
   - Para preparar la partida, se crea la mesa inicial formando 4 filas con 3 cartas de pájaro cada una. No puede haber 2 especies iguales en la misma fila. Si se da ese caso se siguen sacando cartas hasta obtener 3 especies distintas, las cartas no utilizadas se devuelven de nuevo al final de la baraja.
   - Se reparten las correspondientes cartas a cada jugador.
   - Cada vez que un jugador coloque cartas en la mesa, es necesario mostrar el estado de la partida: cartas en la mesa, cartas de su zona de juego y cartas de su mano.
   - En caso de que no se cojan cartas de la mesa, hay que preguntar si quiere coger dos cartas de la baraja.
   - Después de colocar cartas en la mesa hay que preguntar si se quieren bajar cartas a la zona de juego del jugador.
   - Después de bajar cartas a la zona de juego del jugador, es necesario que se compruebe si el jugador cumple los requisitos para ganar.   En caso de que sea el ganador, se indicará y se terminará la partida; en otro caso se mostrará el estado de la partida.
   - Siempre que se coloquen cartas (mesa o zona de juego) es necesario comprobar si le quedan cartas en la mano. Si no le quedan cartas  tiene que coger 8 de la baraja, si no es posible la partida termina y gana el jugador que más cartas tiene en su zona de juego.
   - Si es necesario rellenar la fila de la mesa y no es posible porque no hay cartas suficientes en la baraja, la partida termina y gana el jugador que más cartas tiene en su zona de juego.
   - Al terminar el juego debe mostrarse el nombre del ganador.

8. La fecha tope para subir el proyecto de forma individual (cada miembro subirá el proyecto completo) será el **lunes 16 de mayo de 2022 a las 23:00h**, a Moovi, sección Práctica:Proyecto*/ *Entrega* *Proyecto* *CuBirds*.

9. Solo se admiten proyectos que compilen y que se ejecuten cumpliendo las reglas del juego.

10. **El descubrimiento de copias del proyecto supondrá el suspenso del mismo, tanto para el grupo con código original, como para el grupo con la copia.**

    

# EVALUACIÓN 
La evaluación constará de dos partes: grupal, en forma de tutoría obligatoria, e individual en forma de examen en el ordenador.

1. **Evaluación grupal: tutoría obligatoria** para todos los miembros del grupo, en la que se mostrará la evolución del proyecto y donde el profesor/a podrá preguntar a cada miembro del grupo sobre su trabajo o sobre el de sus compañeros; el profesor/a marcará con cada grupo cuándo se realizará la tutoría, que será como fecha tope entre **el 18 y el 24 de mayo**. Esta tutoría es evaluable (sólo para los que siguen la modalidad de asistentes) y supondrá el 10 % de la calificación final de la asignatura.
2. **Evaluación individual**: se realizará en ordenador el **7 de junio de 2022**. Supondrá <u>el 30% de la calificación final</u> de la asignatura para la modalidad de  asistentes y el <u>40% de la calificación final</u> de la asignatura para la modalidad de no asistentes.
