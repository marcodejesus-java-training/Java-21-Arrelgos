import java.util.*;

public class Main {
    public static void main(String args[]){
        // Arreglos unidimensionales
        String [] frutas = new String[3];
        frutas[0] = "Manzana";
        frutas[1] = "Pera";
        frutas[2] = "Melocoton";

        // Para recorrer el arreglo podemos utilizar un For
        for(int i=0; i<frutas.length; i++){
            System.out.println(frutas[i]);
        }

        System.out.println();

        int edades [] = {3, 34, 45};

        // Ó, podemos recorrer el arreglo con un For-Each
        for(int i : edades){
            System.out.println(i);
        }

        System.out.println();

        // Arreglos multidimensionales
        int tablaUsuarios[][] = new int [2][3];
        tablaUsuarios[0][0] = 12;
        tablaUsuarios[0][1] = 32;
        tablaUsuarios[0][2] = 7;
        tablaUsuarios[1][0] = 9;
        tablaUsuarios[1][1] = 48;
        tablaUsuarios[1][2] = 61;

        // El numero de filas es determinado por el primer ciclo For
        for(int filas=0; filas<2; filas++){
            for(int columnas=0; columnas<3; columnas++){
                System.out.print(tablaUsuarios[filas][columnas] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int filas=0; filas<3; filas++){
            for(int columnas=0; columnas<2; columnas++){
                System.out.print(tablaUsuarios[columnas][filas] + " ");
            }
            System.out.println();
        }

        System.out.println();

        String coloresYParticipantes [][] = {{"Verde", "Amarillo", "Azul"}, {"Mario", "Andres", "Adrian"}};

        // Fila de colores y Fila de nombres
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(coloresYParticipantes[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();

        // Filas combinadas entre Color y Nombre
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(coloresYParticipantes[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println();

        Arreglos arreglos = new Arreglos();
        // Podemos pasar un Arreglo como parámetro.
        arreglos.AgregarArregloComoParametro(new String[] {"Matrix", "Lord of the Rings", "John Wick", "Harry Potter"});

        System.out.println();

        // Podemos obtener un arreglo como valor de regreso.
        String peliculaTaquillera = new String(arreglos.RegresarArregloDesdeUnMetodo());
        System.out.println(peliculaTaquillera);
        System.out.println();

        // Trabjando con Colas
        Queue<String> filaDelBanco = new LinkedList<>();
        filaDelBanco.add("B024");
        filaDelBanco.add("B025");
        filaDelBanco.add("AF003");
        filaDelBanco.add("Yo - B026");

        System.out.println("Todas los turnos son: " + filaDelBanco);
        System.out.println("¿Quién es el siguiente turno en ser atendido?: " + filaDelBanco.peek());
        System.out.println("El turno: " + filaDelBanco.remove() + " ha sido Atendido.");
        System.out.println("Todas los turnos son: " + filaDelBanco);
        System.out.println("¿Cuántos turnos faltan para que me atiendan? " + filaDelBanco.size());
        System.out.println("El turno: " + filaDelBanco.remove() + " ha sido Atendido.");

        Iterator iterator = filaDelBanco.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("AF003")){
                System.out.println("El turno: " + filaDelBanco.remove() + " ha sido Atendido.");
            }
        }

        System.out.println("Finalmente estoy siendo atendido: " + filaDelBanco.peek());
        System.out.println();

        // Trabjando con Pilas
        Stack<String> inventarioPcGeneration = new Stack<>();
        inventarioPcGeneration.push("iPhone 5");
        inventarioPcGeneration.push("iPhone 6");
        inventarioPcGeneration.push("iPhone X");
        inventarioPcGeneration.push("iPhone 12");
        inventarioPcGeneration.push("iPhone 12");

        System.out.println("Los productos en el inventario son: " + inventarioPcGeneration);
        System.out.println("El último item agregado al inventario es: " +  inventarioPcGeneration.peek());
        System.out.println("Se ha quitado de inventario el: " + inventarioPcGeneration.pop());
        System.out.println("Se ha quitado de inventario el: " + inventarioPcGeneration.pop());

        System.out.println("Aún tenemos 'iPhone 12' en existencia? ");
        if(inventarioPcGeneration.search("iPhone 12") == -1){
            System.out.println("El iPhone 12 está agotado!");
        }
        System.out.println("¿Cúal es la versión más nueva en el inventario?: " + inventarioPcGeneration.peek());

        System.out.println("Muéstrame la lista del inventario: ");
        iterator = inventarioPcGeneration.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        // Trbajando con Listas Enlazadas
        LinkedList<String> listaAmigosEnCallOfDuty = new LinkedList<String>();
        listaAmigosEnCallOfDuty.add("Warrior23");
        listaAmigosEnCallOfDuty.add("SableX");
        listaAmigosEnCallOfDuty.add("GoldenStriker");
        listaAmigosEnCallOfDuty.add("Gasparin");

        listaAmigosEnCallOfDuty.addFirst("Comrade73");
        listaAmigosEnCallOfDuty.addLast("Raven");
        listaAmigosEnCallOfDuty.add(2, "Snake123");

        System.out.println("Muéstrame la lista de mis Amigos en Call of Duty: ");
        iterator = listaAmigosEnCallOfDuty.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("Quita por favor a Gasparín, ese no es un nombre para un shooter.");
        listaAmigosEnCallOfDuty.remove("Gasparin");
        System.out.println("A Quién esté en segundo lugar de la lista, Quítalo: " + listaAmigosEnCallOfDuty.remove(1));
        System.out.println();
        System.out.println("Quita también al primero -" + listaAmigosEnCallOfDuty.removeFirst() + "- y al segundo"
                + " -" + listaAmigosEnCallOfDuty.removeLast() + "- de la lista");
        System.out.println();

        System.out.println("¿Quién es todo el equipo ahora? " + listaAmigosEnCallOfDuty);
        System.out.println("Queda al mando quien esté en la primera posición: " + listaAmigosEnCallOfDuty.get(0));

/*        for(int i=0; i<listaAmigosEnCallOfDuty.size(); i++){
            System.out.println(listaAmigosEnCallOfDuty.get(i));
        }

        for(String amigo : listaAmigosEnCallOfDuty){
            System.out.println(amigo);
        }*/
    }
}
