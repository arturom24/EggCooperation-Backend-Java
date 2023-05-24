# Java Collections Framework

El Java Collections Framework es una biblioteca en Java que proporciona implementaciones de alto rendimiento de estructuras de datos comunes, como listas, conjuntos, mapas, etc. Estas estructuras de datos se implementan mediante interfaces, lo que permite una mayor flexibilidad y reutilización de código.

1. Para la interfaz `List`:
   
   - `ArrayList`: Implementación basada en un arreglo dinámico que permite un acceso rápido a los elementos, pero puede tener un costo elevado en inserciones o eliminaciones en posiciones intermedias.
   - `LinkedList`: Implementación basada en una lista enlazada que permite un acceso rápido a los elementos y una eficiencia superior en inserciones o eliminaciones en posiciones intermedias.

2. Para la interfaz `Set`:
   
   - `HashSet`: Implementación basada en una tabla hash, no garantiza ningún orden específico de los elementos y no permite elementos duplicados.
   - `TreeSet`: Implementación basada en una estructura de árbol, mantiene los elementos ordenados según el orden natural o un comparador personalizado y no permite elementos duplicados.
   - `LinkedHashSet`: Implementación que combina las características de un `HashSet` y una lista enlazada, mantiene el orden de inserción de los elementos y no permite elementos duplicados.

3. Para la interfaz `Map`:
   
   - `HashMap`: Implementación basada en una tabla hash, no garantiza ningún orden específico de los pares clave-valor y permite una única clave nula y múltiples valores nulos.
   - `TreeMap`: Implementación basada en una estructura de árbol, mantiene los pares clave-valor ordenados según el orden natural de las claves o un comparador personalizado y no permite claves nulas.
   - `LinkedHashMap`: Implementación que combina las características de un `HashMap` y una lista enlazada, mantiene el orden de inserción de los pares clave-valor y permite una única clave nula y múltiples valores nulos.

4. Para la interfaz `Queue`:
   
   - `LinkedList`: Implementación basada en una lista enlazada que permite operaciones de encolar y desencolar eficientes, así como un acceso rápido al frente de la cola.
   - `PriorityQueue`: Implementación basada en una cola de prioridad, los elementos se ordenan según su prioridad y se accede al elemento de mayor prioridad de manera eficiente.

--- 

- **Listas**: La interfaz `List` representa una colección ordenada de elementos en la que se permite el acceso mediante índices. Algunas implementaciones comunes de la interfaz `List` son `ArrayList` y `LinkedList`. Las listas permiten elementos duplicados y suelen utilizarse cuando el orden y la posibilidad de acceso aleatorio son importantes.

#### ArrayList:

El `ArrayList` es una implementación de la interfaz `List` en el Java Collections Framework. Se basa en un arreglo dinámico que crece automáticamente a medida que se agregan elementos. Algunas características importantes del `ArrayList` son:

- Permite el acceso aleatorio a los elementos a través de un índice.
- Permite elementos duplicados.
- No es sincronizado, lo que significa que no es seguro para usar en entornos concurrentes.
- Proporciona métodos para agregar, eliminar y buscar elementos de manera eficiente.

Ejemplo de uso del `ArrayList`:

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Agregar elementos
        fruits.add("Manzana");
        fruits.add("Plátano");
        fruits.add("Naranja");

        // Acceder a elementos
        String firstFruit = fruits.get(0);
        System.out.println("Primer fruta: " + firstFruit);

        // Eliminar elementos
        fruits.remove("Plátano");

        // Iterar sobre elementos
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

#### LinkedList:

La `LinkedList` es otra implementación de la interfaz `List` en el Java Collections Framework. A diferencia del `ArrayList`, la `LinkedList` se basa en una estructura de nodos enlazados. Algunas características importantes de la `LinkedList` son:

- Permite el acceso secuencial a los elementos.
- Permite elementos duplicados.
- No es sincronizada.
- Proporciona métodos para agregar, eliminar y buscar elementos de manera eficiente.

Ejemplo de uso de la `LinkedList`:

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Agregar elementos al final
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Agregar elementos al principio
        numbers.addFirst(5);

        // Acceder a elementos
        int firstNumber = numbers.getFirst();
        System.out.println("Primer número: " + firstNumber);

        // Eliminar elementos
        numbers.removeLast();

        // Iterar sobre elementos
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

```



---

- **Conjuntos**: La interfaz `Set` representa una colección de elementos únicos, es decir, no permite elementos duplicados. Algunas implementaciones comunes de la interfaz `Set` son `HashSet` y `TreeSet`. Los conjuntos no mantienen un orden específico de los elementos y se utilizan cuando se necesita almacenar elementos sin duplicados.

#### HashSet:

`HashSet` es una implementación de la interfaz `Set` en Java que utiliza una tabla hash para almacenar los elementos y garantiza que no haya elementos duplicados en la colección. No mantiene un orden específico de los elementos.

Aquí tienes un ejemplo básico de cómo utilizar `HashSet` en Java:

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<>();

        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Pera");
        conjunto.add("Manzana"); // Se ignora, ya que es un duplicado

        System.out.println("Tamaño del conjunto: " + conjunto.size()); // Salida: Tamaño del conjunto: 4

        System.out.println("Contiene 'Naranja': " + conjunto.contains("Naranja")); // Salida: Contiene 'Naranja': true

        conjunto.remove("Pera");

        System.out.println("Tamaño del conjunto después de eliminar 'Pera': " + conjunto.size()); // Salida: Tamaño del conjunto después de eliminar 'Pera': 3

        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
```

La salida en este caso será:

```
Tamaño del conjunto: 4
Contiene 'Naranja': true
Tamaño del conjunto después de eliminar 'Pera': 3
Manzana
Banana
Naranja
```

Esto muestra el comportamiento básico de un `HashSet`, donde los elementos se agregan sin duplicados, se pueden eliminar y se pueden recorrer de manera no ordenada.



#### TreeSet:

`TreeSet` es una implementación de la interfaz `SortedSet` en Java que utiliza una estructura de árbol balanceado (árbol rojo-negro) para almacenar los elementos. A diferencia de `HashSet`, `TreeSet` mantiene los elementos ordenados de acuerdo con su orden natural o un orden personalizado.

Aquí tienes un ejemplo básico de cómo utilizar `TreeSet` en Java:

```java
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto = new TreeSet<>();

        conjunto.add(5);
        conjunto.add(2);
        conjunto.add(8);
        conjunto.add(1);
        conjunto.add(10);

        System.out.println("Tamaño del conjunto: " + conjunto.size()); // Salida: Tamaño del conjunto: 5

        System.out.println("Contiene el número 8: " + conjunto.contains(8)); // Salida: Contiene el número 8: true

        conjunto.remove(2);

        System.out.println("Tamaño del conjunto después de eliminar el número 2: " + conjunto.size()); // Salida: Tamaño del conjunto después de eliminar el número 2: 4

        for (Integer elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
```

La salida en este caso será:

```
Tamaño del conjunto: 5
Contiene el número 8: true
Tamaño del conjunto después de eliminar el número 2: 4
1
5
8
10
```

Esto muestra el comportamiento de `TreeSet`, donde los elementos se almacenan de manera ordenada y se pueden realizar operaciones de búsqueda y eliminación eficientes.



#### LinkedHashSet:

`LinkedHashSet` es una implementación de la interfaz `Set` en Java que combina las características de un `HashSet` y una lista enlazada. Mantiene una colección de elementos únicos sin permitir duplicados y conserva el orden de inserción de los elementos.

Aquí tienes un ejemplo básico de cómo utilizar `LinkedHashSet` en Java:

```java
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();

        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Pera");
        conjunto.add("Manzana"); // Se ignora, ya que es un duplicado

        System.out.println("Tamaño del conjunto: " + conjunto.size()); // Salida: Tamaño del conjunto: 4

        System.out.println("Contiene 'Naranja': " + conjunto.contains("Naranja")); // Salida: Contiene 'Naranja': true

        conjunto.remove("Pera");

        System.out.println("Tamaño del conjunto después de eliminar 'Pera': " + conjunto.size()); // Salida: Tamaño del conjunto después de eliminar 'Pera': 3

        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
```

La salida en este caso será:

```
Tamaño del conjunto: 4
Contiene 'Naranja': true
Tamaño del conjunto después de eliminar 'Pera': 3
Manzana
Banana
Naranja
```

Esto muestra el comportamiento de `LinkedHashSet`, donde los elementos se almacenan de manera única y se conserva el orden de inserción original.



Aquí están las principales diferencias entre `HashSet`, `TreeSet` y `LinkedHashSet`:

1. Ordenamiento de elementos:
   
   - `HashSet`: No mantiene un orden específico de los elementos. Los elementos se almacenan en función de su valor hash, lo que proporciona un acceso rápido a los elementos.
   - `TreeSet`: Mantiene los elementos ordenados de forma ascendente o según un orden personalizado. Utiliza una estructura de árbol balanceado (árbol rojo-negro) para lograr el ordenamiento.
   - `LinkedHashSet`: Mantiene el orden de inserción de los elementos. Combina las características de `HashSet` y una lista enlazada, lo que permite un acceso rápido a los elementos y mantiene el orden de inserción.

2. Eficiencia en operaciones:
   
   - `HashSet`: Proporciona un acceso rápido a los elementos y un tiempo constante promedio para operaciones de inserción, eliminación y búsqueda (O(1)). Sin embargo, el orden de los elementos no está garantizado.
   - `TreeSet`: Garantiza que los elementos se mantengan ordenados. El tiempo de inserción, eliminación y búsqueda es logarítmico en relación con el tamaño del conjunto (O(log n)).
   - `LinkedHashSet`: Mantiene el orden de inserción y proporciona un tiempo constante promedio para operaciones de inserción, eliminación y búsqueda (O(1)). Sin embargo, requiere un poco más de memoria para mantener los enlaces adicionales entre los elementos.

3. Uso de memoria:
   
   - `HashSet`: Requiere menos memoria en comparación con `TreeSet` y `LinkedHashSet`, ya que no se necesita almacenar información de orden adicional.
   - `TreeSet`: Requiere más memoria que `HashSet` debido a la estructura de árbol utilizada para mantener los elementos ordenados.
   - `LinkedHashSet`: Requiere más memoria que `HashSet` debido a la necesidad de mantener los enlaces entre los elementos.

4. Iteración de elementos:
   
   - `HashSet`: No garantiza un orden específico durante la iteración de elementos. El orden puede variar en cada iteración.
   - `TreeSet`: Itera los elementos en orden ascendente o según el orden definido por un comparador personalizado.
   - `LinkedHashSet`: Itera los elementos en el orden de inserción original, ya que mantiene una lista enlazada adicional para mantener este orden.

La elección entre `HashSet`, `TreeSet` y `LinkedHashSet` depende de los requisitos específicos de tu aplicación. Si necesitas elementos únicos sin importar el orden y un acceso rápido, puedes utilizar `HashSet`. Si necesitas que los elementos se mantengan ordenados, puedes optar por `TreeSet`. Si deseas mantener el orden de inserción y un acceso rápido a los elementos, puedes utilizar `LinkedHashSet`.



---

- **Mapas**: La interfaz `Map` representa una colección de pares clave-valor, donde cada clave es única y está asociada a un valor. Algunas implementaciones comunes de la interfaz `Map` son `HashMap` y `TreeMap`. Los mapas permiten el acceso a los valores mediante las claves y se utilizan para almacenar y recuperar datos basados en una clave.

#### HashMap:

`HashMap` es una implementación de la interfaz `Map` en Java que almacena pares de clave-valor. Permite almacenar y acceder a los elementos de manera eficiente utilizando una función hash.

Aquí tienes un ejemplo básico de cómo utilizar `HashMap` en Java:

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 3);
        mapa.put("Banana", 5);
        mapa.put("Naranja", 2);

        System.out.println("Tamaño del mapa: " + mapa.size()); // Salida: Tamaño del mapa: 3

        System.out.println("Cantidad de manzanas: " + mapa.get("Manzana")); // Salida: Cantidad de manzanas: 3

        mapa.put("Manzana", 4); // Actualizar el valor de la clave "Manzana"

        System.out.println("Tamaño del mapa después de actualizar: " + mapa.size()); // Salida: Tamaño del mapa después de actualizar: 3

        for (String clave : mapa.keySet()) {
            int valor = mapa.get(clave);
            System.out.println(clave + ": " + valor);
        }
    }
}
```

La salida en este caso será:

```
Tamaño del mapa: 3
Cantidad de manzanas: 3
Tamaño del mapa después de actualizar: 3
Manzana: 4
Banana: 5
Naranja: 2
```

Esto muestra el comportamiento de `HashMap`, donde se pueden almacenar y acceder a los valores utilizando claves únicas. Los valores pueden actualizarse y se pueden recorrer utilizando el conjunto de claves.



#### TreeMap:

`TreeMap` es una implementación de la interfaz `SortedMap` en Java que almacena pares de clave-valor ordenados por la clave. Utiliza una estructura de árbol balanceado (árbol rojo-negro) para mantener el orden de las claves.

Aquí tienes un ejemplo básico de cómo utilizar `TreeMap` en Java:

```java
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 3);
        mapa.put("Banana", 5);
        mapa.put("Naranja", 2);

        System.out.println("Tamaño del mapa: " + mapa.size()); // Salida: Tamaño del mapa: 3

        System.out.println("Cantidad de manzanas: " + mapa.get("Manzana")); // Salida: Cantidad de manzanas: 3

        mapa.put("Manzana", 4); // Actualizar el valor de la clave "Manzana"

        System.out.println("Tamaño del mapa después de actualizar: " + mapa.size()); // Salida: Tamaño del mapa después de actualizar: 3

        for (String clave : mapa.keySet()) {
            int valor = mapa.get(clave);
            System.out.println(clave + ": " + valor);
        }
    }
}
```

La salida en este caso será:

```
Tamaño del mapa: 3
Cantidad de manzanas: 3
Tamaño del mapa después de actualizar: 3
Banana: 5
Manzana: 4
Naranja: 2
```

Esto muestra el comportamiento de `TreeMap`, donde los pares clave-valor se mantienen ordenados por la clave en orden ascendente. Se pueden almacenar, acceder, actualizar y recorrer los elementos del mapa utilizando las operaciones proporcionadas por la interfaz `SortedMap`.



#### LinkedHashMap:

`LinkedHashMap` es una implementación de la interfaz `Map` en Java que almacena pares de clave-valor y mantiene el orden de inserción de los elementos. Combina las características de `HashMap` y una lista enlazada para lograr este comportamiento.

Aquí tienes un ejemplo básico de cómo utilizar `LinkedHashMap` en Java:

```java
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 3);
        mapa.put("Banana", 5);
        mapa.put("Naranja", 2);

        System.out.println("Tamaño del mapa: " + mapa.size()); // Salida: Tamaño del mapa: 3

        System.out.println("Cantidad de manzanas: " + mapa.get("Manzana")); // Salida: Cantidad de manzanas: 3

        mapa.put("Manzana", 4); // Actualizar el valor de la clave "Manzana"

        System.out.println("Tamaño del mapa después de actualizar: " + mapa.size()); // Salida: Tamaño del mapa después de actualizar: 3

        for (String clave : mapa.keySet()) {
            int valor = mapa.get(clave);
            System.out.println(clave + ": " + valor);
        }
    }
}
```

La salida en este caso será:

```
Tamaño del mapa: 3
Cantidad de manzanas: 3
Tamaño del mapa después de actualizar: 3
Manzana: 4
Banana: 5
Naranja: 2
```

Esto muestra el comportamiento de `LinkedHashMap`, donde los pares clave-valor se mantienen en el orden de inserción original. Se pueden almacenar, acceder, actualizar y recorrer los elementos del mapa utilizando las operaciones proporcionadas por la interfaz `Map`.



Aquí tienes las principales diferencias entre `HashMap`, `TreeMap`, `LinkedHashMap` y `HashTable`:

1. Orden de los elementos:
   
   - `HashMap`: No garantiza ningún orden específico de los elementos. Los elementos se almacenan utilizando una función hash para un acceso rápido.
   - `TreeMap`: Mantiene los elementos ordenados según el orden natural de las claves o un comparador personalizado. Utiliza una estructura de árbol balanceado (árbol rojo-negro) para lograr el ordenamiento.
   - `LinkedHashMap`: Mantiene el orden de inserción de los elementos. Combina las características de `HashMap` y una lista enlazada, lo que permite un acceso rápido y mantiene el orden de inserción.

2. Sincronización:
   
   - `HashMap`: No es sincronizado por defecto. No proporciona garantías de seguridad en entornos concurrentes sin una sincronización adicional.
   - `TreeMap`: No es sincronizado por defecto. No proporciona garantías de seguridad en entornos concurrentes sin una sincronización adicional.
   - `LinkedHashMap`: No es sincronizado por defecto. No proporciona garantías de seguridad en entornos concurrentes sin una sincronización adicional.

3. Aceptación de valores nulos:
   
   - `HashMap`: Permite una clave nula y cualquier cantidad de valores nulos.
   - `TreeMap`: No permite claves nulas pero permite valores nulos.
   - `LinkedHashMap`: Permite una clave nula y cualquier cantidad de valores nulos.

4. Eficiencia en operaciones:
   
   - `HashMap`: Proporciona un acceso rápido a los elementos y un tiempo constante promedio para operaciones de inserción, eliminación y búsqueda (O(1)). Sin embargo, el orden de los elementos no está garantizado.
   - `TreeMap`: Garantiza que los elementos se mantengan ordenados. El tiempo de inserción, eliminación y búsqueda es logarítmico en relación con el tamaño del mapa (O(log n)).
   - `LinkedHashMap`: Mantiene el orden de inserción y proporciona un tiempo constante promedio para operaciones de inserción, eliminación y búsqueda (O(1)). Requiere un poco más de memoria para mantener los enlaces adicionales entre los elementos.

La elección entre `HashMap`, `TreeMap`, y `LinkedHashMap` depende de los requisitos específicos de tu aplicación. En general, `HashMap` es la opción más común debido a su rendimiento y flexibilidad. Sin embargo, si necesitas un orden específico, puedes optar por `TreeMap` o `LinkedHashMap`. 



---

`foreach`, `Map.Entry` e `Iterator` son tres formas diferentes de iterar sobre colecciones en Java, como mapas y listas. Aquí te explico cada uno de ellos:

1. `foreach` (bucle for-each):
   El bucle `foreach` es una forma conveniente de iterar sobre colecciones en Java. Se utiliza principalmente con matrices, listas, conjuntos y mapas. Proporciona una forma más simple y legible de recorrer los elementos de una colección sin la necesidad de un índice explícito.
   
   Ejemplo de uso del bucle `foreach` con una lista:
   
   ```java
   List<String> lista = Arrays.asList("Manzana", "Banana", "Naranja");
   for (String elemento : lista) {
       System.out.println(elemento);
   }
   ```
   
   En este ejemplo, cada elemento de la lista se asigna a la variable `elemento` en cada iteración del bucle, lo que permite realizar operaciones en cada elemento de manera más sencilla.

2. `Map.Entry`:
   `Map.Entry` es una interfaz en Java que representa una entrada (par clave-valor) en un mapa. Se utiliza comúnmente al iterar sobre un mapa utilizando un bucle `foreach` o un iterador. Permite acceder tanto a la clave como al valor de cada entrada del mapa.
   
   Ejemplo de uso de `Map.Entry` para iterar sobre un mapa:
   
   ```java
   Map<String, Integer> mapa = new HashMap<>();
   mapa.put("Manzana", 3);
   mapa.put("Banana", 5);
   mapa.put("Naranja", 2);
   
   for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
       String clave = entry.getKey();
       Integer valor = entry.getValue();
       System.out.println(clave + ": " + valor);
   }
   ```
   
   En este ejemplo, se utiliza el método `entrySet()` para obtener un conjunto de `Map.Entry` que representa todas las entradas del mapa. Luego, se itera sobre cada entrada utilizando un bucle `foreach` y se accede a la clave y al valor de cada entrada utilizando los métodos `getKey()` y `getValue()` respectivamente.

3. `Iterator`:
   `Iterator` es una interfaz en Java que permite recorrer elementos de una colección uno por uno. Proporciona métodos como `hasNext()` para verificar si hay más elementos, y `next()` para obtener el siguiente elemento de la colección.
   
   Ejemplo de uso de `Iterator` para iterar sobre una lista:
   
   ```java
   List<String> lista = Arrays.asList("Manzana", "Banana", "Naranja");
   Iterator<String> iterator = lista.iterator();
   while (iterator.hasNext()) {
       String elemento = iterator.next();
       System.out.println(elemento);
   }
   ```
   
   En este ejemplo, se utiliza el método `iterator()` de la lista para obtener un objeto `Iterator` que permite iterar sobre los elementos de la lista. Luego, se utiliza un bucle `while` para verificar si hay más elementos (`hasNext()`) y obtener el siguiente elemento (`next()`) en cada iteración.

Estas son diferentes formas de iterar sobre colecciones en Java, y la elección depende de tus necesidades y preferencias. El bucle `foreach` es más simple y legible, mientras que `Map.Entry` y `Iterator` ofrecen más flexibilidad y control sobre las operaciones de iteración.











































A continuación, se presentan algunas características y casos de uso comunes para cada una de estas interfaces:

- **Listas**:
  
  - Características:
    - Almacenamiento ordenado de elementos.
    - Permite elementos duplicados.
    - Acceso rápido mediante índices.
    - Eficiente para agregar o eliminar elementos al final de la lista.
  - Casos de uso comunes:
    - Mantener una secuencia ordenada de elementos.
    - Acceder a elementos específicos por su índice.
    - Necesidad de permitir duplicados en la colección.

- **Conjuntos**:
  
  - Características:
    - No permite elementos duplicados.
    - No mantiene un orden específico de los elementos.
    - Ofrece operaciones eficientes para agregar, eliminar y buscar elementos.
  - Casos de uso comunes:
    - Eliminar duplicados de una colección.
    - Verificar la existencia de un elemento en una colección.
    - Realizar operaciones de conjunto como intersección, unión o diferencia.

- **Mapas**:
  
  - Características:
    - Almacena pares clave-valor únicos.
    - Permite acceder a los valores mediante las claves.
    - No mantiene un orden específico de los elementos.
    - Ofrece operaciones eficientes para agregar, eliminar y buscar elementos por clave.
  - Casos de uso comunes:
    - Asociar información o datos adicionales a una clave.
    - Realizar búsquedas eficientes basadas en una clave.
    - Mantener una estructura de datos que relacione claves y valores.

Estas interfaces del Java Collections Framework proporcionan diferentes opciones para almacenar y manipular datos de manera eficiente según los requisitos específicos de tu aplicación.

#### Interfaces adicionales

Además de `List`, `ArrayList` y `LinkedList`, el Java Collections Framework proporciona otras interfaces y clases útiles:

- `Map`: Esta interfaz representa una colección de pares clave-valor sin duplicados de claves. Algunas implementaciones comunes son `HashMap` y `TreeMap`.
- `Set`: Esta interfaz representa una colección de elementos únicos. No permite duplicados. Algunas implementaciones comunes son `HashSet` y `TreeSet

`.

- `Iterator`: Esta interfaz permite iterar sobre los elementos de una colección de manera secuencial.
- `Comparator`: Esta interfaz permite definir un orden personalizado para los elementos de una colección.

Espero que este archivo de ayuda te sea útil para comprender el Java Collections Framework y sus diferentes implementaciones. ¡Si tienes alguna otra pregunta, no dudes en preguntar!
