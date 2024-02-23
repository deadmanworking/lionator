package io.deadmanworking.dao;

import io.deadmanworking.Unit;

public interface UnitDao {

    /**
     * Get a unit from the datastore that has the given id.
     * If the id is not found, return null.
     *
     * @param id the id of the unit to get from the datastore.
     * @return the unit object
     */
    Unit getUnitById(int id);

}
