package org.example.comprtamiento.observer;

interface Subject {
    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();
}
