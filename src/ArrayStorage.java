import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private int size = 0;

    Resume[] storage = new Resume[10000];


    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;

        }
        size = 0;
    }

    void update(Resume r) {
        //todo check if rezume prezent
        for (int i = 0; i < size; i++) {
            if (storage[i] == r) {
                System.out.println("ERROR: rezume already exists");
                break;
            }
        }

    }

    void save(Resume r) {
//todo check if rezume not prezent
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (storage[i] == r) {
                flag = true;

            }


        }
        if (flag) {
            System.out.println("Rezume already exists");
        } else {
            storage[size] = r;
            size++;
        }
    }
    

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid == storage[i].toString()) {
                System.out.println("Get - Rezume exists:");
                return storage[i];

            }

        }
        return null;
    }


    void delete(String uuid) {
        //todo check if rezume prezent
        for (int i = 0; i < size; i++) {
            if (storage[i] != null) {
                if (uuid == storage[i].toString()) {
                    storage[i] = storage[size - 1];
                    storage[size - 1] = null;
                    size--;
                }
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] storageOut = new Resume[size];


        storageOut = Arrays.copyOfRange(storage, 0, size);


        return storageOut;
    }


    int size() {
        return size;
    }
}
