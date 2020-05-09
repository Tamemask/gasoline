package ru.innopolis.stc.java.lesson12;

public class RaisedChild {

    /** Сделать для конструктора ребенка
     * рандомный выбор любимого блюда
     * использовать метод класса enum.set
     * @param
     */


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
        boolean z = false;
        for (Food f : Food.values()) {
            String y = f.getName();
            if (y.equals(fromFridge)) {
                z = true;
                break;
            } else {
                z = false;
            }
        }
        return z;
    }


}
