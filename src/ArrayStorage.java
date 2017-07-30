/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    int n = 0;

    Resume[] storage = new Resume[10000];
    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;
            n=0;
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                n++;
                break;
            }
        }

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
