/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CA5;

import Exceptions.DaoException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author HP
 */
public interface VehicleDAOInterface
{

    /**
     *
     * @return
     * @throws DaoException
     */
    public Set<Vehicle> getAllVehicle() throws DaoException;

    /**
     *
     * @param regNum
     * @return
     * @throws DaoException
     */
    public boolean insertVehicle(String regNum) throws DaoException;

    /**
     *
     * @param vehicles
     * @return
     * @throws DaoException
     */
    public boolean insertAllVehicles(HashSet<Vehicle> vehicles) throws DaoException;
}
