package dyskoteka.wyjatki;

public class ExceededCapacityException extends Exception {

        public ExceededCapacityException(String message) {
            super(message);
        }

        public ExceededCapacityException() {}
}
