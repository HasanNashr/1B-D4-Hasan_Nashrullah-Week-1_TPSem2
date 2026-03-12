// Silahkan mencoba source code pada lampiran dan memberikan penjelasan detail setiap bagian pentingnya!

public class GenericsTypeOld {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Java");
        String str = (String) type.get(); // type casting, error prone and can cause ClassCastException
        System.out.println(str);
        System.out.println(type.get());
    }
}

