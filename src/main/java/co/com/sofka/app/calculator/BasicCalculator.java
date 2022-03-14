package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long rest(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplication(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 * number2;
    }

    public Long division(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        if(number2 == 0){
            throw new IllegalArgumentException("No se puede dividir por 0");
        }
        return number1 / number2;
    }

}
