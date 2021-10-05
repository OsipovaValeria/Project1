package package1;
import java.util.Scanner;
/**
 * Класс Solution, показывающий работу класса Container
 */
public class Solution {

   /**
    * Реализация методов класса Container
    * @param args - аргументы
    */
   public static void main(String[] args){

      Scanner console = new Scanner(System.in);
      /**
       * Создание экземпляра класса Container
       */
      Container MyContainer;
      MyContainer = new Container();

      String exit;

      do
      {
         /**
          * Считывание комманды
          */
         System.out.println("Выберите действие: ");
         System.out.println("1 - добавить элемент в контейнер; \n2 - удалить элемент из контейнера; \n3 - вывести элемент контейнера по идексу; \n4 - вывести размер контейнера; \n5 - вывести содержимое контейнера.\n");
         int action = console.nextInt();
         switch(action){
            case 1:
            {
               /**
                * Кейс добавления элемента
                */
               System.out.print("Введите элемент, который хотите добавить: ");
               int elem = console.nextInt();
               MyContainer.push(elem);
               break;
            }
            case 2:
            {
               /**
                * Кейс удаления элемента
                */
               System.out.print("Введите индекс элемента, который хотите удалить: ");
               int index = console.nextInt();
               MyContainer.remove(index);
               break;
            }
            case 3:
            {
               /**
                * Кейс извлечения элемента по индексу
                */
               System.out.print("Введите индекс, по которому хотите получить элемент: ");
               int index = console.nextInt();
               System.out.print("Элемент с индексом " + index + ": " + MyContainer.get(index));
               break;
            }
            case 4:
            {
               /**
                * Кейс получения размера контейнера
                */
               System.out.print("Размер контейнера: " + MyContainer.size());
               break;
            }
            case 5:
            {
               /**
                * Кейс вывода содержимого контейнера
                */
               System.out.print("Контейнер: " + MyContainer.to_string());
               break;
            }
         }
         /**
          * Считывание комманды
          */
         System.out.println("\nПродолжить - a, выйти - q.");
         Scanner console2 = new Scanner(System.in);
         exit = console2.nextLine();
      } while (exit.equals("a"));

      /**
       * Очистка данных
       */
      MyContainer.clean();
   }
}
