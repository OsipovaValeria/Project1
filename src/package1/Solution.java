package package1;

/**
* Класс Solution, показывающий работу класса Container
*/
public class Solution {

   /**
    * Реализация методов класса Container
    * @param args - аргументы
    */
   public static void main(String[] args){
      /**
       * Создание экземпляра класса Container
       */
      Container MyContainer;
      MyContainer = new Container();
      /**
       * Добавление элементов в контейнер
       */
      MyContainer.push(1);
      MyContainer.push(2);
      MyContainer.push(3);
      /**
       * Вывод содержимого контейнера
       */
      System.out.println("Контейнер: ");
      MyContainer.print();
      /**
       * Вывод размера контейнера
       */
      System.out.println("Размер контейнера: " + MyContainer.size());
      /**
       * Вывод элемента контейнера с индексом 1
       */
      System.out.println("Элемент контейнера с индексом 1: " + MyContainer.get(1));
      /**
       * Удаление элемента контейнера с индексом 0
       */
      MyContainer.remove(0);
      /**
       * Вывод содержимого контейнера
       */
      System.out.println("Контейнер: ");
      MyContainer.print();
      /**
       * Очистка данных
       */
      MyContainer.clean();
   }
}
