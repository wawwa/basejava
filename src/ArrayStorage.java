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
          if (storage[i]==null) {
              storage[i] = r;break;
          }
            }

        }


    String get(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (uuid == storage[i].toString()) {
                return uuid;
            }
        }
        return null;
    }



    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].toString()==uuid) {
                storage[i] = null;break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        for (int i = 0; i < storage.length; i++) {
          if (null != storage[i].toString()) {
              System.out.println(storage[i]);
          }
        }


        return null;
    }

    int size() {
        return storage.length;
    }
}
