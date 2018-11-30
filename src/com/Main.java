package com;

import javax.management.ObjectName;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayContainer arrayContainer=new ArrayContainer();
        Iterator iterator=arrayContainer.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
interface Iterator{
    boolean hasNext();
    Object next();
}
interface Container{
    Iterator getIterator();
}
class ArrayContainer implements Container {
    String[] array = {"Jarik", "Petro", "Mickle"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return (index < array.length) ? true : false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return array[index++];
            }
            return null;
        }
    }
}


















