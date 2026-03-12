//Silahkan mencoba source code pada lampiran dan memberikan penjelasan detail setiap bagian pentingnya!

public class GenericsType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); // valid
        System.out.println(type.get());

        GenericsType type1 = new GenericsType(); // raw type
        type1.set("Java"); // valid
        System.out.println(type1.get());
        type1.set(10); // valid and autoboxing support
        System.out.println(type1.get());

        // Penggunaan Raw Type pada generic Type versi terbaru mengakibatkan error karena baris program
        // dianggap tidak aman. Baris di atas, mengganggap bahwa program masih menggunakan bentuk lama sehingga
        // Generic Type "T" di anggap sebagai objek.
    }
}

