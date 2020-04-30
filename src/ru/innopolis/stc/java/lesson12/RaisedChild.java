package ru.innopolis.stc.java.lesson12;

public class RaisedChild {
    private boolean favorite;

    /** Сделать для конструктора ребенка
     * рандомный выбор любимого блюда
     * использовать метод класса enum.set
     * @param favorite
     */
    private void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public void eatFood(String i) {
        isThisFoodFavorite(i);
        try {
            if (favorite) {
                System.out.println("Съел " + i + " за обе щеки");
            }
                throw new Exception();
        } catch(Exception e) {
            System.out.println("Ребенок выплюнул " + i);
        } finally {
            System.out.println("Ребенок говорит: 'Спасибо, мама'");
        }

    }

    private void isThisFoodFavorite(String fromFridge) {
        for (Food f : Food.values()) {
            if (f.name().equals(fromFridge)) {
                setFavorite(true);
            } else {
                setFavorite(false);
            }
        }
    }


}
