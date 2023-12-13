

import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {

    private final T data;

    private boolean visited;

    private List<Vertex<T>> neighbors = new LinkedList<>();

}
