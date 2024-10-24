import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaramos las variables de las respuestas del cuestionario
        String nombreUsuario;
        final int numeroRegistro;
        final int hermanoEnCentro;
        final int mismaPoblacion;
        final int padresTrabajandoEnPoblacion;
        final int discapacidad;
        final int familiaNumerosaOMonoparental;
        final int familiarEscolarizadoEnEscuela;
        final int puntuacion = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            //pedimos el numero de registro
            System.out.println("Número de registro del niño (entre 1 y 499): ");
            if (sc.hasNextInt()) {
                numeroRegistro = sc.nextInt();
                //evaluar si el numero es valido
                if (numeroRegistro >= 1 && numeroRegistro <= 499) {
                    break;
                } else {
                    System.out.println("Error: El número de registro debe estar entre 1 y 499.");
                }
            } else {
                //evaluar que el numero sea entero
                System.out.println("Error: Debe introducir un número entero.");
                //si es correcto seguir el cuestionario
                sc.next();
            }
        }
        while (true) {

            System.out.println("tiene algún hermano en el centro (1:si / 0:no) ?: ");
            hermanoEnCentro = sc.nextInt();
            System.out.println("vives en la misma población (1:si / 0:no) ?: ");
            mismaPoblacion = sc.nextInt();
            System.out.println("el padre o madre trabaja en la misma poblacion (1:si / 0:no) ?: ");
            padresTrabajandoEnPoblacion = sc.nextInt();
            System.out.println("tiene usted alguna dicapacidad (1:si / 0:no) ?: ");
            discapacidad = sc.nextInt();
            System.out.println("es usted familia numerosa o monoparental (1:familia numerosa / 0:monoprental) ?: ");
            familiaNumerosaOMonoparental = sc.nextInt();
            System.out.println("ha estado algún familiar escolarizado en la misma escuela (1:si / 0:no) ?: ");
            familiarEscolarizadoEnEscuela = sc.nextInt();

            if ((hermanoEnCentro == 0 || hermanoEnCentro == 1) &&
                    (mismaPoblacion == 0 || mismaPoblacion == 1) &&
                    (padresTrabajandoEnPoblacion == 0 || padresTrabajandoEnPoblacion == 1) &&
                    (discapacidad == 0 || discapacidad == 1) &&
                    (familiaNumerosaOMonoparental == 0 || familiaNumerosaOMonoparental == 1) &&
                    (familiarEscolarizadoEnEscuela == 0 || familiarEscolarizadoEnEscuela == 1)) {
                System.out.println("los datos introducidos son correctos");
                break;
            } else {
                System.out.println("alguna de las respuestas tiene un valor diferente de 1 ó 0 vuelve a intentarlo");
            } //cerramos el else
        } //cerramos el bucle while

        sc.close();

        //ahora calculamos la puntuación del total de puntos que tiene
        //el alumno, multiplicando la repuesta por el numero de puntos
        //que aporta cada respuesta

        //para la pregunta de que si los padres trabajan en la misma población y
        //si viven en la misma población haremos un if para que coja el valor
        //que mas valor tenga

        if (padresTrabajandoEnPoblacion == 1 && mismaPoblacion == 1) {
            puntuacion += 30;
        } else {
            puntuacion += padresTrabajandoEnPoblacion * 20 + mismaPoblacion * 30;
        }
        puntuacion += hermanoEnCentro * 40 + discapacidad * 10 + familiaNumerosaOMonoparental * 15 + familiarEscolarizadoEnEscuela * 5;
        //imprimimos la puntuación final
        System.out.println("número de registro: " + numeroRegistro);
        System.out.println("la puntuación del alumno será de : " + puntuacion);
    }

}
