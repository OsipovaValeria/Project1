package package1;
/**
 * Реализация класса контейнер, позволяющего хранить произвольное количество объектов, с помощью массива.
 * Без использование встроенных коллекций. Контейнер позволяет добавлять, извлекать, удалять элементы.
 * @author Осипова Валерия
 * @version 1.2
 */
public class Container {

    private
    /** Поле начального размера массива */
    final int init_size = 1;
    /** Поле указатель (текущий размер массива) */
    int current;
    /** Поле контейнер */
    int[] NewContainer;

    public
    /**
     * Конструктор - создание нового объекта
     * @see Container#Container(int, int)
     */
    Container(){
        current = 0;
        NewContainer = new int[init_size];
    }
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param size - размер
     * @see Container#Container()
     */
    Container(int size){
        current = 0;
        NewContainer = new int[size];
    }
    /**
     * Процедура добавления элемента в контейнер
     * @param data - данные
     */
    void push(int data){
        resize();
        NewContainer[current] = data;
        current++;
    }
    /**
     * Функция получения значения поля по индексу {@link  Container#NewContainer}
     * @param index - индекс элемента контейнера
     * @return возвращает элемент контейнера
     */
    int get(int index){
        return NewContainer[index];
    }
    /**
     * Процедура удаления элемента контейнера {@link  Container#current}
     */
    void remove(int index){
        for (int i = index; i < current - 1; i++)
            NewContainer[i] = NewContainer[i + 1];
        current--;
        resize();
    }
    /**
     * Процедура очистки контейнера
     */
    void clean(){
        current = 0;
        NewContainer = null;
    }
    /**
     * Функция получения значения поля размер {@link  Container#current}
     * @return возвращает размер контейнера
     */
    int size(){
        return current;
    }
    /**
     * Процедура увеличения размера контейнера
     */
    void resize(){
        int new_length = NewContainer.length;
        if (current == NewContainer.length - 1)
            new_length = NewContainer.length * 2;
        if (current + 1 < NewContainer.length / 2)
            new_length = NewContainer.length / 2;
        if (new_length != NewContainer.length){
            int[] tmpNewContainer = new int[new_length];
            for (int i = 0; i < current; i++)
                tmpNewContainer[i] = NewContainer[i];
            NewContainer = null;
            NewContainer = tmpNewContainer;
        }
    }
    /**
     * Функция вывода контейнера
     * @return возвращает в виде строки содержиоме контейнера
     */
    String to_string(){
        String str = "";
        for (int i = 0; i < current; i++)
            str += NewContainer[i] + " ";
        return str;
    }
}
