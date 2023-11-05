package lambdaFunRef;

 /**
  *  Interfejs funkcyjny, który przyjmuje dwa argumenty typu int i zwraca wartość typu double.
 */
@FunctionalInterface
public interface MyFunction {

    double apply(int a, int b);

}
