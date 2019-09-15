import logger.Logger;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class);

        log.info("" + CircleUtils.PI);

        double length = CircleUtils.circleLength(-5);
        double area = CircleUtils.circleArea(5);
        double quadrature = CircleUtils.squareEquivalent(1);

        if (length < 0)
            log.error("Error while calculating circle length.");
        else
            log.info("Circle length = " + length);

        if (area < 0)
            log.error("Error while calculating circle area.");
        else
            log.info("Circle area = " + area);

        if(quadrature < 0)
            log.error("Error while calculating circle quadrature.");
        else
            log.info("Circle quadrature = " + quadrature);

        log.info("" + Math.sqrt(CircleUtils.PI));

    }
}
