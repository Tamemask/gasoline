package ru.innopolis.stc.java.lesson12;

public class RaisedChild {

    /**
     * Сделать для конструктора ребенка
     * рандомный выбор любимого блюда
     * использовать метод класса enum.set
     *
     * @param
     */

    String favoriteFood = Food.getRandomFood().getName();


    public void eatFood(String i) throws Exception {

        try {
            if (isThisFoodFavorite(i)) {
                System.out.println("Съел " + i + " за обе щеки");
            } else {
                throw new Exception("Ребенок выплюнул еду");
            }
        } finally {
            System.out.println("Ребенок говорит: 'Спасибо, мама'");
        }
    }

    private boolean isThisFoodFavorite(String fromFridge) {
        boolean z;
        if (favoriteFood.equals(fromFridge)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
