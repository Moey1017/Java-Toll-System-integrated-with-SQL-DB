/*
 * This class Encapsulates the HashMap that maps ids to student objects.
*  All the accessor methods - get(), put(), getAllStudents() clone
*  the Student objects so that access to the Student objects is permitted
*  only via the public methods.  
*  There will be no references from outside this object pointing to the
   Student objects in the Map, because this object creates clones of the originals.
   No references to the Student objetcs in the Map are returned from this object
   (as references to cloned Student objects are returned)
   
 */
package ca5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TollEventMap
{

    private final Map<String, ArrayList<TollEvent>> map;

    public TollEventMap()
    {
        this.map = new TreeMap<>();
    }

    /**
     * @param id
     * @param student - Student object, will be cloned If we simply put() the
     * student reference into the map, then the client code will have direct
     * access to the student object in the map. Instead, this StudentMap creates
     * its own clone (copy) of the student object passed in, and stores a
     * reference top that object, thus eliminating access by the client.
     */
    public void put(String reg, TollEvent tollEvent)
    {
        
        map.put(reg, new TollEvent(tollEvent)); // put a Copy Constructed clone of Student object
    }
//
//    /**
//     * @param key
//     * @return Student object, or null if key not found If we simply return a
//     * reference to a Student object in the map, then the client code will have
//     * a reference into the map, and could make changes. To prevent this, we
//     * clone the Student object, and return a reference to it, thus preventing
//     * access to the map contents.
//     */
//    public List<TollEvent> get(String reg)
//    {
//        List<TollEvent> tollEvents = map.get(reg);
//        return new ArrayList<TollEvent> (map.get(reg)); // returns a Copy Constructed object
//    }
//
//    public List getAllStudents()
//    {
//        List<TollEvent> list = new ArrayList<>();
//
//        // get each Student value from map and add to list
//        for (Map.Entry<String, TollEvent> entry : map.entrySet())
//        {
//            list.add(new Student(entry.getValue()));  // clone and add to list
//        }
//        return list;
//    }
}
