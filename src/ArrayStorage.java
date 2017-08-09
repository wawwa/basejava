import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    int size = 0;

    Resume[] storage=new Resume[1];
    Resume[] storage2=new Resume[1];

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;

        }
        size =0;
    }


    void save(Resume r) {
        storage2=new Resume[size +1];
        if(size !=0) storage2 = Arrays.copyOf(storage,storage2.length);
        for (int i = 0; i < storage2.length; i++) {
            if (storage2[i] == null) {
                storage2[i] = r;
                size++;
                break;
            }
        }
        storage=new Resume[size];
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
        int k=0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                if (uuid == storage[i].toString()) {
                    storage[i] = null;
                    size--;
                    storage2=new Resume[size];
                    for (int j = 0; j <storage.length ; j++) {
                        if (storage[j] != null){
                            storage2[k]=storage[j];
                            k++;
                        }
                    }
                    storage=new Resume[size];
                    storage = Arrays.copyOf(storage2,storage.length);
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




        Resume[] buffer = new Resume[size];


        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                buffer[k] = storage[i];
                k++;

            }
        }



        return buffer;
    }


    int size() {
        return size;
    }
}
