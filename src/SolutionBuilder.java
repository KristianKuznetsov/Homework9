import task1.*;
import task2.*;
import taskStar.*;

public class SolutionBuilder {
    public static void buildTaskOne() {
        System.out.println("\n\n          Задача 1\n");
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();

        System.out.println("\n");
    }

//    Задача 1:
//    Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с
//    методом, который печатает название должности и имплементировать этот метод в
//    созданные классы.


    public static void buildTaskTwo() {
        System.out.println("\n\n          Задача 2\n");

        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 4, 5);
        shapes[1] = new Rectangle(5, 7);
        shapes[2] = new Circle(2);
        shapes[3] = new Triangle(6, 8, 10);
        shapes[4] = new Rectangle(4, 6);

        System.out.println("Общий пириметр:");
        double totalPerimeter = 0;
        for (Shape el : shapes) {
            totalPerimeter += el.calculatePerimeter();
            System.out.print(el.calculatePerimeter());
            if (el != shapes[shapes.length - 1]) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + totalPerimeter);

        System.out.println("\n");
    }

//    Задача 2:
//    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//    функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//    абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран
//    сумму периметра всех фигур в массиве.

    public static void buildTaskStar() {
        System.out.println("\n\n          Задача *\n");

        ImperialStormtrooper trooper1 = new ImperialStormtrooper();
        try {
            ImperialStormtrooper trooper2 = (ImperialStormtrooper) trooper1.clone();

            trooper1.shoot();
            trooper2.shoot();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("\n");

        //TODO: Интерфейс Cloneable – это так называемый интерфейс-маркер, который не содержит никаких методов.
        // Он используется, чтобы маркировать (помечать) некоторые классы.

        // TODO: Если разработчик класса считает, что объекты класса можно клонировать, он помечает класс этим интерфейсом
        //  (наследует класс от Cloneable).

        // TODO: Если разработчика не устраивает стандартная реализация метода clone, он должен написать свою,
        //  которая будет создавать дубликат объекта правильным образом.

        // TODO: При вызове метода clone(), Java проверяет, был ли у объекта интерфейс Cloneable.
        //  Если да — клонирует объект методом clone(), если нет — выкидывает исключение CloneNotSupportedException.
    }

//    Задача *:
//    Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.

}
