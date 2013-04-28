package org.maubergine.vindaloo.services;

import javax.validation.constraints.Min;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;


@Component
public class PriceIncrease {

    /** Logger for this class and subclasses */
    private final static Logger logger = Logger.getLogger(PriceIncrease.class);
 
    @Min(value = 10)
    private int percentage;

    public void setPercentage(int i) {
        percentage = i;
        logger.info("Percentage set to " + i);
    }

    public int getPercentage() {
        return percentage;
    }

}