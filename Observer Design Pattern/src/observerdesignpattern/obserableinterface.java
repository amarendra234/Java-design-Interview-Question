package observerdesignpattern;

public interface obserableinterface {
     void add(observerinterface observer);
     void remove(observerinterface observer);
     void notifyobserver();
}
