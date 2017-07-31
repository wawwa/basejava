import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    int n = 0;
    int j=1;
    Resume[] storage=new Resume[j];
    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;

        }
        n=0;
    }

    void save(Resume r) {
j++;
        Resume[] storageTrim=new Resume[j];

        System.arraycopy(storage,0,storageTrim,0,j);

        for (int i = 0; i < storageTrim.length; i++) {
            if (storageTrim[i] == null) {
                storageTrim[i] = r;
                n++;
                break;
            }
        }
        Resume[] storage=new Resume[j];
        System.arraycopy(storageTrim,0,storage,0,j);
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
