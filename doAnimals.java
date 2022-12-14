package main.java;

import java.util.*;

public class doAnimals {

    static Scanner read = new Scanner(System.in);
    int numChoiceMenu, numChoiceGroup;

    public void showMenu() {
        System.out.println("\nВведите команду: ");
        System.out.println("1. Добавить животное");
        System.out.println("2. Удалить животное");
        System.out.println("3. Изменить параметры животного");
        System.out.println("4. Отобразить животных");
        System.out.println("5. Сохранить данные в XML");
        System.out.println("6. Получить данные из XML");
        System.out.println("7. Завершить работу c меню");
        numChoiceMenu = inputNumInt();
        switch (numChoiceMenu) {
            //Добавление
            case 1:
                System.out.println("Выберите, в какую группу хотите добавить животное: ");
                System.out.println("1. Птицы");
                System.out.println("2. Млекопитающие");
                System.out.println("3. Пресмыкающиеся");
                System.out.println("4. Земноводные");
                System.out.println("5. Рыбы");
                numChoiceGroup = inputNumInt();
                switch (numChoiceGroup) {
                    case 1: {
                        addBird();
                        break;
                    }
                    case 2: {
                        addMammal();
                        break;
                    }
                    case 3: {
                        addReptile();
                        break;
                    }
                    case 4: {
                        addAmphibian();
                        break;
                    }
                    case 5: {
                        addFish();
                        break;
                    }
                    default: {
                        break;
                    }
                }
                showMenu();
                break;
            //Удаление
            case 2:
                System.out.println("Выберите, в какой группе хотите удалить животное: ");
                System.out.println("1. Птицы");
                System.out.println("2. Млекопитающие");
                System.out.println("3. Пресмыкающиеся");
                System.out.println("4. Земноводные");
                System.out.println("5. Рыбы");
                numChoiceGroup = inputNumInt();
                switch (numChoiceGroup) {
                    case 1: {
                        removeBird();
                        break;
                    }
                    case 2: {
                        removeMammal();
                        break;
                    }
                    case 3: {
                        removeReptile();
                        break;
                    }
                    case 4: {
                        removeAmphibian();
                        break;
                    }
                    case 5: {
                        removeFish();
                        break;
                    }
                    default: {
                        break;
                    }
                }
                showMenu();
                break;
            //Изменение параметров
            case 3:
                System.out.println("Выберите, в какой группе хотите изменить животное: ");
                System.out.println("1. Птицы");
                System.out.println("2. Млекопитающие");
                System.out.println("3. Пресмыкающиеся");
                System.out.println("4. Земноводные");
                System.out.println("5. Рыбы");
                numChoiceGroup = inputNumInt();
                System.out.println("Режим изменения параметров животного");
                switch (numChoiceGroup) {
                    case 1: {
                        changeBird();
                        break;
                    }
                    case 2: {
                        changeMammal();
                        break;
                    }
                    case 3: {
                        changeReptile();
                        break;
                    }
                    case 4: {
                        changeAmphibian();
                        break;
                    }
                    case 5: {
                        changeFish();
                        break;
                    }
                    default: {
                        break;
                    }
                }
                showMenu();
                break;
            //Показать животных
            case 4:
                System.out.println("Выберите, какую группу животных хотите отобразить: ");
                System.out.println("1. Птицы");
                System.out.println("2. Млекопитающие");
                System.out.println("3. Пресмыкающиеся");
                System.out.println("4. Земноводные");
                System.out.println("5. Рыбы");
                System.out.println("6. Все");
                numChoiceGroup = inputNumInt();
                System.out.println("Режим вывода животных");
                switch (numChoiceGroup) {
                    case 1: {
                        displayBird();
                        break;
                    }
                    case 2: {
                        displayMammal();
                        break;
                    }
                    case 3: {
                        displayReptile();
                        break;
                    }
                    case 4: {
                        displayAmphibian();
                        break;
                    }
                    case 5: {
                        displayFish();
                        break;
                    }
                    case 6: {
                        displayAll();
                        break;
                    }
                    default: {
                        break;
                    }
                }
                showMenu();
                break;
            //Сохранить в XML
            case 5:
                Main.writeToXML();
                showMenu();
                break;
            //Прочитать XML
            case 6:
                Main.readFromXML();
                showMenu();
                break;
            //Завершить программу
            case 7:
                System.out.println("Работа с меню завершена");
                break;
            //Неправильный ввод
            default: {
                showMenu();
                break;
            }
        }
    }

    public void addBird() {
        read.nextLine();
        System.out.println("Введите название птицы: ");
        String name = read.nextLine();
        System.out.println("Введите размер птицы в сантиметрах: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность птицы (да/нет): ");
        String predatoryYN = read.nextLine();
        Bird bird = new Bird(name, size, predatoryYN);
        Bird.birds.add(bird);
        System.out.println("Добавлена птица с параметрами:\n" + bird);
    }

    public void addMammal() {
        read.nextLine();
        System.out.println("Введите название млекопитающего: ");
        String name = read.nextLine();
        System.out.println("Введите размер млекопитающего в сантиметрах: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность млекопитающего (да/нет): ");
        String predatoryYN = read.nextLine();
        Mammal mammal = new Mammal(name, size, predatoryYN);
        Mammal.mammals.add(mammal);
        System.out.println("Добавлено млекопитающее с параметрами:\n" + mammal);
    }

    public void addReptile() {
        read.nextLine();
        System.out.println("Введите название пресмыкающегося (рептилии): ");
        String name = read.nextLine();
        System.out.println("Введите размер пресмыкающегося (рептилии) в сантиметрах: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность пресмыкающегося (рептилии) (да/нет): ");
        String predatoryYN = read.nextLine();
        Reptile reptile = new Reptile(name, size, predatoryYN);
        Reptile.reptiles.add(reptile);
        System.out.println("Добавлено пресмыкающееся (рептилия) с параметрами:\n" + reptile);
    }

    public void addAmphibian() {
        read.nextLine();
        System.out.println("Введите название земноводного (амфибии): ");
        String name = read.nextLine();
        System.out.println("Введите размер земноводного (амфибии) в сантиметрах: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность земноводного (амфибии) (да/нет): ");
        String predatoryYN = read.nextLine();
        Amphibian amphibian = new Amphibian(name, size, predatoryYN);
        Amphibian.amphibians.add(amphibian);
        System.out.println("Добавлено земноводное (амфибия) с параметрами:\n" + amphibian);
    }

    public void addFish() {
        read.nextLine();
        System.out.println("Введите название рыбы: ");
        String name = read.nextLine();
        System.out.println("Введите размер рыбы в сантиметрах: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность рыбы (да/нет): ");
        String predatoryYN = read.nextLine();
        Fish fish = (new Fish(name, size, predatoryYN));
        Fish.fish.add(fish);
        System.out.println("Добавлена рыба с параметрами:\n" + fish);
    }

    public static double inputNumDouble() {
        double numDouble;
        try {
            numDouble = read.nextDouble();
            if (read.hasNextLine()) {
                read.nextLine();
            }
        } catch (InputMismatchException e) {
            read.nextLine();
            System.out.println("!!! Неправильный ввод числа !!!");
            System.out.println("Введите заново: ");
            numDouble = inputNumDouble();
        }
        return numDouble;
    }

    public static int inputNumInt() {
        int numInt;
        try {
            numInt = read.nextInt();
            if (read.hasNextLine()) {
                read.skip("");
            }
        } catch (InputMismatchException e) {
            read.nextLine();
            System.out.println("!!! Неправильный ввод числа !!!");
            System.out.println("Введите заново: ");
            numInt = inputNumInt();
        }
        return numInt;
    }

    public void removeBird() {
        read.nextLine();
        boolean exists = false;
        System.out.println("!!! Удаление птицы !!!");
        System.out.println("Введите название птицы: ");
        String name = read.nextLine();
        System.out.println("Введите размер птицы: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность птицы (да/нет): ");
        String predatoryYN = read.nextLine();
        for (Bird obj : Bird.birds) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Удалена птица с параметрами:" + obj);
                Bird.birds.remove(obj);
                break;
            }
        }
        if (!exists) System.out.println("Такая птица не найдена");
    }

    public void removeMammal() {
        read.nextLine();
        boolean exists = false;
        System.out.println("!!! Удаление млекопитающего !!!");
        System.out.println("Введите название млекопитающего: ");
        String name = read.nextLine();
        System.out.println("Введите размер млекопитающего: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность млекопитающего (да/нет): ");
        String predatoryYN = read.nextLine();
        read.skip("");
        for (Mammal obj : Mammal.mammals) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Удалено млекопитающее с параметрами:" + obj);
                Mammal.mammals.remove(obj);
                break;
            }
        }
        if (!exists) System.out.println("Такое млекопитающее не найдено");
    }

    public void removeReptile() {
        read.nextLine();
        boolean exists = false;
        System.out.println("!!! Удаление пресмыкающегося (рептилии) !!!");
        System.out.println("Введите название пресмыкающегося (рептилии): ");
        String name = read.nextLine();
        System.out.println("Введите размер пресмыкающегося (рептилии): ");
        double size = inputNumDouble();
        System.out.println("Введите хищность пресмыкающегося (рептилии) (да/нет): ");
        String predatoryYN = read.nextLine();
        read.skip("");
        for (Reptile obj : Reptile.reptiles) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Удалено пресмыкающееся (рептилия) с параметрами:" + obj);
                Reptile.reptiles.remove(obj);
                break;
            }
        }
        if (!exists) System.out.println("Такое пресмыкающееся (рептилия) не найдено");
    }

    public void removeAmphibian() {
        read.nextLine();
        boolean exists = false;
        System.out.println("!!! Удаление земноводного (амфибии) !!!");
        System.out.println("Введите земноводного (амфибии): ");
        String name = read.nextLine();
        System.out.println("Введите размер земноводного (амфибии): ");
        double size = inputNumDouble();
        System.out.println("Введите хищность земноводного (амфибии): ");
        String predatoryYN = read.nextLine();
        read.skip("");
        for (Amphibian obj : Amphibian.amphibians) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Удалено земноводное (амфибия) с параметрами:" + obj);
                Amphibian.amphibians.remove(obj);
                break;
            }
        }
        if (!exists) System.out.println("Такое земноводное (амфибия) не найдено");
    }

    public void removeFish() {
        read.nextLine();
        boolean exists = false;
        System.out.println("!!! Удаление рыбы !!!");
        System.out.println("Введите название рыбы: ");
        String name = read.nextLine();
        System.out.println("Введите размер рыбы: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность рыбы (да/нет): ");
        String predatoryYN = read.nextLine();
        read.skip("");
        for (Fish obj : Fish.fish) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Удалена рыба с параметрами:" + obj);
                Fish.fish.remove(obj);
                break;
            }
        }
        if (!exists) System.out.println("Такая рыба не найдена");
    }

    public void changeBird() {
        read.nextLine();
        boolean exists = false;
        System.out.println("Введите название птицы: ");
        String name = read.nextLine();
        System.out.println("Введите размер птицы: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность птицы (да/нет): ");
        String predatoryYN = read.nextLine();
        for (Bird obj : Bird.birds) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Введите желаемое название птицы: ");
                obj.setName(read.nextLine());
                System.out.println("Введите желаемый размер птицы: ");
                obj.setSizeCentimeter(inputNumDouble());
                System.out.println("Введите желаемую хищность птицы (да/нет): ");
                obj.setPredatoryYN(read.nextLine());
                System.out.println("Параметры птицы изменены на: " + obj);
                break;
            }
        }
        if (!exists) System.out.println("Такая птица не найдена");
    }

    public void changeMammal() {
        read.nextLine();
        boolean exists = false;
        System.out.println("Введите название млекопитающего: ");
        String name = read.nextLine();
        System.out.println("Введите размер млекопитающего: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность млекопитающего (да/нет): ");
        String predatoryYN = read.nextLine();
        for (Mammal obj : Mammal.mammals) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Введите желаемое название млекопитающего: ");
                obj.setName(read.nextLine());
                System.out.println("Введите желаемый размер млекопитающего: ");
                obj.setSizeCentimeter(inputNumDouble());
                System.out.println("Введите желаемую хищность млекопитающего (да/нет): ");
                obj.setPredatoryYN(read.nextLine());
                System.out.println("Параметры млекопитающего изменены на: " + obj);
                break;
            }
        }
        if (!exists) System.out.println("Такое млекопитающее не найдено");
    }

    public void changeReptile() {
        read.nextLine();
        boolean exists = false;
        System.out.println("Введите название пресмыкающегося (рептилии): ");
        String name = read.nextLine();
        System.out.println("Введите размер пресмыкающегося (рептилии): ");
        double size = inputNumDouble();
        System.out.println("Введите хищность пресмыкающегося (рептилии) (да/нет): ");
        String predatoryYN = read.nextLine();
        for (Reptile obj : Reptile.reptiles) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Введите желаемое название пресмыкающегося (рептилии): ");
                obj.setName(read.nextLine());
                System.out.println("Введите желаемый размер пресмыкающегося (рептилии): ");
                obj.setSizeCentimeter(inputNumDouble());
                System.out.println("Введите желаемую хищность пресмыкающегося (рептилии) (да/нет): ");
                obj.setPredatoryYN(read.nextLine());
                System.out.println("Параметры пресмыкающегося (рептилии) изменены на: " + obj);
                break;
            }
        }
        if (!exists) System.out.println("Такое пресмыкающееся (рептилия) не найдено");
    }

    public void changeAmphibian() {
        read.nextLine();
        boolean exists = false;
        System.out.println("Введите название земноводного (амфибии): ");
        String name = read.nextLine();
        System.out.println("Введите размер земноводного (амфибии): ");
        double size = inputNumDouble();
        System.out.println("Введите хищность земноводного (амфибии) (да/нет): ");
        String predatoryYN = read.nextLine();
        for (Amphibian obj : Amphibian.amphibians) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Введите желаемое название земноводного (амфибии): ");
                obj.setName(read.nextLine());
                System.out.println("Введите желаемый размер земноводного (амфибии): ");
                obj.setSizeCentimeter(inputNumDouble());
                System.out.println("Введите желаемую хищность земноводного (амфибии) (да/нет): ");
                obj.setPredatoryYN(read.nextLine());
                System.out.println("Параметры земноводного (амфибии) изменены на: " + obj);
                break;
            }
        }
        if (!exists) System.out.println("Такаое земноводное (амфибия) не найдено");
    }

    public void changeFish() {
        read.nextLine();
        boolean exists = false;
        System.out.println("Введите название рыбы: ");
        String name = read.nextLine();
        System.out.println("Введите размер рыбы: ");
        double size = inputNumDouble();
        System.out.println("Введите хищность рыбы (да/нет): ");
        String predatoryYN = read.nextLine();
        for (Fish obj : Fish.fish) {
            if (obj.getName().equals(name) && obj.getSizeCentimeter() == size && obj.getPredatoryYN().equals(predatoryYN)) {
                exists = true;
                System.out.println("Введите желаемое название рыбы: ");
                obj.setName(read.nextLine());
                System.out.println("Введите желаемый размер рыбы: ");
                obj.setSizeCentimeter(inputNumDouble());
                System.out.println("Введите желаемую хищность рыбы (да/нет): ");
                obj.setPredatoryYN(read.nextLine());
                System.out.println("Параметры рыбы изменены на: " + obj);
                break;
            }
        }
        if (!exists) System.out.println("Такая рыба не найдена");
    }

    public void displayBird() {
        System.out.println("Птицы: ");
        for (Bird obj : Bird.birds) {
            System.out.println(obj);
        }
        if (Bird.birds.isEmpty()) System.out.println("Отсутствуют");
    }

    public void displayMammal() {
        System.out.println("Млекопитающие: ");
        for (Mammal obj : Mammal.mammals) {
            System.out.println(obj);
        }
        if (Mammal.mammals.isEmpty()) System.out.println("Отсутствуют");
    }

    public void displayReptile() {
        System.out.println("Пресмыкающиеся (рептилии): ");
        for (Reptile obj : Reptile.reptiles) {
            System.out.println(obj);
        }
        if (Reptile.reptiles.isEmpty()) System.out.println("Отсутствуют");
    }

    public void displayAmphibian() {
        System.out.println("Земноводные (амфибии): ");
        for (Amphibian obj : Amphibian.amphibians) {
            System.out.println(obj);
        }
        if (Amphibian.amphibians.isEmpty()) System.out.println("Отсутствуют");
    }

    public void displayFish() {
        System.out.println("Рыбы: ");
        for (Fish obj : Fish.fish) {
            System.out.println(obj);
        }
        if (Fish.fish.isEmpty()) System.out.println("Отсутствуют");
    }

    public void displayAll() {
        System.out.println("Вывод всех животных: ");
        displayBird();
        displayMammal();
        displayReptile();
        displayAmphibian();
        displayFish();
    }
}
