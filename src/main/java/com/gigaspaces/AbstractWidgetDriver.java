package com.gigaspaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 10/15/13
 * Time: 4:23 PM
 */
public abstract  class AbstractWidgetDriver implements WidgetDriver {

    private static Logger logger = LoggerFactory.getLogger(AbstractWidgetDriver.class);

    @Override
    public List<Machine> listMachines() {
        throw new UnsupportedOperationException("listMachines");
    }
}
