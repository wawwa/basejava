import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private int size = 0;

    Resume[] storage=new Resume[10000];


    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;

        }
        size =0;
    }

void update(Resume r){
        
}

    void save(Resume r) {

        storage[size]=r;
        size++;
    }


    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid == storage[i].toString()) {
                    return storage[i];

            }

        }
        return null;
    }


    void delete(String uuid) {
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
        Resume[] storageOut=new Resume[size];



        storageOut=Arrays.copyOfRange(storage,0,size);



        return storageOut;
    }


    int size() {
        return size;
    }
}
