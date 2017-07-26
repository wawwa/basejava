/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
          if (storage[i]==null)
              storage[i]=r;
          break;
            }
        }


    String get(String uuid) {
        return uuid;
    }



    void delete(String uuid) {
        remove ;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        for (int i = 0; i < storage.length; i++) {
          if (storage[i] != null) return new Resume[]{storage[i]};
        }


        return null;
    }

    int size() {
        return storage.length;
    }
}
