package com.henco.dietapp.Domain.Interface;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Henco on 8/5/2017.
 */
public interface EatingPlanInterface {

    String breakfast();
    String lunch();
    String dinner();
    String snack();
}
