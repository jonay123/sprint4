import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaramos las variables de las respuestas del cuestionario
    String nombreUsuario;
    int numeroRegistro;
    int hermanoEnCentro;
    int mismaPoblacion;
    int padresTrabajandoEnPoblacion;
    int discapacidad;
    int familiaNumerosaOMonoparental;
    int familiarEscolarizadoEnEscuela;
    int puntuacion = 0;

     Scanner sc = new Scanner(System.in);
     while (true) {
         System.out.println("numero de registro del niño: ");
         numeroRegistro = sc.nextInt();
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

         if ((hermanoEnCentro==0 || hermanoEnCentro==1) &&
                 (mismaPoblacion==0 || mismaPoblacion==1) &&
                 (padresTrabajandoEnPoblacion==0 || padresTrabajandoEnPoblacion==1) &&
                 (discapacidad==0 || discapacidad==1) &&
                 (familiaNumerosaOMonoparental==0 || familiaNumerosaOMonoparental==1) &&
                 (familiarEscolarizadoEnEscuela==0 || familiarEscolarizadoEnEscuela==1)){
             System.out.println("los datos introducidos son correctos");
             break;
         } else{
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

        if (padresTrabajandoEnPoblacion==1 && mismaPoblacion==1) {
            puntuacion += 30;
        } else {
            puntuacion += padresTrabajandoEnPoblacion * 20 + mismaPoblacion * 30;
        }
        puntuacion += hermanoEnCentro*40 + discapacidad*10 + familiaNumerosaOMonoparental*15 + familiarEscolarizadoEnEscuela*5;
        //imprimimos la puntuación final
        System.out.println("número de registro: " + numeroRegistro);
        System.out.println("la puntuación del alumno será de : " + puntuacion);
