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

    void update(String uuid) {
        //todo check if rezume prezent
        ifResumePresent(uuid);

    }

    private void ifResumePresent(String r) {
        for (int i = 0; i < size; i++) {
            if (r.toString().equals(storage[i])) {
                printExists();
                break;
            }
        }
    }

    private void printExists() {
        System.out.println("Rezume already exists");
    }

    void save(Resume r) {
//todo check if rezume not prezent
        boolean isExist = false;
        for (int i = 0; i < size; i++) {
            if (r.toString().equals(storage[i])) {
                isExist = true;
                printExists();
                break;
            }


        }
        if (!isExist) {
            storage[size] = r;
            size++;

        }
    }


    Resume get(String uuid) {
        ifResumePresent(uuid);
        for (int i = 0; i < size; i++) {
            if (uuid.toString().equals(storage[i])) {
                printExists();
                return storage[i];

            }

        }
        return null;
    }


    void delete(String uuid) {
        //todo check if rezume prezent
        ifResumePresent(uuid);
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
