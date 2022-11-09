public class TaskSolution {
    public static void main(String[] args) {
        //Дан массив пар названий книг и авторов,
        //необходимо привести каждую пару в строку вида: «Название книги» И.О.Автора.
        String[] books = {"IT", "1984", "Onegin"};
        String[] authors = {"Stephen King", "George Orwell", "Alexandr Pushkin"};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i] + " - " + authors[i]);
        }
    }
}
