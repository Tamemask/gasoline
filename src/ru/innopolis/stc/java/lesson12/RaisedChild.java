package ru.innopolis.stc.java.lesson12;

public class RaisedChild {
    boolean favorite;

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
        for (favoriteFood f : favoriteFood.values()) {
            if (f.name().equals(fromFridge)) {
                setFavorite(true);
            } else {
                setFavorite(false);
            }
        }
    }

    enum favoriteFood {МОРКОВЬ, ЯБЛОКО, КАША;}


}
