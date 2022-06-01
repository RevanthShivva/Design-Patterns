package com.company.objectpool;

import java.util.HashSet;

public abstract class ObjectPoolPattern<T> {


        private  HashSet<T> readyToUse = new HashSet<>();
        private  HashSet<T> areInUse = new HashSet<>();

        protected abstract T build();

        public T giveAway() {
            if (readyToUse.isEmpty()) {
                readyToUse.add(build());
            }
            var type = readyToUse.iterator().next();
            readyToUse.remove(type);
             areInUse.add(type);
            return type;
        }

        public void bringIn(T type) {
            areInUse.remove(type);
            readyToUse.add(type);
        }

    public HashSet<T> getReadyToUse() {
        return readyToUse;
    }

    public void setReadyToUse(HashSet<T> readyToUse) {
        this.readyToUse = readyToUse;
    }

    public HashSet<T> getAreInUse() {
        return areInUse;
    }

    public void setAreInUse(HashSet<T> areInUse) {
        this.areInUse = areInUse;
    }
}

