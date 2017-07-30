/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    int j = 0;
    Resume[] storage = new Resume[10000];
    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
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
                    break;
                }
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {




        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                j += 1;
            }
        }
        Resume[] buffer = new Resume[j];
        int k=0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                buffer[k] = storage[i];
                k+=1;

            }
        }



        return buffer;
    }


    int size() {
        return storage.length;
    }
}
