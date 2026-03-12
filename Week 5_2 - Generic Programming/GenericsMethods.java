
class GenericsType<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }
}

public class GenericsMethods {
    
    // Java Generic Method
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");
        
        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");
        
        // Pemanggilan secara eksplisit
        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
        System.out.println("Hasil perbandingan eksplisit: " + isEqual);
        
        // Pemanggilan menggunakan Type Inference (lebih ringkas)
        isEqual = GenericsMethods.isEqual(g1, g2);
        System.out.println("Hasil perbandingan type inference: " + isEqual);
    }
}