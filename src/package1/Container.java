package package1;
/**
 * Реализация класса контейнер, позволяющего хранить произвольное количество объектов, с помощью массива.
 * Без использование встроенных коллекций. Контейнер позволяет добавлять, извлекать, удалять элементы.
 * @author Осипова Валерия
 * @version 1.1
 */
public class Container {
    /** Поле начального размера массива */
    private final int init_size = 10;
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
        if (current == NewContainer.length - 1)
            resize(NewContainer.length * 2);
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
        for (int i = index; i < current; i++)
            NewContainer[i] = NewContainer[i + 1];
        current--;
        if(current < NewContainer.length/2)
            resize(NewContainer.length/2);
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
    void resize(int new_length){
        int[] tmpNewContainer = new int[new_length];
        for (int i = 0; i < current; i++)
            tmpNewContainer[i] = NewContainer[i];
        NewContainer = null;
        NewContainer = tmpNewContainer;
    }
    /**
     * Процедура вывода контейнера
     */
    void print()
    {
        for (int i = 0; i < current; i++)
            System.out.print(NewContainer[i] + " ");
        System.out.print('\n');
    }
}
