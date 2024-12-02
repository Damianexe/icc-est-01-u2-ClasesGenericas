public class Caja1 <T> {
    //T es un parámetro de tipo genérico lo cual puede ser cualquier letra pero las mas usadas son:
    //E: Element, T: Type, K: Key, V: Value.
    private T content;

    public Caja1(T content) {
        this.content = content;
    }

    public T getcontent() {
        return content;
    }

    public void setcontent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Caja{" + "content=" + content + '}';|
    }
    //Una clase genérica puede tener más de un tipo de parámetro
    /*public class Par <K, V> {
    private K key;
    private V value;

    public Par(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
    SU USO PUEDE SER EL SIGUIENTE:
    Par<String, Integer> entrada = new Par<>("Edad", 30);
    System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());

 */
}
