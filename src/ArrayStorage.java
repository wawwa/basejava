import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    int n = 0;

    Resume[] storage=new Resume[1];
    Resume[] storage2=new Resume[1];

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;

        }
        n=0;
    }


    void save(Resume r) {
        storage2=new Resume[n+1];
        if(n!=0) storage2 = Arrays.copyOf(storage,storage2.length);


        for (int i = 0; i < storage2.length; i++) {
            if (storage2[i] == null) {
                storage2[i] = r;
                n++;
                break;
            }
        }
        storage=new Resume[n];
        storage = Arrays.copyOf(storage2,storage.length);

    }


    String get(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                if (uuid == storage[i].toString()) {
                    return uuid;
                }
            }

        }
        return null;
    }


    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                if (uuid == storage[i].toString()) {
                    storage[i] = null;
                    n--;
                    break;
                }
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

int k=0;int j=0;




        Resume[] buffer = new Resume[n];


        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                buffer[k] = storage[i];
                k++;

            }
        }



        return buffer;
    }


    int size() {
        return n;
    }
}
